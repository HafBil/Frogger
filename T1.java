import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class T1{

    
    private final JFrame frame;
    private final JPanel Ba;
    private  JPanel Re;
    ST panel[]= new ST[25];
    

        public T1(){

        frame = new JFrame();
        frame.setTitle("Frogger");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




            Ba = new JPanel();
            Ba.setLayout(new GridLayout(5, 5));

                Re = new JPanel();
                Re.setLayout(new BorderLayout());
                Re.add("Center", Ba);
    

                for (int i = 0; i < 25; i++) {
                Re = new ST();
                Re.add(Ba); 
                }

               add(Re);
            }








                private void add(JPanel re2) {
            }

            public static void main(String args[]) {
                    new T1();
                }


}