
package code_fo_rfinall;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Question_1a implements ActionListener,WindowListener {
    
    private Frame frame;
    private Button b1,b2;
    private TextField tf;
    private TextArea ta;
    
    
    public Question_1a(){
        frame = new Frame("Test Code");
        
        b1 = new Button("Read");
        b2 = new Button("Clear");
        
        tf = new TextField(50);
        ta = new TextArea();
        ta.setEnabled(false);
        ta.setFocusable(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        frame.addWindowListener(this);
        frame.setLayout(new FlowLayout());
        frame.add(tf);
        //frame.setLayout(new FlowLayout());
        frame.add(b1);
        frame.add(b2);
        frame.add(ta);
        frame.setSize(500,500);
        frame.setVisible(true);
        
        
        
        
        
    }
    
    public static void main(String[] args){
        
        Question_1a obj = new Question_1a();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1){
            
            String s = tf.getText();
            ta.setText(s);
        }
        
        if(e.getSource()==b2){
            
            String s = " ";
            ta.setText(s);
        }
       
    }

    @Override
    public void windowOpened(WindowEvent e) {
      
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
       
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       
    }

    @Override
    public void windowActivated(WindowEvent e) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       
    }
    
    
    
}
