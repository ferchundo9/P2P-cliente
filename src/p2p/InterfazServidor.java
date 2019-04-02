/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p;
import java.rmi.*;
/**
 *
 * @author Jairo
 */
public interface InterfazServidor extends Remote  {
     public void registrarCliente(InterfazCliente callbackClientObject) throws java.rmi.RemoteException;
     public void borrarCliente(InterfazCliente callbackClientObject) throws java.rmi.RemoteException;
     public boolean login(InterfazCliente cliente,String pass) throws java.rmi.RemoteException;;
     public void registro(InterfazCliente cliente,String pass) throws java.rmi.RemoteException;;
     public void deRegister(InterfazCliente cliente) throws java.rmi.RemoteException;;
}
