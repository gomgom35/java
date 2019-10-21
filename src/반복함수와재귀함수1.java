
public class 반복함수와재귀함수1 {
	/* 반복함수
	public static int factorial(int number) {
		int sum = 1;
		for(int i = 2; i <= number; i++)
		{
			sum*=i;			
		}
		return sum;
	}
	*/
	
	public static int factorial (int number) {
		if(number == 1)
		return 1;
		else 
			return number*factorial(number-1);
		           /*5*4!
				     5*4*3!
				     5*4*3*2!
				     %*4*3*2*1 (1!= 1*0!, 0!=0*-1) return 1 을 안해주면 무한루프에 빠질 수 있다 */
				   
		          
		
	}
	public static void main(String[] args) {
		/* 반복함수
	    System.out.println("10팩토리얼은 " + factorial(10)); */
		
		System.out.println("10팩도리얼은" + factorial(10));
	}

}
