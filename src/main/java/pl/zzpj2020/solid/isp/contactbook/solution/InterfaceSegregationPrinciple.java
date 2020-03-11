package pl.zzpj2020.solid.isp.contactbook.solution;

class InterfaceSegregationPrinciple {
	
	private Emailable emailer;
	private Dialable dialler;
	
	public InterfaceSegregationPrinciple() {
		emailer = new Emailer();
		dialler = new Dialler();
	}
	
	public static void main(String[] args) {
		
		InterfaceSegregationPrinciple interfaceSegregationPrinciple = new InterfaceSegregationPrinciple();
		interfaceSegregationPrinciple.contactPeople();
		
	}
	
	public void contactPeople() {
		
		Contact contact = new Contact("Jan Kowalski", "Kielce", "jan.kowalski@gmail.com", "83744-23434");		
		emailer.sendMessage(contact, "promocja", "tanio dzisiaj!");
		dialler.makeCall(contact);
	}
	

}
