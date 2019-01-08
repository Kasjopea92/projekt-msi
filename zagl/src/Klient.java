import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class Klient extends ObjectPlus implements Serializable {

	private String imieNazwisko;
	private Vector<Wypozyczenie> wypozyczenia = new Vector<Wypozyczenie>(); // kompozycja- klasa wew. calosc
	private static HashSet<Wypozyczenie> wszystkieWypozyczenia = new HashSet<Wypozyczenie>();// pojemnik na wszystkie
																								// referencje
																								// calosc-czesc
	private ArrayList<Zaglowka> zaglowka = new ArrayList<Zaglowka>(); // impl. Asocjacji, licznosc *

	public Klient(String imieNazwisko) {
		this.imieNazwisko = imieNazwisko;

	}

	public void dodajZaglowke(Zaglowka nowaZaglowka) {
		if (!zaglowka.contains(nowaZaglowka)) {
			zaglowka.add(nowaZaglowka);
			nowaZaglowka.dodajKlient(this);

		}
	}

	public void dodajWypozyczenie(Wypozyczenie wypozyczenie) throws Exception {
		if (!wypozyczenia.contains(wypozyczenie)) {
			if (wszystkieWypozyczenia.contains(wypozyczenie)) {
				throw new Exception("Ta czêœæ jest ju¿ powi¹zana z ca³oœci¹!");
			}
			wypozyczenia.add(wypozyczenie);
			wszystkieWypozyczenia.add(wypozyczenie);
		}
	}

	@Override
	public String toString() {

		String Zwroc = new String();
		Zwroc += " Klient = " + imieNazwisko + " " + "\n";
		for (Zaglowka z : zaglowka) {
			Zwroc += "P³ywa³ ¿aglówk¹: " + z.nazwa + "\n";

			Zwroc += "Dane wypo¿yczenia: " + imieNazwisko + "\n";
			for (Wypozyczenie wyp : wypozyczenia) {
				Zwroc += "Numer wypo¿yczenia: " + wyp.idWypozyczenia + "\n";
			}

			return Zwroc;
		}
		return Zwroc;
	}

	public static void main(String[] args) throws Exception {

		// Klient klient1 = new Klient("Antoni Nowak");
		// Klient klient2 = new Klient("Zdzislaw Burak");
		// Klient klient3 = new Klient("Przemyslaw Koslawy");
		// Klient klient4 = new Klient("Gracjan Pologlowy");
		//
		// Wypozyczenie wypozyczenie1 = new Wypozyczenie(klient1, 4587);
		// Wypozyczenie wypozyczenie2 = new Wypozyczenie(klient2, 4748);
		// Wypozyczenie wypozyczenie3 = new Wypozyczenie(klient2, 9888);
		// Wypozyczenie wypozyczenie4 = new Wypozyczenie(klient3, 3633);
		//
		//
		// klient1.dodajWypozyczenie(wypozyczenie1);
		// System.out.println(klient1);

		ObjectPlus.pokazEkstensje(Klient.class);

	}

}