package sample;

import java.util.Scanner;

public class matrixrotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		{
		for( i=0; i<n; i++) {
			for( j=0;j<n;j++);{
				arr[i][j] = sc.nextInt();
			}
		}
		rotateImage(arr);
		for ( i=0;i<n;i++) {
			for(j=i;j<n;j++) {
				System.out.println(arr[i][j]+" ");
			}
		}

		}
	}
	private static void rotateImage(int[][] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int a=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=a;
	}
}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n/2;j++) {
				int a=arr[i][j];
				arr[i][j]=arr[i][n-1-j];
				arr[i][n-1-j]=a;
			}
}
	}
}

}
