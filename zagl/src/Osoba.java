import java.util.EnumSet;

enum OsobaRodzaj {
	Osoba, Klient, Sternik
}

public class Osoba {
	String imieNazwisko;
	String dataUrodzenia;
	String nrPatentuDow;
	String port;
	String stopieñ;

	public Osoba(String imieNazwisko) {
		this.imieNazwisko = imieNazwisko;
	}

	private EnumSet<OsobaRodzaj> rodzajOsoby = EnumSet.<OsobaRodzaj>of(OsobaRodzaj.Osoba);

	public static void main(String[] args) {

		EnumSet<OsobaRodzaj> osoba1 = EnumSet.<OsobaRodzaj>of(OsobaRodzaj.Klient, OsobaRodzaj.Sternik);

		System.out.println("Osoba jest jednoczeœnie: " + osoba1);

	}

}