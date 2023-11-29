public class Notifikasi {
    private String pesan;

    private Anggota penerima;

    public Notifikasi(String pesan, Anggota penerima){
        this.pesan = pesan;
        this.penerima = penerima;
    }
    public String getPesan(){
        return pesan;
    }
    public void setPesan(String pesan){
        this.pesan = pesan;
    }
    public Anggota getPenerima(){
        return penerima;
    }
    public void setPenerima(Anggota penerima){
        this.penerima = penerima;

    }
}
