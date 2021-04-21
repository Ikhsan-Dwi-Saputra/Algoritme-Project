package com.ikhsan.project;

public class NimRun {
    public static void main(String[] args) {
        NIM objnim = new NIM();
        String nim= "12050113500";
        objnim.setNim(nim);
        System.out.println("Nim Lengkap : "+objnim.getNim());
        System.out.println("Jenjang Pendidikan : " + objnim.getJenjangPendidikan());
        System.out.println("Tahun Masuk : " + objnim.getTahunMasuk());
        System.out.println("Fakultas : " + objnim.getFakultas());
        System.out.println("Jurusan : " + objnim.getJurusan());
        System.out.println("Jenis Kelamin : " + objnim.getJenisKelamin());
        System.out.println(objnim.getUrutaMahasiswa());
    }
}

