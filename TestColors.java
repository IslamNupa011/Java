
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;


public class TestColors implements WindowListener,ActionListener 
{
    private Frame frame;
    private Button button;
    private TextField textfield;
    
    private Random random;
    
    public TestColors()
    {
        frame = new Frame("Test Colors");
        textfield = new TextField(20);
        button = new Button ("Press To Change The Color");
        
        random = new Random();
    }
    public void show()
    {
        button.addActionListener(this);
        button.setBackground(Color.YELLOW);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Consolas",Font.PLAIN,16));
        button.setEnabled(true);
        
        textfield.setFocusable(true);
        textfield.setEnabled(true);
        textfield.setEditable(false);
        
        frame.add(button);
        frame.add(textfield);
        frame.addWindowListener(this);
        frame.setSize(800,600);
        frame.setBackground(Color.GREEN);
        frame.setLayout(new FlowLayout());
        frame.setResizable(true);
        frame.setVisible(true);
        
        
        
    }
    public static void main(String[] args)
    {
        TestColors testcolors = new TestColors();
        testcolors.show();
        
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

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
       int r;
       int g;
       int b;
       
       String string;
       
       if(e.getSource()==button)
       {
           r = random.nextInt(256);
           g = random.nextInt(256);
           b = random.nextInt(256);
           
           Color color = new Color(r,g,b);
           String String = "RGB =(" + r + ", " + g + ", " + b + ")";
           
           frame.setBackground(color);
           textfield.setText(String);
       }
    }
    
    
}
