package Stud;

import java.io.*;

public class StudBrbk {

	public void studbrbk() throws IOException{
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		for(int i=1;i==10;i++){//���⼭ i�� sql�� �˻��̵� ����
			System.out.println(i+". ������ ");
			System.out.println("����: ");
			System.out.println("���ǻ�: ");
			System.out.println("ISBN: ");
			System.out.println("���Ⱑ�ɿ���: ");
			System.out.println("�뿩��: ");
		}
	}
}