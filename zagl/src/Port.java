// import java.io.Serializable;
// import java.util.ArrayList;
//
// public class Port extends ObjectPlus implements Serializable {
//
// public String nazwaPortu;
//// private ArrayList<Zaglowka> zaglowka = new ArrayList<Zaglowka>(); // impl.
// Asocjacji, licznosc *
////
//// public void dodajZaglowke(Zaglowka nowaZaglowka) {
//// if (!zaglowka.contains(nowaZaglowka)) {
//// zaglowka.add(nowaZaglowka);
//// nowaZaglowka.dodajPort(this);
////
//// }
//// }
//
// public Port(String nazwaPortu) {
// this.nazwaPortu = nazwaPortu;
//
// }
//
// @Override
// public String toString() {
// String zwroc = "Port: " + nazwaPortu + "\n";
// for (Zaglowka z : zaglowka) {
// zwroc += " " + z.nazwa + "\n";
// }
//
// return zwroc;
// }
//
// public static void main(String[] args) throws Exception {
//
// Port port1 = new Port("Ekomarina");
// Port port2 = new Port("Sztynort");
// Port port3 = new Port("Wêgorapa");
// Port port4 = new Port("Keja");
//
// ObjectPlus.pokazEkstensje(Port.class);
//
// }
//
// }
