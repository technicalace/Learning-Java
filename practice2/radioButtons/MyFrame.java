package practice2.radioButtons;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame extends JFrame implements ActionListener{
    
    JRadioButton pizzaButton; 
    JRadioButton hotdogButton;
    JRadioButton hamburgerButton;

    ImageIcon pizzaIcon;
    ImageIcon hamburgIcon;
    ImageIcon hotdogIcon;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIcon = new ImageIcon("");
        hamburgIcon = new ImageIcon("");
        hotdogIcon = new ImageIcon("");
       
        pizzaButton = new JRadioButton("pizza");
        hotdogButton = new JRadioButton("hamburger");
        hamburgerButton = new JRadioButton("hotdog");

        pizzaButton.setIcon(pizzaIcon);
        hamburgIcon.setIcon(hamburgIcon);
        hotdogButton.setIcon(hotdogIcon);


        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);



        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getSource()==pizzaButton) {
            System.out.println("You ordered pizza!");
        }
        else if (e.getSource()==hamburgerButton) {
            System.out.println("You ordered a hamburger!");
        }
        else if (e.getSource()==hotdogButton) {
            System.out.println("You ordered a hotdog!");
        }
    }
}
