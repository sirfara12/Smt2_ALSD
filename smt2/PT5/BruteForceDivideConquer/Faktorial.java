package PT5.BruteForceDivideConquer;

public class Faktorial {
   public int nilai;
    
        int FaktorialBF(int n) {
            int fakto = 1;
            int i=1;
            while(i <= n){
                fakto = fakto*i;
                i++;
            }
            return fakto;
      }
        
    int FaktorialDC(int n){
        if(n==1){
            return 1;
        }else{
            int fakto = n * FaktorialDC(n-1); 
            return fakto;      
        }
   }
}


 // for(int i=1; i <=n; i++){
         //   fakto *= i;
