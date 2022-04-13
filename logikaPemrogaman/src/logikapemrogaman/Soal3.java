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
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  scan= new Scanner(System.in);
        int angka, sum;
        sum = 0;
        
        System.out.println("Menghitung Jumlah");
        System.out.print("Inputkan Bilangan : " );
        angka = scan.nextInt();
        
        for(int i=1 ; i<= angka; i++){
            sum += i;
            if(i < angka){
                System.out.print(i + "+");
            }else if(i == angka){
                System.out.print(i);
            }
         }
        System.out.println("\nTotal Penjumlahan = " + sum);
        }
            
    }