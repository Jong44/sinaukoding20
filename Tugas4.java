import java.util.Scanner;

public class Tugas4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Tugas4 tgs = new Tugas4();
        while(true) {
            int pilihan;
            System.out.println("========================== MENU ================================");
            System.out.println("1. Persegi ");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga ");
            System.out.println("4. Lingkaran");
            System.out.println("5. Exit");
            System.out.print("Masukkan Pilihan Menu = ");
            pilihan = in.nextInt();

            switch (pilihan){

                case 1:
                int sisi;
                int inp;
                System.out.print("Masukkan Sisi = ");
                sisi = in.nextInt();
                rumus ps = tgs.new rumus();
                System.out.println("========================== MENU ================================");
                System.out.println("1. Luas");
                System.out.println("2. Keliling");
                System.out.print("Masukkan Pilihan Menu = ");
                inp = in.nextInt();
                if(inp == 1){
                    ps.luas(sisi);
                }
                else if (inp == 2){
                    ps.keliling(sisi);
                }
                else{
                    System.out.println("Menu yang anda pilih salah");
                }
                break;

                case 2:
                int a;
                int b;
                System.out.print("Masukkan Sisi a = ");
                a = in.nextInt();
                System.out.print("Masukkan Sisi b = ");
                b = in.nextInt();
                rumus1 panjang = tgs.new rumus1();
                System.out.println("========================== MENU ================================");
                System.out.println("1. Luas");
                System.out.println("2. Keliling");
                System.out.print("Masukkan Pilihan Menu = ");
                inp = in.nextInt();
                if(inp == 1){
                    panjang.luas(a, b);
                }
                else if (inp == 2){
                    panjang.keliling(a,b);
                }
                else{
                    System.out.println("Menu yang anda pilih salah");
                }
                break;

                case 3:
                int c;
                
                System.out.print("Masukkan Sisi a = ");
                a = in.nextInt();
                System.out.print("Masukkan Sisi b = ");
                b = in.nextInt();
                System.out.print("Masukkan Sisi c = ");
                c = in.nextInt();
                rumus2 stg = tgs.new rumus2();
                System.out.println("========================== MENU ================================");
                System.out.println("1. Luas");
                System.out.println("2. Keliling");
                System.out.print("Masukkan Pilihan Menu = ");
                inp = in.nextInt();
                if(inp == 1){
                    stg.luas(a, b);
                }
                else if (inp == 2){
                    stg.keliling(a,b,c);
                }
                else{
                    System.out.println("Menu yang anda pilih salah");
                }
                break;

                case 4:
                int r;
                System.out.print("Masukkan jari-jari = ");
                r = in.nextInt();
                rumus3 ling = tgs.new rumus3();
                System.out.println("========================== MENU ================================");
                System.out.println("1. Luas");
                System.out.println("2. Keliling");
                System.out.print("Masukkan Pilihan Menu = ");
                inp = in.nextInt();
                if(inp == 1){
                    ling.luas(r);
                }
                else if (inp == 2){
                    ling.keliling(r);;
                }
                else{
                    System.out.println("Menu yang anda pilih salah");
                }
                break;
                
                

                case 5:
                System.exit(0);
                break;

                default:
                System.out.println("Menu yang anda pilih salah");
                break;

            }
        }
        





    }


class rumus implements Persegi{
    @Override
    public void luas(int sisi){
        int luas;
        luas = sisi * sisi;
        System.out.println("Luas = " + luas);
    }

    @Override
    public void keliling(int sisi){
        int keliling;
        keliling = 4*sisi;
        System.out.println("Keliling = " + keliling);
    }

}

class rumus1 implements panjang{
    @Override
    public void luas(int a, int b){
        int luas;
        luas = a * b;
        System.out.println("Luas = " + luas);
    }

    @Override
    public void keliling(int a, int b){
        int keliling;
        keliling = 2*a+2*b;
        System.out.println("Keliling = " + keliling);
    }

}

class rumus2 implements segitiga{
    @Override
    public void luas(int a, int b){
        double luas;
        luas = 0.5*a*b;
        System.out.println("Luas = " + luas);
    }

    @Override
    public void keliling(int a, int b, int c){
        int keliling;
        keliling = a+b+c;
        System.out.println("Keliling = " + keliling);
    }

}

class rumus3 implements lingkaran{
    @Override
    public void luas(int r){
        double luas;
        luas = 3.14*r*r;
        System.out.println("Luas = " + luas);
    }

    @Override
    public void keliling(int r){
        double keliling;
        keliling = 2*3.14*r;
        System.out.println("Keliling = " + keliling);
    }

}









public interface Persegi{
    void luas(int sisi);
    void keliling(int sisi);
}

public interface panjang{
    void luas(int a, int b);
    void keliling(int a, int b);
}

public interface segitiga{
    void luas(int a, int b);
    void keliling(int a, int b, int c);
}
public interface lingkaran{
    void luas(int r);
    void keliling(int r);
}

}

