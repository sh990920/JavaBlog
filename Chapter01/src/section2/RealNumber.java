package section2;

public class RealNumber {

	public static void main(String[] args) {
		// float 는 실수 리터럴의 기본 타입이 아니므로 컴파일 에러가 발생한다.
		// float var1 = 3.14;
		double var2 = 3.14;
		double var3 = 314e-2;
		
		// 실수 리터럴의 타입을 float 으로 사용하고 싶다면
		// 뒤에 소문자f 나 대문자 F를 작성하여 
		// 컴파일러가 float 타입임을 알 수 있도록 해야 한다.
		float var4 = 3.14f;
		float var5 = 3E6F;
	}

}
