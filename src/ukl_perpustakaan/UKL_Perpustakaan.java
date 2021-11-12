package ukl_perpustakaan;

public class UKL_Perpustakaan {

    public static void main(String[] args) {
        //membuat objek
        Buku book = new Buku();
        Siswa student = new Siswa();
        Peminjaman rent= new Peminjaman();
        Laporan report = new Laporan();
        Menu menu = new Menu();
        Petugas salary = new Petugas();
        Pengembalian repay = new Pengembalian();
        
        //menginputkan data 
        book.Buku();
        student.Siswa();
        salary.Petugas();
        
        //menampilak hasil inputan yang berbentuk list
        System.out.println("");
        report.Laporan(student);
        System.out.println("");
        report.Laporan(book);
        System.out.println("");
        report.Laporan(salary);
        
        //menjalankan program menu
        System.out.println("");
        menu.Peminjaman(student, book, rent, repay);             
        
    }    
}
