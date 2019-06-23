package ch3;

//삼항연산자만 이용해 주어진 숫자가 양수인지 0인지 음수인지 출력
public class Ex3 {
	public static void main (String args[]) {
		int num=-10;
		System.out.println(num>0 ? "양수" : num ==0 ? "0" : "음수");
	
		System.out.println(num>0 ? "양수" : (num ==0 ? "0" : "음수"));
	}
}
