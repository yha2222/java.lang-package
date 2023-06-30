package ddit.chap11.sec01;
//인간 알 수 없는 문자로 정보 전달
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* Class클래스
 * - 자바 클래스와 인터페이스에 대한 메터데이터(자바 핵심 데이터->클래스명, 생성자, 필드정보, 매서드정보)관리
 * - getClass(), forName() - new 연산자에 의해 객체 생성되었을 때 정보 얻을 수 있음 
 * 파일 정보 얻기
 */
public class ClassExample {

	public static void main(String[] args) throws Exception {
		Person p1 = new Person("홍길동");
		Class c1 = p1.getClass(); // 클래스 파일 만들어져야 => 해당 객체 생성 => 
		System.out.println(c1.getName()); //패키지+클래스명
		System.out.println(c1.getSimpleName()); //축약된 클래스명 => 클래스명만
		System.out.println(c1.getPackage().getName());//패키지 명만
		
		//생성자메서드 - 배열로 반환
		//생성자 메서드가 하나 이상 있을 수 있으니까 배열
		Constructor[] constructors = c1.getDeclaredConstructors();//class 클래스 
		Person p = null;
		for(Constructor c : constructors) {
			System.out.print(c.getName() + "(");
			printParameters(constructors);
			System.out.println(")");
		}
		//멤버필드
		Field[] fields = c1.getFields(); //public field만 반환 - 필드 타입 배열로 저장
		Field[] fieldInher = c1.getDeclaredFields(); //상속받은 field
		for(Field field : fields) {
			System.out.println("필드명 : " + field.getName());
			System.out.println("필드타입: " + field.getType());
		}
		//메서드
		//Method[] methods = c1.getMethods(); //상속메서드 포함
		Method[] methods = c1.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println("메서드명 " + method.getName());
			System.out.println("반환타입: " + method.getReturnType());
		}
		
	}
	
	public static void printParameters(Constructor[] parameters) {
		for(int i = 0; i < parameters.length; i++) {
			if(i<(parameters.length-1)) {				
				System.out.print(",");
				
			}
		}
	}

}
