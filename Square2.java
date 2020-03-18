import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Square2 implements ActionListener 
{
    private final JPanel numericPanel;
    private final JFrame frame;
    ImageIcon Waterimage = new ImageIcon("Water.png");
    ImageIcon Lilypad = new ImageIcon("Lilypad.png");
    ImageIcon GreenFrog = new ImageIcon("GreenFrog.png");
    ImageIcon RedFrog = new ImageIcon("RedFrog.png");
    private final Pad[] numericKeypad = new Pad[25];
    private ImageIcon[] level1 = {Lilypad, Waterimage, Lilypad, Waterimage, Lilypad, Waterimage, GreenFrog, Waterimage, GreenFrog, Waterimage, Lilypad, Waterimage, GreenFrog, Waterimage, Lilypad, Waterimage, Lilypad, Waterimage, Lilypad, Waterimage, GreenFrog, Waterimage, RedFrog, Waterimage, GreenFrog};
    
//rename classes, board 3 main class
//square 2 board class
//Pad= square

    public Square2() {
        frame = new JFrame();
        frame.setTitle("Frogger");
        frame.setSize(760, 760);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        numericPanel = new JPanel();
        numericPanel.setLayout(new GridLayout(5, 5));
        
    
        

        /*for (int i = 0; i < 25; i++) {
            numericKeypad[i] = new JButton();

            numericKeypad[i].setContentAreaFilled(false);

            numericPanel.add(numericKeypad[i]);
            numericKeypad[i].setIcon(Waterimage);
            numericPanel.setSize(400,400);
            
            
        }
        */
        for (int i = 0; i < 25; i++) {
            numericKeypad[i] = new Pad();


            numericPanel.add(numericKeypad[i].getButton());
            numericKeypad[i].getButton().setIcon(level1[i]);
            numericPanel.setSize(400,400);
            
            
        }
       
       
        frame.add(numericPanel);
        
        

        for (int i = 0; i < 25; i++)

            numericKeypad[i].getButton().addActionListener(this);
        
        frame.setContentPane(numericPanel);
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
        System.out.println("Square " +b);
        

    }

}