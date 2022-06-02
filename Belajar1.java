public class Belajar1 {
    public static void main(String args[]){


      for (int n = 1; n <= 50; n++){
          if(n % 3 == 0){
            System.out.print(n + "habis dibagi 3");
          }
          else if(n % 5 == 0){
            System.out.print(n + "habis dibagi 5");
          } else {
            System.out.print(n);
          }  
      }
    }

}