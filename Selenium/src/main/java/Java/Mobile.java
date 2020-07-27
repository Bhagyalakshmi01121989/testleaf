package Java;



public class Mobile {

     public void sendMsg() {
    	 System.out.println("sendMsg");
		
	}
    	
		
	public void makecall() {
		System.out.println("makecall");
		
		
	}
	
	public void savecontact() {
		System.out.println("savecontact");
		
	}

	public static void main(String[] args) {
		Mobile mb = new Mobile();
		
		mb.sendMsg();
		mb.savecontact();
		mb.makecall();
		
		
	}

}
