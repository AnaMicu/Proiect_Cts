package ro.home.cts;


public class AgentieTurism {
	
	private final String denumire;
	private String oras;
	private String telefon;
	private String mail;
	private static AgentieTurism singleton=null;

	
	public String getOras() {
		return oras;
	}
	public void setOras(String oras) {
		this.oras = oras;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	private AgentieTurism(String denumire, String oras) {
		this.denumire = denumire;
		this.oras = oras;
		this.telefon = "+40269222330";
		this.mail = "office@happy-travel.ro";
	}
	
	public static AgentieTurism getAgentieTurism(String oras){
		if(singleton == null)
			singleton=new AgentieTurism("Happy Travel",oras);
		return singleton;
	}
	
	
	public void afisareDetalii(){
		System.out.println("Agentia de Turism " +"\n" +denumire + " " + oras
				+"\n Tel:" + telefon +"\n Mail:" + mail);
	}
	
}
