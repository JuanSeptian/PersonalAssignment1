package com.example.personalassignment1;

public class Mahasiswa {
	private String nama;
	private String nim;
	private String jurusan;
	private double ipk;
	
	// Constructor untuk menginisialisasi data mahasiswa
	public Mahasiswa(String nama, String nim, String jurusan, double ipk){
		this.nama = nama;
		this.nim = nim;
		this.jurusan = jurusan;
		this.ipk = ipk;
	}
	
	// Menampilkan informasi data mahasiswa ke console
	public void tampilkanInfo() {
		System.out.println("Nama: " + nama);
		System.out.println("NIM: " + nim);
		System.out.println("Jurusan: " + jurusan);
		System.out.printf(java.util.Locale.US, "IPK: %.2f%n", ipk ); // Menampilkan IPK dengan dua angka desimal menggunakan titik bukan koma
	}
	
	// Mengambil NIM mahasiswa untuk proses pencarian
	public String getNim() {
		return nim;
	}
	
	// Mengambil nilai IPK mahasiswa
	public double getIpk() {
	    return ipk;
	}

	// Memperbarui nilai IPK mahasiswa
	public void setIpk(double ipk) {
	    this.ipk = ipk;
	}

	// Menentukan status kelulusan berdasarkan IPK
	public void cekKelulusan() {
	    if (ipk >= 3.00) {
	        System.out.println("Status: Lulus");
	    } else {
	        System.out.println("Status: Belum Lulus");
	    }
	}

	// Memperbarui IPK melalui setter
	public void updateIpk(double ipkBaru) {
	    setIpk(ipkBaru);
	}
	
	// Menentukan predikat mahasiswa berdasarkan IPK
	public void hitungPredikat() {
		if (ipk >= 3.75) {
		    System.out.println("Predikat: Dengan Pujian");
		} else if (ipk >= 3.50) {
		    System.out.println("Predikat: Sangat Memuaskan");
		} else if (ipk >= 3.00) {
		    System.out.println("Predikat: Memuaskan");
		} else {
		    System.out.println("Predikat: Perlu Perbaikan");
		}
	}
}
