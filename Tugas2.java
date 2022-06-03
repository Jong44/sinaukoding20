public class Tugas2 {
    public static void main(String args[]){

      for (int n = 1; n <= 20; n++){
        int i = 0;
        for( int j = 1; j<=n; j++ ){
          if (n % j== 0){
            i++;
          }
        } 
        if (i == 2){
          System.out.println(n + " Ini bilangan Prima");
        } else{
          System.out.println(n + " Ini bukan bilangan Prima");
        }
        
      }
    }

}