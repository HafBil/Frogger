import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class Board1 extends JFrame{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JPanel p = new JPanel();
	Square0 buttons[]=new Square0[25];
	
	public static void main(String args[]){
		new Board1();
	}
	
	public Board1(){
		super("Board1");
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(5,5));
		for(int i=0;i<25;i++){
			buttons[i]=new Square0();
			p.add(buttons[i]);
		}
		add(p);
		
		setVisible(true);
	}
}