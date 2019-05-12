package putra095;
import putra095.Alat;

public class Tulis extends Alat{
   
    String fgs, dmsi;
    public void Fungsi() {
        System.out.print("Fungsi : ");
        fgs = sc.next();
    }
    
    public void DimensiAlat (){
        System.out.print("Warna = ");
        dmsi = sc.next();
    }
}
