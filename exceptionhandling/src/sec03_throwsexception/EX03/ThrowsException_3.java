package sec03_throwsexception.EX03;
class A{
	void abc() {bcd();}
void bcd() {try {
	Class cls=Class.forName("java.lang.Object");//일반예외 : ClassNotFoundException
	Thread.sleep(1000); //일반예외 : InterruptedException
} 
catch (InterruptedException | ClassNotFoundException e) {//예외처리 구문-catch가 있으면 예외처리 된 것.
}}
}

class B{
	void abc() {try {
		bcd();//일반예외 : InterruptedException
	} catch (InterruptedException | ClassNotFoundException e) {	}}//예외처리 구문(catch가 있으면 예외처리 된 것.
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls=Class.forName("java.lang.Object");
		Thread.sleep(1000);}
}

public class ThrowsException_3 {

}
