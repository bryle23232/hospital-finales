package hospital.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



/**
 *
 * @author bryle
 */



    
public class Login extends JFrame implements ActionListener{
    
     private static final String username = "root";
     private static final String password = "1234";
     private static final String dataConn = "jdbc:mysql://localhost:3306/login";

     Connection sqlConn = null;
     PreparedStatement pst = null;
     ResultSet rs = null;
    
    JTextField t1, t2;
    JButton b1;
    JLabel l1, l2, l3, l4;
    
    Login(){
        setLayout(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState( JFrame.MAXIMIZED_BOTH);
        
         getContentPane().setBackground(new Color(240, 247, 255));
        
        
          l1 = new JLabel("Login");
        l1.setFont(new Font("Rockwell", Font.BOLD, 25));
        l1.setForeground(Color.black);
        l1.setBounds(950, 10, 900, 30);
        add(l1);
        
        l2 = new JLabel("");
        l2.setBounds(890, 400, 300, 30);
        add(l2);
        
        l3 = new JLabel ("Username: ");
        l3.setBounds(647, 450, 200, 30);
        l3.setFont(new Font("Rockwell", Font.BOLD, 20));
        add(l3);
        
        l4 = new JLabel ("Password: ");
        l4.setBounds(650, 550, 200, 30);
        l4.setFont(new Font("Rockwell", Font.BOLD, 20));
        add(l4);
        
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        b1.addActionListener(this);
        
        
        t1.setBounds(755, 450, 500, 30);               
        t2.setBounds(755, 550, 500, 30);
        b1.setBounds(850, 680, 250, 30);
        
        
        add(t1);
        add(t2);
        add(b1);

   
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String username = t1.getText();
        String password = t2.getText();
        
        
        
        if(e.getSource()== b1){
            try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "1234");

          
            String query = "SELECT * FROM login WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);


            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Good");
                JOptionPane.showMessageDialog(this, "Successfully logged in!");
                dispose();
                Homepage hp = new Homepage();
                hp.setVisible(true);
            } else {
       
                JOptionPane.showMessageDialog(this, "Your username or password is Invalid!");
            }


            resultSet.close();
            statement.close();
            conn.close();

        } catch (Exception ex) {
      
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred during login.");
        }
    
        }
    
        }
        
    }

   




        
        
                    
               
        
               