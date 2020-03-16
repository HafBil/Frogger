import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Square0 extends JButton implements ActionListener{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon X;
	byte value=0;
	/*
	0:nothing
	1:X
	2:O
	*/
	
	public Square0(){
		X=new ImageIcon(this.getClass().getResource("water.png"));
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		value++;
		value%=5;
		switch(value){
				case 1:
				setIcon(X);
				break;
		}
	}
}