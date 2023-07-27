/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;



import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;




/**
 *
 * @author bryle
 */

class Patient extends JFrame implements ActionListener{
    
    
  
    JTextField t3, t4, t5, t6, t7, t8, t9;
    JComboBox cb1, cb2, cb3;
    JTextField c3, c4, c5, c6, c7, c8, c9, c10, c11;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JButton btnConfirm, btnClear, btnBack;
    
                    
   
   

  Patient(){
    setResizable(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setExtendedState( JFrame.MAXIMIZED_BOTH);
    
    getContentPane().setBackground(new Color(255, 204, 204));
    
    
                
    
  
    
    
     l1 = new JLabel("HOSPITAL MANGEMENT SYSTEM");
     l1.setBounds(850, 20, 300, 50);
     l1.setFont(new Font("Rockwell", Font.BOLD, 15));
     add(l1);
     
     t3 = new JTextField ();
     t3.setBounds(180, 130, 300, 30);
     add(t3);
             
             
     l2 = new JLabel("Patient ID:");
     l2.setBounds(20, 20, 200, 250);
     l2.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l2);
     
     
      l3 = new JLabel("Patient name:");
     l3.setBounds(20, 20, 200, 450);
     l3.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l3);
     
     t5 = new JTextField ();
     t5.setBounds(180, 230, 300, 30);
     add(t5);
     
     l4 = new JLabel("Contact No:");
     l4.setBounds(20, 20, 200, 650);
     l4.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l4);
     
      t6 = new JTextField ();
     t6.setBounds(180, 335, 300, 30);
     add(t6);
     
     l5 = new JLabel("Doctor's name:");
     l5.setBounds(20, 20, 200, 850);
     l5.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l5);
     
     
     l6 = new JLabel("Age:");
     l6.setBounds(20, 20, 200, 1050);
     l6.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l6);
     
     t8 = new JTextField ();
     t8.setBounds(180, 535, 300, 30);
     add(t8);
     
  
     l7 = new JLabel("Gender:");
     l7.setBounds(20, 20, 200, 1250);
     l7.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l7);
     
     t9 = new JTextField ();
     t9.setBounds(180, 735, 300, 30);
     add(t9);
     
     
     l8 = new JLabel("Address:");
     l8.setBounds(20, 20, 200, 1450);
     l8.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l8);
     
     c3 = new JTextField ();
     c3.setBounds(180, 835, 300, 30);
     add(c3);
     
     
     
      l8 = new JLabel("Date of Birth:");
     l8.setBounds(20, 20, 200, 1650);
     l8.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l8);
     
     c4 = new JTextField ();
     c4.setBounds(180, 930, 300, 30);
     add(c4);
   
     
     l8 = new JLabel("Blood Group:");
     l8.setBounds(20, 20, 200, 1850);
     l8.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l8);
     
     
     
     l1 = new JLabel("Name of Tablets:");
     l1.setBounds(950,20,200,250);
     l1.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l1);
     
     c6 = new JTextField ();
     c6.setBounds(1143, 225, 300, 30);
     add(c6);
     
     l2 = new JLabel("Dose(mg):");
     l2.setBounds(950,20,200,450);
     l2.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l2);
     
     c7 = new JTextField ();
     c7.setBounds(1143, 330, 300, 30);
     add(c7);
     
     l3 = new JLabel("Number of Tablets:");
     l3.setBounds(950,20,200,650);
     l3.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l3);
     
      c8 = new JTextField ();
     c8.setBounds(1143, 430, 300, 30);
     add(c8);
     
     l4 = new JLabel("Issued Date:");
     l4.setBounds(950,20,200,850);
     l4.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l4);
     
     c9 = new JTextField ();
     c9.setBounds(1143, 530, 300, 30);
     add(c9);
     
     l5 = new JLabel("Exp Date:");
     l5.setBounds(950,20,200,1050);
     l5.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l5);
     
     c10 = new JTextField ();
     c10.setBounds(1143, 630, 300, 30);
     add(c10);
     
     l6 = new JLabel("Daily Dose:");
     l6.setBounds(950,20,200,1250);
     l6.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l6);
     
     btnConfirm = new JButton ("Confirm");
     btnConfirm.setVisible(true);
     btnConfirm.setBounds(1000, 965, 250, 30);
     btnConfirm.addActionListener(this);
     add(btnConfirm);
     
     btnClear = new JButton ("Clear");
     btnClear.setVisible(true);
     btnClear.setBounds(1275, 965, 250, 30);
      btnClear.addActionListener(this);
     add(btnClear);
     
     btnBack = new JButton("Back to Homepage");
        btnBack.setVisible(true);
        btnBack.setBounds(1550, 965, 255, 30);
        btnBack.addActionListener(this);
        add(btnBack);
     
     
     
     String[] Gender = {"None","Male","Female","Others"};
     cb1 = new JComboBox(Gender); 
     cb1.setBounds(180, 635, 300, 30);
     add(cb1);
     
     String[] Name = {"None","Metformin","Neozep","Losartan", "Antibiotic", "Mefanamic", "Albuterol", "Antihistamines", "Biogesic", "Gabapentin", "Omeprazole"};
     cb2 = new JComboBox(Name); 
     cb2.setBounds(1143, 130, 300, 30);
     add(cb2); 
     
     String[] Doctor = {"None","Dr. Bryle Molina","Dr. Prince Figueroa","Dr. Nathaniel Daelo", "Dr. Johnny Sins"};
     cb3 = new JComboBox(Doctor); 
     cb3.setBounds(180, 435, 300, 30);
     add(cb3); 
  
    
  

  }

  
    public void actionPerformed(ActionEvent ae) {
        
        String patientid = t3.getText();
        String patientname = t5.getText();
        String contactno = t6.getText();
        String doctorsname = cb3.getSelectedItem().toString();
        String age = t8.getText();
        String gender = cb1.getSelectedItem().toString();
        String address = t9.getText();
        String dateofbirth = c3.getText();
        String bloodgroup = c4.getText();
        String nameoftablets = cb2.getSelectedItem().toString();
        String dose = c6.getText();
        String numberoftablets = c7.getText();
        String issueddate = c8.getText();
        String expdate = c9.getText();
        String dailydose = c10.getText();
        
        
       if(ae.getSource()==btnClear){
           
   
        t3.setText("");
        t5.setText("");
        t6.setText("");
        t8.setText("");
        t9.setText("");
        c3.setText("");
        c4.setText("");
        c6.setText("");
        c7.setText("");
        c8.setText("");
        c9.setText("");
        c10.setText("");
        
        cb1.setSelectedIndex(0);
        cb2.setSelectedIndex(0);
        cb3.setSelectedIndex(0);
        
        t3.requestFocus();
        
        } else if (ae.getSource() == btnConfirm) {
          try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "1234");
            String query = "INSERT INTO patientrecord (patientid, patientname, contactno, doctorsname, age, gender, address, dateofbirth, bloodgroup, nameoftablets, dose, numberoftablets, issueddate, expdate, dailydose) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, patientid);
            preparedStatement.setString(2, patientname);
            preparedStatement.setString(3, contactno);
            preparedStatement.setString(4, doctorsname);
            preparedStatement.setString(5, age);
            preparedStatement.setString(6, gender);
            preparedStatement.setString(7, address);
            preparedStatement.setString(8, dateofbirth);
            preparedStatement.setString(9, bloodgroup);
            preparedStatement.setString(10, nameoftablets);
            preparedStatement.setString(11, dose);
            preparedStatement.setString(12, numberoftablets);
            preparedStatement.setString(13, issueddate);
            preparedStatement.setString(14, expdate);
            preparedStatement.setString(15, dailydose);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Patient Data added successfully!");
        t3.setText("");
        t5.setText("");
        t6.setText("");
        t8.setText("");
        t9.setText("");
        c3.setText("");
        c4.setText("");
        c6.setText("");
        c7.setText("");
        c8.setText("");
        c9.setText("");
        c10.setText("");
        
        cb1.setSelectedIndex(0);
        cb2.setSelectedIndex(0);
        cb3.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add data.");
            }

            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }

        } else if (ae.getSource() == btnBack) {
            dispose();
            Homepage homepage = new Homepage();
            homepage.setVisible(true);
        }
    }
}