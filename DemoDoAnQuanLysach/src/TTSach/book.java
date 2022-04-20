/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TTSach;

/**
 *
 * @author TechCare
 */
public class book {
    String tacgia,theloai,tensach,nhaxuaban,ngaynhap;
    float dongia;
    int soluong;

    public book(){}

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }
    public String getNgaynhap(){
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getNhaxuaban() {
        return nhaxuaban;
    }

    public void setNhaxuaban(String nhaxuaban) {
        this.nhaxuaban = nhaxuaban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public book(String tensach, String tacgia, String theloai, String nhaxuaban, int soluong, float dongia,String ngaynhap) {
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.tensach = tensach;
        this.nhaxuaban = nhaxuaban;
        this.soluong = soluong;
        this.dongia = dongia;
        this.ngaynhap = ngaynhap;
    }
}
