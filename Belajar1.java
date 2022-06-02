public class Belajar {
    public static void main(String args[]){
        //int a = 1;
        //if(a == 0){
         //   System.out.print("A adlah 0");
       // } else if(a == 1){
        //    System.out.print("A adlah 1");
      //  } else {
       //     System.out.print("A tidak sama dengan 0 dan 1");
      //  } 


      for (int n = 1; n <= 50; n++){
          if(n % 3 == 0){
            System.out.print(n + "habis dibagi 3");
          }
          else if(n % 3 == 0){
            System.out.print(n + "habis dibagi 5");
          }
          System.out.print(n);
      }
    }

}