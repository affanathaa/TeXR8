public class BukuTester {
public static void main(String[] args) {
    //object
    Buku a1 = new Buku(1, "ian lagi balap", "ian", "2001");
    Buku a2 = new Buku(2, "qumuna jatuh cinta", "qomuna", "2003");
    Buku a3 = new Buku(30, "sekolahkku", "atha", "2014");
    Buku a4 = new Buku(40, "adly makan bakso", "adly", "2023");
    Buku a5 = new Buku(50, "nendra naik kereta", "nendra", "2021");

    System.out.println(a1.id+a1.judul+a1.pengarang+a1.tahunTerbit);
    System.out.println(a2.id+a2.judul+a2.pengarang+a2.tahunTerbit);
    System.out.println(a3.id+a3.judul+a3.id+a3.pengarang+a3.tahunTerbit);
    System.out.println(a4.id+a4.judul+a4.pengarang+a4.tahunTerbit);
    System.out.println(a5.id+a5.judul+a5.pengarang+a5.tahunTerbit);
}
    
}