/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p;
import java.io.*;
import java.rmi.*;
/**
 *
 * @author fer
 */
public class P2PCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try {
        int RMIPort;         
        String hostName;
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println( "Introduzca la ip del servidor:");
        hostName = br.readLine();
        System.out.println("Introduzca el puerto:");
        String portNum = br.readLine();
        RMIPort = Integer.parseInt(portNum); 
        String registryURL =  "rmi://"+hostName+":" + portNum + "/aplicacion";  
        InterfazServidor h =(InterfazServidor)Naming.lookup(registryURL);
      
        UserCallBack callbackObj =(UserCallBack) new CallBack();
        
        //String username=br.readLine();
        //InterfazUsuario u=h.login(username, username,callbackObj);
        LoginGui interfaz = new LoginGui(h);
        /*if(u!=null)
        {
            System.out.println(u.getName());
            System.out.println("Cliente registrado en el servidor");
        }
        else
        {
            System.out.println("No existe");
        }
        System.out.println("Cliente registrado en el servidor");*/

    }
    catch (Exception e) 
    {
      System.out.println("Excepcion en Cliente: " + e);
    } 
    }
    
}
