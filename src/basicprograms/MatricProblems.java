package basicprograms;

class MatrixBoundry
{
  public void anticlock()
  {
	  int a[][]= { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		
		
		int i=0;int j=0;
		for(i=0;i<a[j].length;i++)
		{
			System.out.print(a[i][j]+" ");
		}
		i=a.length-1;
		for(j=1;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		j=a.length-1;
		for(i=a.length-2;i>=0;i--)
		{
			System.out.print(a[i][j]+" ");
		}
		i=0;
		for(j=a.length-2;j>0;j--)
		{
			System.out.print(a[i][j]+" ");
		}
		
	}
  	
}

public class MatricProblems {
	public static void main(String[] args) {
		MatrixBoundry mc = new MatrixBoundry();
		mc.anticlock();

	}
}
