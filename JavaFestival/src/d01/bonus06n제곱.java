package d01;

public class bonus06n제곱 {

	public static void main(String[] args) {

		
		int base = 10;
		int n=2;
		int result =powerN(base, n);
		System.out.println("결과 확인 : "+ result);
		
	}
	
	public static int powerN(int base, int n) {
		int result = 1;
		for(int i=0; i<n; i++) {
			result*=base;
			
		}
		return result;
	}
	
	
	
	
	
	
}
