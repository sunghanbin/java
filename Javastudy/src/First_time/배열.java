package First_time;

public class 배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 배열  하나의 데이터만 가지고 있던 변수와 달리 여러개의 데이터를 가지고 있는 변수. 즉,여러개의 변수를 모아놓은 또 하나의 변수   
//		 여러개의 데이터가 모여 있어 '{}' 를 사용한다
	//  배열의 크기는 최초에 한번 설정 되면 변경불가

//		 빈 배열                                          크기지정-크기가 5인 빈배열 
		 int[] emptyArr = new int[5];
//		 값넣기
		 emptyArr[0] = 5;
		 emptyArr[1] = 10;
		 emptyArr[2] = 20;
		 emptyArr[3] = 30;
		 emptyArr[4] = 40;
		 
//		                                                                    배열 초기화부
//		배열(Array)         배열 선언부         0,1,2,3,4,5 <- index
		                  int[] ii = {1,2,3,4,5,6};
		 
		                  
//	 다차원 배열
//	배열 사이즈가 정해지지 않은 다차원 배열 선언 
  int [][] iArr = new int[3][];
  iArr[0] = new int[2];
  iArr[1] = new int[3];
  iArr[2] = new int[2];
  
//  배열사이즈가 정해진 배열선언
  int [][] iArr2 = new int[3][2];
  iArr2[0][0] = 10;
  iArr2[0][1] = 20;
  iArr2[1][0] = 10;
  iArr2[1][1] = 30;
  iArr2[2][0] = 11;
  

	}

}
