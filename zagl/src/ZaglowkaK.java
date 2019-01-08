
public class ZaglowkaK extends Zaglowka {
	private int iloscSypialni;

	public ZaglowkaK(String model, String nazwa, double cena, String obszar, String silnik, int iloscSypialni,
			double dlugosc, double powierzchniaZagl) {

		super(model, nazwa, cena, obszar, silnik, dlugosc, powierzchniaZagl);

		this.iloscSypialni = iloscSypialni;
	}

	public int getiloscSypialni() {
		return iloscSypialni;
	}

	public static void main(String[] args) throws Exception {

		ZaglowkaK zaglowka8 = new ZaglowkaK("Foka", "Falon", 100, "Mazury", "Yamaha", 1, 7.20, 0);

		ZaglowkaK zaglowka4 = new ZaglowkaK("Tango", "Szatanek", 200, "Mazury", "Yamaha", 3, 0, 10.00);

		ZaglowkaK zaglowka5 = new ZaglowkaK("Orion", "Moskit", 100, "Kaszuby", null, 1, 0, 8.00);

		System.out.println(zaglowka8 + " Iloœæ sypialni: " + zaglowka8.getiloscSypialni());

	}
}
