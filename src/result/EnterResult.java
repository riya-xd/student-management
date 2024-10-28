
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
// */
package result;
//import com.mysql.cj.conf.ConnectionUrlParser.Pair;
import com.google.gson.Gson;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.bridj.util.Pair;
import java.sql.*;
import student_management_system.DBConnect;


/**
 *
 * @author hp
 */
public class EnterResult extends javax.swing.JFrame {
    int x,i;
    int s = 0;
    int num =0;
    ArrayList<Pair <String,Integer>> p1;
    ArrayList<Pair < javax.swing.JTextField, javax.swing.JTextField>> jfield;
    /**
     * Creates new form EnterResult
     */
    public EnterResult() {
        initComponents();
        try{
            Connection con = DBConnect.connect();
            PreparedStatement ps = con.prepareStatement("select rollno from student");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                roll_txt.addItem(rs.getString("rollno"));
            }
        }catch(Exception e){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sub_pnl = new javax.swing.JPanel();
        s1 = new javax.swing.JTextField();
        n1 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        s3 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        s4 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();
        s5 = new javax.swing.JTextField();
        n5 = new javax.swing.JTextField();
        roll_txt = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        add_btn = new javax.swing.JButton();
        submit_btn2 = new javax.swing.JButton();
        submit_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 255));
        jScrollPane1.setOpaque(false);

        sub_pnl.setBackground(new java.awt.Color(0, 114, 255));
        sub_pnl.setLayout(new java.awt.GridLayout(x, 2, 10, 10));

        s1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        sub_pnl.add(s1);

        n1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        sub_pnl.add(n1);

        s2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        sub_pnl.add(s2);

        n2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });
        sub_pnl.add(n2);

        s3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        sub_pnl.add(s3);

        n3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });
        sub_pnl.add(n3);

        s4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        sub_pnl.add(s4);

        n4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });
        sub_pnl.add(n4);

        s5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        sub_pnl.add(s5);

        n5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });
        sub_pnl.add(n5);

        jScrollPane1.setViewportView(sub_pnl);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 720, 420));

        roll_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roll_txtActionPerformed(evt);
            }
        });
        jPanel1.add(roll_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 270, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("SEARCH BY ROLL NUMBER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        add_btn.setBackground(new java.awt.Color(102, 153, 255));
        add_btn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        add_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_btn.setText("ADD");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        jPanel1.add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, -1));

        submit_btn2.setBackground(new java.awt.Color(102, 153, 255));
        submit_btn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        submit_btn2.setForeground(new java.awt.Color(255, 255, 255));
        submit_btn2.setText("BACK");
        submit_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(submit_btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, -1, -1));

        submit_btn.setBackground(new java.awt.Color(102, 102, 255));
        submit_btn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        submit_btn.setForeground(new java.awt.Color(255, 255, 255));
        submit_btn.setText("SUBMIT");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        jPanel1.add(submit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 200, 50));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENTER RESULT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 48), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roll_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roll_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roll_txtActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        try{
            //Enter the no of additional subjects
            num = Integer.parseInt(JOptionPane.showInputDialog("enter the number of subjects you want to add"));
            //incrementing the rows
            x = 5+num;
            jfield = new ArrayList<Pair<javax.swing.JTextField,javax.swing.JTextField>>();
            int top = 410;
            for(i=0;i<num;i++){
                top+=60;
                javax.swing.JTextField newj,newm;
                newj = new javax.swing.JTextField();
                newj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));

               sub_pnl.add(newj,new org.netbeans.lib.awtextra.AbsoluteConstraints(60,top,210,40));
                newm = new javax.swing.JTextField();
                newm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));

                sub_pnl.add(newm,new org.netbeans.lib.awtextra.AbsoluteConstraints(340,top,210,40));
                jfield.add(new Pair<javax.swing.JTextField,javax.swing.JTextField>(newj,newm));
            }
                s=num;
                sub_pnl.setPreferredSize(new java.awt.Dimension(sub_pnl.getWidth(),top+100));
                sub_pnl.revalidate();
                sub_pnl.repaint();
            
        }catch (Exception e){}

    }//GEN-LAST:event_add_btnActionPerformed

    private void submit_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btn2ActionPerformed
        // TODO add your handling code here:
        dispose();
       
    }//GEN-LAST:event_submit_btn2ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n4ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n3ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n2ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n1ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n5ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        // TODO add your handling code here:
        try{
          p1 = new ArrayList<Pair<String,Integer>>();
          
          p1.add(new Pair<String,Integer>(s1.getText(),Integer.parseInt(n1.getText())));
          p1.add(new Pair<String,Integer>(s2.getText(),Integer.parseInt(n2.getText())));
          p1.add(new Pair<String,Integer>(s3.getText(),Integer.parseInt(n3.getText())));
          p1.add(new Pair<String,Integer>(s4.getText(),Integer.parseInt(n4.getText())));
          p1.add(new Pair<String,Integer>(s5.getText(),Integer.parseInt(n5.getText())));
        
        if(jfield!=null){
          //    System.out.println(jfield);
          for(Pair<JTextField, JTextField> pair : jfield){
            JTextField sub = pair.getKey(); // key
            JTextField mark = pair.getValue();//value
            // Get the text from the JTextField key
            String subStr = sub.getText();
            String markStr = mark.getText();
           p1.add(new Pair<String,Integer>(subStr,Integer.parseInt(markStr)));

            // Print the text from the key JTextField
            System.out.println("subject : " + subStr);         
            System.out.println("marks : " + markStr);         
          }
         }
        System.out.println(p1);

            // Convert p1 to JSON
            
            Gson gson = new Gson();
            String json = gson.toJson(p1);
                Connection con = DBConnect.connect();
                PreparedStatement ps = con.prepareStatement("insert into result values(?,?)");
                ps.setString(1,roll_txt.getSelectedItem().toString());
                ps.setString(2,json);
                int a = ps.executeUpdate();
                
                if(a==1){
                    JOptionPane.showMessageDialog(null, "Result declared Successfully");
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Some Error ... try again later");
                }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_submit_btnActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

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
            java.util.logging.Logger.getLogger(EnterResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JComboBox<String> roll_txt;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JPanel sub_pnl;
    private javax.swing.JButton submit_btn;
    private javax.swing.JButton submit_btn2;
    // End of variables declaration//GEN-END:variables
}