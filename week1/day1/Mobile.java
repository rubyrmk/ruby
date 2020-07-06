package week1.day1;

public class Mobile {
	public static void main(String[] args) {
	Mobile object = new Mobile();
	object.makeCall();
	object.sendMessage();
	object.takePicture();
	}
	public void makeCall() {
		System.out.println("Call made");
	}
	public void sendMessage() {
		System.out.println("Message Sent");
	}
	public void takePicture() {
		System.out.println("Picture Taken");
	}
}
