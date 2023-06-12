/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectolab131part2;

/**
 *
 * @author MiPC
 */
public class Principal extends javax.swing.JFrame {

    private VentanaMacrodistrito ventanaMacrodistrito;
    private PilaM m1;
    private Macrodistrito ma1;
    private Macrodistrito ma2;
    private Zona z1,z2,z3,z4;
    private CSimpleZ cz1,cz2;
    private LSimpleF lf1,lf2,lf3,lf4;
    private Farmacia f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12;
    private Sucursal s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22;
    private PilaS ps1,ps2,ps3,ps4,ps5,ps6,ps7,ps8,ps9,ps10,ps11,ps12;
    private EstablecimientoDeSalud e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12;
    private LDobleE le1,le2,le3,le4;
    
    
    
    
    public Principal() {
        initComponents();
        
        LDobleE le1 = new LDobleE();
        EstablecimientoDeSalud e1 = new EstablecimientoDeSalud("Pro Mujer", "C. Canonigo Ayllon", "ONGs", 2, "Clinica");
        EstablecimientoDeSalud e2 = new EstablecimientoDeSalud("El Carmen", "C. Canonigo A. Pza. el Carmen", "ONGs", 3, "Hospital");
        EstablecimientoDeSalud e3 = new EstablecimientoDeSalud("Bajo San Pedro", "C. General Gonzales #1328", "publico", 1, "Hospital");
        le1.adiFinal(e1);
        le1.adiFinal(e2);
        le1.adiFinal(e3);

        LDobleE le2 = new LDobleE();
        EstablecimientoDeSalud e4 = new EstablecimientoDeSalud("Medi Health", "Av. Sánchez Lima 2326", "ONGs", 1, "Hospital");
        EstablecimientoDeSalud e5 = new EstablecimientoDeSalud("Caja petrolera", "Av. 6 de Agosto", "ONGs", 2, "Clinica");
        EstablecimientoDeSalud e6 = new EstablecimientoDeSalud("SS Universitario", "Av. 6 de Agosto", "privado", 1, "Hospital");
        le2.adiFinal(e4);
        le2.adiFinal(e5);
        le2.adiFinal(e6);

        LDobleE le3 = new LDobleE();
        EstablecimientoDeSalud e7 = new EstablecimientoDeSalud("Arcoiris", "C. 15 de abril", "publico", 2, "Hospital");
        EstablecimientoDeSalud e8 = new EstablecimientoDeSalud("La merced", "C. Villa Aspiazu", "publico", 1, "Hospital");
        EstablecimientoDeSalud e9 = new EstablecimientoDeSalud("Caja petrolera", "C. Miguel Aparicio", "publico", 1, "Clinica");
        le3.adiFinal(e7);
        le3.adiFinal(e8);
        le3.adiFinal(e9);
        
        LDobleE le4 = new LDobleE();
        EstablecimientoDeSalud e10 = new EstablecimientoDeSalud("Virgen de Copacabana", "Av. de la Oliva", "publico", 2, "Hospital");
        EstablecimientoDeSalud e11 = new EstablecimientoDeSalud("Centro Bajo San Antonio", "C. R. Castrillo", "privado", 3, "Centro de Salud");
        EstablecimientoDeSalud e12 = new EstablecimientoDeSalud("Centro Copacabana", "Av. oleoducto", "publico", 3, "Centro de Salud");
        le4.adiFinal(e10);
        le4.adiFinal(e11);
        le4.adiFinal(e12);

        LSimpleF lf1 = new LSimpleF();
        PilaS ps1 = new PilaS();
        Sucursal s1 = new Sucursal("central", "avenida1");
        ps1.adicionar(s1);
        Farmacia f1 = new Farmacia("La glorieta", "publico", ps1);

        PilaS ps2 = new PilaS();
        Sucursal s2 = new Sucursal("Plaza San Pedro", "calle 2");
        Sucursal s3 = new Sucursal("Teleferico", "calle 3");
        ps2.adicionar(s2);
        ps2.adicionar(s3);
        Farmacia f2 = new Farmacia("Mi Farma", "institucional", ps2);

        PilaS ps3 = new PilaS();
        Sucursal s4 = new Sucursal("San Pedro", "calle 4");
        Sucursal s5 = new Sucursal("Rotonda", "calle 7");
        ps3.adicionar(s4);
        ps3.adicionar(s5);
        Farmacia f3 = new Farmacia("Angel Samuel", "publico", ps3);

        lf1.adiPrincipio(f1);
        lf1.adiPrincipio(f2);
        lf1.adiPrincipio(f3);

        LSimpleF lf2 = new LSimpleF();
        PilaS ps4 = new PilaS();
        Sucursal s6 = new Sucursal("central", "avenida 9");
        ps4.adicionar(s6);
        Farmacia f4 = new Farmacia("Victoria", "hospitalaria", ps4);

        PilaS ps5 = new PilaS();
        Sucursal s7 = new Sucursal("Plaza España", "calle 2");
        Sucursal s8 = new Sucursal("Plaza Avaroa", "avenida 3");
        ps5.adicionar(s7);
        ps5.adicionar(s8);
        Farmacia f5 = new Farmacia("Mi Farma", "institucional", ps5);

        PilaS ps6 = new PilaS();
        Sucursal s9 = new Sucursal("Plaza España", "avenida 4");
        Sucursal s10 = new Sucursal("6 de agosto", "calle 7");
        ps6.adicionar(s9);
        ps6.adicionar(s10);
        Farmacia f6 = new Farmacia("Beni", "publico", ps6);

        lf2.adiPrincipio(f4);
        lf2.adiPrincipio(f5);
        lf2.adiPrincipio(f6);
        
        
        LSimpleF lf3 = new LSimpleF();
        PilaS ps7 = new PilaS();
        Sucursal s11 = new Sucursal("villa Fatima", "av Nueva america");
        Sucursal s12 = new Sucursal("las delicias", "plza del Maestro");
        ps7.adicionar(s11); ps7.adicionar(s12);
        Farmacia f7 = new Farmacia("Bolivia", "publico", ps7);

        PilaS ps8 = new PilaS();
        Sucursal s13 = new Sucursal("Villa Fatima", "av Conzata");
        Sucursal s14 = new Sucursal("Tejada Zorsano", "plaza Villaroel");
        Sucursal s15 = new Sucursal("Central", "av Nueva america");
        ps8.adicionar(s13);
        ps8.adicionar(s14);
        ps8.adicionar(s15);
        Farmacia f8 = new Farmacia("Ave Maria", "publico", ps8);

        PilaS ps9 = new PilaS();
        Sucursal s16 = new Sucursal("central", "plaza Arandia");
        ps9.adicionar(s16);
        Farmacia f9 = new Farmacia("Nazareth", "publico", ps9);

        lf3.adiPrincipio(f7);
        lf3.adiPrincipio(f8);
        lf3.adiPrincipio(f9);
        
        LSimpleF lf4 = new LSimpleF();
        PilaS ps10 = new PilaS();
        Sucursal s17 = new Sucursal("Munaypata", "la florida");
        Sucursal s18 = new Sucursal("San antonio", "av. Republica");
        Sucursal s19 = new Sucursal("Tejar", "C. Bustillos");
        ps10.adicionar(s17); ps10.adicionar(s18); ps10.adicionar(s19);
        Farmacia f10 = new Farmacia("Bolivia", "publico", ps10);

        PilaS ps11 = new PilaS();
        Sucursal s20 = new Sucursal("El tejar", "Cancha El Tejar");
        Sucursal s21 = new Sucursal("San antonio", "av. Republica");
        ps11.adicionar(s20);
        ps11.adicionar(s21);
        Farmacia f11 = new Farmacia("Mi Farma", "publico", ps11);

        PilaS ps12 = new PilaS();
        Sucursal s22 = new Sucursal("central", "C. Lima");
        ps12.adicionar(s22);
        Farmacia f12 = new Farmacia("MediCup", "publico", ps12);

        lf4.adiPrincipio(f10);
        lf4.adiPrincipio(f11);
        lf4.adiPrincipio(f12);

        CSimpleZ cz1 = new CSimpleZ();
        Zona z1 = new Zona("San Pedro", lf1, le1, 3455);
        Zona z2 = new Zona("Sopocachi", lf2, le2, 2288);
        CSimpleZ cz2 = new CSimpleZ();
        Zona z3 = new Zona("Villa Fatima", lf3, le3, 2288);
        Zona z4 = new Zona("Villa Copacabana", lf4, le4, 2288);
        cz1.adicionar(z1);
        cz1.adicionar(z2);
        cz2.adicionar(z3);
        cz2.adicionar(z4);

        PilaM m1 = new PilaM();
        Macrodistrito ma1 = new Macrodistrito("Centro", 15534, cz1);
        Macrodistrito ma2 = new Macrodistrito("Max Paredes", 77124, cz2);
        m1.adicionar(ma1); m1.adicionar(ma2);
        
        
        
        this.setLocationRelativeTo(null);
    }
    
    public Principal(PilaM a) {
        initComponents();
        m1=a;
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jPasswordFieldContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    Sistema de búsqueda de hospitales");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                y farmacias en La Paz");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonEntrar.setBackground(new java.awt.Color(0, 0, 102));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Usuario:");

        jTextFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jButtonEntrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUser, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldContrasena))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(jButtonEntrar)
                .addGap(38, 38, 38))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        ventanaMacrodistrito = new VentanaMacrodistrito(m1);
        ventanaMacrodistrito.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jTextFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldContrasena;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
