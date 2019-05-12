package putra095;
import java.util.Scanner;
public class Putra095 {

    
    public static void main(String[] args) {
        int jumlah, pilih;

        Scanner input = new Scanner(System.in);
        Alat honda = new Alat();
        Mandi suzuki = new Mandi();
        Tulis yamaha = new Tulis () ;
        Kesehatan ktm = new Kesehatan();

        System.out.println("Pilihan Alat : ");
        System.out.println("1. Alat Mandi");
        System.out.println("2. Alat Kesehatan");
        System.out.println("3. Alat Tulis");
        System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                   suzuki.Nama();
                   suzuki.Merk();
                   suzuki.Harga();
                   suzuki.Bentuk();
                   suzuki.Warna();
                    break;
                case 2:
                    yamaha.Nama();
                    yamaha.Merk();
                    yamaha.Harga();
                    yamaha.Fungsi();
                    yamaha.DimensiAlat();
                    break;
                case 3:
                    ktm.Nama();
                     ktm.Merk();
                     ktm.Harga();
                     ktm.Jenis();
                     ktm.Manfaat();
                    break;
                default:
                    System.out.println("tidak ada Pilihan");
                    break;
            }
            System.out.println("-----------------------");
            switch (pilih) {
                case 1:
                    System.out.println("Nama alat: " + suzuki.nama);
                    System.out.println("Merk alat : " + suzuki.merk);
                    System.out.println("Harga alat : " +suzuki.hrg);
                    System.out.println("Wujud alat : " +suzuki.wuj);
                    System.out.println("Warna alat : " + suzuki.wrna);
                    break;
                case 2:
                    System.out.println("Nama alat: " + yamaha.nama);
                    System.out.println("Merk alat: " + yamaha.merk);
                    System.out.println("Harga alat: " + yamaha.hrg);
                    System.out.println("Bentuk alat: " + yamaha.fgs);
                    System.out.println("Warna alat: " + yamaha.dmsi);
                    break;
                case 3:
                    System.out.println("Nama alat: " +  ktm.nama);
                    System.out.println("Merk alat: " +  ktm.merk);
                    System.out.println("Harga alat : " +  ktm.hrg);
                    System.out.println("Jenis alat : " +  ktm.jns);
                    System.out.println("Manfaat alat : " +  ktm.mft);
                    break;
                default:
                    break;
            }
        }

    }
    
