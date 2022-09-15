/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasjs4;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */
public class tugas2JS4 {
    public static void main (String[] args){
        int x = 10;
        int y = 23;
        int z = 5;
        int max;

        System.out.println("number 1 = "+x);
        System.out.println("number 2 = "+y);
        System.out.println("number 3 = "+z);

        //mencari nilai tertinggi
        max = (y >= x) ? y : x;
        max = (z >= max) ? z : max;
        System.out.println("Nilai tertingginya adalah angka = "+max);
    }
    
}
