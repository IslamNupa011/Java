
package awt;




import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.BoxLayout;


public class Remix_Layout2 implements WindowListener{
    
    
    private Frame frame;
    private Panel[] panel;
    private Button[][] button;
    private TextArea ta;
    
    public Remix_Layout2(){
        frame = new Frame("LAYOUT REMIX By TURJO 86");
        panel = new Panel[4]; // we need 4 panle for that we are declaring an object array of Panel class
        ta = new TextArea();        
        for(int i =0;i<panel.length;i++){
            panel[i] = new Panel();   // creating panel
        }
        
        button = new Button[4][4];  // we add 16 buttons which we can generate from a 4 x 4 matrix
                                    // declaring the Button class 2-D array
                                    
                                    
              for(int counter=1,i=0;i<button.length;i++){
                  for(int j=0;j<button[i].length;j++){
                      button[i][j] = new Button ("Button"+counter);  // Setting the number plate of button
                      counter++;
                  }
              } 
              
             
  }
    public void show(){
        ta.setSize(10,10);
        ta.setBackground(Color.BLUE);
        ta.setForeground(Color.black);
        panel[0].setBackground(Color.ORANGE);
        
        panel[0].setLayout(new FlowLayout());
        
        panel[0].add(button[0][0]);    // setting buttons in panel number 1
        panel[0].add(button[0][1]);
        panel[0].add(button[0][2]);
        panel[0].add(button[0][3]);
        
        panel[1].setBackground(Color.GREEN);
        panel[1].setLayout(new BorderLayout());
        
        panel[1].add(button[1][0],BorderLayout.NORTH);  // setting button in panel number 2  
        panel[1].add(button[1][1],BorderLayout.SOUTH);
        panel[1].add(button[1][2],BorderLayout.EAST);
        panel[1].add(button[1][3],BorderLayout.WEST);
        
        
        panel[2].setBackground(Color.BLUE);
        
        panel[2].setLayout(new BoxLayout(panel[2],BoxLayout.X_AXIS));  // setting the orientation of layout
        //panel[2].setLayout(new BoxLayout(panel[2],BoxLayout.Y_AXIS));
        
        panel[2].add(button[2][0]);  // setting button in panel number 3
        panel[2].add(button[2][1]);
        panel[2].add(button[2][2]);
        panel[2].add(button[2][3]);
        
        panel[3].setBackground(Color.YELLOW);
        
        panel[3].setLayout(new FlowLayout());
        
        panel[3].add(ta);
        
       
       
        

        
        frame.add(panel[0]);   // adding panel in the frame
        frame.add(panel[1]);
        frame.add(panel[2]);
        frame.add(panel[3]);
        
        
        frame.addWindowListener(this);
        frame.setLayout(new GridLayout(2,2,10,10));
        frame.setBackground(Color.MAGENTA);
        frame.setSize(800,800);
      
        frame.setResizable(true);
        frame.setVisible(true);
    }
    
    public static void main(String[] args){
        Remix_Layout2 obj = new Remix_Layout2();
        obj.show();
    }
    

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
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
    
}


