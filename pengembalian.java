import java.util.Date;
public class pengembalian  {
     private Buku buku;
     private Anggota anggota;
     private Date tanggalPengembalian;


     public pengembalian(Buku buku, Anggota anggota, Date tanggalpengembalian) {
         this.buku = buku;
         this.anggota = anggota;
         this.tanggalPengembalian = new Date();
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

         public Date getTanggalPengembalian() {
             return tanggalPengembalian;
         }

         public void setTanggalPengembalian(Date tanggalPengembalian) {
             this.tanggalPengembalian = tanggalPengembalian;
         }

     }
