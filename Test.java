import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Test
    {



private final JPanel SQs;
private final JFrame frame;
private JPanel panel;

public Test() {
    frame = new JFrame();
    frame.setTitle("Frogger");
    frame.setSize(1000, 1000);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    SQs = new JPanel();
    SQs.setLayout(new GridLayout(5, 5));


    panel.setLayout(new BorderLayout());

        panel.add("Center", SQs);

        frame.setContentPane(panel);
        frame.setVisible(true); 

    for (int i = 1; i < 25; i++) {
        panel = new JPanel();
        panel.add(SQs);} 
    }





public static void main (String[] Args) {
    Test c = new Test();
}
}