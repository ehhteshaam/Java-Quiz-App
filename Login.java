package quiz.application;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JButton rules, back;
    JTextField tfname;
            
    // Frame code
    Login(){
        getContentPane().setBackground(Color.black);
        setLayout(null); // disabling deafult layout
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiztime.png"));
        JLabel image =  new JLabel(i1);
        image.setBounds(130, 0, 1000, 500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(480, 450, 360, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(248, 228, 204));
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name :");
        name.setBounds(340, 500, 360, 45);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
        name.setForeground(new Color(248, 228, 204));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(600, 500, 360, 45);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Next");
        rules.setBounds(400, 570, 200, 40);
        rules.setBackground(new Color(143, 188, 219));
        rules.setForeground(new Color(248, 228, 204));
        rules.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Close");
        back.setBounds(610, 570, 200, 40);
        back.setBackground(new Color(143, 188, 219));
        back.setForeground(new Color(248, 228, 204));
        back.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));              
        back.addActionListener(this);
        add(back);
        
        setSize(1200,800);
        setLocation(180,40);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);            
        } else if (ae.getSource() == back){
            setVisible(false);
            
        }
    }
    
    public static void main(String[] args){
        new Login(); // Anonymous object
        
    }
}
