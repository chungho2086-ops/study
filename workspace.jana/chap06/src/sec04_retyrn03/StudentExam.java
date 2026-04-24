package sec04_retyrn03;

public class StudentExam {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "송상민";
		s1.age = 25;
		
		s1.name = null;
		s1.age = -25;
		
		s1.setName("송상민");
		String name = s1.getName();
		System.out.println("이름: "+ name);
	}

}
