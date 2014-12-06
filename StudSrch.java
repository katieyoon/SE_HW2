package Stud;

import java.io.*;
import java.sql.*;

public class StudSrch {
	
	StudSrch() throws IOException, SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	//���� �˻� �� �� �Է��ϴ� �������� 2�� �̸��̰ų� 20�ڰ� ������ �ٽ� �Է� �޵��� �Ѵ�.
	
	public void studsrch() throws IOException, SQLException{
		
		String bname, availability, renting_stud;
		int ISBN;
		availability="";
		renting_stud="";
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
			
		String jdbcUrl="jdbc:mysql://127.0.0.1:3306/library";
		String userID = "root";
		String userPass="1111";
		
		Connection conn = DriverManager.getConnection(jdbcUrl, userID, userPass);
		PreparedStatement ps= null;
		String sql=null;
		ResultSet rs = null;
		
		System.out.println("---------------------------");
		System.out.println("���� �˻�");
		System.out.println("---------------------------");
			
		System.out.println("ã�� ���� ���� ������ �Է����ּ���.");
		System.out.print("> ");
			
		bname=br.readLine();
		sql="select * from book where bname=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1,bname);
		rs=ps.executeQuery();
			
			
		int i=0;
		while(rs.next()){
				System.out.println(i+". ������ "+rs.getString(1));
				System.out.println("����: "+rs.getString(2));
				System.out.println("���ǻ�: "+rs.getString(3));
				System.out.println("ISBN: "+rs.getInt(4));
				System.out.println("���Ⱑ�ɿ���: "+rs.getString(5));
				System.out.println("�뿩��: "+rs.getString(6));
		}
	}
}
