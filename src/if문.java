
public class if�� {

	public static void main(String[] args) {
		
		//contains() �����ϰ� �ִ��� 
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
			System.out.print("A+�Դϴ�.");
		}
		else if (score >= 80) 
		{
			System.out.print("B+�Դϴ�.");
		}
		else if (score >= 70) 
		{
			System.out.print("C+�Դϴ�.");
		}
		else  
		{
			System.out.print("F�Դϴ�.");
		}
		
		
		
		String c ="man";
		int b = 0;
		
		//Java String ���� equals()�� ����Ѵ�. String�� �ٸ� �������̱� ������
		if(c.equals("man"))
		{
			System.out.println("�����Դϴ�.");
		}
		else 
		{
			System.out.println("���ڰ� �ƴմϴ�.");
		}
		if(b == 0)
		{
			System.out.println("b�� 0�Դϴ�.");
		}
		else
		{
			System.out.println("b�� 0�� �ƴմϴ�.");
		}
		
		//��ҹ��� ���о��� ������ �������� eualsIgnoreCase()
		if(c.equalsIgnoreCase("man") && b==0)
		{
			System.out.println("���Դϴ�.");
		}
		else 
		{
			System.out.println("�����Դϴ�.");
		}
	
	
	}
}
