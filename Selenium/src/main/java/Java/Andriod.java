package Java;

public class Andriod extends Mobile {

	public void takevedio() {
		System.out.println("takevedio");
		
	}
	
	public static void main(String[] args) {
		Andriod ap = new Andriod();
		
		ap.takevedio();
		ap.sendMsg();
		ap.makecall();
		ap.savecontact();
		
		
		
		
	}
}
