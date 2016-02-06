package calculator;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class calcWindow extends Frame implements ActionListener	{
	   Button Btn1=new Button("Sum");
       Button Btn2=new Button("Subtract");
       Button Btn3=new Button("Multiply");
       Button Btn4=new Button("Divide");
       Label lbl1=new Label("Number 1: ");
       Label lbl2=new Label("Number 2: ");
       Label lbl3=new Label("Result: ");
       TextField txt1=new TextField(20);
       TextField txt2=new TextField(20);
       TextField txt3=new TextField(20);
       
       public calcWindow() {
    	   super("Calculator");
           setLayout(null);
           lbl1.setBounds(20,50,75,25);
           add(lbl1);
           lbl2.setBounds(20,100,75,25);
           add(lbl2);
           lbl3.setBounds(20,150,75,25);
           add(lbl3);
           txt1.setBounds(150,50,100,25);
           add(txt1);
           txt2.setBounds(150,100,100,25);
           add(txt2);
           txt3.setBounds(150,150,100,25);
           add(txt3);
           Btn1.setBounds(20,200,80,25);
           add(Btn1);
           Btn2.setBounds(100,200,80,25);
           add(Btn2);
           Btn3.setBounds(180,200,80,25);
           add(Btn3);
           Btn4.setBounds(260,200,80,25);
           add(Btn4);
           Btn1.addActionListener(this);
           Btn2.addActionListener(this);
           Btn3.addActionListener(this);
           Btn4.addActionListener(this);
           
           //exit window
           addWindowListener(new WindowAdapter() {
               public void windowClosing(WindowEvent e) {
              		System.exit(0);
                    }
           		}
        	   );
       }
       
       public void actionPerformed(ActionEvent AE) {
            if(AE.getSource()==Btn1) {
            	sum();
            }
            else if(AE.getSource()==Btn2){
                subt();
            }
            else if(AE.getSource()==Btn3){
                mult();
            }
            else if(AE.getSource()==Btn4){
                div();
            }
       }
       
       public void sum(){
            float i=Float.parseFloat(txt1.getText());
            float j=Float.parseFloat(txt2.getText());
            float val;
          
            val=operations.add(i, j);
            txt3.setText(""+val);
            }
       
       public void subt() {
           	float i=Float.parseFloat(txt1.getText());
           	float j=Float.parseFloat(txt2.getText());
           	float val;
	        
            val=operations.subt(i, j);;
            txt3.setText(""+val);
            }
       
       public void mult(){
          	float i=Float.parseFloat(txt1.getText());
          	float j=Float.parseFloat(txt2.getText());
          	float val;
            
            val=operations.mult(i, j);;
            txt3.setText(""+val);
        	}
       
        public void div(){
           	float i=Float.parseFloat(txt1.getText());
           	float j=Float.parseFloat(txt2.getText());
           	float val;
            
            val=operations.div(i, j);
            txt3.setText(""+val);
        }
        
        public static void main(String args[]){
        	calcWindow calcInterface=new calcWindow();
            calcInterface.setVisible(true);
            calcInterface.setSize(375,250);
        };
} 