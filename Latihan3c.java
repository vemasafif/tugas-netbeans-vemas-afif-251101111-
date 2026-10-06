/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan3c;

/**
 *
 * @author ASUS TUF A15
 */
public class Latihan3c {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String nama = "Vemas Afif";
        String prodi = "Teknik Informatika";
        biodata(nama,prodi);
        
        double sudutDerajat = 50.5;
        Trigonometri(sudutDerajat);
        
        int hasil = penjumlahan(20,40);
        System.out.println("hasil penjumlahan = "+hasil);     
        
        hasil = pengurangan(100, 50);
        System.out.println("hasil pengurangan = "+hasil);
        
        hasil = perkalian(10, 10);
        System.out.println("hasil perkalian = "+hasil);
        
        hasil = pembagian(100, 10);
        System.out.println("hasil pembagian = "+hasil);
        
        hasil = perkalianpengurangan(140,10,200);
        System.out.println("ini hasil perkalian pengurangan = "+hasil);
        
        hasil = penjumlahanpembagian(1000,10,150);
        System.out.println("ini hasil penjumlahan pembagian = "+hasil);
    
    }
    
    public static int penjumlahan(int a, int b){
        return a+b;
    }
    
    public static int pengurangan(int a, int b){
        return a-b;
    }
    
    public static int perkalian(int a, int b){
        return a*b;
    }
    
    public static int pembagian(int a, int b){
        return a/b;
        
    }
    
    public static int perkalianpengurangan(int a, int b, int c){
         return a*b-c;
    }
    
     public static int penjumlahanpembagian(int a, int b, int c){
         return a+b/c;
     }
     
     public static void Trigonometri(double sudutDerajat){   
        double sudutRadian = Math.toRadians(sudutDerajat);
        
        double nilaiSin = Math.sin(sudutRadian);
        double nilaiCos = Math.cos(sudutRadian);
        double nilaiTan = Math.tan(sudutRadian);
        
        System.out.println("hasil Sin: " +nilaiSin);
        System.out.println("hasil Cos: " +nilaiCos);
        System.out.println("hasil Tan: " +nilaiTan);
    }
    public static void biodata(String nama,String prodi){
        System.out.println("----------");  
        System.out.println("Nama: Vemas afif"); 
        System.out.println("Prodi: Teknik Informatika");
        System.out.println("----------"); 
    }
}
