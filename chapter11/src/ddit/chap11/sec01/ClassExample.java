package ddit.chap11.sec01;
//�ΰ� �� �� ���� ���ڷ� ���� ����
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* ClassŬ����
 * - �ڹ� Ŭ������ �������̽��� ���� ���͵�����(�ڹ� �ٽ� ������->Ŭ������, ������, �ʵ�����, �ż�������)����
 * - getClass(), forName() - new �����ڿ� ���� ��ü �����Ǿ��� �� ���� ���� �� ���� 
 * ���� ���� ���
 */
public class ClassExample {

	public static void main(String[] args) throws Exception {
		Person p1 = new Person("ȫ�浿");
		Class c1 = p1.getClass(); // Ŭ���� ���� ��������� => �ش� ��ü ���� => 
		System.out.println(c1.getName()); //��Ű��+Ŭ������
		System.out.println(c1.getSimpleName()); //���� Ŭ������ => Ŭ������
		System.out.println(c1.getPackage().getName());//��Ű�� ��
		
		//�����ڸ޼��� - �迭�� ��ȯ
		//������ �޼��尡 �ϳ� �̻� ���� �� �����ϱ� �迭
		Constructor[] constructors = c1.getDeclaredConstructors();//class Ŭ���� 
		Person p = null;
		for(Constructor c : constructors) {
			System.out.print(c.getName() + "(");
			printParameters(constructors);
			System.out.println(")");
		}
		//����ʵ�
		Field[] fields = c1.getFields(); //public field�� ��ȯ - �ʵ� Ÿ�� �迭�� ����
		Field[] fieldInher = c1.getDeclaredFields(); //��ӹ��� field
		for(Field field : fields) {
			System.out.println("�ʵ�� : " + field.getName());
			System.out.println("�ʵ�Ÿ��: " + field.getType());
		}
		//�޼���
		//Method[] methods = c1.getMethods(); //��Ӹ޼��� ����
		Method[] methods = c1.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println("�޼���� " + method.getName());
			System.out.println("��ȯŸ��: " + method.getReturnType());
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
