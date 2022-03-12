package Application;

public class Tomek extends Czlowiek {
    int selfIlorazInteligencji;

    public Tomek(String imie, int wysokosc, int waga, int ilorazInteligencji) {
        super(imie, wysokosc, waga);
        selfIlorazInteligencji = ilorazInteligencji;
    }

    //STWORZENIE FUNKCJI
    public void Okrzyk()
    {
        System.out.println("mam iloraz Ingeligencji równy " + selfIlorazInteligencji);
    }
}
