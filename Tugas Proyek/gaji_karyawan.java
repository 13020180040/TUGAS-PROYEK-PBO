
import java.util.*;
public class gaji_karyawan {
     public static void main(String[]args)
    {
        String nama="";
        int jam=0;
        long lembur;
        long total;
        long upah;

    Scanner input=new Scanner(System.in);
	System.out.println("Program Hitung Gaji Karyawan");
       System.out.println("INPUT");
       System.out.println("==================");

        System.out.print("input nama : ");
       nama=input.next(); 

        System.out.print("input jam : ");  
    jam=input.nextInt();

    if(jam>8)
        {
            lembur=(int) (jam*10000);}        
        else{
        lembur=(int) (jam*0);
}
        System.out.println();
        System.out.println();

        System.out.println("OUTPUT");
       System.out.println("==================");

        System.out.println("Nama : "+nama);
        System.out.println("Jam Kerja : "+jam);

         upah=(int) (jam*20000);
        System.out.println("Upah: "+upah);

         System.out.println("Lembur: "+lembur);

        total=upah+lembur;
         System.out.println("Total Upah: "+total);
    }
}