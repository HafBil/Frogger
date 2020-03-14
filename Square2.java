package Square2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Square2 implements ActionListener
{
    private final JPanel numericPanel;
    private final JFrame frame;
    private final JPanel panel;
    
    private final JButton[] numericKeypad = new JButton[25];

    public Square2() {
        frame = new JFrame();
        frame.setTitle("Frogger");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        numericPanel = new JPanel();
        numericPanel.setLayout(new GridLayout(5, 5));

        for (int i = 1; i < 25; i++) {
            numericKeypad[i] = new JButton("" + i);
            numericPanel.add(numericKeypad[i]);
        }

        

        numericKeypad[0] = new JButton("25");
        numericPanel.add(numericKeypad[0]);
        

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
//create phone: buttons, layout, text field