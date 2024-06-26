package PT5.BruteForceDivideConquer;

public class Pangkat {
    public int nilai, pangkat;

    public Pangkat(int n, int p){
        nilai = n;
        pangkat = p;
    }

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for(int i = 0; i < n; i++){
            hasil = hasil * a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if (n == 1) {
            return a;
        }  else {
            if(n%2 == 0) //bilangan ganjil
            {
                 return (pangkatDC(a, n/2) * pangkatDC(a, n/2));

            } else{
                return(pangkatDC(a, n/2) * pangkatDC(a, n/2)*a);
            }
         }
    }
}
