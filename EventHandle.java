
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


public class EventHandle implements WindowListener,ActionListener
{
    private Frame frame;
    
    private Button button1;
    private Button button2;
    private Button button3;
    
    private TextField textfield;
    public EventHandle()
    {
        frame = new Frame("Welcome To The Event Handler");
        
        button1 = new Button();
        button1.setLabel("YES");
        
        button2 = new Button("NO");
        
        button3 = new Button("CLEAR");
        
        textfield = new TextField(50);  // 50 is the size of how many character the field can take
        
    }
    
    public void show()
    {
        button1.addActionListener(this);
        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.MAGENTA);
        button1.setFont(new Font("Consolas",Font.BOLD,16));
        
        button2.addActionListener(this);
        button2.setBackground(Color.BLUE);
        button2.setForeground(Color.MAGENTA);
        button2.setFont(new Font("Consolas",Font.BOLD,16));
        
        button3.addActionListener(this);
        button3.setBackground(Color.BLUE);
        button3.setForeground(Color.MAGENTA);
        button3.setFont(new Font("Consolas",Font.BOLD,16));
        
        textfield.setBackground(Color.WHITE);
        textfield.setForeground(Color.BLACK);
        textfield.setEditable(false);
        textfield.setFocusable(true);
        
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(textfield);
        
        frame.addWindowListener(this);
        frame.setSize(800,600);
        frame.setBackground(Color.ORANGE);
        frame.setLayout(new FlowLayout());  // If there is not layout set , then java by default set FlowLayout
        frame.setResizable(true);
        frame.setVisible(true);
        
    }
    public static void main(String[] args)
    {
        EventHandle eventhandle = new EventHandle();
        eventhandle.show();
        
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        String string = null;
        if(e.getSource()==button1)
        {
            string = "You Have Pressed Yes Button";
        }
        else
        {
            if(e.getSource()==button2)
            {
                string = "You Pressed No Button";
            }
            else
            {
                if(e.getSource()==button3)
                {
                    string = "You Have Pressed Clear Button";
                }
            }
        }
        textfield.setText(string);
    }
    
    
}
