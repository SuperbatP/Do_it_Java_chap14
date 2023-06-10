package sec01_typeofexception.EX02;

class A{}
class B extends A{}

public class UncheckedException {
public static void main(String[] args) {
	//UneheckedException(실행예외)=RuntimeException
	//문법상에는 문제가 없지만 실행하면 오류가 보임
	//1.ArithmeticExcetion
//	System.out.println(3/0);
	
	//2.ClassCastException
//	A a=new A();
//	B b=(B)a;
	
	//3.ArrayIndexOutOfBoundException
//	int[] array= {1,2,3};
//	System.out.println(array[3]);
	
	//4.NumberFormatException
//	int num = Integer.parseInt("10!");
	
	//5.NullPointerException
//	String str = null;
//	System.out.println(str.charAt(2));
}
}
