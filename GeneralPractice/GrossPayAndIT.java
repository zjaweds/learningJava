import javax.swing.*;
import java.awt.event.*;

class SwingDemo implements ActionListener{
	JLabel label1, label2,label3;
	JTextField tf1, tf2, tf3;
	JButton b1, b2;
	SwingDemo(){
		JFrame f=new JFrame("Our Own Calculator");
		label1=new JLabel("First value");
		label1.setBounds(50,20, 100, 20);
		label2=new JLabel("Second value");
		label2.setBounds(50,70,100,20);
		label3=new JLabel("Result");
		label3.setBounds(50,120,100,20);
		tf1=new JTextField();
		tf1.setBounds(150,20,200,20);
		
		tf2=new JTextField();
		tf2.setBounds(150,70,200,20);
		
		tf3=new JTextField();
		tf3.setBounds(150,120,200,20);
		tf3.setEditable(false);
		
		b1=new JButton(" + ");
		b1.setBounds(100,150,80,40);
		b2=new JButton(" - ");
		b2.setBounds(200,150,80,40);
		
		//Registring listeners
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		//adding labels, textfields and buttons to frame 
		f.add(label1); 
		f.add(label2); f.add(label3);
		f.add(tf1); f.add(tf2); f.add(tf3); f.add(b1); 
		f.add(b2); f.setSize(450, 300); 
		f.setLayout(null); 
		f.setVisible(true); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		float a=Float.parseFloat(tf1.getText()); 
		float b=Float.parseFloat(tf2.getText()); 
		float c=0; 
		if(e.getSource()==b1) 
			c=a+b; 
		else if(e.getSource()==b2) 
			c=a-b; 
		
		tf3.setText(Float.toString(c)); 
		}
		
	public static void main(String args[])
	{
		new SwingDemo();
	}
}