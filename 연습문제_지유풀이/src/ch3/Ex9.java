package ch3;

//ch가 영문자이거나 숫자일때만 b의 값이 true이도록
public class Ex9 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z') || ('0'<=ch && ch<='9');
		
		System.out.println(b);
		
	}

}
