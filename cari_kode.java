
import java.util.ArrayList;

public class cari_kode {
    public static int cari(String plane, ArrayList<String> arr){ 
        int terdeteksi = -1;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i).equals(plane)){
                terdeteksi = i;
            }
        }
        return terdeteksi;
    }
    public static int ubahdata(String IDBarang, ArrayList<String> arr, String itu){
        int mulaiubah = -1;
        int kode = cari(IDBarang,arr);
        if(kode != -1){
            arr.set(kode, itu);
            mulaiubah = 1;
        }
        return mulaiubah;
    }
    public static int hapusData(String IDBarang, ArrayList<String> arr1, ArrayList<String> arr2, ArrayList<String> 
            arr3, ArrayList<String> arr4, ArrayList<String>arr5){
        int trunc = -1;
        int kode = cari(IDBarang, arr1);
        if(kode!=-1){
            arr1.remove(kode);
            arr2.remove(kode);
            arr3.remove(kode);
            arr4.remove(kode);
            arr5.remove(kode);
            trunc = 1;
        }
        return trunc;
    }
    public static int tambahPesawat(String namaBarang, String IDBarang, String warna, String merk,String jenis,
            ArrayList<String>arr1, ArrayList<String>arr2, ArrayList<String>arr3, ArrayList<String>arr4, ArrayList<String>arr5, ArrayList<String>arr6, ArrayList<String>arr7){
        arr1.add(namaBarang);
        arr2.add(IDBarang);
        arr3.add(warna);
        arr4.add(merk);
        arr5.add(jenis);
        return 1;
    }           

    public static void hapusData(String IDBarang, ArrayList namaBarang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
