package api.lang.string2;

public class Test06비밀번호검사 {
	public static void main(String[] args) {
		//(Q) 정규표현식으로 반드시 한개 이상 포함이라는 것을 검사할 수 있는가?
		//(ex) 비밀번호 - 대문자/소문자/숫자/특수문자 반드시 1개이상 포함
		// + * ?의 차이 +는 1이상 *는 0이상 ?는 0아니면1
		//.은 아무글자나
		//.*? 아무글자나 0개이상이 있거나 말거나? 즉 관심없음의 의미
		
		//(?= 지금부터 내가 말하는걸 찾아)
		//(?=(.*?)[A-Z]+) 다 스킵하고 A~Z를 찾아
		//긍정탐색 positive 부정탐색 negative
		//반드시 빼고
		String password = "STudent1234@!";
		
		String regex = "^(?=(.*?)[A-Z]+)(?=(.*?)[a-z]+)(?=(.*?)[0-9]+)(?=(.*?)[!@#$]+)[A-Za-z0-9!@#$]{8,16}$";//대문자 반드시포함
		
		System.out.print(password.matches(regex));
	}
}
