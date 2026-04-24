package chap07;

public class ExtendsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child = new Child();
		
		System.out.println("------------");
		
		child.printName();
		// Child를 통해서 부모인 Parent 필드에 접근가능
		System.out.println( "child.name: "+ child.name );
		
		// Child를 통해서 부모인 Parent 필드에 접근가능
		String n = child.getName();
		System.out.println("child.getName(): "+ n);
	}

}
