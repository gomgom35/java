
public class if문 {

	public static void main(String[] args) {
		
		//contains() 포함하고 있는지 
		String a = "i Love You.";
		if(a.contains ("Love")) 
		{
			System.out.println("Me Too!");
		}
		else {
			System.out.println("I don't think so...");		
		}
		
		
		
		int score = 95;
		if (score >= 90) 
		{
			System.out.print("A+입니다.");
		}
		else if (score >= 80) 
		{
			System.out.print("B+입니다.");
		}
		else if (score >= 70) 
		{
			System.out.print("C+입니다.");
		}
		else  
		{
			System.out.print("F입니다.");
		}
		
		
		
		String c ="man";
		int b = 0;
		
		//Java String 형은 equals()을 사용한다. String은 다른 문자형이기 때문에
		if(c.equals("man"))
		{
			System.out.println("남자입니다.");
		}
		else 
		{
			System.out.println("남자가 아닙니다.");
		}
		if(b == 0)
		{
			System.out.println("b는 0입니다.");
		}
		else
		{
			System.out.println("b는 0이 아닙니다.");
		}
		
		//대소문자 구분없이 참인지 거짓인지 eualsIgnoreCase()
		if(c.equalsIgnoreCase("man") && b==0)
		{
			System.out.println("참입니다.");
		}
		else 
		{
			System.out.println("거짓입니다.");
		}
	
	
	}
}
