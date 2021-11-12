package ukl_perpustakaan;

import java.util.ArrayList;

public class Buku{
    //membuat arraylist 
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<String> judulBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    // menambahkan data pada arraylist
    public void Buku() {
        this.idBuku.add(0);
        this.judulBuku.add("Habislah Duit Terbitlah Lapar");
        this.stok.add(5);
        this.harga.add(70000);

        this.idBuku.add(1);
        this.judulBuku.add("Pintu Menuju Surga");
        this.stok.add(1);
        this.harga.add(60000);
        
        this.idBuku.add(2);
        this.judulBuku.add("Septihan");
        this.stok.add(99);
        this.harga.add(50000);
        
        this.idBuku.add(3);
        this.judulBuku.add("Kuroiwa");
        this.stok.add(12);
        this.harga.add(40000);
        
        this.idBuku.add(3);
        this.judulBuku.add("Jantung");
        this.stok.add(27);
        this.harga.add(60000);
        
        this.idBuku.add(4);
        this.judulBuku.add("Iyaa");
        this.stok.add(24);
        this.harga.add(52000);
    }

    public void setIdBuku(int idBuku) {
        this.idBuku.add(idBuku);
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku.add(judulBuku);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }
    
    public void setHarga(int Harga){
        this.harga.add(Harga);
    }

    public int getIdBuku(int idBuku) {
        return this.idBuku.get(idBuku);
    }

    public String getJudulBuku(int idBuku) {
        return this.judulBuku.get(idBuku);
    }

    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }

    public int getJumlahBuku(){
    return this.idBuku.size();
    }
    
    public int getHarga(int idBuku){
        return this.harga.get(idBuku);
    }
    
    public void editStok(int idBuku, int stok){
        this.stok.set(idBuku, stok);
    }
}    
