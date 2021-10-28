/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc_va_ghi_file_text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class FileWriter_Thong_Qua_BufferedWriter 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileWriter fileWriter = new FileWriter("E:\\1_May_Tinh\\5_Mon_Hoc_Ki_5\\0_Git_HK5\\JFream_Chuyen_De_Java\\Thu_Muc_Luu_File_Txt\\Read_Me_Please.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Test khả năng khi file thông qua buffered writer\n Khả năng đọc\nHết.");
            
            //Thread.sleep(10000);
            bufferedWriter.flush();//chừng nào gặp lệnh flush() mới ghi vô file (Chưa gặp thì nó còn trong bộ nhớ đệm)
            
            //Thread.sleep(50000);
            bufferedWriter.close();//chừng nào gặp lệnh close() hoặc lệnh flush() mới ghi vô file (Chưa gặp thì nó còn trong bộ nhớ đệm)
            fileWriter.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(FileWriter_Thong_Qua_BufferedWriter.class.getName()).log(Level.SEVERE, null, ex);
        } 
//        catch (InterruptedException ex) 
//        {
//            Logger.getLogger(FileWriter_Thong_Qua_BufferedWriter.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
}
