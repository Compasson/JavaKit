package awt_demo;

import java.awt.Frame;
import java.awt.Window;

import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAWTFrame extends Frame {

	private static final long serialVersionUID = 1L;
	private JButton MyButton = null;
	private Button exitButton = null;
	
	private int counter = 0;

	/**
	 * This method initializes MyButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getMyButton() {
		if (MyButton == null) {
			MyButton = new JButton();
			MyButton.setPreferredSize(new Dimension(34, 20));
			MyButton.setText("<html><b>Swing</b> <font color=red><i>Button</i></font>");
			
			MyButton.addActionListener(
					e -> MyButton.setText("Swing Button : "+String.valueOf(++counter))
			);
			
			
			//MyButton.addActionListener(this::MyButtonAction);
		}
		return MyButton;
	}
	
	private void MyButtonAction(java.awt.event.ActionEvent e)
	{
		counter++;
		MyButton.setText("Swing Button : "+String.valueOf(counter));
	}

	/**
	 * This method initializes exitButton	
	 * 	
	 * @return java.awt.Button	
	 */
	private Button getExitButton() {
		if (exitButton == null) {
			exitButton = new Button();
			exitButton.setLabel("Exit");
			exitButton.addActionListener(e->{
				System.exit(0);
				//exitButton.setLabel(String.format("Counter : %d",
				//		++counter));
			}
			);
		}
		return exitButton;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(()->{
			MyAWTFrame frame = new MyAWTFrame(null);
			frame.setVisible(true);
		});
	}

	/**
	 * @param owner
	 */
	public MyAWTFrame(Frame owner) {
		super();
		initialize();
		this.setResizable(false);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.add(getMyButton(), BorderLayout.NORTH);
		this.add(getExitButton(), BorderLayout.SOUTH);
	}
	@Override
	public boolean handleEvent(java.awt.Event evt)
	  {
	    if(evt.id == java.awt.Event.WINDOW_DESTROY)
	    {
	      setVisible(false);
	      System.exit(0);
	      return true;
	    }
	    else
	      return super.handleEvent(evt);
	  }
	
}
