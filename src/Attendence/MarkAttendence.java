/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Attendence;
import student_management_system.DBConnect;
import java.sql.*;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author hp
 */
public class MarkAttendence extends javax.swing.JFrame implements Runnable,ThreadFactory{
    private WebcamPanel p1 = null;
    private Webcam w1 = null;
    private ExecutorService e = Executors.newSingleThreadExecutor(this);
    private boolean webcamOpen = true;
    /**
     * Creates new form MarkAttendence
     */
    public MarkAttendence() {
        initComponents();
        initWebcam();
        Timer t = new Timer(1,new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                update();
            }
        });
            t.start();
        }
    public void update(){
        SimpleDateFormat s = new SimpleDateFormat("yyy-MM-dd");
        date_txt.setText(s.format(new Date()));
//        date_txt.setEditable(false);
    }
    public void initWebcam(){
//        get the webcam object form the camera 
      w1 = Webcam.getDefault();
//      checking if there is webcam or not
      if(w1!= null){
//        returns the visible current size that can be captured in pixels
          Dimension[] reso = w1.getViewSizes();
//        get the length
          Dimension maxRes = reso[reso.length -1];
//        if webcam was open beforehand then close it
          if(w1.isOpen()){
              w1.close();
          }
//        set the size of webcam
          w1.setViewSize(new Dimension(640,480));
//        and then open it
          w1.open();
//        create a panel for the wbcam and then set the size
            p1 = new WebcamPanel(w1);
            p1.setSize(maxRes);
            p1.setFPSDisplayed(true);
            web_pnl.add(p1,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,700,700));
            webcamOpen = true;
            e.execute(this);
      }
      else
          JOptionPane.showMessageDialog(null,"SOME ISSUES");
      
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        start_btn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();
        stop_btn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        search_btn2 = new javax.swing.JButton();
        roll_lbl = new javax.swing.JLabel();
        web_pnl = new javax.swing.JPanel();
        name_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("MARK ATTENDENCE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("DATE :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("ROLL NO :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 371, -1, -1));

        start_btn.setBackground(new java.awt.Color(102, 153, 255));
        start_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        start_btn.setForeground(new java.awt.Color(255, 255, 255));
        start_btn.setText("START");
        start_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_btnActionPerformed(evt);
            }
        });
        jPanel1.add(start_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 180, 80));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 255));
        jLabel9.setText("NAME :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 290, -1, -1));

        date_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 4));
        jPanel1.add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 248, 48));

        stop_btn.setBackground(new java.awt.Color(102, 153, 255));
        stop_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        stop_btn.setForeground(new java.awt.Color(255, 255, 255));
        stop_btn.setText("STOP");
        stop_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop_btnActionPerformed(evt);
            }
        });
        jPanel1.add(stop_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 190, 80));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("  ---WEBCAM---");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, -1));

        search_btn2.setBackground(new java.awt.Color(102, 153, 255));
        search_btn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        search_btn2.setForeground(new java.awt.Color(255, 255, 255));
        search_btn2.setText("BACK");
        search_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(search_btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, 180, 70));

        roll_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 4));
        jPanel1.add(roll_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 371, 248, 48));

        javax.swing.GroupLayout web_pnlLayout = new javax.swing.GroupLayout(web_pnl);
        web_pnl.setLayout(web_pnlLayout);
        web_pnlLayout.setHorizontalGroup(
            web_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        web_pnlLayout.setVerticalGroup(
            web_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        jPanel1.add(web_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 420, 360));

        name_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 4));
        jPanel1.add(name_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 290, 248, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_btnActionPerformed
        // TODO add your handling code here:
        if(!webcamOpen){
            initWebcam();
        }
    }//GEN-LAST:event_start_btnActionPerformed

    private void stop_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop_btnActionPerformed
        // TODO add your handling code here:
        w1.close();
        webcamOpen=false;
    }//GEN-LAST:event_stop_btnActionPerformed

    private void search_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btn2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_search_btn2ActionPerformed

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
            java.util.logging.Logger.getLogger(MarkAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarkAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkAttendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkAttendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JLabel roll_lbl;
    private javax.swing.JButton search_btn2;
    private javax.swing.JButton start_btn;
    private javax.swing.JButton stop_btn;
    private javax.swing.JPanel web_pnl;
    // End of variables declaration//GEN-END:variables
Map<String,String> resultMap = new HashMap<String,String>();
    
@Override
public void run() {
    do {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Result res = null;
            BufferedImage image = null;

            if (w1.isOpen()) {
                image = w1.getImage();
                if (image == null) {
                    System.out.println("No image captured from webcam");
                    continue;
                }

                LuminanceSource source = new BufferedImageLuminanceSource(image);
                BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

                try {
                    res = new MultiFormatReader().decode(bitmap);
                    if (res != null) {
                        System.out.println("QR Code Text: " + res.getText());
//                        jLabel4.setText(res.getText());
                       resultMap = convertJsonToMap(res.getText());
                       System.out.println(resultMap.get("rollno"));
                       name_lbl.setText(resultMap.get("name"));
                       roll_lbl.setText(resultMap.get("rollno"));
                        
                        w1.close();
                        webcamOpen = false;
                        presentAttend(resultMap.get("rollno"));
                        System.out.println("QR Code detected and displayed");
                    } else {
                        System.out.println("No QR Code detected");
                    }
                } catch (com.google.zxing.NotFoundException e) {
                    // Handle the case where no QR code is found in the image
                    System.out.println(e);
                    System.out.println("No QR code found in the image");
                } catch (Exception e) {
                    // Print other exceptions for debugging
                    e.printStackTrace();
                }
            } else {
                System.out.println("Webcam is not open");
            }
        } catch (Exception e) {
            // Print the exception stack trace for debugging
            e.printStackTrace();
        }
    } while (true);
}



    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r,"my thread");
        t.setDaemon(true);
        return t;
    }

    private Map<String, String> convertJsonToMap(String json) {
        Gson gson = new Gson();
        java.lang.reflect.Type   type = new TypeToken<Map<String, String>>() {}.getType();
        return gson.fromJson(json, type);
    }
    
    public void presentAttend(String rollno){
        try{
            Connection con = DBConnect.connect();
            PreparedStatement p1 = con.prepareStatement("select * from attendence where rollno=? ");
            p1.setString(1,rollno);
            ResultSet rs = p1.executeQuery();
//            System.out.println(rs);
//            if(rs.next()==true){
            while(rs.next()){
//               System.out.println(" - = - ");
     
                    if(rs.getString("pa").equalsIgnoreCase("-") ){
//                        upate the attendence of that roll number
    System.out.println("pa = - ");
                           PreparedStatement a1 = con.prepareStatement("update attendence set date = ? , pa = ? where rollno = ?");
                           a1.setString(1,date_txt.getText());
                           a1.setString(2,"present");
                           a1.setString(3,rollno);
                            int a = a1.executeUpdate();
                            if(a==1){
                                JOptionPane.showMessageDialog(null,
                                        resultMap.get("name")+" is marked present ");
                            }
                            
                           
                            else{
                                JOptionPane.showMessageDialog(null,"Some Error");
                            }
                    }
                    else if(!rs.getString("date").equalsIgnoreCase(date_txt.getText()) ){
                    System.out.println("pa = -       "+rs.getString("date"));

                             String qry = "insert into attendence values(?,?,?)";
                                PreparedStatement ps = con.prepareStatement(qry);
                                ps.setString(1,rollno);
                                ps.setString(2,date_txt.getText());
                                ps.setString(3,"present");

                                int av = ps.executeUpdate();
                                if(av==1){
                                    JOptionPane.showMessageDialog(null,
                                            resultMap.get("name")+" is marked present ");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Some Error");
                                }
                            }
                    
                    
                    else{
                        JOptionPane.showMessageDialog(null,  resultMap.get("name")+
                       "  is already marked present");
                    }
               }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }

}
