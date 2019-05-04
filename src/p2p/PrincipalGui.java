/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.table.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.html.HTMLDocument;
/**
 *
 * @author fer
 */
public class PrincipalGui extends javax.swing.JFrame {
    private InterfazServidor h;
    private InterfazUsuario u;
    private UserCallBack callback;
    private String amigoChat;
    /**
     * Creates new form Principal
     */
    public PrincipalGui(InterfazServidor h,InterfazUsuario u) {
        initComponents();
        this.u=u;
        this.h=h;
        this.callback=null;
        this.setLocationRelativeTo(null);
        this.contrasenaIncorrecta.setVisible(false);
        this.contrasenaNoCoincide.setVisible(false);
        jTextPane1.setContentType("text/html");
        jTextPane1.setText("<html>");
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTabbedPane1.setSelectedIndex(1);
        jTable1.setDefaultRenderer(String.class, centerRenderer);
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) 
        {
            dm.removeRow(i);
        }
        try 
        {
            Set <String> claves;
            claves = u.getAmigos().keySet();
            for(String key:claves)
            {
                 String vector[]=new String[1];
                 vector[0]=key;
                 dm.addRow(vector);
                 dm.fireTableDataChanged();
            }
        }
        catch (RemoteException ex) {
            Logger.getLogger(PrincipalGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ContrasenaActual = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        ConfirmarContrasena = new javax.swing.JPasswordField();
        NuevaContrasena = new javax.swing.JPasswordField();
        jButton8 = new javax.swing.JButton();
        contrasenaIncorrecta = new javax.swing.JLabel();
        contrasenaNoCoincide = new javax.swing.JLabel();
        ContrasenaActualizada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(160, 180));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("usuario");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(3);
        jScrollPane3.setViewportView(jTextArea1);

        jButton6.setText("Enviar");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jTextPane1.setEditable(false);
        jScrollPane4.setViewportView(jTextPane1);

        jButton7.setText("Enviar Archivo");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addGap(82, 82, 82)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Chats", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Amigos conectados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("Chatear");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Borrar Amigo");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 217, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(11, 11, 11)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Amigos conectados", jPanel2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Nueva peticion de amistad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Peticiones pendientes");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Aceptar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Rechazar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton1)))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(53, 53, 53)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Peticiones de amistad", jPanel3);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Contraseña Actual");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Nueva Contraseña");

        ContrasenaActual.setText("jPasswordField1");
        ContrasenaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaActualActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Confirmar Contraseña");

        ConfirmarContrasena.setText("jPasswordField2");
        ConfirmarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarContrasenaActionPerformed(evt);
            }
        });

        NuevaContrasena.setText("jPasswordField3");

        jButton8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton8.setText("Actualizar Contraseña");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        contrasenaIncorrecta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contrasenaIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        contrasenaIncorrecta.setText("La contraseña actual es incorrecta");

        contrasenaNoCoincide.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contrasenaNoCoincide.setForeground(new java.awt.Color(255, 0, 0));
        contrasenaNoCoincide.setText("Las nuevas contraseñas no coinciden");

        ContrasenaActualizada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ContrasenaActualizada.setForeground(new java.awt.Color(0, 204, 0));
        ContrasenaActualizada.setText("La contraseña ha sido actualizada");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(ConfirmarContrasena)
                    .addComponent(NuevaContrasena)
                    .addComponent(ContrasenaActual))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(contrasenaIncorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(contrasenaNoCoincide, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(ContrasenaActualizada, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ContrasenaActualizada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contrasenaIncorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContrasenaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contrasenaNoCoincide, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Cambiar Contraseña", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        if(jTabbedPane1.getSelectedIndex()==0&&callback==null)
        {
            jTabbedPane1.setSelectedIndex(1);
            return;
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable1.setDefaultRenderer(String.class, centerRenderer);
        jTable2.setDefaultRenderer(String.class, centerRenderer);
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel dm2 = (DefaultTableModel) jTable2.getModel();
        int rowCount = dm.getRowCount();
        int rowCount2 = dm2.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) 
        {
            dm.removeRow(i);
        }
        for (int i = rowCount2 - 1; i >= 0; i--) 
        {
            dm2.removeRow(i);
        }
        try 
        {
            
            //AMIGOS CONECTADOS
            Set <String> claves;
            claves = u.getAmigos().keySet();
            for(String key:claves)
            {
                 String vector[]=new String[1];
                 vector[0]=key;
                 dm.addRow(vector);
                 dm.fireTableDataChanged();
            }
            
            //USUARIOS NO AMIGOS (COMBO BOX)
            jComboBox1.removeAllItems();
            ArrayList<String> usuarios=h.getList(u);
            for(int i=0;i<usuarios.size();i++)
            {
                InterfazUsuario in=u.getAmigos().get(usuarios.get(i));
                if(in==null)
                {
                    if(!usuarios.get(i).equals(u.getName()))
                    {
                        jComboBox1.addItem(usuarios.get(i));
                    }
                }
            }
            
            //PETICIONES PENDIENTES
            ArrayList<String>peticionesUsuario = h.peticionesUsuario(u);
            for(int i=0;i<peticionesUsuario.size();i++)
            {
                String vector[]=new String[1];
                vector[0]=peticionesUsuario.get(i);
                dm2.addRow(vector);
                dm2.fireTableDataChanged();
            }
        }
        catch (RemoteException ex) {
            Logger.getLogger(PrincipalGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       //ENVIAR PETICION DE AMISTAD
       if(jComboBox1.getSelectedItem()!=null)
       {
           try {
               h.addFriendRequest(u.getName(),String.valueOf(jComboBox1.getSelectedItem()));
               
               //CAMBIA EL COMBOBOX PARA RESETEAR LA NUEVA
               jComboBox1.removeAllItems();
                ArrayList<String> usuarios=h.getList(u);
                for(int i=0;i<usuarios.size();i++)
                {
                    InterfazUsuario in=u.getAmigos().get(usuarios.get(i));
                    if(in==null)
                    {
                        if(!usuarios.get(i).equals(u.getName()))
                        {
                            jComboBox1.addItem(usuarios.get(i));
                        }
                    }
                }
           } catch (RemoteException ex) {
               Logger.getLogger(PrincipalGui.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //ACEPTAR PETICION DE AMISTAD
        String tipo = jTable2.getValueAt(jTable2.getSelectedRow(),0).toString();
        DefaultTableModel dm2 = (DefaultTableModel) jTable2.getModel();
        int rowCount2 = dm2.getRowCount();
        if(tipo!=null)
        {
            try {
                h.nuevaAmistad(u.getName(), tipo);
                
                //RENUEVA PETICIONES PENDIENTES
                for (int i = rowCount2 - 1; i >= 0; i--) 
                {
                    dm2.removeRow(i);
                }
                ArrayList<String>peticionesUsuario = h.peticionesUsuario(u);
                for(int i=0;i<peticionesUsuario.size();i++)
                {
                    String vector[]=new String[1];
                    vector[0]=peticionesUsuario.get(i);
                    dm2.addRow(vector);
                    dm2.fireTableDataChanged();
                }
            } catch (RemoteException ex) {
                Logger.getLogger(PrincipalGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       //RECHAZAR AMISTAD
        String tipo = jTable2.getValueAt(jTable2.getSelectedRow(),0).toString();
        DefaultTableModel dm2 = (DefaultTableModel) jTable2.getModel();
        int rowCount2 = dm2.getRowCount();
        if(tipo!=null)
        {
            try {
                h.rechazoAmistad(u.getName(), tipo);

                //RENUEVA PETICIONES PENDIENTES
                for (int i = rowCount2 - 1; i >= 0; i--) 
                {
                    dm2.removeRow(i);
                }
                ArrayList<String>peticionesUsuario = h.peticionesUsuario(u);
                for(int i=0;i<peticionesUsuario.size();i++)
                {
                    String vector[]=new String[1];
                    vector[0]=peticionesUsuario.get(i);
                    dm2.addRow(vector);
                    dm2.fireTableDataChanged();
                }
                
                //CAMBIA EL COMBOBOX PARA RESETEAR LA NUEVA
               jComboBox1.removeAllItems();
                ArrayList<String> usuarios=h.getList(u);
                for(int i=0;i<usuarios.size();i++)
                {
                    InterfazUsuario in=u.getAmigos().get(usuarios.get(i));
                    if(in==null)
                    {
                        if(!usuarios.get(i).equals(u.getName()))
                        {
                            jComboBox1.addItem(usuarios.get(i));
                        }
                    }
                }
                
                } catch (RemoteException ex) {
                Logger.getLogger(PrincipalGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // BORRAR AMIGO
        String tipo = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        if(tipo!=null)
        {
            try {
                h.desAmistad(u.getName(), tipo);
                
                //ACTUALIZAMOS TABLA
                DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
                int rowCount = dm.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--)
                {
                    dm.removeRow(i);
                }   
            
                //AMIGOS CONECTADOS
                Set <String> claves;
                claves = u.getAmigos().keySet();
                for(String key:claves)
                {
                     String vector[]=new String[1];
                     vector[0]=key;
                     dm.addRow(vector);
                     dm.fireTableDataChanged();
                }
            
                } catch (RemoteException ex) {
                Logger.getLogger(PrincipalGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        //NUEVO CHAT
        String tipo = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
        if(tipo!=null)
        {
            try {
                jTabbedPane1.setSelectedIndex(0);
                callback=u.getAmigos().get(tipo).getCallBack();
                amigoChat=tipo;
                jLabel5.setText(tipo);
            } catch (RemoteException ex) {
                Logger.getLogger(PrincipalGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        //ENVIAR MENSAJE
        if(!"".equals(jTextArea1.getText()))
        {
            try {
                String previo= jTextPane1.getText();
                String[] split = previo.split("</body>");
                jTextPane1.setText(split[0]+"<p style=\"color:black\">"+"Tu"+":"+jTextArea1.getText()+"</p></body></html>");
                callback.SendMessageToMe("<p align=\"right\""+"<font color=\"red\">"+u.getName()+":"+jTextArea1.getText()+"</font></p></body></html>");
                jTextArea1.setText("");
            } catch (RemoteException ex) {
                Logger.getLogger(PrincipalGui.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        this.setVisible(false);
        ArchivosGui archivos=new ArchivosGui(amigoChat,callback,this,h,u);
        archivos.setVisible(true);
    }//GEN-LAST:event_jButton7MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            // TODO add your handling code here:
            h.delogin(u);
        } catch (RemoteException ex) {
            Logger.getLogger(PrincipalGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void ContrasenaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContrasenaActualActionPerformed

    private void ConfirmarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmarContrasenaActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try {
            if(!NuevaContrasena.equals(ConfirmarContrasena)){
                contrasenaNoCoincide.setVisible(true);
                contrasenaIncorrecta.setVisible(false);
                ContrasenaActualizada.setVisible(false);
            }
            else{
                boolean resultado=h.cambiarContrasena(u, Arrays.toString(ContrasenaActual.getPassword()), Arrays.toString(NuevaContrasena.getPassword()));
                if(!resultado){
                    contrasenaNoCoincide.setVisible(false);
                    contrasenaIncorrecta.setVisible(true);
                    ContrasenaActualizada.setVisible(false);
                }else{
                    contrasenaNoCoincide.setVisible(false);
                    contrasenaIncorrecta.setVisible(false);
                    ContrasenaActualizada.setVisible(true);
                }
            }
            
        } catch (RemoteException ex) {
            Logger.getLogger(PrincipalGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    public JTextPane getjTextPane1() {
        return jTextPane1;
    }

    
   
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmarContrasena;
    private javax.swing.JPasswordField ContrasenaActual;
    private javax.swing.JLabel ContrasenaActualizada;
    private javax.swing.JPasswordField NuevaContrasena;
    private javax.swing.JLabel contrasenaIncorrecta;
    private javax.swing.JLabel contrasenaNoCoincide;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
