import java.util.List;

public class Anggota  {
    private String nama;
    private String  nomorAnggota;
    private String alamat;
    public List<String> riwayatPeminjaman;

    public Anggota(String nama, String nomorAnggota,String alamat) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;

    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorAnggota() {
        return nomorAnggota;
    }

    public void setNomorAnggota(String nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getDetails(){
        return "Anggota : " + nama + ", Nomor Anggota : " + nomorAnggota + ", Alamat " + alamat;
    }
    public boolean Login(String inputNomorAnggota, String password){
        return nomorAnggota.equals(inputNomorAnggota) && password.equals("");
    }

    public void addkekolabuku() {
        System.out.println("Notifikasi diterima");
    }
}
