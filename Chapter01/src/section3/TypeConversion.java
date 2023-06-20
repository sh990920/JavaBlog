package section3;

public class TypeConversion {

	public static void main(String[] args) {
		byte a = 10;
		int b = a;
		
		// byte 타입 변수를 int 타입 변수에 저장하기
		byte byteValue = 10;
		int intValue = byteValue; // 자동 타입 변환
		
		// 정수 타입이 실수 타입으로 저장될 경우 무조건 자동 타입 변환이 일어난다.
		// 실수 타입은 정수 타입보다 허용범위가 크기 때문이다.
		long longValue = 5000000000L;
		float floatValue = longValue;	// 5.0E9f로 저장됨
		double doubleValue = longValue;	// 5.0E9로 저장됨
			
		//char 타입인 경우 int 타입으로 자동 타입 변환되면 유니코드 값이 int 타입에 저장된다.
		char charValue = 'A';
		int intValue2 = charValue;
	}

}
