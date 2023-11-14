
import java.util.ArrayList;


public class tokoolahraga extends barang{
    private ArrayList<barang> barang = new ArrayList<>();
    public void setBarang(barang barang) {
        this.barang.add(barang);
    }

    public ArrayList<barang> getBarang() {
        return barang;
    }
}