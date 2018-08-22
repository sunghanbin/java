package First_time;

public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 for 반복
		 
		 for (int fori=0; fori < 10; fori++) {
			 int forresult = fori + 10;
			 System.out.println("fori는"+ fori +"입니다.\n"+"10 + fori" + forresult);
			 }
		 
//		 for 문에서의 break
		 
		 for (int foriB=0; foriB < 5; foriB++) {
			 System.out.println("foriB는"+ foriB +"입니다.");
			 if(foriB >= 3) break; // 실행문이 하나일 경우 개행하지 않으면    {} 사용하지 않아도  된다 
		 }
		 
//		 continue 컨티뉴 만나면  다시 위로가서 진행 한다.
		 for (int foriB=0; foriB < 5; foriB++) {
			 System.out.println("foriB는"+ foriB +"입니다.");
//			 continue; 여기에 써주면 아래 if 문은 오류가난다  컨티뉴 는 다시위로가서 실행 하라는 의미 이기때문에 if문을 실행 할수가없기 때문이다. 언어사전적의미/계속하다
			 if(foriB >= 3) break;
			 
		 }
		 
//		 while 루프문 조건하나만 이용하여 문법이 간결함 ////// for문과의 차이는 조건문에 수증가를 실행문에서 해준다??
		 int l = 1;
		 while(l <=10) {
			 System.out.println("i는"+l +"입니다");
			 l++;
		 }

	}

}
