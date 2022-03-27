import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
public class JavaWindow extends JFrame {
    public JavaWindow() {
        setTitle("p1Younouss_T");
        setSize(700, 500); 
        textFieldNorth = new JTextField();
        Container contentPane = getContentPane();
        contentPane.add(textFieldNorth, "North");
        textFieldNorth.setText("Hello, World!");
        buttonSouth1 = new JButton("First");
        buttonSouth2 = new JButton("Last");
        buttonSouth3 = new JButton("My Computer");
        JPanel p = new JPanel();
        contentPane.add(p, "South");
        p.add(buttonSouth1);
        p.add(buttonSouth2);
        p.add(buttonSouth3);
        ButtonObserver observer = new ButtonObserver();
        buttonSouth1.addActionListener(observer);
        buttonSouth2.addActionListener(observer);
        buttonSouth3.addActionListener(observer);
    }
    class ButtonObserver implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            if (source == buttonSouth1) {
                System.out.println("First button pressed");
                textFieldNorth.setText("My first name is Younouss");
            } 
            else if (source == buttonSouth2) {
                System.out.println("Last button pressed");
                textFieldNorth.setText("My last name is Thiam");
            }
            else if (source == buttonSouth3){
                System.out.println("My Computer button pressed");
                textFieldNorth.setText("very old hp computer");
            }
        }
    }
   
    private final JTextField textFieldNorth;
    private final JButton buttonSouth1;
    private final JButton buttonSouth2;
    private final JButton buttonSouth3;
}