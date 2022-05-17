package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
	//0,1,1	,2,3,5,8,13,21,34,55,89
		int num1=0;
		int num2=1;
		int num3;
System.out.println(num1);
System.out.println(num2);
for(int i=1;i<=10;i++) {
	num3=num1+num2;
	System.out.println(num3);
	//swap the nubers
	num1=num2;
	num2=num3;
}
	}

}
