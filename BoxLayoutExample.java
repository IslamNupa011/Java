
package code_fo_rfinall;
import java.awt.*;
import java.awt.event.*;
import javax.swing.BoxLayout;

public class BoxLayoutExample implements WindowListener{
    public Frame f;
    public Button[] b;
    public BoxLayoutExample(){
        f=new Frame("BoxLayout");
        b=new Button[5];
        for(int i=0;i<b.length;i++){
            b[i]=new Button("Button"+(i+1));
        }
    }
    public void show(){
        f.setLayout(new BoxLayout(f,BoxLayout.X_AXIS));
        for(int i=0;i<b.length;i++){
            f.add(b[i]);
        }
            f.addWindowListener(this);
            f.setSize(900,900);
            f.setBackground(Color.MAGENTA);
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
        BoxLayoutExample bl=new BoxLayoutExample();
        bl.show();
    }
}
