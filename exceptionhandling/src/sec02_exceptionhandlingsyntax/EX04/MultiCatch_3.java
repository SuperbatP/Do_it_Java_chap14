package sec02_exceptionhandlingsyntax.EX04;

public class MultiCatch_3 {
public static void main(String[] args) {
	//1.catch블록을 각각 처리한 경우
	try {System.out.println(3/1);
	int num =Integer.parseInt("10A");}
	
	catch(NumberFormatException e) {
		System.out.println("예외가 발생했습니다.");}
	catch(ArithmeticException e) {
		System.out.println("예외가 발생했습니다.");}
	
	//2.catch블록을 하나로 통합
	try {System.out.println(3/1);
	int num =Integer.parseInt("10A");}
	
	catch(NumberFormatException | ArithmeticException e) {//| or 연산자
		System.out.println("예외가 발생했습니다.");}

}
}
