package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int	input=2;
		int flag=0;
		if(input==0||input==1) {
			System.out.println("It Is A PrimeNumber");
		}
		else
		{
			for(int i=2;i<input;i++) {
				if(input%i==0) {
					System.out.println(" Not A PrimeNumber");
					flag=1;
					break;
				}
			}
			if( flag == 0) {
				System.out.println("It Is A PrimeNumber");
			}
		}
	}
}