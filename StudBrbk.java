package Stud;

import java.io.*;
import java.sql.*;

public class StudBrbk {

	StudBrbk() throws IOException{
		try{
				Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	//�л��� �������� å�� 3���� �Ѿ�� ���� �� ���ٴ� �޼����� �߰� �α��� �� ȭ������ �ǵ��ư��� �Ѵ�.
	//�̹� �뿩 ���� å�� �������� �õ��� ��� ���� ���� �뿩 ���̶�� �޼����� �߰� ���� �˻� ȭ������ �ǵ��ư��� �Ѵ�.
	//������ �ݳ��� �� ���� �ݳ��� ���̳İ� ���� ������ ��ҹ��� ���� ���� y�� n�� �ƴ� �ٸ� ���ڰ� �Է��� �Ǹ� ������ �ٽ� �����ְ� ����ڿ��� �Է��� �޴´�.
	public void studbrbk() throws IOException,SQLException{
		
		String bname, author, publisher, availability, renting_stud;
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
		System.out.println("�ڽ��� �뿩 ���� ���� ���");
		System.out.println("---------------------------");
		
		// ������� ���� 11��
		
		
	}
}
