
public class barang {
    public String nama;
    protected String jenis;
    protected String warna;
    protected String kode;
    protected String merk;
    protected int tanggal_input;
   

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
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

    public int getTanggal_input() {
        return tanggal_input;
    }

    public void setTanggal_input(int tanggal_input) {
        this.tanggal_input = tanggal_input;
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
}
