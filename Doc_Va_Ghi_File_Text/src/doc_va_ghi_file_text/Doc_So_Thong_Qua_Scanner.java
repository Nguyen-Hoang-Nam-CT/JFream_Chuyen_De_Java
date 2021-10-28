/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc_va_ghi_file_text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Doc_So_Thong_Qua_Scanner 
{
    public static void main(String[] args) 
    {
        try 
        {
            Scanner sc = new Scanner(new File("E:\\1_May_Tinh\\5_Mon_Hoc_Ki_5\\0_Git_HK5\\JFream_Chuyen_De_Java\\Thu_Muc_Luu_File_Txt\\Read_Me_Please.txt"));
            int temp;
            System.out.print("Cac so trong file: ");
            while(sc.hasNextInt()) //nếu hasNextInt() trả về true thì làm //Hàm hasNextInt() trả về true khi mà phần tử kế tiếp (không tính khoảng trắng) là số nguyên
            {
                temp = sc.nextInt();
                System.out.print(temp + " ");
            }
            sc.close();
        }catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Doc_So_Thong_Qua_Scanner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
