package ch3;

//사과를 담는데 총 몇개의 바구니가 필요한지
public class Ex2 {

	public static void main(String[] args) {

			int apple = 123;
			int basketCapacity = 10;
			System.out.println(apple/basketCapacity +(apple%basketCapacity != 0? 1 : 0));

	}

}
