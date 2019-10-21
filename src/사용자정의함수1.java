
public class 사용자정의함수1 {
	
				// 최대공약수 구하기 세 수중에 최소값을 구한고 최소값으로 모두 나눴을때 나머지가 0이 되는 수중에서 가장 큰 수..? 
		
				// 반환형 ,  한수명,  매개변수
	public static int function(int a, int b, int c) {
		int min;
		if (a > b)
		{
			if (b > c)
			{
				min = c;
			}
			else {
				min = b;
			}
		}
		else 
		{
			if(a > c) {
				min = c;
			}
			else {
				min = a;
			}
		}
		for(int i = min; i >0; i-- ) 
		{
			if(a % i ==0 && b % i == 0 && c % i == 0)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("(400, 300, 750)의 최대공약수는" + function(400, 300, 750)+ "입니다.");
		
	}

}
