import java.io.Serializable;

public class Sternik extends ObjectPlus implements Serializable {

	private int numerId;
	String imieNazwisko;
	String stopienZegl;

	public Sternik(int numerId, String imieNazwisko, String stopienZegl) {
		this.numerId = numerId;
		this.setImieNazwisko(imieNazwisko);
		this.stopienZegl = stopienZegl;

	}

	@Override
	public String toString() {
		String zwroc = "Sternik: " + "\n" + "Numer: " + numerId + "\n" + "Imiê i nazwisko: " + getImieNazwisko() + "\n"
				+ "Stopieñ ¿eglarski: " + stopienZegl;

		return zwroc;
	}

	public static void main(String[] args) throws Exception {

		// Sternik sternik1 = new Sternik(001, "Antoni Konewka", "zelgarz jachtowy");
		// Sternik sternik2 = new Sternik(002, "Bartosz Kajak", "jachtowy sternik
		// morski");
		// Sternik sternik3 = new Sternik(003, "Walezja Malezja", "Kapitan morski");
		// Sternik sternik4 = new Sternik(004, "Kunegudna Kaczka", "zeglarz jachtowy");

		// ObjectPlus.pokazEkstensje(Sternik.class);

	}

	public String getImieNazwisko() {
		return imieNazwisko;
	}

	public void setImieNazwisko(String imieNazwisko) {
		this.imieNazwisko = imieNazwisko;
	}

	public void dodajZaglowka(Zaglowka zaglowka) {
		// TODO Auto-generated method stub

	}

}
