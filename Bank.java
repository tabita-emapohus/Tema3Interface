import java.util.ArrayList;

public class Bank {

	private ArrayList<Client> clients;
	private String bankcode;
	public Bank( String bankcode) {
		this.bankcode = bankcode;
		this.clients = new ArrayList<>();
	}
	public void add(Client c) {
        clients.add(c);
    }
	public void afisareClient(String name) {
        for (Client client : clients) {
            System.out.println("Nume si Prenume Cclient : " + name );
                return;
            }
        }
}
