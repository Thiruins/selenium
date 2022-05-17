package week1.day1;

public class Car {
	//access modifer,return type,method name
public void applybreak() {
	System.out.println("front wheels");
}
public void applygear() {
	System.out.println("1st gear");
	
}
public void switchonac() {
	System.out.println("Ac on");
}
public void applyacclerate() {
	System.out.println("applied accleration");
}
//special method - main method
public static void main(String[] args) {
	System.out.println("");
	//create an object
	Car mycar=new Car();
	mycar.applybreak();
	mycar.applygear();
	mycar.switchonac();
	mycar.applyacclerate();
}
}