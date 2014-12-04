package library;
import java.io.*;
import java.sql.*;


public class MainMenu1 {

	MainMenu1() throws IOException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			//System.exit(0);
		}
	}
	
	public void mainmenu1() throws IOException, SQLException{
		
		String sid, pw, name, major;	
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sr);
		
		String jdbcUrl="jdbc:mysql://127.0.0.1:3306/library";
		String userID = "root";
		String userPass="1111";
		
		Connection conn = DriverManager.getConnection(jdbcUrl, userID, userPass);
		PreparedStatement ps= null;
		String sql=null;
		ResultSet rs = null;
		
		int n=0;
		sql="select * from user where sid=?";
		ps=conn.prepareStatement(sql);
		
		System.out.println("---------------------------");
		System.out.println("ȸ������");
		System.out.println("---------------------------");
		System.out.print("���̵�(�й�):	");
		sid=br.readLine();
		ps.setString(1,  sid);
		rs=ps.executeQuery();
		//���̵� �ߺ� üũ. �ߺ��Ǿ��� ���, �ٽ� �Է¹���.
		
		if(!rs.next()){
			System.out.print("��й�ȣ:	");
			pw=br.readLine();
			//���ܻ���ó��
			//��й�ȣ�� ���ڷθ� �̷������ �ϰ�, �ƴ� ���, ���ڷθ� �Է��϶�� �޼����� �� ��, �ٽ� �Է�
			//��й�ȣ�� 8�ڸ� ���Ͽ��� �ϰ�, �ƴ� ���, 8�ڸ� ���Ϸθ� �Է��϶�� �޽����� ����, �ٽ� �Է�.
		
			System.out.print("�̸�:	");
			name=br.readLine();
			System.out.print("�а�:	");
			major=br.readLine();
			
			sql="insert into user values(?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,  sid);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, major);
			n=ps.executeUpdate();
			if(n>0){
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�");
			}
			else{
				System.out.println("ȸ�������� �����Ͽ����ϴ�.");
			}
		}
		else{
			System.out.println("������ ���̵� �����մϴ�.");
			mainmenu1();
		}
	}	
}
