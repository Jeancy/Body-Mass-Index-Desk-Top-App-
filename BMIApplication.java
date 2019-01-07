
 * Given the heigth and the weight of a person, compute his body mass
 * index BMI and tell the person if he is underweight, overweight, obese
 * or has a normal weight
 *
 */
package bodymassindexapp;

import java.awt.Toolkit;

/**
 *
 * @author Jeancy Tshibemba 
 */
public class BMIApplication extends javax.swing.JFrame {

    /**
     * Creates new form BMIApplication
     */
    public BMIApplication() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("BMI.png")));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtBodyMass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnCompute1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BODY MASS INDEX APPLICATION BUILT BY JEANCY TSHIBEMBA");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImages(null);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BELOW IS YOUR BODY MASS INDEX");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WEIGHT");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));

        txtWeight.setBackground(new java.awt.Color(255, 255, 0));
        txtWeight.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtWeight.setForeground(new java.awt.Color(51, 0, 255));
        txtWeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtWeight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        txtWeight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtBodyMass.setBackground(new java.awt.Color(255, 255, 0));
        txtBodyMass.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtBodyMass.setForeground(new java.awt.Color(0, 0, 255));
        txtBodyMass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBodyMass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HEIGHT");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));

        txtHeight.setBackground(new java.awt.Color(255, 255, 0));
        txtHeight.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtHeight.setForeground(new java.awt.Color(0, 0, 255));
        txtHeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHeight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        txtHeight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnReset.setBackground(new java.awt.Color(255, 255, 0));
        btnReset.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 0, 255));
        btnReset.setText("RESET");
        btnReset.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true), null));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCompute1.setBackground(new java.awt.Color(255, 255, 0));
        btnCompute1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCompute1.setForeground(new java.awt.Color(0, 0, 255));
        btnCompute1.setText("COMPUTE");
        btnCompute1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        btnCompute1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompute1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txtHeight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBodyMass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                            .addComponent(btnCompute1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBodyMass, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompute1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("PLEASE PUT YOUR HEIGHT AND YOUR WEIGHT RESPECTIVELY THEN CLICK COMPUTE, TO COMPUTE YOUR CURRENT WEIGHT SITUATION");

        pack();
    }// </editor-fold>                        

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
         txtHeight.setText("");
         txtWeight.setText("");
         txtBodyMass.setText("");
    }                                        

    private void btnCompute1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String ht = txtHeight.getText();
        double height = Double.valueOf(ht);
        String wt = txtWeight.getText();
        double weight = Double.valueOf(wt);
        double bmi = weight / (height * height);
        if(bmi < 18.5){
            txtBodyMass.setText("You are underweight");
        }else if( (bmi >= 18.5) && (bmi < 25)){
	    txtBodyMass.setText("Your weight is normal ");
	}else if((bmi >= 25)&&( bmi < 30)){
	    txtBodyMass.setText("You are overweight");
	}else{
            txtBodyMass.setText("You are obese");
	}
        
        
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BMIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BMIApplication().setVisible(true);
            new BMIApplication().setTitle("BODY MASS INDEX APPLICATION");
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCompute1;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBodyMass;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration                   

   
}

