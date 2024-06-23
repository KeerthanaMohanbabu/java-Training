package day08java;

public class MultiDimensionArray {

	public static void main(String[] args) {
		int matrix[][] = {{10,20,30},{40,50},{70,80,90}}; // 3 * 3
//		System.out.println(matrix[0][2]);
//		System.out.println(matrix[2][0]);
//		System.out.println(matrix[1][2]);
//		System.out.println(matrix[1][1]);
		System.out.println("Row Count : "+matrix.length);
		System.out.println("Column count of 2nd row : "+matrix[1].length);
		for(int iRow=0;iRow<matrix.length;iRow++) {
			for(int iCol = 0;iCol < matrix[iRow].length;iCol++) {
				System.out.print(matrix[iRow][iCol]+" ");
			}
			System.out.println();
		}
	}

}



