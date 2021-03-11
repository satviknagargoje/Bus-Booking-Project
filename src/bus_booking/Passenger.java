/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_booking;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.*;
import java.net.UnknownHostException;
import java.util.Set;
import com.mongodb.ServerAddress;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import javax.swing.JOptionPane;

/**
 *
 * @author charu
 */
public class Passenger extends javax.swing.JFrame {
              // static String P_id,name,email_id,mob_no;
    /**
     * Creates new form Passenger
     */
    public Passenger() {
        initComponents();
         this.getRootPane().setDefaultButton(insert);
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        passenger_id = new javax.swing.JLabel();
        nm = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        mobno = new javax.swing.JLabel();
        id1 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        mob1 = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        modify = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        display = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Bus Booking ");
        setBackground(new java.awt.Color(255, 204, 153));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(840, 540));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus_booking/busing.gif"))); // NOI18N
        jLabel1.setLabelFor(this);
        jLabel1.setText(" Bus Booking System");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        passenger_id.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        passenger_id.setText("Passenger_id");
        passenger_id.setName("passenger_id"); // NOI18N
        passenger_id.setOpaque(true);

        nm.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        nm.setText("Name");

        email.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        email.setText("Email_id");

        mobno.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        mobno.setText("Mobile_no");

        id1.setEditable(false);
        id1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        id1.setToolTipText("enter id");
        id1.setBorder(null);

        name1.setEditable(false);
        name1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        name1.setBorder(null);

        email1.setEditable(false);
        email1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        email1.setBorder(null);
        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });

        mob1.setEditable(false);
        mob1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        mob1.setBorder(null);

        insert.setText("Insert");
        insert.setToolTipText("Click here to insert record");
        insert.setBorder(null);
        insert.setBorderPainted(false);
        insert.setSelected(true);
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
        });
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        insert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                insertKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insertKeyPressed(evt);
            }
        });

        modify.setText("Modify");
        modify.setToolTipText("Click here to update record");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.setToolTipText("Click here to delete record");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        display.setText("Display");
        display.setToolTipText("Click here to display record");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(222, 29, 37));
        jLabel2.setText("Passenger Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(262, 262, 262))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passenger_id, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobno)
                                    .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mob1)
                                    .addComponent(id1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(name1)
                                    .addComponent(email1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(modify, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(display)
                                .addGap(26, 26, 26)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passenger_id)
                                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mob1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobno))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modify)
                    .addComponent(delete)
                    .addComponent(display)
                    .addComponent(back))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

    private void insertKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertKeyPressed

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_insertMouseClicked

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
   if(insert.getText().equals("Insert"))
   {
       id1.setEditable(true);
       name1.setEditable(true);
       email1.setEditable(true);
       mob1.setEditable(true);
       insert.setText("Save");
      
   }
   else 
   {
        try
    {
          MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("BusBooking");
        DBCollection coll = db.getCollection("Passenger");
        
         
	String P_id,name,email_id,mob_no; 	
                
        P_id = id1.getText();
        name = name1.getText();
        email_id = email1.getText();
        mob_no=mob1.getText();
       String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
       
       // int ln = mob_no.length();
      
      if(name.equals("") || P_id.equals("") || mob_no.equals("") || email_id.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill all Fields");
        } 
      else if(!email_id.matches(EMAIL_REGEX))///Email Validation
      {
       JOptionPane.showMessageDialog(null,"Please Enter Valid Id");
       email1.setText(null);
      }
      
          
       else  if((!mob_no.matches("[0-9.]"))&&(mob_no.length())!=10)
      {
          JOptionPane.showMessageDialog(null,"Please Valid mobile no");
          mob1.setText(null);
      }
       else{
      BasicDBObject doc = new BasicDBObject("Passenger_id",P_id).append("Name", name).append("Email_id",email_id).append("Mobile_no",mob_no);

          coll.insert(doc);
          //coll.find(doc);
       }
          }
     
//DBCursor myDoc = coll.find();
//System.out.println(myDoc);
         
        catch(UnknownHostException e){}
           name1.setText(null);

          id1.setText(null);
           mob1.setText(null);
           email1.setText(null);
           insert.setText("Insert");
           id1.setEditable(false);
       name1.setEditable(false);
       email1.setEditable(false);
       mob1.setEditable(false);
           
   }
    // TODO add your handling code here:
    }//GEN-LAST:event_insertActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
     
        String P_id,name,email_id,mob_no;
             
        P_id = id1.getText();
        name = name1.getText();
        email_id = email1.getText();
        mob_no=mob1.getText();

        if(name.equals("") || P_id.equals("") || mob_no.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill all Fields");
        }
        else{
            try
            {

                MongoClient mongoClient = new MongoClient("localhost", 27017);
          DB db = mongoClient.getDB("BusBooking");
          DBCollection coll = db.getCollection("Passenger");
         
                BasicDBObject doc=new BasicDBObject("_id",P_id);
               BasicDBObject query= new BasicDBObject("_id",P_id).append("Name", name).append("Email_id",email_id).append("Mobile_no",mob_no);
                coll.update(doc,query);
                JOptionPane.showMessageDialog(this, "Customer Entry modified Successful");
            }catch(Exception e){}

           name1.setText(null);

          id1.setText(null);
           mob1.setText(null);
           email1.setText(null);
            
        }
        // TODO add your handling 
       
    }//GEN-LAST:event_modifyActionPerformed

    private void insertKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_insertKeyTyped

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
     this.setVisible(false);
    new choice().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      String P_id; 
        P_id=id1.getText();
         if(P_id.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Insert Customer-Id");
        }
        else{
            try
            {

                 MongoClient mongoClient = new MongoClient("localhost", 27017);
          DB db = mongoClient.getDB("BusBooking");
          DBCollection coll = db.getCollection("Passenger");
         

                BasicDBObject doc=new BasicDBObject("_id",P_id);
                coll.remove(doc);
                JOptionPane.showMessageDialog(this, "Customer Entry Deleted Successful");
            }catch(Exception e){}

            id1.setText(null);

            name1.setText(null);
            email1.setText(null);
           mob1.setText(null);
           
        }
      
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        String P_id,name,email_id,mob_no; 
        P_id=id1.getText();
        try
        {
             MongoClient mongoClient = new MongoClient("localhost", 27017);
          DB db = mongoClient.getDB("BusBooking");
          DBCollection coll = db.getCollection("Passenger");
         

            BasicDBObject query=new BasicDBObject("_id",P_id);

            DBCursor cursor=coll.find(query);
            try
            {
                DBObject s=cursor.next();

                name=s.get("Name").toString();
                email_id=s.get("Email_id").toString();
                mob_no=s.get("Mobile_no").toString();
                

                 name1.setText(name);
                email1.setText(email_id);
                mob1.setText(mob_no);
                

            }catch(Exception e){}
        }catch(Exception e){}        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed
                                      
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
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passenger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JLabel email;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField id1;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mob1;
    private javax.swing.JLabel mobno;
    private javax.swing.JButton modify;
    private javax.swing.JTextField name1;
    private javax.swing.JLabel nm;
    private javax.swing.JLabel passenger_id;
    // End of variables declaration//GEN-END:variables
}