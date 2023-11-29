public class Admin {
    private String username;
    private String password;

    public static void addkekolaanggota() {
        System.out.println("Notifikasi kekola Anggota Berhasil");
    }

    public static void kekolaBuku(){
    System.out.println("Kelola Buku Berhasil");
}
public static void generateLaporan(){
    System.out.println("Laporan Di terima");
}
public String getUsername(){
    return username;
    }
    public void setUsername(String username){
    this.username = username;

    }

}
