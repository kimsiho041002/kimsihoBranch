package atarashi_project;
import java.util.*;
public class OneAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		a[0] = 1;
		int num = 0;
		
		
		while(true) {
		for( int v = 0; v < a.length; v++ ) {
			System.out.print( a[v] ); 
		}
		System.out.println( "" );
		System.out.println( "숫자를 입력해주세요." );
		int move = s.nextInt();
		
			
			for( int A = 0; A < a.length; A++ ) {
				if( a[A] == 1 ) {
					num = A;
				}
			}
			
			if( move == 1 ) {
			
				if( num == (a.length-1) ) {
					a[num] = 1;
				}
				else { 
					a[num] = 0;
					a[num+1] = 1;
				}
			continue;
			}
			else if( move == -1 ) {
				if( num == 0 ) {
					a[num] = 1;
				}
				else { 
					a[num] = 0;
					a[num-1] = 1;
					}
			continue;
			}
		}
	}
}