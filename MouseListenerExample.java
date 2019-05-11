
package code_fo_rfinall;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample implements WindowListener,MouseListener {
    public Frame f;
    public TextField tf;
    public MouseListenerExample(){
        f=new Frame("Mouse listener");
        tf=new TextField(50);
    }
    public void show(){
        Label label=new Label("This is a label");
        label.setAlignment(Label.CENTER);
        
        tf.setEditable(false);
        tf.setFocusable(false);
        
        f.setLayout(new BorderLayout());
        f.add(label,BorderLayout.NORTH);
        f.add(tf,BorderLayout.SOUTH);
        
        f.addWindowListener(this);
        f.addMouseListener(this);
        f.setSize(800,800);
        f.setBackground(Color.CYAN);
        f.setVisible(true);
        f.setResizable(true);
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

    @Override
    public void mouseClicked(MouseEvent e) {
        String str="Mouse clicked at:"+e.getX()+","+e.getY();
        tf.setText(str);
    }

    @Override
    public void mousePressed(MouseEvent e) {
         String str="Mouse pressed at:"+e.getX()+","+e.getY();
        tf.setText(str);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         String str="Mouse realeased at:"+e.getX()+","+e.getY();
        tf.setText(str);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String str="MOuse enetered the frame";
        tf.setText(str);
    }

    @Override
    public void mouseExited(MouseEvent e) {
         String str="MOuse left the frame";
        tf.setText(str);
    }
    public static void main(String[] args){
        MouseListenerExample m=new MouseListenerExample();
        m.show();
    }
}
