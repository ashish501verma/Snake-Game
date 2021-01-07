package Snake.Game;

import javax.swing.JFrame;

public class Snake extends JFrame  {

	Snake(){
	add(new Board());	
	pack();
	setLocationRelativeTo(null); // for set the location also we can use setLocation(x,y);
	setTitle("Snake Game");
	setResizable(false);
	
	}
	
	public static void main(String []args) {
		new Snake().setVisible(true);
	}
	
	
	
}
