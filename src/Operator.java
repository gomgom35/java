
public class Operator {
	final static int SECOND= 1000;
	public static void main(String[] args) {
		/*초를 입력하는 프로그램
		int minute = SECOND / 60;
		int second = SECOND % 60;
		System.out.println(minute + "분" + second + "초"); */
		
		/*++ -- (증감 연산자)
		int a = 10;
		System.out.println("현재의 a는 " + a + " 입니다.");
		a++;
		System.out.println("현재의 a는 " + a + " 입니다.");
		System.out.println("현재의 a는 "+ ++a + "입니다.");
		System.out.println("현재의 a는 " + a++ + " 입니다.");
		System.out.println("현재의 a는 " + a + " 입니다."); */
		
		/*%(모듈러 연산) 나눗셈의 나머지값
		System.out.println("1 % 5");
		System.out.println("2 % 3");
		System.out.println("4 % 3");
		System.out.println("3 % 2");
		System.out.println("8 % 1");
		System.out.println("5 % 7");*/
		
		/*논리 연산자
		int a = 50;
		int b = 50;
		
		System.out.println("a와 b가 같은가요? " + (a==b));
		System.out.println("a가  b보다  작거나 같은가요? " + ((a<b)&&(a==b)));
		System.out.println("a가 50이 아닌가요? " + !(a==50)); */
		
		
	//거듭제곱 연산자
		double a = Math.pow(3.0, 20.0);
		System.out.println("3의 20제곱은 " + (int)a + "입니다.");
		
		/*삼항 연산자 (반환형, 함수이름, 매개변수)
		int x = 50;
		int y = 60;
	System.out.println("최대값은 " + max(x, y) + "입니다.");*/
			
}
	/*static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}*/
}
