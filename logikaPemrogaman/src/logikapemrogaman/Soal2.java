/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logikapemrogaman;
import java.util.Scanner;
/**
 *
 * @author Revalina Santosa
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  scan= new Scanner(System.in);
        int angka;
        String keterangan = null;
        
        System.out.println("Menentukan Bilangan Ganjil/Genap");
        System.out.println("Inputkan Bilangan :");
        angka = scan.nextInt();
        
        if(angka %2 == 00){
        keterangan = "genap";
    }else{
    keterangan = "ganjil";
        }
            System.out.println("Bilangan " + angka +" merupakan bilangan " + keterangan);
        }
}
