package week1.day2;

public class IsPrimeNumber {
	public void launchBrowser(int n)
	{
			
		int x,y,flg;

		for( x = 1; x<=n ; x++) {
			if(x==1 || x==0)
				continue;
			flg=1;
			for( y = 2; y<=x/2 ; ++y)
			{
				if (x%y == 0)
					flg=0;
				break;
			}

			if(flg ==1)
				System.out.println( x + " is prime number" );
			else {
				System.out.println( x + " is  not prime number" );
			}

		}
	}

	
	public static void main(String[] args) {
		
		IsPrimeNumber p = new IsPrimeNumber();
		p.launchBrowser(10);
	}

}
