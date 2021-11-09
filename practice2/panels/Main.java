package practice2.panels;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // JPanel = a GUI component that fucntions as a contatiner to hold other components 
        ImageIcon icon = new ImageIcon("elmo.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0, 0, 75, 75);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(0,255,0));
        greenPanel.setBounds(0,0,250,250);
        greenPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(0,0,255));
        bluePanel.setBounds(250,0,250,250);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(new Color(255,0,0));
        redPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(greenPanel);
        frame.add(bluePanel);
        frame.add(redPanel);


    }
}
