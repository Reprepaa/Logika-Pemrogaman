/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logikapemrogaman;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Revalina Santosa
 */
public class Soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int max, n, arr[], i;

        System.out.println("Menentukan Bilangan Maksimum");

        System.out.print("Inputkan jumlah N: ");
        n = scan.nextInt();
        arr = new int[n];

        System.out.println("Masukkan " + n + " angka");
        for (i = 0; i < n; i++) {
            System.out.print("Angka[" + (i) + "] : ");
            arr[i] = scan.nextInt();
        }
        
        max = arr[0];
        for(i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        String arrValue = Arrays.toString(arr);
        System.out.println("Array yang dimasukkan adalah " + arrValue);
        System.out.println("Bilangan maksimum adalah " + max);
    }
    }