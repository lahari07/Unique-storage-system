
public class except {
	public static void main(String[] args) {
		
		int[] arr = new int[1];
		
		try {
			int b = 1/0;
			
		} catch (ArithmeticException e) {
			System.out.println( "arithematic" );
			arr[2] = 0;
		} catch(Exception e) {
			System.out.println( "e" );
		} finally {
			System.out.println(  );
		}
		
		
	}
}
