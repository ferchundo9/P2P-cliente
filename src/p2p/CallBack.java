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
    private PrincipalGui interfaz;
    public CallBack() throws RemoteException{
        super();
    }
    @Override
    public void SendMessageToMe(String message) throws RemoteException {
        
        interfaz.getjEditorPane1().setText(message);
    }

    public PrincipalGui getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(PrincipalGui interfaz) {
        this.interfaz = interfaz;
    }
    
}
