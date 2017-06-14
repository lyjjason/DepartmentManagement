import java.sql.*;
import java.util.Vector;
public class DeptHandler {

	private Connection conn;
	private Statement stmt;
	private jdbc db;
	public DeptHandler()
	{
		db=new jdbc();
		conn=db.getCon();
		stmt=null;
	}
	public void InsertRow(Vector<String> input) throws SQLException//받은 벡터 값과 같은 값을 갖는 row를 지점 테이블에 추가
	{
		stmt=conn.createStatement();
		String query="INSERT INTO deptstores(department_id, name, city, call_num, owner) VALUES(";
		query=query+input.elementAt(0)+",'"+input.elementAt(1)+"','"+input.elementAt(2)+"','"+input.elementAt(3)+"',"+input.elementAt(4)+")";
		stmt.executeQuery(query);
			System.out.println(query+" Executed");
		stmt.close();
	}
	public void deleteRow(int num) throws SQLException// 받은 아이디 값과 같은 아이디를 갖는 row를 지점 테이블에서 삭제
	{
		stmt=conn.createStatement();
		String query="DELETE FROM deptstores WHERE department_id=";
		query=query+num;
		stmt.executeQuery(query);
		System.out.println(query+" Executed");
		stmt.close();
		
	}
	public void updateRow(Vector<String> input) throws SQLException// 받은 벡터 값으로 row update
	{
		
	}
	
	public void finalize() throws SQLException
	{
		stmt.close();
		conn.close();
	}
}
