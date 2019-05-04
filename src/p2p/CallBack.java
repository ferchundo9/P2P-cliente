/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.html.HTMLDocument;

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
    public void SendMessageToMe(String emisor,String message) throws RemoteException {
        
        if(emisor.equals(interfaz.getAmigoChat())){
            String previo= interfaz.getjTextPane1().getText();
            String[] split = previo.split("</body>");
            interfaz.getjTextPane1().setText(split[0]+message);
            interfaz.getChats().remove(emisor);
            interfaz.getChats().put(emisor, split[0]+message);
        }
        else{
            if(interfaz.getChats().containsKey(emisor)){
                String previo= interfaz.getChats().get(emisor);
                String[] split = previo.split("</body>");
                interfaz.getChats().remove(emisor);
                interfaz.getChats().put(emisor, split[0]+message);
            }
            else{
                interfaz.getChats().put(emisor,"<html><body>"+message+"</body></html>");
            }
            
        }
        
    }

    @Override
    public void SendImageToMe(String emisor,byte [] dataInfo,String nombre)throws RemoteException
    {
        try {
            
            File outputfile = new File(nombre);
            BufferedImage imagen = javax.imageio.ImageIO.read(new ByteArrayInputStream(dataInfo));
            ImageIO.write(imagen, "jpg", outputfile);
            if(emisor.equals(interfaz.getAmigoChat())){
                String previo= interfaz.getjTextPane1().getText();
                String[] split = previo.split("</body>");
                interfaz.getjTextPane1().setText(split[0]+"<p>Has recibido una imagen</p><br></body></html>");
                interfaz.getChats().remove(emisor);
                interfaz.getChats().put(emisor, split[0]+"<p>Has recibido una imagen</p><br></body></html>");
            }
            else{
                if(interfaz.getChats().containsKey(emisor)){
                    String previo= interfaz.getChats().get(emisor);
                    String[] split = previo.split("</body>");
                    interfaz.getChats().remove(emisor);
                    interfaz.getChats().put(emisor,split[0]+"<p>Has recibido una imagen</p><br></body></html>");
                }
                else{
                    interfaz.getChats().put(emisor,"<p>Has recibido una imagen</p><br></body></html>");
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(CallBack.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void SendPDFTome(String emisor,byte [] dataInfo,String nombre)throws RemoteException
    {
        try {
            OutputStream out = new FileOutputStream(nombre);
            out.write(dataInfo);
            out.close();
            if(emisor.equals(interfaz.getAmigoChat())){
                String previo= interfaz.getjTextPane1().getText();
                String[] split = previo.split("</body>");
                interfaz.getjTextPane1().setText(split[0]+"<p>Has recibido un PDF</p><br></body></html>");
                interfaz.getChats().remove(emisor);
                interfaz.getChats().put(emisor, split[0]+"<p>Has recibido un PDF</p><br></body></html>");
            }
            else{
                if(interfaz.getChats().containsKey(emisor)){
                    String previo= interfaz.getChats().get(emisor);
                    String[] split = previo.split("</body>");
                    interfaz.getChats().remove(emisor);
                    interfaz.getChats().put(emisor,split[0]+"<p>Has recibido un PDF</p><br></body></html>");
                }
                else{
                    interfaz.getChats().put(emisor,"<p>Has recibido un PDF</p><br></body></html>");
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CallBack.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CallBack.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public PrincipalGui getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(PrincipalGui interfaz) {
        this.interfaz = interfaz;
    }
    
}
