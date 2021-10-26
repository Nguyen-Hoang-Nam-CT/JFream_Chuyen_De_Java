/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doc_va_ghi_file_text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Doc_File_Text {
    public static void main(String[] args) {
        FileReader fileReader;
        try 
        {
            fileReader = new FileReader("E:\\1_May_Tinh\\5_Mon_Hoc_Ki_5\\0_Git_HK5\\JFream_Chuyen_De_Java\\Thu_Muc_Luu_File_Txt\\Read_Me_Please.txt");
            char c;
            int i;
            do
            {
                i = fileReader.read();
                //nào con trỏ nhấp nhái trong file đứng sau kí tự cuối cùng và đọc ký tự kết thúc file là -1 thì dừng
                if(i == -1)
                    break;
                //ép kiểu từ mã assci sang kiểu char
                c = (char)i;
                System.out.print("" + c);
            }while(true);
            fileReader.close();
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println(ex.getMessage());
        } 
        catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
}
