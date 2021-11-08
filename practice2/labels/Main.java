package practice2.labels;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("elmo.jpg");

        JLabel label = new JLabel(); // create a label 
        label.setText("Bro do you even code?"); // set text of label 
        label.setIcon(image); 


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }   
}
