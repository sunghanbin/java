package First_time;

import java.util.Scanner;

public class 변수 {

	public static void main(String[] args) {
	   System.out.println("변수란 무엇이든 담을수 있는 마술 주머니 이다");

//	   단축키 모음  
	   
	   /*Ctrl + F - 찾기 기능 및 replace with 기능이있음 
	   Ctrl + K - 드래그 또는 클릭하여 선택한 글자를 찾아서 바로 이동함.
	   Ctrl + L : 특정 줄 번호로 이동
	   F2 : 컴파일 에러의 빨간 줄에 커서를 가져다가 이 키를 누르면 에러의 원인에 대한 힌트를 제공
	   Ctrl + K : 찾고자 하는 문자열을 블럭으로 설정한 후 키를 누른다
	   Ctrl + Shift + F : 코드 자동 정리
	   Ctrl + Shift + / : 블록 주석( )
	   Ctrl + Shift + \ : 블록 주석 제거
	   Ctrl + / : 여러 줄이 한꺼번에 주석 처리됨 (주석 해제하려면 반대로 하면 됨)
	   Alt + Up(Down) : 위(아래)줄과 바꾸기
	   Alt + Shift + 방향키 : 블록 선택하기
	   Ctrl + D : 한 줄 삭제
	   Ctrl + I : 들여쓰기 자동 수정
	   Ctrl + Shift + X : 대문자로 변환
	   Ctrl + Shift + Y : 소문자로 변환
	   Ctrl + Shift + L : 모든 단축키의 내용을 표시
	   Ctrl + Alt + ↓/↑ 한줄라인복사
	   Ctrl + space : 자동완성
	   Ctrl + f11 : 실행*/

//	   기초자료형
//	   char
//	   값을 할당할때 홑따옴표를 붙여서 할당 문자하나 밖에 들어가지않는다 
	  char ch = 'A';

	  
//	  int
//	  정수형 숫자 
	  int i = 10;
	  
//	  double 
//	  실수형 숫자 -- 구별을 위해 값뒤에 D를 표시한다.
	  double D = 3.14D;
	  
	  
//	  형변환 
	  
//	  묵시적 형변환 ==> 작은 타입에 들어 있던 값을  큰 타입에 할당 될때 큰타입의 형으로 자동 변환 된다
	  D = i;
	  
//	  명시적 형변환 ==> 큰타입의 데이터를 작은 타입의 변수에 할당 할때 데이터 손실이 있을수 있을수 있고 오류가 난다. 그렇기 때문에 코드에 명시해 주어야 한다 .
//	  변환 해주게 되면 작은타입에 맞게 잘려나온다
	  i = (int)D;
	  
	  

	}

}
