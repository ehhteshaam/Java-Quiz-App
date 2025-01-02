package quiz.application;

import java.awt.*; // imports the color, font features
import javax.swing.*; // used to develop graphical user interface desktop based application
import java.awt.event.*; // used for actionlistener ( means enables the functionality of button,etc`

public class Score extends JFrame implements ActionListener {
    
    JLabel heading,scorel;
    JButton submit,close;
    
    Score(String name, int score) {
        getContentPane().setBackground(new Color(0, 15, 30));
        setBounds(300, 100, 900, 600);
        setLayout(null);
       
        heading = new JLabel("Thank you "+ name + " for playing Simple Minds");
        heading.setBounds(35, 30, 800, 50);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 40));
        heading.setForeground(new Color(248, 228, 204));
        add(heading);
        
        scorel = new JLabel("Your Score is "+ score + "/100");
        scorel.setBounds(350, 200, 300, 30);
        scorel.setFont(new Font("Tahoma", Font.BOLD, 24));
        scorel.setForeground(new Color(248, 228, 204));
        add(scorel);
        
        submit = new JButton("PLAY AGAIN");
        submit.setBounds(350, 250, 185, 40);
        submit.setFont(new Font("Times New Roman", Font.BOLD, 22));
        submit.setForeground(Color.black);
        submit.addActionListener(this);
        add(submit);
        
        close = new JButton("CLOSE");
        close.setBounds(350, 300, 185, 40);
        close.setFont(new Font("Times New Roman", Font.BOLD, 22));
        close.setForeground(Color.black);
        close.addActionListener(this);
        add(close);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == submit){
            setVisible(false);
            new Login();
        } else if (ae.getSource() == close) {
            setVisible(false); 
        }
    }
    
    public static void main(String args[]){
        new Score("User", 0);
    }
}
