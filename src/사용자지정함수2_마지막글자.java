
public class 사용자지정함수2_마지막글자 {
	//charAt은 문자열을 0부터 카운트, length는 1부터 (둘다 공백 포함)
	public static char function(String input) {
		return input.charAt(input.length()-1);
	}
	
	public static void main(String[] args) {
		System.out.println(function("hello world"));

	}

}
