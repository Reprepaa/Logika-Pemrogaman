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
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka1, angka2, angkaTerbesar;
        Scanner  scan= new Scanner(System.in);
        
        angkaTerbesar = 0;
        
        System.out.println("Menentukan Bilangan Terbesar");
        System.out.println("Inputkan Bilangan :");
        
        System.out.print("Bilangan 1 = ");
        angka1 = scan.nextInt();
        System.out.print("Bilangan 2 = ");
        angka2 = scan.nextInt();

        
         if(angka1 > angka2){
            angkaTerbesar = angka1;
        }else if(angka2 > angka1){
            angkaTerbesar= angka2;
        }
        System.out.println("Bilangan Terbesar = "+ angkaTerbesar);
        
    }
    
}
