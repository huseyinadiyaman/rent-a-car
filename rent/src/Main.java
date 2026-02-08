
public class Main {
    public static void main(String[] args) {
        KiralamaSirketi avis = new KiralamaSirketi();

        avis.aracEkle(new Binek("Volkswagen", "Passat", 2020, 550, 5));
        avis.aracEkle(new Binek("BMW", "5.20", 2021, 670, 5));
        avis.aracEkle(new Kamyon("Ford", "F-150", 2020, 800, 2500));
        avis.aracEkle(new Kamyon("Volkswagen", "Amarok", 2021, 970, 3000));
        avis.aracEkle(new Ticari("Fiat","Doblo", 2018, 500, 5, 800));
        avis.aracEkle(new Ticari("Volkswagen","Caddy", 2020, 700, 5, 920));
        avis.aracEkle(new Spor("Nissan","GT-R", 2010, 1500, 315));
        avis.aracEkle(new Spor("Ferrari","458", 2012, 2000, 325));

        avis.garajiGoster();

        KiralamaPlaný kiralama = avis.kiralamaPlaniOlustur("günlük", avis.araclar.get(7), 3);
        kiralama.planiYazdir();
    }
}