
public class WhileFor {
	//final static int N = 30;
	final static int N = 15;
	public static void main(String[] args) {
				
		/* 1부터 1000까지의 합 while
		int i = 1, sum = 0;	
		while (i <= 1000) 
		{
			sum += i++;
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다."); */
		
		
		
		/*for은 초기화,조건,연산부분으로 이루어져 있다.		
		for(int i = N; i > 0; i--)
		{
			for (int j = i; j > 0; j--)
			{
			System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		for(int i = -N; i <= N; i++)
		{
			for(int j = -N; j <= N; j++)
			{
				if (i * i + j * j <= N * N)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
