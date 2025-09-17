package latihahansasa;

import java.util.Scanner;

public class latihankita {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String jeniskelamin;
         jeniskelamin= in.nextLine();
         int usia;
         usia= in.nextInt();

        switch (jeniskelamin) {
            case "perempuan":
                if ( usia <12){
                    System.out.println("MASIH DEK-DEK KAMU AHAHAH");break;
                
                } else if ( usia > 16 ){
                    System.out.println("UDAH PAS TAPI RASANYA YANG BEDA");break;
                } else {
                    System.out.println("SORRY UDAH KETUAAN");break;
                }

            case "lakilaki"  :

            if ( usia <12){
                    System.out.println("MASIH DEK-DEK KAMU AHAHAH");break;
                
                } else if ( usia > 16 ){
                    System.out.println("UDAH PAS TAPI RASANYA YANG BEDA");break;
                } else {
                    System.out.println("SORRY UDAH KETUAAN");break;
                }
            default:
                System.out.println("IH GA TAU MAU BILANG APA");break;
        }

        }




    }

