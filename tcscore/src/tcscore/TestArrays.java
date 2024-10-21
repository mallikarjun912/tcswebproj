package tcscore;

public class TestArrays {
	public static void main(String[] args) {
		int x[] = new int[5];
		int a[] = {1,2,3,4,5};
		int b[][] = new int[3][3];
		int c[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
				System.out.print(c[i][j]+"  ");
			System.out.println();  
		}

	}
}
