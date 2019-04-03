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
      
     
        UserCallBack callbackObj = new CallBack();
        //h.registrarCliente(callbackObj);
        
        System.out.println("Introduce nombre de usuario");
        String username=br.readLine();
        h.deRegister(username);
        h.registro(username,username);
        InterfazUsuario u=h.login(username, username,callbackObj);
        if(u!=null)
        {
            System.out.println(u.getName());
            System.out.println("Cliente registrado en el servidor");
        }
        else
        {
            System.out.println("No existe");
        }
        System.out.println("Cliente registrado en el servidor");
        System.out.println("Introduce comando");
        String option;
        while(true){
            option=br.readLine();

            if(option.equals("list")){
                ArrayList<String> nombres;
                nombres=h.getList();
                System.out.println("Lista de conectados");
                for(String nombre:nombres){
                    System.out.println(nombre);
                }
            }
            if(option.equals("friend")){
                System.out.println("Introduce el nombre de tu nuevo amigo");
                String nombre=br.readLine();
                h.addFriendRequest(u.getName(), nombre);
            }
        }

    }
    catch (Exception e) 
    {
      System.out.println("Excepcion en Cliente: " + e);
    } 
    }
    
}
