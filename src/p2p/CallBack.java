/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author fer
 */
public class CallBack extends UnicastRemoteObject implements UserCallBack{
    public CallBack() throws RemoteException{
        super();
    }
    @Override
    public void SendMessageToMe(String message) throws RemoteException {
        
        System.out.println(message);
    }

    @Override
    public void ReceiveFriendRequest(InterfazUsuario friend,InterfazUsuario yo) throws RemoteException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("El usuario:"+friend.getName()+ " te ha enviado una solicitud de amistad");
        String respuesta=null;
        try {
           
            do{
                System.out.println("Desea aceptarla");
                respuesta = bufferRead.readLine();
            }while(!(respuesta.equals("si") || respuesta.equals("no")));
            
        } catch (IOException ex) {
            System.out.println("Error escribiendo respuesta amistad");
        }

        if(respuesta.equals("si")){
            System.out.println("Estamos en si");
            friend.AcceptFriendRequest(yo);
            
        }else if(respuesta.equals("no")){
            System.out.println("Estamos en no");
            friend.CancelFriendRequest(yo);
        }
        else{
            System.out.println("Que pasa");
        }
    }
    
}
