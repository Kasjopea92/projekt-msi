public class Main {

	public static void main(String[] args) throws Exception {

		Klient klient1 = new Klient("Antoni Nowak");
		Klient klient2 = new Klient("Zdzislaw Burak");
		Klient klient3 = new Klient("Przemyslaw Koslawy");
		Klient klient4 = new Klient("Gracjan Pologlowy");

		Zaglowka zaglowka1 = new Zaglowka("Foka", "Falon", 100, "Mazury", "Yamaha", 0, 7.20);

		Zaglowka zaglowka2 = new Zaglowka("Omega", "Jaskó³", 80, "Kaszuby", null, 6.20, 0);

		Zaglowka zaglowka3 = new Zaglowka("Sasanka", "Lataj¹ca po falach", 190, "Mazury", "Honda", 0, 9.00);

		Zaglowka zaglowka4 = new Zaglowka("Tango", "Szatanek", 200, "Mazury", "Yamaha", 0, 10.00);

		Zaglowka zaglowka5 = new Zaglowka("Orion", "Moskit", 100, "Kaszuby", null, 0, 8.00);

		Zaglowka zaglowka8 = new Zaglowka("Katamaran", "Orzel", 160, "Mazury", "Honda", 0, 16.3);

		Zaglowka zaglowka6 = new Zaglowka("Laser", "Ostryga", 150, "Kaszuby", "Yamaha", 4.20, 0);

		Zaglowka zaglowka7 = new Zaglowka("Pirat", "Zygfryd", 50, "Mazury", null, 5.20, 0);

		Sternik sternik1 = new Sternik(001, "Antoni Konewka", "zelgarz jachtowy");
		Sternik sternik2 = new Sternik(002, "Bartosz Kajak", "jachtowy sternik morski");
		Sternik sternik3 = new Sternik(003, "Walezja Malezja", "Kapitan morski");
		Sternik sternik4 = new Sternik(004, "Kunegudna Kaczka", "zeglarz jachtowy");

		Wypozyczenie wypozyczenie1 = new Wypozyczenie(klient1, 4587);
		Wypozyczenie wypozyczenie2 = new Wypozyczenie(klient2, 4748);
		Wypozyczenie wypozyczenie3 = new Wypozyczenie(klient2, 9888);
		Wypozyczenie wypozyczenie4 = new Wypozyczenie(klient3, 3633);

		System.out.println("Asocjajcja binarna: " + "\n");

		klient1.dodajZaglowke(zaglowka8);// Asocjacja binarna
		klient2.dodajZaglowke(zaglowka5);
		klient3.dodajZaglowke(zaglowka2);
		klient4.dodajZaglowke(zaglowka7);

		zaglowka1.dodajKlient(klient3);

		System.out.println(klient1);
		System.out.println(klient2);
		System.out.println(klient3);
		System.out.println(klient4);

		System.out.println("Asocjajcja kwalifikowana: " + "\n");

		zaglowka1.dodajSterKwalif(sternik3);
		zaglowka1.dodajSterKwalif(sternik2);
		zaglowka2.dodajSterKwalif(sternik4);
		zaglowka5.dodajSterKwalif(sternik1);
		zaglowka6.dodajSterKwalif(sternik2);
		zaglowka6.dodajSterKwalif(sternik1);

		// System.out.println(zaglowka1);
		// System.out.println(zaglowka2);
		// System.out.println(zaglowka5);
		// System.out.println(zaglowka6);

		Sternik z = zaglowka1.znajdzSterKwalif("Walezja Malezja");// asocjajcja kwalifikowana
		System.out.println(z);

		System.out.println(" ");

		Sternik a = zaglowka6.znajdzSterKwalif("Bartosz Kajak");// asocjajcja kwalifikowana
		System.out.println(a);

		System.out.println(" ");

		// Sternik y = zaglowka1.znajdzSterKwalif("Brajan Kwiat");// asocjajcja
		// kwalifikowana
		// System.out.println(y);

		// Sternik x = zaglowka1.znajdzSterKwalif("Kunegunda Kaczka");// wyjatek
		// System.out.println(x);

		System.out.println("Wypo¿yczenie ¿aglówki - asocjajcja z atrybutem: " + "\n");

		WypozyczenieZagl wypozyczenieK1 = new WypozyczenieZagl();

		wypozyczenieK1.dodajZagWyp(zaglowka5, wypozyczenie1, "08/10/2011");

		System.out.println(wypozyczenieK1);

		System.out.println("Kompozycja: " + "\n");

		klient1.dodajWypozyczenie(wypozyczenie1);
		System.out.println(klient1);

		// System.out.println("Obs³uga wyj¹tku: ");
		// klient2.dodajWypozyczenie(wypozyczenie1);
		// System.out.println(klient1);

	}

}
