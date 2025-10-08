public abstract class Peminjam {
    private String nama;
    private String idPeminjam;
    private String status;
    protected double jumlahPinjaman;
    private int lamaPinjaman;
    private double bunga;
    private double rewardBunga;
    private double denda;
    private final double jumlahPeminjam;
    private final int lamaPeminjam;

    public Peminjam(String nama, String idPeminjam, String status, double jumlahPeminjam, int lamaPeminjam){
        this.nama = nama;
        this.idPeminjam = idPeminjam;
        this.status = status;
        this.jumlahPeminjam = jumlahPeminjam;
        this.lamaPeminjam = lamaPeminjam;
    }

    public double hitungAngsuranPokok(){
        return jumlahPinjaman / lamaPinjaman;
    }

    public double hitungAngsuranPokok(double biayaAdmin){
        return (jumlahPinjaman / lamaPinjaman) + biayaAdmin;
    }

    public double hitungBunga(){
        return bunga * jumlahPinjaman;
    }

    public boolean TotalBayar(boolean tepatWaktu){
        if (lamaPeminjam == lamaPinjaman){
            tepatWaktu = true;
        }
        return tepatWaktu;
    }

    public String getNama(){
        return nama;
    }

    public String getStatus(){
        return status;
    }

    public double getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public int getLamaPinjaman(){
        return lamaPinjaman;
    }

    public double getRewardBunga(){
        return rewardBunga;
    }

    public double getDenda(){
        return denda;
    }

    protected void setRewardBunga(double rewardBunga){
        this.rewardBunga = lamaPinjaman * jumlahPeminjam;
    }

    protected void setDenda (double denda){
        this.denda = lamaPinjaman * jumlahPeminjam;
    }
}
