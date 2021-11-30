package practice2.selectFile2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*; 
import javax.swing.JFileChooser;

public class MyFrame extends JFrame implements ActionListener {
    
    JButton button;

    MyFrame() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button) {

            JFileChooser fileChooser = new JFileChooser();

            int response = fileChooser.showOpenDialog(null); // select file to open

            if(response == 0 JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            }

        }
    } 

}
