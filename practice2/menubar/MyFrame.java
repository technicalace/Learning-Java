package practice2.menubar;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame extends JFrame implements ActionListener{
    
    JMenuBar menuBar;
    JMenu fileMenu; 
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon fileIcon;
    ImageIcon editIcon;
    ImageIcon helpIcon;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("");
        saveIcon = new ImageIcon("");
        exitIcon = new ImageIcon("");

        menuBar = new JMenuBar();
        
        fileMenu = new JMenu("File");
        editMenu = new JMenu("edit");
        helpMenu = new JMenu("help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadIcon.setIcon(loadIcon);
        saveIcon.setIcon(saveIcon);
        exitIcon.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for load
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E load
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H load
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for load
        exitItem.setMnemonic(KeyEvent.VK_E); // e for load
        
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        
        this.setJMenuBar(menuBar);
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource()==loadItem) {
            System.out.println("Ahhhhhhhh file loaded");
        }
        if (e.getSource()==saveItem) {
            System.out.println("Ahhhhh file saved");
        }
        if (e.getSource()==exitItem) {
            System.exit(0);
        }
    }

}
