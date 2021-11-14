package practice2.progressbar;
import java.awt.*;
import javax.swing.*;




public class progressbarDemo {
    
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,500);

    progressbarDemo() {

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(new Color(255,0,0));
        bar.setBackground(new Color(255,255,255));

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 0;

        while (counter <= 100) {

            bar.setValue(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter += 10;
        }
        bar.setString("Done! :)");
    }
}
