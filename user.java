
public class user {

    public user() {
    }
    public String nama;
    protected String jenis;
    protected String warna;

    public user(String nama, String jenis, String warna, String kode, String merk) {
        this.nama = nama;
        this.warna = warna;
        this.kode = kode;
        this.merk = merk;
    }
    protected String kode;
    protected String merk;

   
   

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

   

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }



   

    public String setNama() {
        throw new UnsupportedOperationException("tidak support"); //To change body of generated methods, choose Tools | Templates.
    }

    public String setWarna() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String setKode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String setFasilitas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
   }

