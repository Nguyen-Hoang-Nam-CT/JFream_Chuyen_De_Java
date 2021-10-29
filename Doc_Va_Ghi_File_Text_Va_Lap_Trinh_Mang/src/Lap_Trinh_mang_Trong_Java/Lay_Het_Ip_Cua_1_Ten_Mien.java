/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap_Trinh_mang_Trong_Java;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Lay_Het_Ip_Cua_1_Ten_Mien 
{
    public static void main(String[] args) 
    {
        InetAddress[] addrs;
        try 
        {
            addrs = InetAddress.getAllByName("youtube.com");
            for(int i = 0; i < addrs.length; i++)
                System.out.print(addrs[i].getHostAddress() + "\n");
        } 
        catch (UnknownHostException ex) 
        {
            System.out.print(ex.getMessage());
        }
    }
}