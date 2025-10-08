
public class Main {
    public static void main(String[] args) {
        Peminjam p1 = new PeminjamMingguan("Budi", "M001", 1000000, 4);
        Peminjam p2 = new PeminjamBulanan("Siti", "B001", 5000000, "12");
        Peminjam p3 = new PeminjamTahunan("Andi", "T001", 2000000, 2);
        Peminjam p4 = new PeminjamMingguan("Dewi", "M002", 3000000, 6);

        pinjaman.tambahPeminjam(p1);
        pinjaman.tambahPeminjam(p2);
        pinjaman.tambahPeminjam(p3);
        pinjaman.tambahPeminjam(p4);

        boolean[] statusPembayaran = {true, false, true, false};
        pinjaman.hitungSemuaAngsuran(statusPembayaran);
    }
}
