package Quiz;

public class Quiz_for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		구구단 만들기 
		for(int gugu = 1;gugu <=9;gugu++) {
			for(int dan =1;dan<=9;dan++) {
				int gugudan = gugu * dan;
				System.out.print(dan+"단" + dan+"*"+gugu+"="+gugudan+"\t" );
			}
//			행한번 내려주기 2번째 for문 다돌고
			System.out.println("");
		}
		

	}

}
