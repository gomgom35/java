
public class �ݺ��Լ�������Լ�1 {
	/* �ݺ��Լ�
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
				     %*4*3*2*1 (1!= 1*0!, 0!=0*-1) return 1 �� �����ָ� ���ѷ����� ���� �� �ִ� */
				   
		          
		
	}
	public static void main(String[] args) {
		/* �ݺ��Լ�
	    System.out.println("10���丮���� " + factorial(10)); */
		
		System.out.println("10�ѵ�������" + factorial(10));
	}

}
