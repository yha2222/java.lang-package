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
		
		int res = i1 + i2; //auto unboxing 		//�ۼ��ϴ� ��
		int r = i1.intValue() + i2.intValue();  //������ �Ǵ� ��
		
		int res1 = Integer.parseInt("50");
		int res2 = Integer.parseInt("3F", 16);  //3F(16����)=>10����(63)
		String binaryStr = Integer.toBinaryString(30); //30 => 2����
		String hexaStr = Integer.toString(63, 16); //63(10����) => 16����(3F)
		String hexaStr1 = Integer.toHexString(63); //Hexa(16����) => 3F ���
		
		System.out.println(res);
		System.out.println(res2);
		System.out.println(binaryStr);
		System.out.println(hexaStr);
		System.out.println(hexaStr1);
	}
}
