package ch3;

//화씨를 섭씨로 바꾸고 round를 사용하지 않고 소수점3째자리에서 반올림
public class Ex7 {
	public static void main(String args[]) {
		int f = 100;
		float c = (int)((5/9f * (f - 32))*100 + 0.5) / 100f;
		System.out.println(c);
	}
}
