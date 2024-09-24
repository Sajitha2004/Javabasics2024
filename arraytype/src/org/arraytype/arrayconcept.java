package org.arraytype;

public class arrayconcept {

	public static void main(String []args) {
		int a[][] = new int [3][3];
		a[0][0]=21;
		a[0][1]=22;
		a[0][0]=23;
		a[0][2]=24;
		a[1][0]=25;
		a[1][1]=26;
		a[1][2]=27;
		a[2][0]=28;
		a[2][1]=29;
		a[2][2]=30;
		for (int []b:a) {
			for (int c:b) {
				System.out.println(c);
			}
		}
		System.out.println("======================");
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a.length;j++) {
				System.out.println(a[i][j]); 
			}
		}
		
	}
}
