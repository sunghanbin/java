package First_time;

public class 메소드의_이해 {
	
//	접근제한자: public = 누구나 접근하여 사용가능하다
//	         반환타입:반환을 하지않는 메소드 타입은 void 사용
//	                           파라미터값 = 지역변수 라고도한다.
	public int sum(int i,int j) {
		int r = 0;
	for (int h = i; h <=j; h++) {
		r=r +h;
	}
	return r;
	}
//	접근제한자 : private = 동일한 class에서만 접근하여 사용가능하다
	private int sum(int i,int j) {
		int r = 0;
	for (int h = i; h <=j; h++) {
		r=r +h;
	}
	return r;
	}

}
