package PT6.Sorting;

public class DaftarMahasiswaBerpretasi {
    Mahasiswa ListMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx<ListMhs.length){
            ListMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for(Mahasiswa m : ListMhs){
            m.tampil();
            System.out.println("----------------------------");
        }
    }
    void bubbleSort(){
        for(int i=0; i<ListMhs.length-1; i++){
            for(int j=1; j<ListMhs.length-i; j++){
                if(ListMhs[j].ipk > ListMhs[j-1].ipk){
                    //proses swap/penukaran
                    Mahasiswa tmp = ListMhs[j];
                    ListMhs[j] = ListMhs[j-1];
                    ListMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i=0; i<ListMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<ListMhs.length; j++){
                if(ListMhs[j].ipk < ListMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = ListMhs[idxMin];
            ListMhs[idxMin] = ListMhs[i];
            ListMhs[i] = tmp;
        }
    }
    void insertionSort(boolean asc){
        for (int i = 1; i < ListMhs.length; i++) {
            Mahasiswa temp = ListMhs[i];
            int j = i;
            if (asc) {
                while(j > 0 && ListMhs[j - 1].ipk > temp.ipk){
                    ListMhs[j] = ListMhs[j-1];
                    j--;
                }
            }else{
                while(j > 0 && ListMhs[j - 1].ipk < temp.ipk){
                    ListMhs[j] = ListMhs[j-1];
                    j--;
                }
            }
            ListMhs[j] = temp;

        }
    }
}
