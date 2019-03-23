package hello;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello everyone!");
		Student stu=new Student();
		stu.speak("Students!");
	}
}
class Student{
	public void speak(String s) {
		System.out.println(s);
	}
}
