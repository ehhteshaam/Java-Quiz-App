package quiz.application;

import javax.swing.*;
import java.awt.*; //color package
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    
    String name;
    JButton back,start;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(248, 228, 204));
        setLayout(null);
               
        JLabel heading = new JLabel("Welcome "+name+" to Simple Minds");
        heading.setBounds(20, 10, 700, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        add(heading);
        
        JLabel head2 = new JLabel("RULES");
        head2.setBounds(20, 50, 150, 45);
        head2.setFont(new Font("Mongolian Baiti", Font.BOLD, 25));
        add(head2);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 100, 700, 355);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>");
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(0, 0, 0));
        back.setForeground(new Color(248, 228, 204));
        back.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));              
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(0, 0, 0));
        start.setForeground(new Color(248, 228, 204));
        start.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(300, 150);
        setVisible(true);
              
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
            
        }else if (ae.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("User");
    }
}
