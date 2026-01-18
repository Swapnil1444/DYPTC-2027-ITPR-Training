import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class window implements ActionListener{
	private JButton jb,jb1;
	private JTextField jt;
	public window() {
		
		JFrame jf=new JFrame();
		jf.setSize(500, 500);
		jf.setLayout(null);
		
		JLabel jl=new JLabel("Enter num:");
		jl.setBounds(200, 100,100, 50);
		jf.add(jl);
		
		 jt=new JTextField();
		jt.setBounds(190,150,100,30);
		jf.add(jt);
		
		 jb=new JButton("Click");
		jb.setBounds(210, 200, 70, 30);
	    jb.addActionListener(this);
		jf.add(jb);
		
		 
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	

	public static void main(String[] args) {

	window s=new window();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	   String a=jt.getText();
	   int num=Integer.parseInt(a);
	   System.out.println(num+10);
	}

}
