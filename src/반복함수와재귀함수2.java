
public class 반복함수와재귀함수2 {
	/* 반복함수
	 *  public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		if(number == 1)
		{
			return one;
		}
		else if (number == 2)
		{
			return two;
		}
		else
		{
			for(int i =2; i < number; i++)
			{
				result = one+two;
				one = two;
				two = result;
						
			}
		}
    	return result; 
 } */
	
	public static int fibonacci(int number) {
		if (number == 1)
		{
			return 1;
		}
		else if (number == 2)
		{
			return 1;
		}
		else {
			return fibonacci(number-1) + fibonacci(number-2); //숫자가 클수록 반복이 많아져서 컴퓨터 과부화, 답을 얻을 수 없게 된다
		}
	}
	
	public static void main(String[] args) {
		System.out.println("피보나치 수열의 10번째 원소는 " + fibonacci(10) + "입니다.");
	}

}
