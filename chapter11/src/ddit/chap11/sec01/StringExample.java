package ddit.chap11.sec01;
/*
 * String class = immutable class
 * 1)charAt(int index) - index��° ���� ��ȯ
 * 2)compareTo(Object obj) - �� ���ڿ��� ���Ͽ� ������ 0
 * 		obj���� ������ ����, ũ�� ��� ��ȯ
 * 3)indexOf(character sequence) - character sequence�� ���õ� ���ڿ��� ù ���� ��ġ�� ��ȯ 
 * 4)trim() - ��ȿ ����(����)�� ����
 * 5)substring(int begin, int end) - begin���� end-1��°������ ���ڿ��� ����
 * 6)length() - ���ڿ� ���� ���� ��
 */
public class StringExample {
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		method5();
	}
	public static void method1() {
		String str = "apple persimmon banana";
		int cnt = 0;
		
		for(int i =0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
					str.charAt(i) == 'o' ||str.charAt(i) == 'u' ||
					str.charAt(i) == 'i') {
				cnt++;
			}
		}
	System.out.println("������ ��: " + cnt);
	}
	public static void method2() {
		String name = "������";
		System.out.println(name.compareTo("�̼���"));
		System.out.println(name.compareTo("������"));
		System.out.println(name.compareTo("�Ѷ��"));
	}
	
	public static void method3() {
		String str = "������ �߱� ���� 846";
		
		System.out.println(str.indexOf(2)); //���� 2 ã�� => ��� -1 ��ȯ
		System.out.println(str.indexOf("����"));
		System.out.println(str.indexOf("������"));
		System.out.println(str.indexOf("8", 3));
	}
	
	public static void method4() {
		String str = "ȫ�浿     ";
		
		if(str.trim().equals("ȫ�浿")) { //����� ������� ����=>���� �ڸ��� equals ����
			System.out.println("���� ����");
		}else {
			System.out.println("�ٸ� ����");
		}
	}
	
	public static void method5() {
		String str = "������ �߱� ���� 846";
		System.out.println(str.substring(1, 5));
		System.out.println(str.substring(1, str.length()-1)); //length:����=>1����
		System.out.println(str.substring(1));
		System.out.println(str.substring(1, 1)); //�ڸ� �� ��� ��� ��ȯ �ȵ�
	}
}
