
import java.util.ArrayList;

import java.util.Scanner;
import java.time.LocalTime;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public abstract class Main {

    public abstract void kucing();
}

class banner extends Main {

    @Override
    public void kucing() {
    }
}

class run extends Main {

    static JFrame r;

    public static void main(String[] args) {
        JTextArea textArea = new JTextArea(20, 40);
        tokoolahraga toko = new tokoolahraga();
        ArrayList<barang> barang = new ArrayList<>();
        barang BARANG;
        ArrayList<user> user = new ArrayList<>();
        user user2;
        Scanner in = new Scanner(System.in);
        Scanner intin = new Scanner(System.in);
        String menu, teks = null;

        banner obj = new banner();
        LocalTime waktu = LocalTime.now();
        System.out.println(waktu);
        obj.kucing();
        r = new JFrame();

        JScrollPane scroll = new JScrollPane(textArea);
        boolean ulangi = true;
        while (ulangi) {

            String user1 = JOptionPane.showInputDialog(r, "Masukkan username", "TOKO OLAHRAGA MADSPEED", JOptionPane.QUESTION_MESSAGE);
            String pass = JOptionPane.showInputDialog(r, "Masukkan password", "TOKO OLAHRAGA MADSPEED", JOptionPane.QUESTION_MESSAGE);

            if (user1.equals("Admin") && pass.equals("123")) {
                boolean ulang = true;
                while (ulang) {
                    String pilih = JOptionPane.showInputDialog(r, "1. Buat Data "
                            + "\n2. Tampilkan Data"
                            + "\n3. Hapus Data"
                            + "\n4. Keluar\n\nMasukan pilihan dibawah ini ", "Menu Utama", JOptionPane.DEFAULT_OPTION);

                    switch (pilih) {
                        case "1":
                            boolean loop = true;
                            while (loop) {
                                String pilihan = JOptionPane.showInputDialog("1. Alat"
                                        + "\n2. Bola"
                                        + "\n3. Jersey"
                                        + "\n4. Sepatu"
                                        + "\n\nMasukan pilihan :");
                                switch (pilihan) {
                                    case "1":
                                        BARANG = new alat();//27-29 case 1
                                        BARANG.setNama(JOptionPane.showInputDialog(r, "Masukkan nama barang : ", "nama barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setWarna(JOptionPane.showInputDialog(r, "Masukkan warna barang : ", "warna barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setKode(JOptionPane.showInputDialog(r, "Masukkan ID barang : ", "ID barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setMerk(JOptionPane.showInputDialog(r, "Masukkan merk barang : ", "Merk barang", JOptionPane.QUESTION_MESSAGE));

                                        try {
                                            BARANG.setTanggal_input(Integer.parseInt(JOptionPane.showInputDialog(r, "tanggal input barang : ", "tanggal input", JOptionPane.QUESTION_MESSAGE)));
                                        } catch (Exception e) {
                                            JOptionPane.showMessageDialog(r, "Anda harus memasukkan angka pada tanggal pembuatan", "kesalahan", JOptionPane.ERROR_MESSAGE);
                                        }
                                        toko.setBarang(BARANG);
                                        JOptionPane.showMessageDialog(r, "Data barang berhasil ditambahkan", "konfirmasi", JOptionPane.DEFAULT_OPTION);

                                        break;
                                    case "2":
                                        BARANG = new bola();//27-29 case1
                                        BARANG.setNama(JOptionPane.showInputDialog(r, "Masukkan nama barang : ", "nama barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setWarna(JOptionPane.showInputDialog(r, "Masukkan warna barang : ", "warna barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setKode(JOptionPane.showInputDialog(r, "Masukkan ID barang : ", "ID barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setMerk(JOptionPane.showInputDialog(r, "Masukkan merk barang : ", "Merk barang", JOptionPane.QUESTION_MESSAGE));
                                        try {
                                            BARANG.setTanggal_input(Integer.parseInt(JOptionPane.showInputDialog(r, "tanggal input barang : ", "tanggal input", JOptionPane.QUESTION_MESSAGE)));
                                        } catch (Exception e) {
                                            JOptionPane.showMessageDialog(r, "Anda harus memasukkan angka pada tanggal pembuatan", "kesalahan", JOptionPane.ERROR_MESSAGE);
                                        }
                                        toko.setBarang(BARANG);
                                        JOptionPane.showMessageDialog(r, "Data barang berhasil ditambahkan", "konfirmasi", JOptionPane.DEFAULT_OPTION);

                                        break;
                                    case "3":
                                        BARANG = new jersey();
                                        BARANG.setNama(JOptionPane.showInputDialog(r, "Masukkan nama barang : ", "nama barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setWarna(JOptionPane.showInputDialog(r, "Masukkan warna barang : ", "warna barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setKode(JOptionPane.showInputDialog(r, "Masukkan ID barang : ", "ID barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setMerk(JOptionPane.showInputDialog(r, "Masukkan merk barang : ", "Merk barang", JOptionPane.QUESTION_MESSAGE));
                                        try {
                                            BARANG.setTanggal_input(Integer.parseInt(JOptionPane.showInputDialog(r, "tanggal input barang : ", "tanggal input", JOptionPane.QUESTION_MESSAGE)));
                                        } catch (Exception e) {
                                            JOptionPane.showMessageDialog(r, "Anda harus memasukkan angka pada tanggal pembuatan", "kesalahan", JOptionPane.ERROR_MESSAGE);
                                        }
                                        toko.setBarang(BARANG);
                                        JOptionPane.showMessageDialog(r, "Data barang berhasil ditambahkan", "konfirmasi", JOptionPane.DEFAULT_OPTION);

                                        break;
                                    case "4":
                                        BARANG = new sepatu();
                                        BARANG.setNama(JOptionPane.showInputDialog(r, "Masukkan nama barang : ", "nama barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setWarna(JOptionPane.showInputDialog(r, "Masukkan warna barang : ", "warna barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setKode(JOptionPane.showInputDialog(r, "Masukkan ID barang : ", "ID barang", JOptionPane.QUESTION_MESSAGE));
                                        BARANG.setMerk(JOptionPane.showInputDialog(r, "Masukkan merk barang : ", "Merk barang", JOptionPane.QUESTION_MESSAGE));
                                        try {
                                            BARANG.setTanggal_input(Integer.parseInt(JOptionPane.showInputDialog(r, "tanggal input barang : ", "tanggal input", JOptionPane.QUESTION_MESSAGE)));
                                        } catch (Exception e) {
                                            JOptionPane.showMessageDialog(r, "Anda harus memasukkan angka pada tanggal pembuatan", "kesalahan", JOptionPane.ERROR_MESSAGE);
                                        }
                                        toko.setBarang(BARANG);
                                        JOptionPane.showMessageDialog(r, "Data barang berhasil ditambahkan", "konfirmasi", JOptionPane.DEFAULT_OPTION);
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(r, "Pilihan tidak tersedia", "kesalahan", JOptionPane.ERROR_MESSAGE);

                                        break;
                                }
                                break;
                            }
                            break;
                        case "2":
                            String[] selanjutnya = {"Menu Utama"};
                            barang = toko.getBarang();
                            for (int i = 0; i < barang.size(); i++) {
                                JOptionPane.showOptionDialog(r, " Kode Barang = " + barang.get(i).getKode()
                                        + "\n Nama Barang = " + barang.get(i).getNama()
                                        + "\n Jenis Barang = " + barang.get(i).getJenis()
                                        + "\n Warna Barang = " + barang.get(i).getWarna()
                                        + "\n Merk Barang = " + barang.get(i).getMerk()
                                        + "\n Tanggal Input = " + barang.get(i).getTanggal_input(),
                                        "Judul Dialog", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, selanjutnya, selanjutnya[0]);
                            }
                            break;

                        case "3"://hapus data
                            String oke[] = {"Tetap Hapus", "batal"};
                            int rimof = JOptionPane.showOptionDialog(r, "Yakin ingin menghapus data", "konfirmasi penghapusan", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, oke, oke[0]);

                            if (rimof == JOptionPane.YES_OPTION) {
                                barang.clear();
                            }
                            if (rimof == JOptionPane.NO_OPTION) {

                            } else {

                            }
                            break;
                        case "4":
                            System.exit(0);
                            break;
                        default:
                            JOptionPane.showMessageDialog(r, "Pilihan tidak tersedia", "kesalahan memilih", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                }

            } else if (user1.equals("User") && pass.equals("321")) {
                boolean ulang = true;
                while (ulang) {
                    user2 = new user();
                    String tepilih = JOptionPane.showInputDialog("=============Barang yang tersedia============="
                            + "\n1.bola"
                            + "\n2.jersey"
                            + "\n3.sepatu");

                    switch (tepilih) {
                        case "1":
                            
                            user2.setNama(JOptionPane.showInputDialog(r, "==================masukkan nama bola==================="
                                    + "\n1.Bola Voly"
                                    + "\n2.Bola Basket"
                                    + "\n3.Bola Kasti"
                                    + "\n4.Bola Sepak", "Nama Bola", JOptionPane.QUESTION_MESSAGE));

                            if ("1".equals(user2.getNama())) {
                                user2.setNama("Voly");
                            } else if ("2".equals(user2.getNama())) {
                                user2.setNama("Basket");
                            } else if ("3".equals(user2.getNama())) {
                                user2.setNama("Kasti");
                            } else if ("4".equals(user2.getNama())) {
                                user2.setNama("Sepak");
                            }

                            user2.setMerk(JOptionPane.showInputDialog(r, "Masukkan Id Merek bola! "
                                    + "\n1.PUMA"
                                    + "\n2.NIKE"
                                    + "\n3.ADIDAS"
                                    + "\n4.SPECS", "Merek Bola", JOptionPane.QUESTION_MESSAGE));

                            if ("1".equals(user2.getMerk())) {
                                user2.setMerk("PUMA");
                            } else if ("2".equals(user2.getMerk())) {
                                user2.setMerk("NIKE");
                            } else if ("3".equals(user2.getMerk())) {
                                user2.setMerk("ADIDAS");
                            } else if ("4".equals(user2.getMerk())) {
                                user2.setMerk("SPECS");
                            }

                            user2.setWarna(JOptionPane.showInputDialog(r, "Masukkan Warna Bola!"
                                    + "\n1.MERAH"
                                    + "\n2.PUTIH"
                                    + "\n3.ABU-ABU"
                                    + "\n4.HITAM", "Warna Bola", JOptionPane.QUESTION_MESSAGE));

                            if ("1".equals(user2.getWarna())) {
                                user2.setWarna("MERAH");
                            } else if ("2".equals(user2.getWarna())) {
                                user2.setWarna("PUTIH");
                            } else if ("3".equals(user2.getWarna())) {
                                user2.setWarna("ABU-ABU");
                            } else if ("4".equals(user2.getWarna())) {
                                user2.setWarna("HITAM");
                            }

                            user2.setKode(JOptionPane.showInputDialog(r, "Mau Bali berapa Mas Bro...!!!: ", "Jumlah Bola", JOptionPane.QUESTION_MESSAGE));

                            JOptionPane.showMessageDialog(r, "pembelian berhasil", "konfirmasi", JOptionPane.DEFAULT_OPTION);

                            String hasilBola = "Anda telah membeli " + user2.getKode() + " Bola " + user2.getNama() + " Merk " + user2.getMerk() + " warna " + user2.getWarna() + ".";
                            JOptionPane.showMessageDialog(r, hasilBola, "Hasil Pembelian", JOptionPane.INFORMATION_MESSAGE);

                            break;

                        case "2":
                            
                            user2.setMerk(JOptionPane.showInputDialog(r, "Masukkan Id Merek Jersey! "
                                    + "\n1.PUMA"
                                    + "\n2.NIKE"
                                    + "\n3.ADIDAS"
                                    + "\n4.SPECS", "Merek Jersey", JOptionPane.QUESTION_MESSAGE));
                            
                            if ("1".equals(user2.getMerk())) {
                                user2.setMerk("PUMA");
                            } else if ("2".equals(user2.getMerk())) {
                                user2.setMerk("NIKE");
                            } else if ("3".equals(user2.getMerk())) {
                                user2.setMerk("ADIDAS");
                            } else if ("4".equals(user2.getMerk())) {
                                user2.setMerk("SPECS");
                            }

                            user2.setWarna(JOptionPane.showInputDialog(r, "Masukkan Warna Jersey!"
                                    + "\n1.MERAH"
                                    + "\n2.PUTIH"
                                    + "\n3.ABU-ABU"
                                    + "\n4.HITAM", "Warna Jersey", JOptionPane.QUESTION_MESSAGE));
                            
                            if ("1".equals(user2.getWarna())) {
                                user2.setWarna("MERAH");
                            } else if ("2".equals(user2.getWarna())) {
                                user2.setWarna("PUTIH");
                            } else if ("3".equals(user2.getWarna())) {
                                user2.setWarna("ABU-ABU");
                            } else if ("4".equals(user2.getWarna())) {
                                user2.setWarna("HITAM");
                            }

                            user2.setKode(JOptionPane.showInputDialog(r, "Mau Bali berapa Mas Bro...!!!: ", "Jumlah Sepatu", JOptionPane.QUESTION_MESSAGE));

                            JOptionPane.showMessageDialog(r, "pembelian berhasil", "konfirmasi", JOptionPane.DEFAULT_OPTION);

                            String hasilJersey = "Anda telah membeli " + user2.getKode() + " jersey merk " + user2.getMerk() + " warna " + user2.getWarna() + ".";
                            JOptionPane.showMessageDialog(r, hasilJersey, "Hasil Pembelian", JOptionPane.INFORMATION_MESSAGE);

                            break;

                        case "3":
                            
                            user2.setMerk(JOptionPane.showInputDialog(r, "Masukkan Id Merek Sepatu! "
                                    + "\n1.PUMA"
                                    + "\n2.NIKE"
                                    + "\n3.ADIDAS"
                                    + "\n4.SPECS", "Merek Sepatu", JOptionPane.QUESTION_MESSAGE));
                            
                            if ("1".equals(user2.getMerk())) {
                                user2.setMerk("PUMA");
                            } else if ("2".equals(user2.getMerk())) {
                                user2.setMerk("NIKE");
                            } else if ("3".equals(user2.getMerk())) {
                                user2.setMerk("ADIDAS");
                            } else if ("4".equals(user2.getMerk())) {
                                user2.setMerk("SPECS");
                            }

                            user2.setWarna(JOptionPane.showInputDialog(r, "Masukkan Warna Sepatu!"
                                    + "\n1.MERAH"
                                    + "\n2.PUTIH"
                                    + "\n3.ABU-ABU"
                                    + "\n4.HITAM", "Warna Sepatu", JOptionPane.QUESTION_MESSAGE));
                            
                            if ("1".equals(user2.getWarna())) {
                                user2.setWarna("MERAH");
                            } else if ("2".equals(user2.getWarna())) {
                                user2.setWarna("PUTIH");
                            } else if ("3".equals(user2.getWarna())) {
                                user2.setWarna("ABU-ABU");
                            } else if ("4".equals(user2.getWarna())) {
                                user2.setWarna("HITAM");
                            }

                            user2.setKode(JOptionPane.showInputDialog(r, "Mau Bali berapa Mas Bro...!!!: ", "Jumlah Bola", JOptionPane.QUESTION_MESSAGE));

                            JOptionPane.showMessageDialog(r, "pembelian berhasil", "konfirmasi", JOptionPane.DEFAULT_OPTION);
                            
                            String hasilSepatu = "Anda telah membeli " + user2.getKode() + " pasang sepatu merk " + user2.getMerk() + " warna " + user2.getWarna() + ".";
                            JOptionPane.showMessageDialog(r, hasilSepatu, "Hasil Pembelian", JOptionPane.INFORMATION_MESSAGE);

                            break;

                        default:
                            JOptionPane.showMessageDialog(r, "Sorry Mas Bro Pilihan Tidak Tersedia...!!!", "kesalahan memilih", JOptionPane.ERROR_MESSAGE);
                            break;
                    }

                }

            } else {
                JOptionPane.showMessageDialog(r, "Maaf username atau password invalid", "kesalahan login", JOptionPane.ERROR_MESSAGE);
            }
            break;

        }

    }

    private static JTextArea setText(String teks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void kucing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
