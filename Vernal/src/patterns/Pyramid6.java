package patterns;

public class Pyramid6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n-1;i>=0;i--)
		{
			for(int space=0;space<n-1-i;space++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i*2;j++)
			{
				System.out.print("* ");
			}
		
		System.out.println();
	}

}
}
