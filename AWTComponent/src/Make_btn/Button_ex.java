package Make_btn;

import java.awt.Button;
import java.awt.Frame;
//  프레임 상속 받음 
public class Button_ex extends Frame {
	
	public Button_ex() {
//		디폴트 생성자 에서 버튼 객체 생성 
//		메인클래스에서 버튼 클래스의 객체를 생성하면 바로 버튼이 객체가 추가된다.
//		                          버튼의 이름
		Button btn = new Button("Button");
//		 Frame 클래스에서 상속받은 메서드 
//		프레임에 붙이겠다.
		add(btn);
		
	}

}
