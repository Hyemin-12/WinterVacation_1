import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			//�ݺ��� �����
			value = scan.nextInt();
			System.out.println("�Է� ���� �� : " + value);
			
		}while(value != 10);
		
		System.out.println("�ݺ��� ����!!");
	}

}
