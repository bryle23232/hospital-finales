/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author Bryle
 */
class Information extends JFrame implements ActionListener{
   
    JLabel l0,l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JButton  btnBack;
    
    
    
    Information(){
    setResizable(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setExtendedState( JFrame.MAXIMIZED_BOTH);
    getContentPane().setBackground(new Color(255, 204, 204));
    
    
    l0 = new JLabel("HOSPITAL MANGEMENT SYSTEM");
     l0.setBounds(850, 20, 300, 50);
     l0.setFont(new Font("Rockwell", Font.BOLD, 15));
     add(l0);
    
    l1 = new JLabel("A Hospital Management System (HMS)is a software program that assists hospitals in managing patient");
     l1.setBounds(300, 300, 1000, 50);
     l1.setFont(new Font("Rockwell", Font.LAYOUT_LEFT_TO_RIGHT , 20));
     add(l1);
     
     l9 = new JLabel("information and data.");
     l9.setBounds(300, 350, 1000, 50);
     l9.setFont(new Font("Rockwell", Font.LAYOUT_LEFT_TO_RIGHT , 20));
     add(l9);
     
     
     l2 = new JLabel("These systems will aid in the interconnection of the hospital, clinics, pharmacies, and patients.");
     l2.setBounds(300,400, 1000, 50);
     l2.setFont(new Font("Rockwell", Font.LAYOUT_LEFT_TO_RIGHT, 20));
     add(l2);
     
     l7 = new JLabel("fees, and availability.");
     l7.setBounds(300,500, 1000, 50);
     l7.setFont(new Font("Rockwell", Font.LAYOUT_LEFT_TO_RIGHT, 20));
     add(l7);
     
     l3 = new JLabel("Patients can find health care professionals and book online appointments based on specialty, rating,");
     l3.setBounds(300, 450, 1000, 50);
     l3.setFont(new Font("Rockwell", Font.LAYOUT_LEFT_TO_RIGHT, 20));
     add(l3);
     
     l4 = new JLabel("These system ensures that the data processes are completed quickly and effectively.");
     l4.setBounds(300, 550, 1000, 50);
     l4.setFont(new Font("Rockwell", Font.LAYOUT_LEFT_TO_RIGHT, 20));
     add(l4);
     
      l5 = new JLabel("Hospital Management system includes registration of patients, storing their details into the system, and also computerized billing");
     l5.setBounds(300,600, 1200, 50);
     l5.setFont(new Font("Rockwell", Font.LAYOUT_LEFT_TO_RIGHT, 20));
     add(l5);
     
     l5 = new JLabel("in the pharmacy.");
     l5.setBounds(300,650, 1200, 50);
     l5.setFont(new Font("Rockwell", Font.LAYOUT_LEFT_TO_RIGHT, 20));
     add(l5);
    
     l6 = new JLabel("The software has the facility to give a unique id for every patient and stores the details of every patient and ");
     l6.setBounds(300, 700, 1000, 50);
     l6.setFont(new Font("Rockwell", Font.LAYOUT_LEFT_TO_RIGHT, 20));
     add(l6);
     
     l5 = new JLabel("and the staff automatically.");
     l5.setBounds(300,750, 1200, 50);
     l5.setFont(new Font("Rockwell", Font.LAYOUT_LEFT_TO_RIGHT, 20));
     add(l5);
     
        btnBack = new JButton("Back to Homepage");
        btnBack.setVisible(true);
        btnBack.setBounds(1550, 965, 255, 30);
        btnBack.addActionListener(this);
        add(btnBack);
    
    
}

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==btnBack){
          dispose();
            Homepage homepage = new Homepage();
            homepage.setVisible(true);
    }
}
  
    }