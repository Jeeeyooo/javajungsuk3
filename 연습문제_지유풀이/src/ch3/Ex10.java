package ch3;

public class Ex10 {

	//ch가 대문자이면 소문자로 바꾸고 아니면 그냥 출력
	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = ('A'<=ch && ch<='Z') ? (char)(ch+32) : ch;
		System.out.println(lowerCase);
		System.out.println('A'-'a'); //32차이남
	}
}
