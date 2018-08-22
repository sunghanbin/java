package Make_btn;

import java.awt.Dimension;

public class MainClass {
	
	public static void main (String[]args){
//		pack(): 컴포넌트의 사이즈 == 기본사이즈
//		setSize(): 컴포넌트 사이즈를 개발자가 정함
//		setVisible(true): 화면에 출력함
//		dispose(): 자원 해제 Visible(false) 하였을 때 화면상에만 보이지 않지
//		아직도 메모리 상에서 자원을 사용하기 때문에 자원해제를 해줘야한다.
//		System.exit(): 어플리케이션 종료
		
//		버튼 객체 생성  하면 프레임에 붙혀짐
		Button_ex btt = new Button_ex();

//		기본사이즈로 설정
		btt.pack();
		
//		개발자가 설정                가로,세로
		btt.setSize(new Dimension(200,200));
//		화면에 보이게 하기(true) 
		btt.setVisible(true);
		
//		2초 대기 
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
//		보이지 않게	
			btt.setVisible(false);
//			자원해제
			btt.dispose();
//			2초 대기
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
//		프로세스  종료
		System.exit(0);
	}

}
