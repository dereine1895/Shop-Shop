public class Kunde {
    private String Vorname;
    private String Nachname;
    private int Kundennummer;
    private List<Bestellung> bestellungen;

    public Kunde() {

    }


    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public int getKundennummer() {
        return Kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        Kundennummer = kundennummer;
    }

    public List<Bestellung> getBestellungen() {
        return bestellungen;
    }

    public void setBestellungen(List<Bestellung> bestellungen) {
        this.bestellungen = bestellungen;
    }
}
