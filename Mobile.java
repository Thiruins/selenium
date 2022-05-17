package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("hello");
	}
public void sendMsg() {
	System.out.println("hi");
}
public static void main(String[] args) {
	Mobile myMobile = new Mobile();
	myMobile.makeCall();
	myMobile.sendMsg();
}
}

