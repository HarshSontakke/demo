package PracticeChap1;

class Teacher{
	public void stud(String name,int rollno) {
		System.out.println(name+rollno);
		
	}
	static void managment(double sal,int id) {
		System.out.println(sal+id);
		
	}
	
}
public class StaticNonS {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.stud("Harsh", 34);
		Teacher.managment(100000,112);
	}

}
