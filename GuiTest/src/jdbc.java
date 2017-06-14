import java.sql.*;
public class jdbc {

	private Connection conn;
	private Statement stmt;
	String toRet=" ";
	public jdbc()
	{
		conn = null;
		stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 사용할 DBMS 드라이버의 이름을 인수로 넘겨 설정한다.
			System.out.println("드라이버 로딩성공"); // 드라이버 로딩에 성공한 경우 성공 메시지를 띄운다.

			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "hr");// DBMS 드라이버와 실질적인 연결을 한다. 
			System.out.println("DB연결 성공");// DB와의 연결에 성공한 경우 성공 메시지를 띄운다.
			stmt = conn.createStatement();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다." + cnfe.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}

	}
	public String getString()
	{
		return toRet;
	}
	public Statement getSt()
	{
		return stmt;
	}
	public Connection getCon()
	{
		return conn;
	}
	public void finalize() throws SQLException
	{
		stmt.close();
		conn.close();
	}

}
