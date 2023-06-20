package section1;

public class valueUse {
	public static void main(String[] args) {
		// 변수 사용하기
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		// 산술 연산식에 변수 사용하기
		int totalMinute = (hour * 60) + minute;
		// 계산 과정
		// int totalMinute = (3 * 60) + minute; 	// 변수 hour에 저장된 값으로 대치
		// int totalMinute = 180 + 5;			 	// 변수 minute에 저장된 값으로 대치
		// int totalMinute = 185;					// 185를 변수 totalMinute에 저장
		System.out.println(totalMinute);
	}
}
