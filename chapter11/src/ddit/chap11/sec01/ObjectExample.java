package ddit.chap11.sec01;

public class ObjectExample {

	public static void main(String[] args) {
		Person p1 = new Person("������");
		System.out.println("p1�� Ŭ���� ���� : " + p1.getInfo());
		System.out.println("p1�� ���� : " + p1.toString());
		
		Person p2;
		p2 = (Person)p1.clone(); //Object Ÿ�� ��ȯ(��� Ŭ������ �θ� Ŭ����)
		System.out.println("p2�� Ŭ���� ���� : " + p2.getInfo());//�ּҰ� �ٸ�
		System.out.println("p2�� ���� : " + p2.toString());//���������ϱ� ������ ����
	}

}
//Person ���� - heap �޸� �ٸ� ������ �������, ���� �Ȱ��� => deep copy
class Person implements Cloneable {
	public String name;
	Person(){}
	Person(String name){
		this.name = name;
	}
	
	String getInfo() {
		//Object toString �޼ҵ�� �Ȱ��� ����
		return getClass().getName() + '@' + Integer.toHexString(hashCode());
		//toHexString:wrapper �Ű�����=>16���� ���ڿ� / hashCode:10���� �ּҰ� ��ȯ
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	//clone �ż��� ������ ���
	@Override
	public Object clone() {
		try {
			//�ڱ� �ڽ� Ÿ������ downcasting
			// Object => Person
			Person p = (Person)super.clone();
			return p;
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
