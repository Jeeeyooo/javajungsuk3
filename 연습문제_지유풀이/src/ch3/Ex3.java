package ch3;

//���׿����ڸ� �̿��� �־��� ���ڰ� ������� 0���� �������� ���
public class Ex3 {
	public static void main (String args[]) {
		int num=-10;
		System.out.println(num>0 ? "���" : num ==0 ? "0" : "����");
	
		System.out.println(num>0 ? "���" : (num ==0 ? "0" : "����"));
	}
}
