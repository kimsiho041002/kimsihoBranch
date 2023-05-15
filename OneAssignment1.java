package atarashi_project;
import java.util.*;
public class OneAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[] = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		int input = s.nextInt();
		input -= 1;
		
		
		for( int c = 0; c < a.length; c++) {
			if( a[c] == 1 ) {
				a[c] = 0;
			}
		}
			a[input] = 1;
		for( int b = 0; b < a.length; b++ ) {
			System.out.print( a[b] );
		}
		
		
		
	}

}
