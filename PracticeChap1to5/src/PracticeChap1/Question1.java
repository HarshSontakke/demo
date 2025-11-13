package PracticeChap1;


class Emp{
	String name="harsh";
	int id =10;
	double sal=1000;
	String add="Usa";
	
	public void displayIn() {
		// TODO Auto-generated method stub
		System.out.println(name+id+sal+add);

	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", add=" + add + "]";
	}
	}


public class Question1 {
public static void main(String[] args) {
	Emp emp = new Emp();
	emp.displayIn();
	
}

}
