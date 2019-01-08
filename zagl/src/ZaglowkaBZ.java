public class ZaglowkaBZ extends Zaglowka {
	private String rodzajOzaglowania;

	public ZaglowkaBZ(String model, String nazwa, double cena, String obszar, String silnik, String rodzajOzaglownia,
			double dlugosc, double powierzchniaZagl) {
		super(model, nazwa, cena, obszar, silnik, dlugosc, powierzchniaZagl);

		this.rodzajOzaglowania = rodzajOzaglownia;
	}

	public String getRodzajOzaglowania() {
		return rodzajOzaglowania;
	}

	public static void main(String[] args) throws Exception {

		ZaglowkaBZ zaglowka2 = new ZaglowkaBZ("Omega", "Jaskó³", 80, "Kaszuby", null, "Grot i fok", 6.20, 0);

		ZaglowkaBZ zaglowka6 = new ZaglowkaBZ("Laser", "Ostryga", 150, "Kaszuby", "Yamaha", "Grot i fok", 4.20, 0);

		ZaglowkaBZ zaglowka7 = new ZaglowkaBZ("Pirat", "Zygfryd", 50, "Mazury", null, "Grot,fok,bezan", 5.20, 0);

		System.out.println(zaglowka2 + " Rodzaj o¿aglownia: " + zaglowka2.getRodzajOzaglowania());
	}
}