package Try_catch;

public class BasicException {
	
	public static void main(String[] args) {
		
//		ArrayINdexOutOfBoundsException 배열을 사용시 존재하지 않는 index값을 호출하면 발생 합니다.
		int[] iArr = {0,1,2,3};
		
		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		System.out.println(iArr[2]);
		System.out.println(iArr[3]);
		
		System.out.println(iArr[4]);
		
///////////////////////////////////////////////////////////////////////
//		NullPointerException 존재하지 않는 객체를 가리킬 때 발생 합니다.

//		객체 데이터를 생성 했을때 아무런 주소값도 가르키고 있지않을 때 를  Null이라 말한다.
		String str = null;
//		str문자열 객체에 0번째 문자를 가져와서 캐릭터 c에 담겠다는 말인데 str의 객체는 아무런 주소값도 가르키고 있지않다.
		char c = str.charAt(0);
		
////////////////////////////////////////////////////////////////////////////
//		NumberFormatException 문자를 숫자로 처리할때 발생한다.
		
		String str1 = "aa";
		int i = 10;
//		          str문자열을 정수형으로 타입변환 하여 더하기 하라는 말인데 문자열을 정수로 바꿧 지만 정수형때가아니므로 
//		더할수가 없다.
		int j = Integer.parseInt(str) + i;
		
//////////////////////////////////////////////////////////////////////////////////
//		DB관련 Exception
		/* ClasNotFoundException: 드라이브 이름을 찾지 못했을 때
		 * SQLException: db,url,id,pw가 올바르지 않을 때
		 */
		
	}

}
