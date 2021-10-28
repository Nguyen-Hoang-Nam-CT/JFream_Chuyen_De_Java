package Lap_Trinh_mang_Trong_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server_ {
    public static void main(String[] args) {
        try 
        {
            ServerSocket s = new ServerSocket(9999);
            
            Socket incoming = s.accept();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
            
            PrintWriter out = new PrintWriter(incoming.getOutputStream(), true);
            
            out.println("Hi. I'm Server");// gửi đến client
            
            String mess = in.readLine();//nhận từ client
            System.out.println(mess);
            
            incoming.close();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Server_.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
