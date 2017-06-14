import java.sql.SQLException;
import java.util.Vector;

public class EventFireStarter {

	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//EventFireGui g=new EventFireGui();
		DeptHandler d=new DeptHandler();
		Vector<String> input=new Vector<>();
		input.add("100");
		input.add("수원점");
		input.add("수원");
		input.add("031-333-3333");
		input.add("202");
		
		d.InsertRow(input);
		//d.deleteRow(100);
		Vector<String> update=new Vector<>();
		update.add("100");
		update.add("");
		update.add("서울");
		update.add("02-333-3333");
		update.add("");
		d.updateRow(100,update);
		

	}

}
