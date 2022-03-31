import java.util.*;

public class DiceApplication extends javax.swing.JFrame {

    public DiceApplication() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dice Roller");
        setMaximumSize(new java.awt.Dimension(400, 350));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setResizable(false);

        Label1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label1.setText(" به Dice Roller خوش آمدید");
        Label1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Label2.setFont(new java.awt.Font("2  Titr", 1, 18)); // NOI18N
        Label2.setForeground(new java.awt.Color(255, 0, 0));
        Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label2.setText("تعداد وجه تاس را در کادر زیر وارد کنید");
        Label2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204)));
        Label2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setToolTipText("عدد تاس در این قسمت نشان داده میشود");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jFormattedTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 0)));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0"))));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.setToolTipText("");
        jFormattedTextField1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jFormattedTextField1.setMaximumSize(new java.awt.Dimension(150, 150));
        jFormattedTextField1.setMinimumSize(new java.awt.Dimension(150, 150));
        jFormattedTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        Label1.getAccessibleContext().setAccessibleName("50");
        Label1.getAccessibleContext().setAccessibleDescription("");
        Label2.getAccessibleContext().setAccessibleName("Label2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyReleased
        dice();
    }//GEN-LAST:event_jFormattedTextField1KeyReleased
    public void dice()
    {
       Random rand = new Random();
        int dice = 0 , side = 0;
        try
        {
            String str = jFormattedTextField1.getText();
                side = Integer.parseInt(str);
                
            for (int i = 0; i < side ; i++) 
            {
                dice = rand.nextInt(side) + 1;
            }
        }
        catch (Exception ex) {}
        jLabel2.setText("Dice " + side + " = " +dice ); 
    }
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
            java.util.logging.Logger.getLogger(DiceApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiceApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiceApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiceApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DiceApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}