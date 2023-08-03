
//GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculate implements ActionListener {

    JFrame frame;
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1, b2, b3, b4;

    Calculate() {
        frame = new JFrame("Simple Calculator");
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.setLocation(50, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        l1 = new JLabel("Number 1: ");
        l1.setFont(new Font("Arial", Font.PLAIN, 20));
        l1.setBounds(50, 50, 100, 50);
        frame.add(l1);

        l2 = new JLabel("Number 2: ");
        l2.setFont(new Font("Arial", Font.PLAIN, 20));
        l2.setBounds(50, 100, 100, 50);
        frame.add(l2);

        t1 = new JTextField();

        t1.setBounds(150, 55, 200, 40);
        frame.add(t1);

        t2 = new JTextField();
        t2.setBounds(150, 105, 200, 40);
        frame.add(t2);

        b1 = new JButton("ADD");
        b1.setBounds(50, 175, 75, 40);
        frame.add(b1);

        b2 = new JButton("SUB");
        b2.setBounds(130, 175, 75, 40);
        frame.add(b2);

        b3 = new JButton("MUL");
        b3.setBounds(210, 175, 75, 40);
        frame.add(b3);

        b4 = new JButton("DIV");
        b4.setBounds(290, 175, 75, 40);
        frame.add(b4);

        l3 = new JLabel(" ");
        l3.setFont(new Font("Arial", Font.PLAIN, 20));
        l3.setBounds(50, 220, 200, 50);
        frame.add(l3);

        // EVENT HANDLING WHEN ADD/SUB/MUL/DIV button is clicked
        // first register buttons to Class that implements the ActionListener

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    // OVERRIDE the abstract Method of the ActionListener Interface
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int sum = n1 + n2;
            l3.setForeground(Color.blue);
            l3.setText("Result is :" + sum);
        }
        if (e.getSource() == b2) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int sub = n1 - n2;
            l3.setForeground(Color.blue);
            l3.setText("Result is :" + sub);
        }
        if (e.getSource() == b3) {

            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int mul = n1 * n2;
            l3.setForeground(Color.blue);
            l3.setText("Result is :" + mul);
        }
        if (e.getSource() == b4) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int div = n1 / n2;
            l3.setForeground(Color.blue);
            l3.setText("Result is : " + div);

        }

    }
}

public class SimpleCalculator {
    public static void main(String[] args) {

        Calculate c = new Calculate();

    }

}
