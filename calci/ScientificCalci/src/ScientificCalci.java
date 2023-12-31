import javax.swing.*;
import java.awt.event.*;

class ScientificCalci extends JFrame implements ActionListener {
    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton div,zero,sub,mul,add,dec,clr,eq,sqr;
    static double a = 0, b= 0, result = 0;
    static int operator = 0;

    ScientificCalci() {
        f = new JFrame("Calculator");
        t = new JTextField();
        b1= new JButton("1");
        b2= new JButton("2");
        b3= new JButton("3");
        b4= new JButton("4");
        b5= new JButton("5");
        b6= new JButton("6");
        b7= new JButton("7");
        b8= new JButton("8");
        b9= new JButton("9");
        zero = new JButton("0");
        div = new JButton("/");
        mul = new JButton("*");
        sub = new JButton("-");
        add = new JButton("+");
        dec = new JButton(".");
        eq = new JButton("=");
        clr = new JButton("Clear");
        sqr = new JButton("x^");
        t.setBounds(30, 40, 280, 30);
        b7.setBounds(40, 100, 50, 40);
        b8.setBounds(110, 100, 50, 40);
        b9.setBounds(180, 100, 50, 40);
        div.setBounds(250, 100, 50, 40);

        b4.setBounds(40, 170, 50, 40);
        b5.setBounds(110, 170, 50, 40);
        b6.setBounds(180, 170, 50, 40);
        mul.setBounds(250, 170, 50, 40);

        b1.setBounds(40, 240, 50, 40);
        b2.setBounds(110, 240, 50, 40);
        b3.setBounds(180, 240, 50, 40);
        sub.setBounds(250, 240, 50, 40);

        dec.setBounds(40, 310, 50, 40);
        zero.setBounds(110, 310, 50, 40);
        eq.setBounds(180, 310, 50, 40);
        add.setBounds(250, 310, 50, 40);

        sqr.setBounds(40, 380, 50, 40);
        clr.setBounds(110, 380, 100, 40);

        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(div);
        f.add(mul);
        f.add(sub);
        f.add(dec);
        f.add(zero);
        f.add(eq);
        f.add(add);
        f.add(sqr);
        f.add(clr);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(350, 500);
        f.setResizable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        zero.addActionListener(this);
        div.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        clr.addActionListener(this);
        mul.addActionListener(this);
        dec.addActionListener(this);
        sqr.addActionListener(this);
        eq.addActionListener(this);
        t.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (c >= '0' && c <= '9') {
                } else {
                    ke.consume();
                }
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)
            t.setText(t.getText().concat("1"));
        if (e.getSource() == b2)
            t.setText(t.getText().concat("2"));
        if (e.getSource() == b3)
            t.setText(t.getText().concat("3"));
        if (e.getSource() == b4)
            t.setText(t.getText().concat("4"));
        if (e.getSource() == b5)
            t.setText(t.getText().concat("5"));
        if (e.getSource() == b6)
            t.setText(t.getText().concat("6"));
        if (e.getSource() == b7)
            t.setText(t.getText().concat("7"));
        if (e.getSource() == b8)
            t.setText(t.getText().concat("8"));
        if (e.getSource() == b9)
            t.setText(t.getText().concat("9"));
        if (e.getSource() == zero)
            t.setText(t.getText().concat("0"));
        if (e.getSource() == dec)
            t.setText(t.getText().concat("."));
        if (e.getSource() == add) {
            a = Double.parseDouble(t.getText());
            operator = 1;
            t.setText("");
        }
        if (e.getSource() == sub) {
            a = Double.parseDouble(t.getText());
            operator = 2;
            t.setText("");
        }
        if (e.getSource() == mul) {
            a = Double.parseDouble(t.getText());
            operator = 3;
            t.setText("");
        }
        if (e.getSource() == div) {
            a = Double.parseDouble(t.getText());
            operator = 4;
            t.setText("");
        }
        if (e.getSource() == sqr) {
            a = Double.parseDouble(t.getText());
            operator = 5;
            t.setText(t.getText().concat("^"));

        }
        if (e.getSource() == clr)
            t.setText("");
        if (e.getSource() == eq) {
            if (operator == 5) {
                b = a;
            } else {
                b = Double.parseDouble(t.getText());
            }
            switch (operator) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = a / b;
                    break;
                case 5:
                    result = a * b;
                    break;
            }
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            System.out.println("result=" + result);
            t.setText("" + result);
        }
    }

    public static void main(String[] args) {
        new ScientificCalci();
    }
}