package ddit.chap11.sec01;

public class ObjectExample {

	public static void main(String[] args) {
		Person p1 = new Person("정몽주");
		System.out.println("p1의 클래스 정보 : " + p1.getInfo());
		System.out.println("p1의 내용 : " + p1.toString());
		
		Person p2;
		p2 = (Person)p1.clone(); //Object 타입 반환(모든 클래스의 부모 클래스)
		System.out.println("p2의 클래스 정보 : " + p2.getInfo());//주소값 다름
		System.out.println("p2의 내용 : " + p2.toString());//복제했으니까 내용은 같음
	}

}
//Person 복제 - heap 메모리 다른 영역에 만들어짐, 내용 똑같음 => deep copy
class Person implements Cloneable {
	public String name;
	Person(){}
	Person(String name){
		this.name = name;
	}
	
	String getInfo() {
		//Object toString 메소드랑 똑같은 내용
		return getClass().getName() + '@' + Integer.toHexString(hashCode());
		//toHexString:wrapper 매개변수=>16진수 문자열 / hashCode:10진수 주소값 반환
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	//clone 매서드 재정의 방법
	@Override
	public Object clone() {
		try {
			//자기 자신 타입으로 downcasting
			// Object => Person
			Person p = (Person)super.clone();
			return p;
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
