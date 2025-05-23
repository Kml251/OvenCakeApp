package ovencakeapp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author kamil
 */
public class OvenGUI extends javax.swing.JFrame {
    private final MyOven oven = new MyOven();

    /**
     * Creates new form OvenGUI
     */
    public OvenGUI() {
        initComponents();
        
        // Sets the font of the output text area to Monospaced, Bold, size 12.
        // Monospaced font ensures that columns of text (like cake details) align neatly,
        // which improves readability when displaying formatted tables in the GUI.
        jTextArea1.setFont(new java.awt.Font("Monospaced", java.awt.Font.BOLD, 12));
        
        //-----------------------------------------------------------------------
        //Note: All cake and weight radio buttons were added via NetBeans GUI Designer.
        //They were grouped by choosing ButtonGroup
        //This makes sure only one button can be selected at a time.
        //-----------------------------------------------------------------------
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        
        jRadioButton6.addActionListener(e -> jTextField1.setEnabled(true));
        jRadioButton12.addActionListener(e -> jTextField2.setEnabled(true));
        
        // To set disable cake's buttons
        jRadioButton1.addActionListener(e -> jTextField1.setEnabled(false));
        jRadioButton2.addActionListener(e -> jTextField1.setEnabled(false));
        jRadioButton3.addActionListener(e -> jTextField1.setEnabled(false));
        jRadioButton4.addActionListener(e -> jTextField1.setEnabled(false));
        jRadioButton5.addActionListener(e -> jTextField1.setEnabled(false));
        
        // To set disable weight's buttons
        jRadioButton7.addActionListener(e -> jTextField2.setEnabled(false));
        jRadioButton8.addActionListener(e -> jTextField2.setEnabled(false));
        jRadioButton9.addActionListener(e -> jTextField2.setEnabled(false));
        jRadioButton10.addActionListener(e -> jTextField2.setEnabled(false));
        jRadioButton11.addActionListener(e -> jTextField2.setEnabled(false));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Seek the Cake");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("List All Cakes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("Remove");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("Welcome to 2024455_Cakes Bakery");

        jLabel4.setText("Best Before :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Pineapple");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Strawberry");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Chocolate");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Vanilla");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Plain");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("New Cake");

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("175");

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setText("275");

        buttonGroup2.add(jRadioButton9);
        jRadioButton9.setText("375");

        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setText("475");

        buttonGroup2.add(jRadioButton11);
        jRadioButton11.setText("575");

        buttonGroup2.add(jRadioButton12);
        jRadioButton12.setText("Different Weight");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(314, 314, 314))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /* 
        * ===== To List All Cakes =====
        */
        
        // To verify if the oven is empty.
        if(oven.isEmpty()){
            jTextArea1.setText("Oven is empty. \n");
        }
        // To display all cakes in the oven.
        else{
            // Using StringBuilder for efficient string concatenation in a loop.
            // This avoids repeated string object creation and is faster than regular string (+) operations.
            StringBuilder sb = new StringBuilder ("Cakes in oven: \n");
            sb.append(String.format("%-12s %-10s %-16s %-25s \n", 
                        "Name", "Weight", "Best Before", "Placed"));
            sb.append("----------------------------------------------------------------------------------------\n");
            
            for (int i = 0; i < oven.size(); i++) {
                Object cake = oven.frontElement();
                sb.append(cake.toString()).append("\n");
                oven.enqueue(oven.dequeue());
            }
            jTextArea1.setText(sb.toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        /* 
        * ===== To Remove =====
        */
        
        // To verify if the oven is empty.
        if (oven.isEmpty()){
            jTextArea1.setText("No cakes to remove. \n");
        }
        // To remove the cake with using dequeue method.
        else {
            Object removed = oven.dequeue();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%-12s %-10s %-16s %-25s \n", 
                        "Name", "Weight", "Best Before", "Placed"));
            sb.append("----------------------------------------------------------------------------------------\n");
            sb.append(removed.toString());
            jTextArea1.setText("Cake removed: \n" + sb.toString());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //To exit the program
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*
        * ===== To Add =====
        */
        
        /*To introduce the fields as a String: getText() is to add value into the cake name;
        trim() is to clean any space around the value to add by mistake. */
        
        // To get cake name
        String name = "";
        if(jRadioButton1.isSelected()) name = "Pineapple";
        else if(jRadioButton2.isSelected()) name = "Strawberry";
        else if(jRadioButton3.isSelected()) name = "Chocolate";
        else if(jRadioButton4.isSelected()) name = "Vanilla";
        else if(jRadioButton5.isSelected()) name = "Plain";
        else if(jRadioButton6.isSelected()) name = jTextField1.getText().trim();
        
        //To get cake's weight as a String
        String weightStr = "";
        if(jRadioButton7.isSelected()) weightStr = "175";
        else if(jRadioButton8.isSelected()) weightStr = "275";
        else if(jRadioButton9.isSelected()) weightStr = "375";
        else if(jRadioButton10.isSelected()) weightStr = "475";
        else if(jRadioButton11.isSelected()) weightStr = "575";
        else if(jRadioButton12.isSelected()) weightStr = jTextField2.getText().trim();
        
        //To get cake's expiration date as a String
        String dateStr = jTextField3.getText().trim();
        
        //To check all fields are filled in.
        if (name.isEmpty() || weightStr.isEmpty() || dateStr.isEmpty()){
            //To request the fields are filled in, if not, prompt the message.
            jTextArea1.setText("Please fill in all fields. \n");
            return;
        }
        //To try-catch is getting any values without numbers.
        try{
            // To return the string values to an integer and date.
            int weight = Integer.parseInt(weightStr);
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate bestBeforeDate =LocalDate.parse(dateStr, inputFormatter);
            LocalDate today = LocalDate.now();
            
            if(weight < 100 || weight >2000 ){
                jTextArea1.setText("Weight cannot add less than 100 g. or more than 2000 g.");
                return;
            }
            
            // To check the date should not be in the past.
            if(bestBeforeDate.isBefore(today)){
                jTextArea1.setText("Best-Before date cannot be in the past. \n");
                return;
            }
            //To check if the expiration date is within 14 days
            if(bestBeforeDate.isAfter(today.plusDays(14))){
                jTextArea1.setText("Best-before date must be within 14 days from today.\n");
                return;
            }
            
            //To check if the oven is full
            if (oven.size() >= 5){
                jTextArea1.setText("No more capacity in the Oven! Please remove the first cake! \n");
            }
            // To add the cake in the oven with using enqueue method.
            else {
                Cakes cake = new Cakes(name, weight, bestBeforeDate);
                oven.enqueue(cake);
                StringBuilder sb = new StringBuilder();
                sb.append(String.format("%-12s %-10s %-16s %-25s \n",
                        "Name", "Weight", "Best Before", "Placed"));
                sb.append("----------------------------------------------------------------------------------------\n");
                sb.append(cake.toString());
                jTextArea1.setText("Cake added: \n" + sb.toString());
            }
            buttonGroup1.clearSelection(); // for cake name group
            buttonGroup2.clearSelection(); // for weight group

            //To clean fields after adding the date
            jTextField1.setText(" ");
            jTextField2.setText(" "); 
            /* I have only chosen name and weight because expiration days cannot be changed every time! */
                       
        } catch (NumberFormatException e){
            jTextArea1.setText("Weight must be a number. \n");
        } catch (Exception e){
            jTextArea1.setText("Invalid data format. Use DD-MM-YYYY. \n");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /*
        * ===== To Seek the Cake =====
        */
        
        // To verify if the oven is empty.
        if (oven.isEmpty()){
            jTextArea1.setText("There are no cakes in the oven. \n");
        }
        // To show the top item using the frontElement function.
        else {
            Object topCake = oven.frontElement();
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("%-12s %-10s %-16s %-25s \n",
                    "Name", "Weight", "Best Before", "Placed"));
            sb.append("----------------------------------------------------------------------------------------\n");
            sb.append(topCake.toString());
            jTextArea1.setText("Cake at the front of the oven: \n" + sb.toString());
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(OvenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OvenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OvenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OvenGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OvenGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
