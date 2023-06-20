package section2;

public class EscapeString {

	public static void main(String[] args) {
		// 만약 나는"자바"를 좋아합니다. 라는 문자열을 출력하고 싶으면
		// 이스케이프 문자를 사용하면 된다.
		String str = "나는 \"자바\"를 좋아합니다.";
		System.out.println(str);
		
		// 탭 만큼 띄우기
		String str2 = "번호\t이름\t나이";
		System.out.println(str2);
		
		// 개행 하기(한 줄 내리기)
		String str3 = "홍길동\n감자바";
		System.out.println(str3);
	}

}
