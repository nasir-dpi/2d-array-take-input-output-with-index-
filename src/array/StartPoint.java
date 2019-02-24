package array;

import java.util.Scanner;

public class StartPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arr[][] = new int[2][2];
		int arr1[][]=new int [2][2];
	
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.printf("arr[%d][%d]=",i,j);
				arr[i][j]=scanner.nextInt();
				
				//System.out.print(arr.length);
			}
		}
		for(int i =0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr1[i][j]=arr[i][j];
				System.out.print(arr1[i][j]+ " " );
			}
			System.out.println();
		}
		
	}

}
