package practice2.radioButtons;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame extends JFrame implements ActionListener{
    
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
       
        JRadioButton pizzaButton = new JRadioButton("pizza");
        JRadioButton hotdogButton = new JRadioButton("hamburger");
        JRadioButton hamburgerButton = new JRadioButton("hotdog");

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
    }
}
