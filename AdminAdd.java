package test1;
import java.io.*;
import java.sql.*;

public class AdminAdd {
	
	AdminAdd() throws IOException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	public void adminadd() throws IOException, SQLException{
		
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
		
		int n=0;

		System.out.println("---------------------------");
		System.out.println("�����߰�");
		System.out.println("---------------------------");
		
		//�����ڰ� ���ο� ������ �߰��� ��, �Էµ� ������ ���ǿ� ���� ������ �߸� �Է��ߴٴ� �޼��� ��� �� �ٽ� �Է¹ް� �Ѵ�.
		//ISBN�ߺ�ó��!! �̰� �ʰ� �ó� �쾯.. �̸� ������ �ٷ� �ϴ°ǵ�; 
		
		System.out.print("������: ");
		bname=br.readLine();
		System.out.print("����: ");
		author=br.readLine();
		System.out.print("���ǻ�: ");
		publisher=br.readLine();		
		System.out.print("ISBN: ");
		ISBN=Integer.parseInt(br.readLine());

		sql="insert into book values(?,?,?,?,?,?)";
		ps=conn.prepareStatement(sql);
		ps.setString(1, bname);
		ps.setString(2, author);
		ps.setString(3, publisher);
		ps.setInt(4, ISBN);
		ps.setString(5, availability);
		ps.setString(6, renting_stud);
		n=ps.executeUpdate();
		System.out.println("---------------------------");
		if(n>0){
			System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�.");
			System.out.println("---------------------------");
		}
		else{
			System.out.println("���� �Է��� �����Ͽ����ϴ�.");
			System.out.println("---------------------------");
			AdminAdd aa=new AdminAdd();
			aa.adminadd();
		}	

		AdminMainMenu amm=new AdminMainMenu();
		amm.adminmainmenu();
	}
}
