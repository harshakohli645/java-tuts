package patterns;

public class HoloLeftTri {
    public static void main(String[] args) {
    	int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n*2;j++) {
				if(i==1||j==1||i==n*2-1||i+j<=n+1||i-j>=n-1||j==n*2-1||j-i>=n-1||i+j>=n*3-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
					
			}
			System.out.println();
		}
	}
}
