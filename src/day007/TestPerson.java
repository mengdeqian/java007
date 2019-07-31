package day007;

public class TestPerson {

	public static void main(String[] args){
		
		Person p = new Person();
		p.name = "fef";
		p.age = 432;
		System.out.println(p.name + " " + p.age);
		p.show();
	}
}
