package PracticeChap1;

public class A {
	public int a=1;
	private int b=2;
	protected int c=3;
	int d=4;
	
	
	public static void main(String[] args) {
		A  a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
	}
    class B{
    	public static void main(String[] args) {
			
		
        A  a = new A();
    	System.out.println(a.a);
    	System.out.println(a.c);
    	System.out.println(a.d);

        }
    }
    class C extends A{
    	public static void main(String[] args) {
        	C c = new C();
        	
            	System.out.println(c.a);
            	System.out.println(c.c);
            	System.out.println(c.d);
    	
        	
    	}
    }
    


    

