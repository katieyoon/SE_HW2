package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdminSearch {
	public void adminsearch() throws IOException{
		
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
		
		while(true){
		System.out.println("---------------------------");
		System.out.println("�����˻�");
		System.out.println("---------------------------");
		
		System.out.println("ã�� ���� ���� ������ �Է����ּ���.");
		System.out.print("> ");
		
		//sql
		for(int i=1;i==10;i++){//���⼭ i�� sql�� �˻��̵� ����
			System.out.println(i+". ������ ");
			System.out.println("����: ");
			System.out.println("���ǻ�: ");
			System.out.println("ISBN: ");
			System.out.println("���Ⱑ�ɿ���: ");
			System.out.println("�뿩��: ");
		}
		
		while(true){
		System.out.println("�����̳� ������ �� ������ ISBN�� �Է����ּ���.(��,0�� �Է��� �ÿ� ����ȭ������ �̵�");
		System.out.print("> ");
		
		System.out.println("---------------------------");
		System.out.println("�� �����ϼ̽��ϴ�.");
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.���� �˻����� �̵�");
		System.out.print("> ");
		
		
		int n = Integer.parseInt(br.readLine());
		
		if(n==1){
			AdminSearch aa = new AdminSearch();
			aa.adminedit();
		}
		else if(n==2){
			AdminSearch as = new AdminSearch();
			as.admindelete();
		}
		else if(n==3){
			break;
		}
		else
			System.out.println("�ٽ� �Է��ϼ���.");
		}
		}
	}
	
	public void adminedit(){
		System.out.println("---------------------------");
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}
	
	public void admindelete(){
		System.out.println("---------------------------");
		System.out.println("�����Ǿ����ϴ�.");
	}

}
