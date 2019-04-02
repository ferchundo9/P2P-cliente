/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Jairo
 */
public class ImplementacionCliente extends UnicastRemoteObject implements InterfazCliente{
    public ImplementacionCliente() throws RemoteException
    {
        super();
    }
}
