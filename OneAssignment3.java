package atarashi_project;
import java.util.*;
public class OneAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a[][] = new int[5][5];
		a[0][0] = 1; //초기위치
		int height = 0;
		int width = 0;
		
		
		while(true) {
			for( int A = 0; A < a.length; A++ ) {
				for( int B = 0; B < a[A].length; B++ ) {
					System.out.print( a[A][B] );
					System.out.print(" ");
				}
				System.out.println( "" );
			}
			int input = s.nextInt();
			
			for( int C = 0; C < a.length; C++ ) {
				for( int D = 0; D < a[C].length; D++ ) {
					if ( a[C][D] == 1 ) {
						height = C;
						width = D;
					}
				}
			}
			
			if(input == 1) {
				if( a[height].length-1 == width ) {
					a[height][width] = 1;
				}
				else {
					a[height][width] = 0;
					a[height][width+1] = 1;
				}
				continue;
			}
			else if(input == -1) {
				if( width == 0 ) {
					a[height][width] = 1;
				}
				else {
					a[height][width] = 0;
					a[height][width-1] = 1;
				}
			}
			else if(input == 2) {
				if( height == 0 ) {
					a[height][width] = 1;
				}
				else {
					a[height][width] = 0;
					a[height - 1][width] = 1;
				}
			}
			else if(input == -2) {
				if( a.length-1 == height ) {
					a[height][width] = 1;
				}
				else {
					a[height][width] = 0;
					a[height + 1][width] = 1;
				}
			}
			else if( input == 0 ) {
				System.out.println( "시스템을 종료합니다." );
				break;
			}
		}
	}
	}

