package basicprograms;


public class MatrixMirror {
	public static void main(String[] args) {
		int a[][]= {{1,6,11,16,21},{2,7,12,17,22},{3,8,13,18,23},{4,9,14,19,24},{5,10,15,20,25}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		mirror(a);
		System.out.println();
		System.out.println();
	}
	static void mirror(int[][] a) {

			int s=0;
			int e=a.length-1;
			while(s<e) {
				int i=0;
				while(i<a.length) {
					int temp=a[i][s];
					a[i][s]=a[i][e];
					a[i][e]=temp;
					i++;
				}
				s++;
				e--;
				
			}
			for(int j=0;j<a.length;j++)
			{
				for(int m=0;m<a[j].length;m++) {
					System.out.print(a[j][m]+" ");
				}
				System.out.println();
			}
			
		
		
	}

}

