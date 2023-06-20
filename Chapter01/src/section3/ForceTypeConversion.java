package section3;

public class ForceTypeConversion {

	public static void main(String[] args) {
		int intValue = 10;
		byte byteValue = (byte)intValue; // 강제 타입 변환
		
		int intValue2 = 65;
		char charValue = (char)intValue2;
		System.out.println(charValue); // 'A'가 출력된다.
		
		double doubleValue = 3.14;
		int intValue3 = (int)doubleValue; // intValue는 정수 부분인 3만 저장된다.

	}

}
