package sec04_userexception.EX02;

public class ExceptionMethod_1 {
public static void main(String[] args) {
	//예외객체 생성시 메세지 전달하지 않는 경우
	try {throw new Exception();//이 서짐에서 예외발생 값이 없어서 null로 출력
	} catch(Exception e)
	{System.out.println(e.getMessage());}
	
	
	//예외객체 생성시 메세지 전달하는 경우
	try {throw new Exception("예외메세지");//이 서짐에서 예외발생
	} catch(Exception e)
	{System.out.println(e.getMessage());}
}
}
