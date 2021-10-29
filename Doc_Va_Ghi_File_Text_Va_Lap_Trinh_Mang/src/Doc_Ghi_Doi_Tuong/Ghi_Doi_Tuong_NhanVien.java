/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doc_Ghi_Doi_Tuong;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


/**
 *
 * @author Admin
 */
public class Ghi_Doi_Tuong_NhanVien {
    public static void main(String[] args) 
    {
        JFileChooser jFileChooser = new JFileChooser(); // tạo đối tượng này để cho người dùng chọn file
        if(jFileChooser.showOpenDialog(jFileChooser) == JFileChooser.APPROVE_OPTION) //phương thức gọi file
        {
            File file = jFileChooser.getSelectedFile(); //gán file người dùng chọn vào đối tượng file
            
            //--------------------------------- Trọng tâm bài học ---------------------------------
            try 
            {
                //-------------------- Viết --------------------
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                NhanVien n1 = new NhanVien("Nguyễn Hoàng Nam", 10000, new Date(101, 9, 17)); //2001 - 1900 = 101; 10 - 1 = 9; 17 = 17 
                NhanVien n2 = new NhanVien("Phạm Thị A", 6000, new Date(102, 9, 20));
                objectOutputStream.writeObject(n1);
                objectOutputStream.writeObject(n2);
                objectOutputStream.close();
                fileOutputStream.close();
                //-----------------------------------------------
            } 
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(Ghi_Doi_Tuong_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Ghi_Doi_Tuong_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
            //---------------------------------------------------------------------------------------
            
        }
    }
}
