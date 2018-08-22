package com.shb.abstractex_childlunch;

public class Child2 extends LunchMenu {

//  객체 생성시 파라미터로 받을 값
public Child2(int bulgogi, int rice, int milk, int amond, int banana) {
//부모의 데이터를 사용하기 위해 super키워드를 써준다
super(bulgogi, rice, milk, amond, banana);
// TODO Auto-generated constructor stub
}

// 추상 클래스 였으므로 반드시 여기서 재정의 하여 사용한다. 아이들마다 먹은 음식이 다르기 때문
@Override
public int cacul() {
// TODO Auto-generated method stub
return rice + bulgogi + milk + amond;
}
}
