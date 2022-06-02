public class Belajar1 {
    public static void main(String args[]){


      //for (int n = 1; n <= 50; n++){
          //if(n % 3 == 0){
            //System.out.println(n + " habis dibagi 3");
          //}
          //else if(n % 5 == 0){
            //System.out.println (n + " habis dibagi 5");
          //} else {
           // System.out.println(n);
          //}  
      //}

      for (int n = 1; n <= 20; n++){
        int i = 0;
        for( int j = 1; j<=n; j++ ){
          if (n % j== 0){
            i++;
          }
        } 
        if (i == 2){
          System.out.println(n + " Ini bilangan Prima");
        } else if (i >= 2){
          System.out.println(n + " Ini bukan bilangan Prima");
        }
        
      }
    }

}