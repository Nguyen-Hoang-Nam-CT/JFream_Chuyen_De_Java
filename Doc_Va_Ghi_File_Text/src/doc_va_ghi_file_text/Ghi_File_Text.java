/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc_va_ghi_file_text;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Ghi_File_Text 
{
    public static void main(String[] args) 
    {
        
        try 
        {
            FileWriter fileWriter = new FileWriter("E:\\1_May_Tinh\\5_Mon_Hoc_Ki_5\\0_Git_HK5\\JFream_Chuyen_De_Java\\Thu_Muc_Luu_File_Txt\\Read_Me_Please.txt");
            fileWriter.write("Test khả năng đọc file\nGhi file\nHết.");
            fileWriter.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Ghi_File_Text.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
