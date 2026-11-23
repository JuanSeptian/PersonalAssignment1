package com.example.personalassignment1;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Menyimpan objek mahasiswa ke dalam array
		Mahasiswa[] daftarMahasiswa = {
				new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75),
				new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40),
				new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90),
				new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00),
				new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20)
		};
		
		System.out.println("=== Data Mahasiswa ===");
		
		// Menampilkan informasi data mahasiswa ke console menggunakan perulangan
		for(int i = 0; i < daftarMahasiswa.length; i++) {
			daftarMahasiswa[i].tampilkanInfo();
			System.out.println(); // Memberikan spasi kosong
		}
		
		// Syntax untuk menerima input user
		Scanner input = new Scanner(System.in);

		// Mengatur format angka desimal agar menggunakan titik (.)
		input.useLocale(Locale.US);
		
		// Meminta NIM mahasiswa yang ingin diperbarui
		System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
		String cariNim = input.nextLine();

		// Mencari mahasiswa berdasarkan NIM
		for (int i = 0; i < daftarMahasiswa.length; i++) {
		    if (daftarMahasiswa[i].getNim().equals(cariNim)) {

		        // Membaca IPK baru yang diberikan user 
		        System.out.print("Masukkan IPK baru: ");
		        double ipkBaru = input.nextDouble();

		        // Memperbarui IPK mahasiswa
		        daftarMahasiswa[i].updateIpk(ipkBaru);

		        System.out.println("Data berhasil diperbarui!");
		        System.out.println("\n=== Data Mahasiswa ===");

		        // // Menampilkan data mahasiswa, status kelulusan, dan predikat setelah pembaruan
		        daftarMahasiswa[i].tampilkanInfo();
		        daftarMahasiswa[i].cekKelulusan();
		        daftarMahasiswa[i].hitungPredikat();

		        break;
		    }
		}

		// Syntax untuk menutup Scanner setelah proses input selesai
		input.close();
	}
}
