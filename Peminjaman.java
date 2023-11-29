import java.util.Date;

public class Peminjaman {

    private Buku buku;
    private Anggota anggota;
    private Date tanggalPeminjaman;
    private int durasiPeminjaman;
    private int waktuPeminjaman;

    public Peminjaman(Buku buku, Anggota anggota, int durasiPeminjaman, int waktuPeminjaman) {
        this.buku = buku;
        this.anggota = anggota;
        this.tanggalPeminjaman = new Date();
        this.durasiPeminjaman = durasiPeminjaman;
        this.waktuPeminjaman = waktuPeminjaman;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }

    public void setDurasiPeminjaman(int durasiPeminjaman) {
        this.durasiPeminjaman = durasiPeminjaman;
    }
    public int getWaktuPeminjaman(){
        return waktuPeminjaman;
    }
    public void setWaktuPeminjaman(int waktuPeminjaman){
        this.waktuPeminjaman = waktuPeminjaman;
    }

    public int calculateDurasiPeminjaman() {
        return durasiPeminjaman;
    }
}
