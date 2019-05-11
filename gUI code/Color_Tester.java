
package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class Color_Tester implements WindowListener,ActionListener{
    
    private Frame f;
    private Button b;
    private TextField t;
    private Random random;
    
    
    public Color_Tester(){
        
        f = new Frame("COLOR");
        b = new Button("Press And Change Color");
        t = new TextField(30);
        
        random = new Random();  // If we don't create object of random here , the code won't work
        
    }
    
    public void show(){
        b.addActionListener(this);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.RED);
        b.setEnabled(true);  // making the button workable
        t.setFocusable(true);
        t.setEnabled(true); // making the text arena workable
        t.setEditable(false);  // preventing from editing
        
        f.addWindowListener(this);
        f.setSize(800,600);
        f.add(b);
        f.add(t);
        f.setLayout(new FlowLayout());
        f.setResizable(true);
        f.setVisible(true);
        
        
    }
    
    public static void main(String[] args){
        Color_Tester t86 = new Color_Tester();
        t86.show();
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

    @Override
    public void actionPerformed(ActionEvent e) {
       int R;
       int G;
       int B;
       String string;
       
       if(e.getSource()== b){
           
           R = random.nextInt(256);
           G = random.nextInt(256);
           B = random.nextInt(256);
           Color color = new Color(R,G,B);
           
           string = "RGB = (" + R + ", " + G + ", " + B + ")";
           f.setBackground(color);
           t.setText(string);
           
       }
    }
    
}
