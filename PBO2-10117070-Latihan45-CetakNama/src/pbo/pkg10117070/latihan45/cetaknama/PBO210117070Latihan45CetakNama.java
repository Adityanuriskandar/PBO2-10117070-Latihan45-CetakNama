/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10117070.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menampilkan nama
 * dalam jumlah cetak yang ditentukan oleh user
 */
public class PBO210117070Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Printer printer = new Printer();
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        String nama = scn.nextLine();
        System.out.print("Mau Cetak Berapa? : ");
        int cetak = scn.nextInt();
        System.out.println();
        
        printer.setNama(nama);
        printer.setJmlCetak(cetak);
        printer.cetak(nama);
        printer.cetak(cetak, nama);
    }
    
}
