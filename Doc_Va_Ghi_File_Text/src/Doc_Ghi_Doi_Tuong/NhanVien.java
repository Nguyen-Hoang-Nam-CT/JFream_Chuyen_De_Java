/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doc_Ghi_Doi_Tuong;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVien implements Serializable{
    String hoTen;
    int luong;
    Date ngaySinh;

    public NhanVien(String hoTen, int luong, Date ngaySinh) {
        this.hoTen = hoTen;
        this.luong = luong;
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "hoTen=" + hoTen + ", luong=" + luong + ", ngaySinh=" + ngaySinh + '}';
    }
}
