/**
 *  Nama File   : Mahasiswa.java                05/06/2024
 *  Penulis     : Zikry Alfahri Akram (24060122120033)
 *  Deskripsi   : Kelas ini merupakan persistent object yang 
 *                berperan sebagai model bagi tabel mahasiswa
 */

package jdbc.model;

public class Mahasiswa {
    // Atribut
    private int id;
    private String nama;
    
    // Construktor
    public Mahasiswa (){
        
    }
    
    public Mahasiswa (int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    // Getter and Setter
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public String toString(){
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}
