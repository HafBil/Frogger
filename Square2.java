package Square2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.swing.border.Border;

public class Square2 extends JFrame implements ActionListener 
{
    private final JPanel numericPanel;
    private final JFrame frame;
    private final JPanel panel;
    ImageIcon image = new ImageIcon("Water.png");
    private final JButton[] numericKeypad = new JButton[25];

    
//getscaled imageicon

    public Square2() {
        frame = new JFrame();
        frame.setTitle("Frogger");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        numericPanel = new JPanel();
        numericPanel.setLayout(new GridLayout(5, 5));
        
    
        

        for (int i = 0; i < 25; i++) {
            numericKeypad[i] = new JButton("" + i);

            numericKeypad[i].setContentAreaFilled(false);

            numericPanel.add(numericKeypad[i]);
            numericKeypad[i].setIcon(image);

        }
       
       
        add(numericPanel);
        setVisible(true);

        
        numericKeypad[0] = new JButton("25");
        
        

        for (int i = 0; i < 25; i++)
            numericKeypad[i].addActionListener(this);

        

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add("Center", numericPanel);

        frame.setContentPane(panel);
        frame.setVisible(true);

    }

    public void actionPerformed(final ActionEvent e)
    { 
       
        
        int b =0;

        for (int i = 0; i< numericKeypad.length; i++)
        {
            if(e.getSource() == numericKeypad[i])
                b = i;
        }
        System.out.println(b);
        

    }

}