import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;

public class Zaglowka extends ObjectPlus implements Serializable {
	// Implementacja czesci biznesowej
	public String model;
	public String nazwa; // atrybut opcjonalny
	public double cena;
	public String silnik;
	public String obszar = "Mazury";
	public double dlugosc;
	public double powierzchniaZagl;

	public ArrayList<Klient> klient = new ArrayList<Klient>(); // impl. Asocjacji, licznosc *
	public WypozyczenieZagl wypozyczenieZagl;

	private TreeMap<String, Sternik> sternikKwalif = new TreeMap<String, Sternik>();

	public void dodajSterKwalif(Sternik nowySternik) {
		if (!sternikKwalif.containsKey(nowySternik.imieNazwisko)) {
			sternikKwalif.put(nowySternik.imieNazwisko, nowySternik);
			nowySternik.dodajZaglowka(this);
		}
	}

	public Sternik znajdzSterKwalif(String imieNazwisko) throws Exception {
		if (!sternikKwalif.containsKey(imieNazwisko)) {
			throw new Exception("Nie odnaleziono sternika o imieniu i nazwisku: " + imieNazwisko);
		}
		return sternikKwalif.get(imieNazwisko);
	}

	public void dodajKlient(Klient nowyKlient) {// asocjacja binarna
		if (!klient.contains(nowyKlient)) {
			klient.add(nowyKlient);
			nowyKlient.dodajZaglowke(this);
		}
	}

	public Zaglowka(String model, String nazwa, double cena, String obszar, String silnik, double dlugosc,
			double powierzchniaZagl) {
		// Dodaj do ekstensji

		this.model = model;
		this.nazwa = nazwa;
		this.cena = cena;
		this.obszar = obszar;
		this.silnik = silnik;
		this.dlugosc = dlugosc;
		this.powierzchniaZagl = powierzchniaZagl;
		this.klient = new ArrayList<Klient>();// asocjacja binarna

	}

	@Override
	public String toString() {

		String Zwroc = new String();
		Zwroc += " Model: " + model + "\n";
		Zwroc += " Nazwa: " + nazwa + "\n";
		Zwroc += " Cena: " + cena + "\n";
		Zwroc += " Obszar na ktorym mozliwe wypozyczenie: " + obszar + "\n";

		if (silnik != null) {

			Zwroc += " Silnik: " + silnik + "\n";
		} else
			Zwroc += " Nie ma silnika" + "\n";

		if (dlugosc != 0) {

			Zwroc += " D³ugoœæ ¿aglówki to: " + dlugosc + "\n";
		} else
			Zwroc += " Zaglówka wypo¿yczana tylko na patent ¿eglarski." + "\n";

		if (powierzchniaZagl != 0) {

			Zwroc += " Powierzchnia ¿agla: " + powierzchniaZagl + "\n";
		} else
			Zwroc += " Zaglówka mo¿e byæ wypo¿yczona na dowód osobisty." + "\n";

		return Zwroc;

	}

	public static void main(String[] args) throws Exception {

		// Test implementacji ekstensji w ramach tej samej klasy
		Zaglowka zaglowka1 = new Zaglowka("Foka", "Falon", 100, "Mazury", "Yamaha", 0, 7.20);

		Zaglowka zaglowka2 = new Zaglowka("Omega", "Jaskó³", 80, "Kaszuby", null, 6.20, 0);

		Zaglowka zaglowka3 = new Zaglowka("Sasanka", "Lataj¹ca po falach", 190, "Mazury", "Honda", 0, 9.00);

		Zaglowka zaglowka4 = new Zaglowka("Tango", "Szatanek", 200, "Mazury", "Yamaha", 0, 10.00);

		Zaglowka zaglowka5 = new Zaglowka("Orion", "Moskit", 100, "Kaszuby", null, 0, 8.00);

		Zaglowka zaglowka8 = new Zaglowka("Katamaran", "Orzel", 160, "Mazury", "Honda", 0, 16.3);

		Zaglowka zaglowka6 = new Zaglowka("Laser", "Ostryga", 150, "Kaszuby", "Yamaha", 4.20, 0);

		Zaglowka zaglowka7 = new Zaglowka("Pirat", "Zygfryd", 50, "Mazury", null, 5.20, 0);

		ObjectPlus.pokazEkstensje(Zaglowka.class);

	}

}
