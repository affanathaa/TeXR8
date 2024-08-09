import java.util.Scanner;

public class Tugas {
    
    public static void main(String[] args) {
        
        int diagonal1,diagonal2;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan diagonal1 layang layang: ");
        diagonal1 = input.nextInt();
        System.out.println("Masukkan diagonal2 layang layang: ");
        diagonal2 = input.nextInt();
        double Konstanta= 0.5;      
        double hasil = diagonal1*diagonal2*Konstanta;
        System.out.println("Hasil luas layang layang adalah: "+hasil);

    }
    
}
