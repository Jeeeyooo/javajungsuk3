package ch3;

public class Ex10 {

	//ch�� �빮���̸� �ҹ��ڷ� �ٲٰ� �ƴϸ� �׳� ���
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = ('A'<=ch && ch<='Z') ? (char)(ch+32) : ch;
		System.out.println(lowerCase);
		System.out.println('A'-'a'); //32���̳�
	}
}
