import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld extends JFrame {
    private JPanel panelMain;
    private JTextField txtName;
    private JButton btnClick;

    public HelloWorld() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick,txtName.getText()+" ,Hello");
            }
        });
    }

    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        h.setContentPane(h.panelMain);
        h.setTitle("Hello");
        h.setSize(300,400);
        h.setBounds(600,200,200,200);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
