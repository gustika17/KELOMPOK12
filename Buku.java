public class Buku {
    private String judul;
    private String pengarang;
    private String nomorISBN ;
    private boolean statusKesediaan;

   public Buku(String judul,String pengarang, String nomorISBN){
       this.judul = judul;
       this.pengarang = pengarang;
       this.nomorISBN = nomorISBN;
       this.statusKesediaan = true;
    }
    public String getJudul() {
        
       return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {

       return pengarang;
    }

    public void setPengarang(String pengarang) {

       this.pengarang = pengarang;
    }

    public String getNomorISBN() {

       return nomorISBN;
    }

    public void setNomorISBN(String nomorISBN) {

       this.nomorISBN = nomorISBN;
    }

    public boolean isStatusKesediaan() {

       return statusKesediaan;
    }

    public void setStatusKesediaan(boolean statusKesediaan) {
        this.statusKesediaan = statusKesediaan;
    }
    public String getDetails(){
       return "Buku : " + judul + "nama pengarang " + pengarang + "ISBN" + nomorISBN;


    }
}
