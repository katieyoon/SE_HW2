package Stud;

import java.io.*;

public class StudSrch {
	
	public void studsrch() throws IOException{
			
		InputStreamReader sr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sr);
			
		while(true){
			System.out.println("---------------------------");
			System.out.println("���� �˻�");
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
				System.out.println("�����ϰ� ���� ������ ISBN�� �Է����ּ���.(��,0�� �Է��� �ÿ� ����ȭ������ �̵�");
				System.out.print("> ");
			
				System.out.println("---------------------------");
				System.out.println("�� �����ϼ̽��ϴ�.");
				System.out.println("1.�뿩");
				System.out.println("2.���� �˻����� �̵�");
				System.out.print("> ");
			
				int button = Integer.parseInt(br.readLine());
			
				switch(button)
				{
					case 1:
					{
						StudSrch ss = new StudSrch();
						ss.studbrrw();
						break;
					}
					case 2:
					{
					
						break;
					}
					default:
						System.out.println("�ٽ� �Է��ϼ���.");
				}
			}
		}
	}
		
	public void studbrrw(){
		System.out.println("---------------------------");	
		System.out.println("���������� ���� �뿩�� �Ϸ�Ǿ����ϴ�.");
	}
}

