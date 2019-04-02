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
      
     
        InterfazCliente callbackObj = new User("Jairo");
        h.registrarCliente(callbackObj);
        h.deRegister(callbackObj);
        h.registro(callbackObj,"jairo");
        System.out.println(h.login(callbackObj,"jairo1111"));
        System.out.println("Cliente registrado en el servidor");

    }
    catch (Exception e) 
    {
      System.out.println("Excepcion en Cliente: " + e);
    } 
    }
    
}
