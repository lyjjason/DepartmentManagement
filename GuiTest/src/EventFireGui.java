import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class EventFireGui extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pane;
	private JButton buttonStart;
	private JButton sectondStart;
	public EventFireGui() throws SQLException
	{
		
		super("Event Firer");
		jdbc db=new jdbc();
		Connection c=db.getCon();
		Statement stmt;
		stmt = c.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT first_name FROM employees WHERE employee_id=101");
		String t="";
		while(rs.next())
		{	
			t=rs.getString("FIRST_NAME");
			
			System.out.println(t);
		
		}
		stmt.close();
		c.close();
		pane=new JPanel();
		buttonStart=new JButton("Start");
		sectondStart=new JButton("Hello");
		GridLayout layout=new GridLayout();
		setBounds(100,100,300,200);
		pane.setLayout(layout);
		this.
		buttonStart.setMnemonic('S');
		pane.add(buttonStart);
		pane.add(sectondStart);
		this.add(pane);
		setVisible(true);
		buttonStart.addActionListener(this);
		sectondStart.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(buttonStart))
		{
			JOptionPane.showMessageDialog(this, "start");
			this.dispose();
		}
		else
		{
			JOptionPane.showMessageDialog(this, "hello");
			this.dispose();
		}
	}

}
