
import java.io.Serializable;
import java.util.ArrayList;

public class WypozyczenieZagl extends ObjectPlus implements Serializable {

	public ArrayList daty;
	public ArrayList<Wypozyczenie> wypozyczenia;
	public ArrayList<Zaglowka> zaglowka;

	public WypozyczenieZagl() {

		this.daty = new ArrayList<>();
		this.zaglowka = new ArrayList<>();
		this.wypozyczenia = new ArrayList<>();

	}

	public void dodajZagWyp(Zaglowka zaglowka, Wypozyczenie wypozyczenie, String data) {
		this.zaglowka.add(zaglowka);
		this.wypozyczenia.add(wypozyczenie);
		this.daty.add(daty);
	}

	// @Override
	// public String toString() {
	//
	// String Zwroc = new String();
	//
	// for (String d : daty) {
	// Zwroc += " W dniu: " + d + "\n";
	// }
	// Zwroc += " Zaglowka = " + zaglowka + "\n";
	//
	// Zwroc += " Id wypozyczenia to: = " + wypozyczenia + "\n";
	//
	// return Zwroc;
	// }

	public static void main(String[] args) throws Exception {

	}

}