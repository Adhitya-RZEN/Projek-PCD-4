public class PeminjamMingguan extends Peminjam {
    public void PeminjamMingguan (String nama, String idPeminjam, double jumlahPinjaman, int lamaPinjaman){
        super(nama, idPeminjam, jumlahPinjaman, lamaPinjaman);
    }
    
    @Override
    public double hitungAngsuranPokok(){

    }

    @Override
    public double hitungBunga(){

    }


    public double hitungTotalBayar(){
        return jumlahPinjaman;

    }
}
