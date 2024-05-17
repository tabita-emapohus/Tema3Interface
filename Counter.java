

public class Counter {

	public static void main(String[] args) {
		Bank banca = new Bank("BC123");

        Client client1 = new Client("Pohus Tabita", "Str. Principală nr. 316");
        client1.afisare();
        banca.add(client1);
	}

}
