
package code_fo_rfinall;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Calculator implements WindowListener,ActionListener {
    
    private Frame f;
    private Button b1,b2,b3,b4,b5;
    private Label l1,l2,l3;
    private TextField t1,t2,t3;
    
    
    public Calculator(){
        
        f = new Frame("CALCULATOR");
        
        l1 = new Label("First Number");
        l2 = new Label("Second Number");
        l3 = new Label("Result");
        
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        b5 = new Button("EXIT");
    }
    
    
    public void show(){
        
        l1.setBounds(50,100,100,20);//x axis,y axis,height,weigth
        l2.setBounds(50,140,100,20);
        l3.setBounds(50,180,100,20);
        
        t1.setBounds(200,100,100,20);
        t2.setBounds(200,140,100,20);
        t3.setBounds(200,180,100,20);
        t3.setEditable(false);
        
        b1.setBounds(50,250,50,20);
        b2.setBounds(110,250,50,20);
        b3.setBounds(170,250,50,20);
        b4.setBounds(230,250,50,20);
        b5.setBounds(290,250,50,20);
        
       
        
        
        f.add(l1);
        f.add(l2);
        f.add(l3);
        
        f.add(t1);
        f.add(t2);
        f.add(t3);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        // f.addWindowListener(this);
        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,350);
    }
    public static void main(String[] args){
        Calculator obj = new Calculator();
        obj.show();
    }
    

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
      
      int number_1 = Integer.parseInt(t1.getText());
      int number_2 = Integer.parseInt(t2.getText());
      
      if(e.getSource()==b1){
          
          t3.setText(String.valueOf(number_1+number_2));
     }
       if(e.getSource()==b2){
         
       t3.setText(String.valueOf(number_1-number_2));
      }
       if(e.getSource()==b3){
         
         t3.setText(String.valueOf(number_1*number_2));
    }
        if(e.getSource()==b4){
       
         t3.setText(String.valueOf(number_1/number_2));
      }
          if(e.getSource()==b5){
          System.exit(0);
     }
    
    }
    
}

