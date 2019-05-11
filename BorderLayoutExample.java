
package code_fo_rfinall;
import java.awt.*;
import java.awt.event.*;
public class BorderLayoutExample implements WindowListener{
    public Frame f;
    public Button[] b;
    public BorderLayoutExample(){
        f=new Frame("Border Layout");
        b=new Button[5];
        for(int i=0;i<b.length;i++){
            b[i]=new Button("Button"+(i+1));
        }
    }
    public void show(){
      f.setLayout(new BorderLayout());
      
      f.add(b[0],BorderLayout.NORTH);
      b[0].setBackground(Color.red);
      f.add(b[1],BorderLayout.SOUTH);
      
      f.add(b[2],BorderLayout.EAST);
      b[2].setBackground(Color.blue);
      f.add(b[3],BorderLayout.WEST);
      f.add(b[4],BorderLayout.CENTER);
      
      f.addWindowListener(this);
      f.setSize(600,600);
      f.setBackground(Color.yellow);
      f.setResizable(true);
      f.setVisible(true);
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
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
    public static void main(String[] args){
        BorderLayoutExample bl=new BorderLayoutExample();
        bl.show();
    }
}
