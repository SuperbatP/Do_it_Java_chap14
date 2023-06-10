package sec02_exceptionhandlingsyntax.EX02;

public class MultiCatch_1 {
public static void main(String[] args) {
	//단일 try-catch
	try {System.out.println(3/0);//실행예외 ArithmeticException
	} 
	catch(ArithmeticException e) {
		System.out.println("숫자는 0으로 나눌수 없습니다.");}
	finally {System.out.println("프로그램 종료");}//중복한 코드를 한 줄로 표현
	
	try {int num =Integer.parseInt("10A");//실행예외 NumberFormatException
		} 
	catch(NumberFormatException e) {
		System.out.println("숫자로 바꿀수 없습니다.");}
	finally {System.out.println("프로그램 종료");}//중복한 코드를 한 줄로 표현
	
	//다중 try-catch(catch가 여러개)
	try {System.out.println(3/0);
	int num =Integer.parseInt("10A");}
	
	catch(ArithmeticException e) {
		System.out.println("숫자는 0으로 나눌수 없습니다.");}
	catch(NumberFormatException e) {
		System.out.println("숫자로 바꿀수 없습니다.");}
	
	finally {System.out.println("프로그램 종료");}
}
}
