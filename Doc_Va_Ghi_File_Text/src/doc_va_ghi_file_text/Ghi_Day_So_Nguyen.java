/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc_va_ghi_file_text;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Ghi_Day_So_Nguyen {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        
        System.out.print("\nNhap so luong so can ghi: ");
        int soLuong = sc.nextInt();
        try 
        {
            fileWriter = new FileWriter("E:\\1_May_Tinh\\5_Mon_Hoc_Ki_5\\0_Git_HK5\\JFream_Chuyen_De_Java\\Thu_Muc_Luu_File_Txt\\Read_Me_Please.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            
            for(int i = 0; i < soLuong; i++)
            {
                System.out.print("\nNhap so thu " + (i + 1) + ": ");
                bufferedWriter.write(sc.nextInt() + "");
                bufferedWriter.write(" ");
            }
            
            bufferedWriter.close();
            fileWriter.close();
                
        } 
        catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
}
