package patterns;

public class HoloUpTri {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n*2;j++) {
				if(i<=j &&i+j<=n*2)  {
					System.out.print(i+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			int m=n-i+1;
			for(int j=1;j<n*2;j++) {
				
				if(i+j>=n+1 && j-i<=n-1)  {
					System.out.print(m+" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	 }
}
