import java.util.ArrayList;

public class Client {

	private String name;
	private String adress;
	private ArrayList<BankAccount> accounts;
	public Client(String name, String adress) {
		this.name = name;
		this.adress = adress;
		this.accounts = new ArrayList<>();
	}
	public void afisare() {
        System.out.println(name + " " + adress);
        for (BankAccount account : accounts) {
            System.out.println("Suma totala: " + account.getTotalAmount());
        }
    }
	public String getName() {
		return name;
	}
	public String getAdress() {
		return adress;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
