import javax.swing.*;

public class FormWindow extends JFrame {
    public FormWindow(){
        Form form = new Form();
        setContentPane(form.getMainPanel());
        pack();
        setTitle("Registration");
        setLocation(300,300);
        //setVisible(true);
    }
    public void run(){
        setVisible(true);
    }
}
