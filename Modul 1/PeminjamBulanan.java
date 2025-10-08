public class PeminjamBulanan extends Peminjam {
    public PeminjamBulanan (String nama, String idPeminjam, double jumlahPinjaman, int lamaPinjaman){
        super(nama, idPeminjam, idPeminjam, jumlahPinjaman, lamaPinjaman);
    }

    public double hitungAngsuranPokok(){
        return jumlahPinjaman * lamaPinjaman;
    }

     @Override
    public double hitungBunga(){
        return (lamaPinjaman * jumlahPinjaman) / 100 ;
    }

    public double hitungTotalBayar(){
        
    }
}
