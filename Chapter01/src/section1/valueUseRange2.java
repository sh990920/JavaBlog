package section1;

public class valueUseRange2 {

	public static void main(String[] args) {	// 메소드 블록
		int var1; 					// 메소드 블록에서 선언
		
		if(null) { 								// if 블록
			int var2; 				// if 블록에서 선언
			// var1 과 var2 사용가능
		} 										// if 블록
		
		for(null) { 							// for 블록
			int var3; 				// for 블록에서 선언
			// var1 과 var3 사용 가능
			// var2 는 사용 불가
		}										// for 블록
		// var1 사용가능
		// var2 와 var3 는 사용 불가
	}											// 메소드 블록

}
