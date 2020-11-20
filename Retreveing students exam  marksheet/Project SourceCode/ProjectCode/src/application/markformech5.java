package application;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javafx.collections.ObservableList;
import javafx.scene.layout.Border;

public class markformech5 extends JFrame {
	private int sum=0;
	private JTextField textfield_1;
	private JLabel label_1;
	//private FlowLayout flowlayout;
	 public markformech5(ObservableList data) {
		 JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel8=new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 =new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	JPanel panel7 = new JPanel();
	
	
	label_1 = new JLabel("GOVERNMENT OF THE REPUBLIC OF THE UNION OF MYANMAR", SwingConstants.CENTER);
	
	
	JLabel label_2 = new JLabel("MINISTRY OF EDUCATION",SwingConstants.CENTER);
	
	JLabel label_3 = new JLabel("DEPARTMENT OF HIGHER EDUCATION",SwingConstants.CENTER);
	
	JLabel label_4 = new JLabel("TECHNOLOGICAL UNIVERSITY(MEIKTILA)",SwingConstants.CENTER);

	JLabel label_5 = new JLabel("Chalan No.                                                                                                                Date.             ");
	
	JLabel label_6 = new JLabel("This is to certify that");
	
	JTextField textfield = new JTextField();
	
	textfield.setBorder(null);
	
	JLabel lbRollNo = new JLabel("Roll No");
	
	textfield_1 = new JTextField();
	
	textfield_1.setBorder(null);
	
	JLabel label_7 = new JLabel("has obtained the following marks in ");

	JLabel l7 = new JLabel("the First Year Bechelor of Engineering(Civil)Examination held in January,2005.");
	
	panel1.setLayout(new GridLayout(5,0));
	panel1.add(label_1);
	panel1.add(label_2);
	panel1.add(label_3);
	panel1.add(label_4);
	panel1.add(label_5);
	//panel2.add(label_8);
	getContentPane().add(panel1,new BorderLayout().NORTH);
	
	//panel3.setLayout(new FlowLayout());
	panel3.add(label_6);
	panel3.add(textfield);
	panel3.add(lbRollNo);
	panel3.add(textfield_1);
	panel3.add(label_7);
	panel8.add(l7);
	panel4.setLayout(new GridLayout(2,0));
	panel4.add(panel3);
	panel4.add(panel8);
	JLabel sub = new JLabel("SUBJECT");
	JLabel obt = new JLabel("MARKS OBTAINED");
	panel5.add(sub);
	panel5.add(obt);		
	JLabel label_9= new JLabel("Engineering Managements");
	JLabel label_10 = new JLabel("Refrigeration & Air-Conditioning");
	JLabel label_11 = new JLabel("Gas Turbine Theory");
	JLabel label_12 = new JLabel("Internal Combustion Engines");
	JLabel label_13 = new JLabel("Fluid Mechanics II");
	JLabel label_15 = new JLabel("Vibration & Control");
	JLabel label_16 = new JLabel("Total",SwingConstants.LEFT);
	//JLabel label_17 = new JLabel("...............");
	
	JTextField myantf = new JTextField();
	//myantf.setBorder(null);
	JTextField engtf = new JTextField();
	//engtf.setBorder(null);
	engtf.setColumns(5);
	JTextField mathtf = new JTextField();
	//mathtf.setBorder(null);
	mathtf.setColumns(5);
	JTextField chemtf = new JTextField();
	//chemtf.setBorder(null);
	chemtf.setColumns(5);
	JTextField phytf = new JTextField();
	//phytf.setBorder(null);
	phytf.setColumns(5);
	JTextField drawtf = new JTextField();
	//drawtf.setBorder(null);
	drawtf.setColumns(5);
	JTextField totaltf = new JTextField();
	totaltf.setColumns(5);
	JTextField t = new JTextField();
	t.setVisible(false);
	JTextField majortf = new JTextField();
	majortf.setVisible(false);
	panel5.setLayout(new GridLayout(9,2));
	panel5.add(label_9);
	panel5.add(myantf);
	panel5.add(label_10);
	panel5.add(engtf);
	panel5.add(label_11);
	panel5.add(mathtf);
	panel5.add(label_12);
	panel5.add(chemtf);
	panel5.add(label_13);
	panel5.add(phytf);
	panel5.add(label_15);
	panel5.add(drawtf);
	panel5.add(label_16);
	panel5.add(totaltf);
	panel5.add(t);
	panel5.add(majortf);
	
	//panel2.setLayout(new GridLayout(2,0));
	panel2.add(panel4);
	panel2.add(panel5);
	
	getContentPane().add(panel2,new BorderLayout().CENTER);
	
	JLabel passfail = new JLabel("Passed/Passed with Qualified");
	JTextField tf = new JTextField();
	tf.setBorder(null);
	tf.setVisible(false);
	JLabel mtla = new JLabel("MTLA TU. SF/F.029/Rev-0/1.1.2016");
	
	JLabel sign = new JLabel("<html><center>PRINCIPAL</center><br/>TECHNOLOGICAL UNIVERSITY<br/><center> MEIKTILA</center></html>");
	panel6.setLayout(new GridLayout(2,2));
	panel6.add(passfail);
	panel6.add(tf);
	panel6.add(mtla);
	panel6.add(sign);
	//panel7.add(sign,BorderLayout.EAST);
	getContentPane().add(panel6,new BorderLayout().SOUTH);
		
		textfield.setText(data.get(1).toString());
		textfield_1.setText(data.get(0).toString());
		myantf.setText(data.get(2).toString());
		engtf.setText(data.get(3).toString());
		mathtf.setText(data.get(4).toString());
		chemtf.setText(data.get(5).toString());
		phytf.setText(data.get(6).toString());
		drawtf.setText(data.get(7).toString());
		
		
		sum+= Integer.parseInt(myantf.getText())+Integer.parseInt(engtf.getText())+Integer.parseInt(mathtf.getText())+Integer.parseInt(chemtf.getText())
		+ Integer.parseInt(phytf.getText())+Integer.parseInt(drawtf.getText());
		
		totaltf.setText(String.valueOf(sum));
		setSize(500,500);
		
		
		show();
	}
	

}
