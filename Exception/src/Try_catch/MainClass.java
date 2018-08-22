package Try_catch;

public class MainClass {
	
	public static void main(String[] args) {
		int i = 10;
		int j =  2;
		
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		
//		예외 처리 문법 try~ catch
//		분모가 0인경우 나누기 를 할수 없으므로 아래 프린트 구문은 더하기 까지만 실행 되고 오류 때문에 아래 빼기와 곱하기는 실행
//		되지 않을 것이다.
//		이럴때 위에 로직에 이상이 있더라도 다음 아래 로직을 실행 할수 있게 해주는 것이 try~ catch 문이다.
		int a = 10;
		int b = 0;
		
		System.out.println(a + b);
		try {// 문제가 발생할수 있는 로직을 기술한다.
		System.out.println(a / b);
//		               익셉션 객체로 파라미터를 받겠다.
		}catch(Exception e){ // try{}안에서 문제가 발생 했을때 대처방안을 기술한다.
//			.getMessage() 어떤 에러인지 보여주는 익셉션 클래스안의 메서드 
			System.out.println(e.getMessage());
//			.printStackTrace() 상세히 에러메세지를 보여주는 메서드
//			e.printStackTrace();
		}
		System.out.println(a - b);
		System.out.println(a * b);
		
		
//////////////////////////////////////////////////////////////////////////////////////////
		
//		try~ catch  catch문에 예외처리를 여러 개 할 수도 있습니다.
		
		try {
			
		}catch(ArrayIndexOutOfBoundsException f) {
			
		}catch(NumberFormatException c) {
			
		}catch(Exception e) {
			
		}
		
		
	}

}
