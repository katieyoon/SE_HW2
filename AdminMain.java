package test1;
import java.io.*;
import java.sql.*;

public class AdminMain {
	
	//public void adminmain() throws IOException{
	//!!!!!!!!!!����!!!!!!!!!1!!!!!!
	//���� ���� ���α׷� ¥���� main�� �ʿ��ؼ� main���� ����!
	//�� ��ĥ ��쿡�� ��ó�� adminmain()���� ����!!
	
	public static void main(String[] args) throws IOException, SQLException{
		System.out.println("---------------------------");
		System.out.println("admin�� ȯ���մϴ�.");
		System.out.println("---------------------------");
		AdminMainMenu amm=new AdminMainMenu();
		amm.adminmainmenu();
	}
	
}