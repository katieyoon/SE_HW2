package library;
import java.io.*;


public class MainMenu1 {
	public void mainmenu1() throws IOException{
		
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sr);
		
		String id, pw, name, major;
		
		System.out.println("---------------------------");
		System.out.println("ȸ������");
		System.out.println("---------------------------");
		System.out.print("���̵�(�й�):	");
		id=br.readLine();
		//���̵� �ߺ� üũ. �ߺ��Ǿ��� ���, �ٽ� �Է¹���.
		
		System.out.print("��й�ȣ:	");
		pw=br.readLine();
		//���ܻ���ó��
		//��й�ȣ�� ���ڷθ� �̷������ �ϰ�, �ƴ� ���, ���ڷθ� �Է��϶�� �޼����� �� ��, �ٽ� �Է�
		//��й�ȣ�� 8�ڸ� ���Ͽ��� �ϰ�, �ƴ� ���, 8�ڸ� ���Ϸθ� �Է��϶�� �޽����� ����, �ٽ� �Է�.
		
		System.out.print("�̸�:	");
		name=br.readLine();
		//���ܻ���ó��? -> ���� �ƹ��͵� �������� ����.
		
		System.out.print("�а�:	");
		major=br.readLine();
		//���ܻ��� ó��? -> ���� �ƹ��͵� �������� ����.
	}
}
