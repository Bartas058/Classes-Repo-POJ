abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected RodzajSilnika rodzajSilnika;
    
    protected enum RodzajSilnika {
        SPALINOWY,
        ELEKTRYCZNY,
        AKUMULATOROWY
    }
}

class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;

    public Kosiarka(String marka, String nazwa, double pojemnoscSilnika, RodzajSilnika rodzajSilnika, boolean czyMelekser, boolean czyNaped, int liczbaOstrzy) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rodzajSilnika = rodzajSilnika;
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public boolean getCzyMelekser() {
        return czyMelekser;
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public boolean getCzyNaped() {
        return czyNaped;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public int getLiczbaOstrzy() {
        return liczbaOstrzy;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }

    public void wyswietl() {
        System.out.println("-----INFORMACJE-----");
        System.out.println("Marka: " + marka);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Pojemność silnika: " + pojemnoscSilnika);
        System.out.println("Rodzaj silnika: " + rodzajSilnika);
        System.out.println("Czy melekser: " + czyMelekser);
        System.out.println("Czy napęd: " + czyNaped);
        System.out.println("Liczba ostrzy: " + liczbaOstrzy);
    }
}

class Test {
    public static void main(String[] args) {
        Kosiarka kosiarka = new Kosiarka("Bosch", "1619M00M8F", 1.4, Maszyna.RodzajSilnika.SPALINOWY, false, false, 3);
        kosiarka.setCzyMelekser(true);
        kosiarka.setCzyNaped(true);
        kosiarka.setLiczbaOstrzy(4);
        kosiarka.wyswietl();
    }
}