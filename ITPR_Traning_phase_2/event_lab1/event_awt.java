package event_lab1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class event_awt implements ActionListener{

	JFrame jf;
	JButton jb;
	JLabel jl;
	int count=0;
	
	
	public event_awt() {
		 jf=new JFrame();
		jf.setSize(500, 500);
		jf.setLayout(null);
		
		 jb=new JButton("Click Me");
		jb.setBounds(100, 100, 100, 50);
		jb.addActionListener(this);
		
		
		 jl=new JLabel();
		jl.setBounds(250, 100, 100, 50); 
		 
		jf.add(jl);
		jf.add(jb);
		
	    jf.setVisible(true);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public static void main(String[] args) {
		event_awt e=new event_awt();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		jl.setText("Count: "+count);
	}

}
