package Try_catch;

public class Finally_ex {
	public static void main(String[] args) {
		int[] iaa = {1,2,3};
		
//		finally 는 try 구문이 실행되던지, catch 구문이 실행 되던지 상관없이 무조건 실행 하는 구문이다.
//		예외가 발생하던 예외가 발생하지 않던 무조건 실행
		
		try {
			System.out.println("************************");
			System.out.println(iaa[3]);
			System.out.println("======================");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("무조건 실행 함");
		}
	}

}
