package sec03_throwsexception.EX01;
//하위메서드에서 직접 예외를 처리하는 경우
class A{
	void abc() {bcd();}
void bcd() {try {
	Thread.sleep(1000); //일반예외 : InterruptedException
} 
catch (InterruptedException e) {//예외처리 구문(catch가 있으면 예외처리 된 것.
}}
}

//예외를 호출메서드로 전가하는 경우

class B{
	void abc() {try {
		bcd();//일반예외 : InterruptedException
	} catch (InterruptedException e) {	}}//예외처리 구문(catch가 있으면 예외처리 된 것.
	void bcd() throws InterruptedException {Thread.sleep(1000);}
}
public class ThrowsException_1 {

}
