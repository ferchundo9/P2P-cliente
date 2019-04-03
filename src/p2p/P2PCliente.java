/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p;
import java.io.*;
import java.rmi.*;
import java.util.ArrayList;
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
      
     
        InterfazCliente callbackObj = new ImplementacionCliente();
        //h.registrarCliente(callbackObj);
        h.deRegister("jairo");
        h.registro("jairo","jairo");
        InterfazUsuario u=h.login("jairo", "jairo");
        if(u!=null)
        {
            System.out.println(u.getName());
        }
        else
        {
            System.out.println("No existe");
        }
        System.out.println("Cliente registrado en el servidor");
        String option;
        option=br.readLine();
        
        if(option.equals("list")){
            ArrayList<String> nombres;
            nombres=h.getList();
            System.out.println("Lista de conectados");
            for(String nombre:nombres){
                System.out.println(nombre);
            }
        }

    }
    catch (Exception e) 
    {
      System.out.println("Excepcion en Cliente: " + e);
    } 
    }
    
}
