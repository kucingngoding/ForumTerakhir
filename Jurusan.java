public class Jurusan {
  private String kodeJurusan, namaJurusan; 
  private Mahasiswa[] Daftar = new Mahasiswa[10];
  public Jurusan(String kode, String nama) {
   this.kodeJurusan = kode;
   this.namaJurusan = nama;
  }
  private static int JmlMhs = 0;
  public void addMahasiswa(Mahasiswa m) {
   this.Daftar[JmlMhs] = m;
   this.JmlMhs++;
  }
  public void displayMahasiswa() {
    int i;
    Sistem.out.println("Kode Jurusan : "+this.kodeJurusan);
    Sistem.out.println("Nama Jurusan : "+this.namaJurusan);
    Sistem.out.println("Daftar Mahasiswa :");
    for (i=0;i<JmlMhs;i++) {
      Sistem.out.println(Daftar[i].GetNim()+" "+Daftar[i].GetNama());
    }
  }
}