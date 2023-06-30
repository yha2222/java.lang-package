package ddit.chap11.sec02;

public class WrapperExample {

	public static void main(String[] args) {
		//boxing
		Integer i1 = new Integer(10);
		Integer i2 = Integer.valueOf(50);
		Integer i3 = Integer.valueOf("500");
		
		if(i3 > 200) {
			System.out.println("true");
		}
		
		int res = i1 + i2; //auto unboxing 		//작성하는 거
		int r = i1.intValue() + i2.intValue();  //컴파일 되는 거
		
		int res1 = Integer.parseInt("50");
		int res2 = Integer.parseInt("3F", 16);  //3F(16진수)=>10진수(63)
		String binaryStr = Integer.toBinaryString(30); //30 => 2진수
		String hexaStr = Integer.toString(63, 16); //63(10진수) => 16진수(3F)
		String hexaStr1 = Integer.toHexString(63); //Hexa(16진수) => 3F 출력
		
		System.out.println(res);
		System.out.println(res2);
		System.out.println(binaryStr);
		System.out.println(hexaStr);
		System.out.println(hexaStr1);
	}
}
