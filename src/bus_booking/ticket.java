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
import com.mongodb.MongoException;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

/**
 *
 * @author charu
 */
public class ticket extends javax.swing.JFrame {

    /**
     * Creates new form ticket
     */
    public ticket() {
        initComponents();
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
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tno1 = new javax.swing.JTextField();
        nos1 = new javax.swing.JTextField();
        total_amt1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        book = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        bdate1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        P_id1 = new javax.swing.JComboBox();
        b_no1 = new javax.swing.JComboBox();
        pname1 = new javax.swing.JTextField();
        bname1 = new javax.swing.JTextField();
        btype1 = new javax.swing.JTextField();
        yr1 = new javax.swing.JComboBox();
        mon1 = new javax.swing.JComboBox();
        day1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bus_Booking");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus_booking/busing.gif"))); // NOI18N
        jLabel1.setText("Bus Booking System");

        back.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 102));
        back.setText("<<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Ticket Details");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Ticket no.");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("No. of Seats");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setText("Date of Journey");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("Total Amount");

        tno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tno1ActionPerformed(evt);
            }
        });

        nos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nos1ActionPerformed(evt);
            }
        });
        nos1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nos1FocusLost(evt);
            }
        });

        total_amt1.setEnabled(false);

        jLabel7.setText("Year");

        jLabel8.setText("Month");

        jLabel9.setText("Day");

        book.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        book.setForeground(new java.awt.Color(0, 0, 102));
        book.setText("Book");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setText("Booking Date");

        bdate1.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel11.setText("Passenger_id");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setText("Name");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel13.setText("Bus_no");

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel14.setText("Name");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel15.setText("Type");

        P_id1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select your ID" }));
        P_id1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                P_id1ItemStateChanged(evt);
            }
        });
        P_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_id1ActionPerformed(evt);
            }
        });

        b_no1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select bus no" }));
        b_no1.setName("b_no1"); // NOI18N
        b_no1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                b_no1ItemStateChanged(evt);
            }
        });
        b_no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_no1ActionPerformed(evt);
            }
        });

        pname1.setText("Name will appear here");
        pname1.setEnabled(false);

        bname1.setEnabled(false);

        btype1.setEnabled(false);

        yr1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2016", "2017", "2018", "2019", "2020" }));
        yr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yr1ActionPerformed(evt);
            }
        });

        mon1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        day1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "14", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(book)
                                .addGap(138, 138, 138)
                                .addComponent(back))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nos1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(total_amt1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(b_no1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(P_id1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bname1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btype1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pname1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tno1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(bdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(P_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(b_no1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btype1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(mon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(total_amt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book)
                    .addComponent(back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
this.setVisible(false); 
new choice().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void tno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tno1ActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
   try
    {
          MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("BusBooking");
        DBCollection coll = db.getCollection("Ticket");
         
       String nos,total_amt,tno,m,bdate;int f=1;
       Object yr,mon,day,P_id,bno; 
       int i;
       bdate=bdate1.getText();
       tno = tno1.getText();
       nos = nos1.getText();
       total_amt=total_amt1.getText();
       yr=yr1.getSelectedItem();
       mon=mon1.getSelectedItem();
       day=day1.getSelectedIndex();
      P_id=P_id1.getSelectedItem();
      bno=b_no1.getSelectedItem();
       System.out.println(""+yr+mon+day);
       
       Object date = yr1.getSelectedItem() + "/" + mon1.getSelectedItem()+ "/"+day1.getSelectedIndex();
        if(tno.equals("") || P_id.equals("") || bno.equals("") || nos.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Fill all Fields");
        } 
     
          Object b1=b_no1.getSelectedItem();
           
  try
        {
             MongoClient mongoClient1 = new MongoClient("localhost", 27017);
          DB db1 = mongoClient1.getDB("BusBooking");
          DBCollection coll1 = db1.getCollection("Buses");
            
            System.out.println("here "+b1);
       BasicDBObject ob=new BasicDBObject("_id",b1);
            DBCursor cursor1=coll1.find(ob);
        
          try{
         
         
        while(cursor1.hasNext()) {
        DBObject obj = cursor1.next();
        
        
  int n = Integer.parseInt(nos); 
   System.out.println("here 2 "+n);
    String maxs = obj.get("Maxseats").toString();
    int maxseat=Integer.parseInt(maxs);
    System.out.println("here 3 "+maxseat);
if(n<=maxseat)
{
   
    
        BasicDBObject doc3=new BasicDBObject("_id",b1);
        System.out.println("here 4 "+doc3);
      int mt=maxseat-n;
        System.out.println("here 5 "+mt);
                 BasicDBObject newDocument = new BasicDBObject();
	newDocument.append("$set", new BasicDBObject().append("Maxseats",mt+""));
                
               
                coll1.update(doc3,newDocument);
}
else
{
    JOptionPane.showMessageDialog(null,"Booking full"); f=0;
}
 
      
    }
        if((f!=0))
        {
         i=Integer.parseInt(tno);
      BasicDBObject doc = new BasicDBObject("_id",i).append("No_of_seats",nos).append("Total_amt",total_amt).append("Booking_date",bdate).append("Date of Journey",date);
      coll.insert(doc);
      JOptionPane.showMessageDialog(null,"Thank you For Booking!!!"+"\n"+"Happy Journey");
          }
       tno1.setText(null);
        P_id1.setSelectedItem(null);
        pname1.setText(null);
       b_no1.setSelectedItem(null);
        bname1.setText(null);
        btype1.setText(null);
          nos1.setText(null);
          total_amt1.setText(null);
         
         }catch(Exception e){} 
       
    }catch(UnknownHostException e){}
       
        
       
    }catch(UnknownHostException e){}
        catch(MongoException m){JOptionPane.showMessageDialog(null,"Same ticket no is not allowed !!");}              // TODO add your handling code here:
    }//GEN-LAST:event_bookActionPerformed
    
   
    private void yr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yr1ActionPerformed

        
// TODO add your handling code here:
    }//GEN-LAST:event_yr1ActionPerformed

    private void nos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nos1ActionPerformed
        calcAmount();
// TODO add your handling code here:
    }//GEN-LAST:event_nos1ActionPerformed

    private void P_id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_id1ActionPerformed

        
// TODO add your handling code here:
    }//GEN-LAST:event_P_id1ActionPerformed
private void calcAmount(){
    try
    {
          MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("BusBooking");
        
        DBCollection coll3 = db.getCollection("Buses");
        String b=b_no1.getSelectedItem().toString();
        int x=Integer.parseInt(b);
        
    System.out.println("b="+b);
       BasicDBObject ob2=new BasicDBObject("_id",x); 
            DBCursor cursor2=coll3.find(ob2);
       
       
      while(cursor2.hasNext()) {
     
        DBObject obj = cursor2.next();
     
        String pr = obj.get("Fare").toString();
        int prc=Integer.parseInt(pr);
        System.out.println("prc:"+prc);
    String t= nos1.getText();
  int  tn=Integer.parseInt(t);
  int amt=tn *prc;
  System.out.println("amount:"+amt);
 
 total_amt1.setText(amt+"");
      
    }
      
      cursor2.close(); 
             mongoClient.close();
    }     
        catch(UnknownHostException e){}
        catch(MongoException m){JOptionPane.showMessageDialog(null,"Same id entry not allowed !!");}
}
    private void nos1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nos1FocusLost
       
          calcAmount();

// TODO add your handling code here:
    }//GEN-LAST:event_nos1FocusLost

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
try
        {
             MongoClient mongoClient = new MongoClient("localhost", 27017);
          DB db = mongoClient.getDB("BusBooking");
          DBCollection coll = db.getCollection("Passenger");
           
           DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	   
	   Date date = new Date();
	   System.out.println(dateFormat.format(date));
           bdate1.setText(dateFormat.format(date));
          DBCursor cursor = coll.find();
          try{
         
        
        while(cursor.hasNext()) {
        DBObject obj = cursor.next();
        Object id = (Object)obj.get("_id");
        
        P_id1.addItem(id);
        
             }
       Object p=P_id1.getSelectedItem();
       System.out.println(p);
       BasicDBObject ob=new BasicDBObject("_id",p); 
            DBCursor cursor1=coll.find(ob);
       
       
      while(cursor1.hasNext()) {
        DBObject obj = cursor1.next();
       
        String name = (String)obj.get("Name");
        System.out.println(name);
       
        pname1.setText(name);
            }
             cursor.close(); 
             mongoClient.close();

          
                
            }catch(Exception e){}
            
        }catch(Exception e){}
        

        try
        {
             MongoClient mongoClient = new MongoClient("localhost", 27017);
          DB db = mongoClient.getDB("BusBooking");
          DBCollection coll = db.getCollection("Buses");
           
          DBCursor cursor = coll.find();
          try{
         
         
        while(cursor.hasNext()) {
        DBObject obj = cursor.next();
        Object id = (Object)obj.get("_id");
        String bname = (String)obj.get("Bus_name");
        String type = (String)obj.get("Type");
       
        b_no1.addItem(id);
         
             }
    

            cursor.close(); 
             mongoClient.close();

            
           
                
            }catch(Exception e){}
            
        }catch(Exception e){} 
        loadDate();
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void P_id1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_P_id1ItemStateChanged
    try
        {
             MongoClient mongoClient = new MongoClient("localhost", 27017);
          DB db = mongoClient.getDB("BusBooking");
          DBCollection coll = db.getCollection("Passenger");
         Object p=P_id1.getSelectedItem();
    System.out.println(p);
       BasicDBObject ob=new BasicDBObject("_id",p); 
            DBCursor cursor1=coll.find(ob);
       
       
      while(cursor1.hasNext()) {
        DBObject obj = cursor1.next();
       
        String name = (String)obj.get("Name");
        System.out.println(name);
       
        pname1.setText(name);
            }
             cursor1.close(); 
             mongoClient.close();

          
                
            }catch(Exception e){}
    
             
        
// TODO add your handling code here:
    }//GEN-LAST:event_P_id1ItemStateChanged

    private void b_no1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_b_no1ItemStateChanged
      
        try
        {
             MongoClient mongoClient = new MongoClient("localhost", 27017);
          DB db = mongoClient.getDB("BusBooking");
          DBCollection coll = db.getCollection("Buses");
            Object b1=b_no1.getSelectedItem();
            //System.out.println(b1);
       BasicDBObject ob=new BasicDBObject("_id",b1);
            DBCursor cursor1=coll.find(ob);
         // DBCursor cursor = coll.find();
          try{
         
         
        while(cursor1.hasNext()) {
        DBObject obj = cursor1.next();
        String id = obj.get("_id").toString();
        String bname = obj.get("Bus_name").toString();
        String type = obj.get("Type").toString();
         String maxseats = obj.get("Maxseats").toString();
        
       // b_no1.addItem(id);
         bname1.setText(bname);
         btype1.setText(type);
        // mxs.setText(maxseats);
        }
            cursor1.close(); 
             mongoClient.close();
                
            }catch(Exception e){
                System.out.println("inner catch:"+e);
            }
            
        }catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_b_no1ItemStateChanged
 private String[] getDate(){
        String y,m,d;
        y=yr1.getSelectedItem().toString();
        m=mon1.getSelectedItem().toString();
        d=day1.getSelectedItem().toString();
        
        String date[]=new String[3];
        date[0]=y;
        date[1]=m;
        date[2]=d;
        /*String date=y;
        date=date+"/";
        date=date+m;
        date=date+"/";
        date=date+d;*/
        
        return date;
    }
 private void loadDate(){
     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	   //get current date time with Date()
	   Date date = new Date();
	   System.out.println(dateFormat.format(date));
           bdate1.setText(dateFormat.format(date));
        String date1[]=getDate();
        String curre[]=new String[3];
        String current=dateFormat.format(date).toString();
        
        System.out.println(current);
        StringTokenizer tokenizer=new StringTokenizer(current,"/");
        int i=0;
        while(tokenizer.hasMoreTokens()){
            curre[i]=tokenizer.nextToken();
            i++;
        }
        
        /*yr1.addItem(curre[0]);
        mon1.addItem(curre[1]);
        day1.addItem(curre[2]);*/
        System.out.println("i="+i+"curre[2]="+curre[2]);
        yr1.setSelectedItem(curre[0]);
        mon1.setSelectedItem(curre[1]);
        day1.setSelectedItem(curre[2]);
 }
    private void day1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day1ActionPerformed

        
        
// TODO add your handling code here:
    }//GEN-LAST:event_day1ActionPerformed

    private void b_no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_no1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_no1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox P_id1;
    private javax.swing.JComboBox b_no1;
    private javax.swing.JButton back;
    private javax.swing.JTextField bdate1;
    private javax.swing.JTextField bname1;
    private javax.swing.JButton book;
    private javax.swing.JTextField btype1;
    private javax.swing.JComboBox day1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox mon1;
    private javax.swing.JTextField nos1;
    private javax.swing.JTextField pname1;
    private javax.swing.JTextField tno1;
    private javax.swing.JTextField total_amt1;
    private javax.swing.JComboBox yr1;
    // End of variables declaration//GEN-END:variables
}
