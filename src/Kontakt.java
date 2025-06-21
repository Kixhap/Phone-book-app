public class Kontakt {
    public String imie;
    public String nazwisko;
    public String numerTelefonu;

    public Kontakt(String imie, String nazwisko, String numerTelefonu){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerTelefonu = numerTelefonu;
    }
    public String toString() {
        return imie +" " + nazwisko+ " " +numerTelefonu;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public String getNumerTelefonu(){
        return numerTelefonu;
    }
}
