package folder1.folder2;

import java.util.Scanner;

     
        public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("pilihan buku: 1.TextBook 2.Novel");
        int pilih = input.nextInt();
        
        System.out.println("Judul buku? ");
        String title = input.next();
        System.out.println("Harga buku? ");
        double price = input.nextDouble();
        System.out.println("Tahun buku? ");
        int year = input.nextInt();

        if (pilih == 1){
            System.out.println("Subject apa? ");
            String subject = input.next();
            TextBook ta = new TextBook(title, year, price, subject);
            ta.print(); 
            System.out.println("Apakah termasuk Bio");
            String bio = input.next();
            if (bio.equals("ya")) {
                System.out.println("Bio tentang apa? ");
                String About = input.next();
                Biography ha = new Biography(title, year, price, subject, About);
                ha.print();
            }
        } else if (pilih == 2){
            System.out.println("Genrenya apa? ");
            String genre = input.next();
            Novel ta = new Novel(title, year, price, genre);
            ta.print();

        }

    }
}
    

