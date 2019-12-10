public class Tugas{
    public static void main(String[] args){
        System.out.println("Tugas Pertama");
        Handphone handphoneA = new Handphone();
        handphoneA.os = "Android";
        handphoneA.beli();
        handphoneA.nyalakanhandphone();

        Handphone handphoneB = new Handphone();
        handphoneB.os = "IOS";
        handphoneB.beli();
        handphoneB.nyalakanhandphone();
    }
}
class Handphone{
    String os;
    String warna;

    public void beli(){
        System.out.println("Handphone "+ this.os +" Handphone Bagus");
    }
    public void nyalakanhandphone(){
        System.out.println("Handphone Menyala");
    }
}