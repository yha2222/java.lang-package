package ddit.chap11.sec01;
/*
 * String class = immutable class
 * 1)charAt(int index) - index번째 문자 반환
 * 2)compareTo(Object obj) - 두 문자열을 비교하여 같으면 0
 * 		obj보다 작으면 음수, 크면 양수 반환
 * 3)indexOf(character sequence) - character sequence로 제시된 문자열의 첫 문자 위치값 반환 
 * 4)trim() - 무효 공백(양쪽)을 제거
 * 5)substring(int begin, int end) - begin에서 end-1번째까지의 문자열을 추출
 * 6)length() - 문자열 내의 문자 수
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
	System.out.println("모음의 수: " + cnt);
	}
	public static void method2() {
		String name = "정몽주";
		System.out.println(name.compareTo("이순신"));
		System.out.println(name.compareTo("정몽주"));
		System.out.println(name.compareTo("한라산"));
	}
	
	public static void method3() {
		String str = "대전시 중구 계룡로 846";
		
		System.out.println(str.indexOf(2)); //숫자 2 찾기 => 없어서 -1 반환
		System.out.println(str.indexOf("계룡로"));
		System.out.println(str.indexOf("계족산"));
		System.out.println(str.indexOf("8", 3));
	}
	
	public static void method4() {
		String str = "홍길동     ";
		
		if(str.trim().equals("홍길동")) { //기술된 순서대로 적용=>공백 자르고 equals 실행
			System.out.println("같은 내용");
		}else {
			System.out.println("다른 내용");
		}
	}
	
	public static void method5() {
		String str = "대전시 중구 계룡로 846";
		System.out.println(str.substring(1, 5));
		System.out.println(str.substring(1, str.length()-1)); //length:개수=>1부터
		System.out.println(str.substring(1));
		System.out.println(str.substring(1, 1)); //자를 수 없어서 결과 반환 안됨
	}
}
