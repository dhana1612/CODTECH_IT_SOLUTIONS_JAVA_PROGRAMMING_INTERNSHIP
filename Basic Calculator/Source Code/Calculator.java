import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Calculator");
		f.setSize(400,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		
		JLabel lb = new JLabel("Welcome to calculator Application");
		lb.setBounds(30,30,500,25);
		lb.setForeground(new Color(252, 147, 10));
		lb.setFont(new Font("Times new Roman",Font.BOLD,25));
		lb.setVisible(true);
		f.add(lb);
		
		JLabel lb1 = new JLabel("Number_1 :");
		lb1.setBounds(100,100,100,25);
		lb1.setVisible(true);
		f.add(lb1);
		
		JTextField jt1 = new JTextField(10);
		jt1.setBounds(200,100,100,25);
		jt1.setVisible(true);
		f.add(jt1);
		
		JLabel lb2 = new JLabel("Number_2 :");
		lb2.setBounds(100,150,100,25);
		lb2.setVisible(true);
		f.add(lb2);
		
		JTextField jt2 = new JTextField(10);
		jt2.setBounds(200,150,100,25);
		jt2.setVisible(true);
		f.add(jt2);
		
		JButton jb1 = new JButton("Addition");
		jb1.setBounds(20,200,110,35);
		jb1.setVisible(true);
		f.add(jb1);
		
		JButton jb2 = new JButton("Subtraction");
		jb2.setBounds(130,200,110,35);
		jb2.setVisible(true);
		f.add(jb2);
		
		JButton jb3 = new JButton("Multiplication");
		jb3.setBounds(240,200,110,35);
		jb3.setVisible(true);
		f.add(jb3);
		
		JButton jb4 = new JButton("Division");
		jb4.setBounds(350,200,110,35);
		jb4.setVisible(true);
		f.add(jb4);
		
		JButton jb5 = new JButton("Clear");
		jb5.setBounds(380,290,70,35);
		jb5.setVisible(true);
		f.add(jb5);
		
		JLabel result = new JLabel("           ");
		result.setBounds(101,220,300,100);
		result.setForeground(Color.blue);
		result.setFont(new Font("Times New Roman",Font.BOLD,20));
		f.add(result);
		
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int n1 = Integer.parseInt(jt1.getText());
				int n2 = Integer.parseInt(jt2.getText());
				int sum = n1 + n2;
				result.setText("Addition of 2 Number : " +sum);
			}
		});
		
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int n1 = Integer.parseInt(jt1.getText());
				int n2 = Integer.parseInt(jt2.getText());
				int sub = n1 - n2;
				result.setText("Subtraction of 2 Number : " +sub);
			}
		});
		
		jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int n1 = Integer.parseInt(jt1.getText());
				int n2 = Integer.parseInt(jt2.getText());
				int mul = n1 * n2;
				result.setText("Multiplication of 2 Number : " +mul);
			}
		});
		
		jb4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int n1 = Integer.parseInt(jt1.getText());
				int n2 = Integer.parseInt(jt2.getText());
				
				if(n2 != 0){
					
						int div = n1 / n2;
				result.setText("Division of 2 Number : " +div);
				}
				else {
				result.setText("Cannot divide by zero");
				}
			}
		});
		
		jb5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jt1.setText("");
				jt2.setText("");
				result.setText("");
			}
		});
		
	}
}