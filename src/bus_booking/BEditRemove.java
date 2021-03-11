/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_booking;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;

/**
 *
 * @author charu
 */
public class BEditRemove extends javax.swing.JFrame {

    /**
     * Creates new form EditRemove
     */
    public BEditRemove() {
        initComponents();
         this.getRootPane().setDefaultButton(getDetails);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bus_no1 = new javax.swing.JTextField();
        getDetails = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bname1 = new javax.swing.JTextField();
        maxseats1 = new javax.swing.JTextField();
        modify = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        type1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fare1 = new javax.swing.JTextField();
        desn1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus_booking/busing.gif"))); // NOI18N
        jLabel1.setText("Bus Booking System");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel2.setText("Enter Bus_no");

        getDetails.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        getDetails.setForeground(new java.awt.Color(0, 0, 102));
        getDetails.setText("Get Details");
        getDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDetailsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Bus _name");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("Type");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setText("Max_seats");

        maxseats1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxseats1ActionPerformed(evt);
            }
        });

        modify.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        modify.setForeground(new java.awt.Color(0, 0, 102));
        modify.setText("Modify");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 102));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 102));
        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        type1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Bus type", "AC", "Non-Ac", "Sleepre" }));
        type1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("Destination");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setText("Fare");

        desn1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select your Destination", "Aurangabad", "Mumbai", "Nashik", "Nagpur", "Shirdi" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(bus_no1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modify, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(delete)
                                        .addGap(54, 54, 54)
                                        .addComponent(back))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fare1)
                                            .addComponent(maxseats1)
                                            .addComponent(bname1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(type1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(desn1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(getDetails)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bus_no1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(getDetails)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(type1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maxseats1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(fare1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modify)
                    .addComponent(delete)
                    .addComponent(back))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
  this.setVisible(false); 
        new bchoice1().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void getDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDetailsActionPerformed
String bus_no,bname,maxseats,desn,fare; 	
         Object type; 
        bus_no=bus_no1.getText();
        
        if(bus_no.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Insert Bus_no");
        }
        try
        {
             MongoClient mongoClient = new MongoClient("localhost", 27017);
          DB db = mongoClient.getDB("BusBooking");
          DBCollection coll = db.getCollection("Buses");
         
           int i=Integer.parseInt(bus_no);
            BasicDBObject query=new BasicDBObject("_id",i);

            DBCursor cursor=coll.find(query);
            try
            {
                DBObject s=cursor.next();

                bname=s.get("Bus_name").toString();
                type=s.get("Type").toString();
                maxseats=s.get("Maxseats").toString();
                desn=s.get("Destination").toString();
                fare=s.get("Fare").toString();
               /* date=s.get("Date").toString();
                time=s.get("Time").toString();*/
                

                 bname1.setText(bname);
               
          type1.setSelectedItem(type);
          maxseats1.setText(maxseats);
          desn1.setSelectedItem(desn);
          fare1.setText(fare);
         /* d1.setText(date);
          t1.setText(time);*/
          

            }catch(Exception e){JOptionPane.showMessageDialog(this,"Bus Details not found");bus_no1.setText(null);}
        }catch(Exception e){}             // TODO add your handling code here:
    }//GEN-LAST:event_getDetailsActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
String bus_no,bname,maxseats,fare,date,time; 	
         Object type,desn; 
        bus_no=bus_no1.getText();
        if(bus_no.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Insert Bus_no");
        }
        else{
        bname = bname1.getText();
        type = type1.getSelectedItem();
        maxseats=maxseats1.getText();
        desn = desn1.getSelectedItem();
        fare = fare1.getText();
       /* date = d1.getText();
        time=t1.getText();*/
        String Bname="[a-zA-Z]*" ;

        if(bname.equals("") || type.equals("") || maxseats.equals("") || fare.equals("") || desn.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill all Fields");
        }
        else if(!bname.matches(Bname))///name Validation
     {
       JOptionPane.showMessageDialog(null,"Please Enter valid Name");
       bname1.setText(null);
      }
      else  if((!maxseats.matches("[0-9.]")&&(maxseats.length())!=2))//Max seat no validation
      {
          JOptionPane.showMessageDialog(null,"Please Enter seats no between 1 to 50");
          maxseats1.setText(null);
      }
     /* else if(!desn.matches(Bname))///name Validation
     {
       JOptionPane.showMessageDialog(null,"enter valid destination");
       desn1.setText(null);
      }*/
      else  if((!fare.matches("[0-9.]")&&(fare.length())!=3))//fare validation
      {
          JOptionPane.showMessageDialog(null,"Please Enter fare between 100 to 999");
          fare1.setText(null);
      }
        
     
        else{
            
            try
            {

                MongoClient mongoClient = new MongoClient("localhost", 27017);
                DB db = mongoClient.getDB("BusBooking");
                DBCollection coll = db.getCollection("Buses");
                int i=Integer.parseInt(bus_no);
                BasicDBObject doc=new BasicDBObject("_id",i);
                BasicDBObject query = new BasicDBObject("_id",i).append("Bus_name", bname).append("Type",type).append("Maxseats",maxseats).append("Destination",desn).append("Fare", fare);
                                
            //query.putAll(q1);
                coll.update(doc,query);
                JOptionPane.showMessageDialog(this, "Bus Entry Successfully Updated");
            }catch(UnknownHostException e){}
            bus_no1.setText(null);

          bname1.setText(null);
          type1.setSelectedItem(null);
          maxseats1.setText(null);
          desn1.setSelectedItem(null);
          fare1.setText(null);
         /* d1.setText(null);
          t1.setText(null);*/
            
        }}
                // TODO add your handling code here:
    }//GEN-LAST:event_modifyActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
String bus_no;//,c_name,c_add,c_mailid,c_cntno;
             
        bus_no = bus_no1.getText();
         if(bus_no.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Insert Bus_no");
        }
        else{
            try
            {

                 MongoClient mongoClient = new MongoClient("localhost", 27017);
          DB db = mongoClient.getDB("BusBooking");
        DBCollection coll = db.getCollection("Buses");
         
int i=Integer.parseInt(bus_no);
                BasicDBObject doc=new BasicDBObject("_id",i);
                coll.remove(doc);
                JOptionPane.showMessageDialog(this, "Bus Entry Deleted Successful");
            }catch(UnknownHostException e){}

            bus_no1.setText(null);

          bname1.setText(null);
          type1.setSelectedItem(null);
          maxseats1.setText(null);
          desn1.setSelectedItem(null);
          fare1.setText(null);
         /* d1.setText(null);
          t1.setText(null);*/
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void maxseats1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxseats1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxseats1ActionPerformed

    private void type1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type1ActionPerformed

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
            java.util.logging.Logger.getLogger(BEditRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BEditRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BEditRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BEditRemove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BEditRemove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField bname1;
    private javax.swing.JTextField bus_no1;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox desn1;
    private javax.swing.JTextField fare1;
    private javax.swing.JButton getDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField maxseats1;
    private javax.swing.JButton modify;
    private javax.swing.JComboBox type1;
    // End of variables declaration//GEN-END:variables
}