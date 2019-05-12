package putra095;
import java.util.Scanner;
public class Alat {
     String nama, merk;
    long hrg;
    static Scanner sc = new Scanner(System.in);
    public void Nama(){
        System.out.print("Nama : ");
        nama = sc.next();
    }
    
    public void Merk(){
        System.out.print("Merk : ");
        merk = sc.next();
    }

    public void Harga() {
        System.out.print("Harga : ");
        hrg = sc.nextLong();
    }
}
