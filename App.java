public class App{
    public static void main(String[] args){
        System.out.println("Selamat Datang Di Applikasi Ini");
        Mobil objMobil = new Mobil();
        objMobil.merk = "Toyota Avanza";
        objMobil.nyalakanmesin();
        objMobil.maju();

        Mobil bmw = new Mobil();
        bmw.merk = "BMW 330i";
        bmw.maju();

        Segitiga segitigaA = new Segitiga();
        segitigaA.alas = 5;
        segitigaA.tinggi = 4;
        segitigaA.hitungluas();

        Segitiga segitigaB = new Segitiga();
        segitigaB.alas = 6;
        segitigaB.tinggi = 7;
        segitigaB.hitungluas();
    }
}

class Mobil{
   String merk;
   int jumlahroda;
   String warna;

   public void maju(){
       System.out.println("Mobil "+ this.merk +" maju  ngeng");
   }

   public void nyalakanmesin(){
       System.out.println("Mesin Menyala");
   }
}
class Segitiga{
       int alas;
       int tinggi;

       public void hitungluas(){
           double luas = this.alas * this.tinggi / 2;
           System.out.println(luas);
       }
   }