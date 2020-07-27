package Java;



public class Smartphone extends Andriod{
	
	public void ConnectwatsApp() {
		System.out.println("ConnectwatsApp");
		
		
	}
	
	public static void main(String[] args) {
		
		Smartphone sp = new Smartphone();
		Andriod ap = new Andriod();
		
		sp.ConnectwatsApp();
		sp.takevedio();
		sp.sendMsg();
		sp.makecall();
		sp.savecontact();
		
		
		
	}

}
