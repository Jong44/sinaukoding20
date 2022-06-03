import java.util.Scanner;


public class Tugas3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Tugas3 tgs = new Tugas3();
        int pilihan;
        System.out.println("========================== MENU ================================");
        System.out.println("1. Persegi ");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga ");
        System.out.println("4. Persegi Panjang");
        System.out.print("Masukkan Pilihan Menu = ");
        pilihan = in.nextInt();

        
        if(pilihan == 1){
            persegi persegi = tgs.new persegi();
            persegi.luas_persegi();
            persegi.keliling_persegi();
        } 
        else if(pilihan == 2) { 
            persegipanjang pp = tgs.new persegipanjang();
            pp.luas_pPanjang();
            pp.keliling_pPanjang();
        }
        else if(pilihan == 3) { 
            System.out.println("========================== MENU ================================");
            System.out.println("1. Luas ");
            System.out.println("2. Keliling ");
            System.out.print("Masukkan Pilihan Menu = ");
            pilihan = in.nextInt();
            segitiga sg = tgs.new segitiga();
            if (pilihan == 1 ){
                sg.luas_segitiga();
            } 
            else if(pilihan == 2){
                sg.keliling_segitiga();
            }
        } 
        else if(pilihan == 4) {  
            lingkaran lingkaran = tgs.new lingkaran();
            lingkaran.luas_lingkaran();
            lingkaran.luas_lingkaran();
        }
        else {
            System.out.println("Pilihan Tidak ada");
        }




     
      
    }

    class persegi{
        int sisi, luas, keliling;

        void luas_persegi(){
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan Sisi = ");

            sisi = in.nextInt();

            luas = sisi * sisi;

            System.out.println("Luasnya = " + luas);

        }   

        void keliling_persegi(){
            keliling = 4 * sisi;

            System.out.println("Keliling = " + keliling);

        }   
    }

    class persegipanjang{
        int panjang, lebar, luas, keliling;
        void luas_pPanjang(){
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan Panjang = ");
            panjang = in.nextInt();
            System.out.print("Masukkan Lebar = ");
            lebar = in.nextInt();

            luas = panjang * lebar;

            System.out.println("Luasnya = " + luas);
            
        }

        void keliling_pPanjang(){
            keliling = 2*panjang+ 2*lebar;
            System.out.println("Kelilingnya = " + keliling);
            
        }
    }

    class segitiga{
        int alas, tinggi, keliling, s1, s2, s3;
        double luas;

        void luas_segitiga(){
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan Alas = ");
            alas = in.nextInt();
            System.out.print("Masukkan Tinggi = ");
            tinggi = in.nextInt();

            luas = 0.5 * alas  * tinggi;

            System.out.println("Luasnya = " + luas);
            
        }

        void keliling_segitiga(){
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan Sisi 1 = ");
            s1 = in.nextInt();
            System.out.print("Masukkan Sisi 2 = ");
            s2 = in.nextInt();
            System.out.print("Masukkan Sisi 3 = ");
            s3 = in.nextInt();

            keliling = s1+s2+s3;

            System.out.println("Kelilingnya = " + keliling);
            
        }
    }
    class lingkaran{
        int jari, tinggi;
        double luas, keliling;

        void luas_lingkaran(){
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan jari-jari = ");
            jari = in.nextInt();

            luas = 3.14 * jari  * jari;

            System.out.println("Luasnya = " + luas);
            
        }

        void keliling_segitiga(){
            keliling = 3.14*jari*2;

            System.out.println("Kelilingnya = " + keliling);
            
        }
        
            
            
    }
}
