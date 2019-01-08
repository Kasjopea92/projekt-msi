import java.io.Serializable;

public class Wypozyczenie extends ObjectPlus implements Serializable {

	public int idWypozyczenia;
	private Klient klient;
	public WypozyczenieZagl wypozyczenieZagl; // impl. Asocjacji, licznosc 1

	Wypozyczenie(Klient klient, int idWypozyczenia) {

		this.idWypozyczenia = idWypozyczenia;
		this.klient = klient;
	}

	public static Wypozyczenie utworzWypozyczenie(Klient klient, int idWypozyczenia) throws Exception {
		if (klient == null) {
			throw new Exception("Caloœæ nie istnieje!!!");
		}
		// nowa czêœæ
		Wypozyczenie wyp = new Wypozyczenie(klient, idWypozyczenia);

		// dodaj do calosci

		klient.dodajWypozyczenie(wyp);

		return wyp;

	}

	@Override
	public String toString() {

		String Zwroc = new String();
		Zwroc += "Numer wypo¿yczenia: " + idWypozyczenia;

		return Zwroc;
	}

	public static void main(String[] args) throws Exception {

		// Wypozyczenie wypozyczenie1 = new Wypozyczenie(4587);
		// Wypozyczenie wypozyczenie2 = new Wypozyczenie(4748);
		// Wypozyczenie wypozyczenie3 = new Wypozyczenie(9888);
		// Wypozyczenie wypozyczenie4 = new Wypozyczenie(3633);

		ObjectPlus.pokazEkstensje(Wypozyczenie.class);

	}

}
