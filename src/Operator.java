
public class Operator {
	final static int SECOND= 1000;
	public static void main(String[] args) {
		/*�ʸ� �Է��ϴ� ���α׷�
		int minute = SECOND / 60;
		int second = SECOND % 60;
		System.out.println(minute + "��" + second + "��"); */
		
		/*++ -- (���� ������)
		int a = 10;
		System.out.println("������ a�� " + a + " �Դϴ�.");
		a++;
		System.out.println("������ a�� " + a + " �Դϴ�.");
		System.out.println("������ a�� "+ ++a + "�Դϴ�.");
		System.out.println("������ a�� " + a++ + " �Դϴ�.");
		System.out.println("������ a�� " + a + " �Դϴ�."); */
		
		/*%(��ⷯ ����) �������� ��������
		System.out.println("1 % 5");
		System.out.println("2 % 3");
		System.out.println("4 % 3");
		System.out.println("3 % 2");
		System.out.println("8 % 1");
		System.out.println("5 % 7");*/
		
		/*�� ������
		int a = 50;
		int b = 50;
		
		System.out.println("a�� b�� ��������? " + (a==b));
		System.out.println("a��  b����  �۰ų� ��������? " + ((a<b)&&(a==b)));
		System.out.println("a�� 50�� �ƴѰ���? " + !(a==50)); */
		
		
	//�ŵ����� ������
		double a = Math.pow(3.0, 20.0);
		System.out.println("3�� 20������ " + (int)a + "�Դϴ�.");
		
		/*���� ������ (��ȯ��, �Լ��̸�, �Ű�����)
		int x = 50;
		int y = 60;
	System.out.println("�ִ밪�� " + max(x, y) + "�Դϴ�.");*/
			
}
	/*static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}*/
}
