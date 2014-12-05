package test1;

import java.io.*;
import java.sql.*;

public class AdminSearch {
	
	AdminSearch() throws IOException, SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	
	public void adminsearch() throws IOException, SQLException{
		
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
		
		//while(true){
		System.out.println("---------------------------");
		System.out.println("�����˻�");
		System.out.println("---------------------------");
		
		////////!!!!!!����!!! �Ϻθ� �˻��ص� ���� �� �ֵ����ϱ�!!
		System.out.println("ã�� ���� ���� ������ �Է����ּ���.");
		System.out.print("> ");
		bname=br.readLine();
		sql="select * from book where bname=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1,bname);
		rs=ps.executeQuery();
		
		int i=0; //���⼭ i�� sql�� �˻��̵� ����
		while(rs.next()){
			i++;
			System.out.println(i+". ������: "+rs.getString(1));
			System.out.println("����: "+rs.getString(2));
			System.out.println("���ǻ�: "+rs.getString(3));
			System.out.println("ISBN: "+rs.getInt(4));
			System.out.println("���Ⱑ�ɿ���: "+rs.getString(5));
			System.out.println("�뿩��: "+rs.getString(6));
		}
		
		//while(true){
		System.out.println("�����̳� ������ �� ������ ISBN�� �Է����ּ���.(��,0�� �Է��� �ÿ� ����ȭ������ �̵�)");
		System.out.print("> ");
		ISBN=Integer.parseInt(br.readLine());
		
		if(ISBN==0){
			AdminMainMenu amm=new AdminMainMenu();
			amm.adminmainmenu();
		}
		/////////////������� �ٽ� �պ�����!!!///////////
		else{
			System.out.println("---------------------------");
			System.out.println("�� �����ϼ̽��ϴ�.");
			System.out.println("1.����");
			System.out.println("2.����");
			System.out.println("3.���� �˻����� �̵�");
			System.out.print("> ");
		
			int k=0;
			int n = Integer.parseInt(br.readLine());
		
			if(n==1){
				sql="select * from book where ISBN=?";
				ps=conn.prepareStatement(sql);
				ps.setInt(4,ISBN);
				rs=ps.executeQuery();
				
				if(rs.next()){
					System.out.println("������: ");
					bname=br.readLine();
					System.out.println("����: ");
					author=br.readLine();
					System.out.println("���ǻ�: ");
					publisher=br.readLine();
					
					sql="update book set bname=?, author=?, publisher=? where ISBN=?";
					ps=conn.prepareStatement(sql);
					ps.setString(1, bname);
					ps.setString(2, author);
					ps.setString(3, publisher);
					ps.setInt(4, ISBN);
					ps.setString(5, availability);
					ps.setString(6, renting_stud);
					ps.executeUpdate();
				}
				else{
					System.out.println(ISBN+"�� �������� �ʴ� ���� �Դϴ�. �ٽ� �Է��ϼ���");
					AdminSearch as=new AdminSearch();
					as.adminsearch();
				}
			}
			else if(n==2){
				AdminSearch as = new AdminSearch();
				as.admindelete();
			}
			else if(n==3){
				AdminSearch as=new AdminSearch();
				as.adminsearch();
			}
			
			////////������� �պ�����!!!!//////
			
			else{
				System.out.println("�ٽ� �Է��ϼ���.");
				System.out.println("1.����");
				System.out.println("2.����");
				System.out.println("3.���� �˻����� �̵�");
				System.out.print("> ");
			}
		}
	}
		//}
	//}
	
	public void adminedit(){
		
		System.out.println("---------------------------");
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}
	
	public void admindelete(){
		System.out.println("---------------------------");
		System.out.println("�����Ǿ����ϴ�.");
	}

}
