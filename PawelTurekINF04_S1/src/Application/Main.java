package Application;

public class Main {

    public static void main(String[] args) {
        //STWORZENIE KLASY
        Czlowiek Pawel_Turek = new Czlowiek("Paweł", 180, 110);
        System.out.println(Pawel_Turek.selfImie + " Waga " + Pawel_Turek.selfWaga + " Wysokość " + Pawel_Turek.selfWysokosc);

        //UŻYCIE BOOLA
        boolean chudniesz = true;

        // PĘTLA
        while (chudniesz) {
            //UŻYCIE WARUNKU
            if (Pawel_Turek.selfWaga >= 90) {
                Pawel_Turek.selfWaga -= 1;
                System.out.println("schudnij");
            }
            //UŻYUCIE WARUNKU ELSE
            else {
                chudniesz = false;
                System.out.println("masz git wage");
            }
        }
        //KLASA DZIEDZICZONA
        Tomek TomekPrzyjaciel = new Tomek("Tomek", 190, 80, 200);

        System.out.println(TomekPrzyjaciel.selfImie + " Waga " + TomekPrzyjaciel.selfWaga + " Wysokość " + TomekPrzyjaciel.selfWysokosc);
        //WYWOLANIE FUNCKJI
        TomekPrzyjaciel.Okrzyk();
    }
}
