package putra095;

import putra095.Alat;

public class Kesehatan extends Alat{
     String jns, mft ;
    public void Jenis (){
        System.out.print("Jenis : ");
       jns = sc.next();
    }
    
    public void Manfaat (){
        System.out.print("Kegunaan : ");
        mft= sc.next();
        
    }
}
