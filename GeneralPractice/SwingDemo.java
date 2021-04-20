import javax.swing.*;
import java.awt.event.*;

class SwingDemo implements ActionListener{
	JLabel label1, label2,label3, label4, label5,label6;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6;
	JButton b1, b2;
	SwingDemo(){
		JFrame f=new JFrame("Financial Data Calculator");
		label1=new JLabel("Basic Salary");
		label1.setBounds(50,20, 100, 20);

        tf1=new JTextField();
		tf1.setBounds(150,20,200,20);

		label2=new JLabel("HRA");
		label2.setBounds(50,70,100,20);
        
        tf2=new JTextField();
		tf2.setBounds(150,70,200,20);
		tf2.setEditable(false);

        label3=new JLabel("DA");
		label3.setBounds(50,120,100,20);
        
        tf3=new JTextField();
		tf3.setBounds(150,120,200,20);
		tf3.setEditable(false);

        label4=new JLabel("TA");
		label4.setBounds(50,170,100,20);
        
        tf4=new JTextField();
		tf4.setBounds(150,170,200,20);
		tf4.setEditable(false);

        label5=new JLabel("IT");
		label5.setBounds(50,220,100,20);
        
        tf5=new JTextField();
		tf5.setBounds(150,220,200,20);
		tf5.setEditable(false);

        label6=new JLabel("Net Salary");
		label6.setBounds(50,270,100,20);
		
        tf6=new JTextField();
		tf6.setBounds(150,270,200,20);
		tf6.setEditable(false);
		
		b1=new JButton(" Calculate Tax ");
		b1.setBounds(60,320,160,40);
		b2=new JButton(" Calculate Other Data ");
		b2.setBounds(250,320,160,40);
		
		//Registring listeners
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		//adding labels, textfields and buttons to frame 
		f.add(label1); 
		f.add(label2); 
        f.add(label3);
        f.add(label4); 
		f.add(label5); 
        f.add(label6);
		f.add(tf1);
        f.add(tf2); 
        f.add(tf3);
        f.add(tf4);
        f.add(tf5); 
        f.add(tf6); 
        f.add(b1); 
		f.add(b2); 
        f.setSize(450, 700); 
		f.setLayout(null); 
		f.setVisible(true); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		float a=Float.parseFloat(tf1.getText()); 
		// float b=Float.parseFloat(tf2.getText()); 
		float c=0;
        float hra, da, ta, it, ns;
        hra=da=ta=it=ns=0; 
		if(e.getSource()==b1) 
			if(a<500000)
                it=0;
            else if(a>=500000 && a<750000){
                it= ((a-500000)*10)/100;
            }
            else if(a>=750000 && a<1000000){
                it= 2500*10;
            } 
		else if(e.getSource()==b2) 
			c=a; 
		
		tf5.setText(Float.toString(it)); 
		}
		
	public static void main(String args[])
	{
		new SwingDemo();
	}
}