package ch3;

public class Ex8 {

	public static void main(String[] args) {
		byte a = 10, b = 20;
		//byte c = a+b; // 30���� ��µǾ����
		byte c = (byte) (a+b); 
		
		char ch = 'A';
		//ch = (ch + 2); //'C'�� ��µǾ����
		ch = (char)(ch + 2);
		
		//float f = 3/2; //1.5�� ��µǾ����
		float f = 3/2f;
		//long l = 3000*3000*3000; //27000000000�� ��µǾ����
		long l = 3000*3000*3000L;
		
		float f2 = 0.1f;
		double d = 0.1;
		//boolean result = d==f2; //false�� ��µǾ����
		boolean result = (float)d==f2;
		
		System.out.println(c);
		System.out.println(ch);
		System.out.println(f);
		System.out.println(l);
		System.out.println(result);
	}

}
