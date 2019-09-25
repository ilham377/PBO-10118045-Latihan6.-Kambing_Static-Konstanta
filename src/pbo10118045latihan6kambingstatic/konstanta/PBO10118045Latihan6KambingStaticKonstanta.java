/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan6kambingstatic.konstanta;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : static dan konstanta
 * 
 */

public class PBO10118045Latihan6KambingStaticKonstanta {

//nama_Kambing sebagai konstanta 
    public static final String NAMA_KAMBING =  "MIDUN";
    
    public static void main(String[] args) {
       Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                            + Mamalia.jumlahKambing);
    }
    
}
