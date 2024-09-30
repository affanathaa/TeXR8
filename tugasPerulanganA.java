import java.util.Scanner;
public class tugasPerulanganA {
    public static void main(String[] args) {
        int buah, jumlahbuah, nilaibuah =0, rataratabuah, temp=0;
        double totalNilai;
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Berapa hari anda Menjual Buah");
        jumlahbuah = in.nextInt();
        buah = 1;
        while (buah <= jumlahbuah) {
        System.out.println("Masukkan nilai buah yang sudah terjual "+ buah + ":");
        nilaibuah = in.nextInt();
        temp+=nilaibuah;
        buah++;
    }
    totalNilai=temp;
    rataratabuah=temp/jumlahbuah;
    System.out.println("totalNilai" +totalNilai+ "/rata-rata nilai: " +rataratabuah );
    System.out.println();
    in.close();    
    }
}