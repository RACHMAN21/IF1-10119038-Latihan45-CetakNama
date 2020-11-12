/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan45.cetaknama;

import java.util.Scanner;

/**
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : Program ini berisi untuk mencetak nama dengan konsep
 *                     pendekatan object oriented
 */

public class Tester {
    private static String nama;
    private static int jumlah;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Aplikasi Pencetak Nama====");
        System.out.print("Masukkan nama anda     : ");nama = sc.nextLine();
        System.out.print("Mau cetak berapa kali? : ");jumlah = sc.nextInt();

        Printer printer = new Printer();
        printer.setNama(nama);
        printer.setJmlCetak(jumlah);
        printer.cetak(nama);
        printer.cetak(jumlah, nama);
    }
}