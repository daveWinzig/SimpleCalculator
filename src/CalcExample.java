import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcExample implements ActionListener {

    JFrame calculator;
    JPanel layout;
    JLabel firstNum, secondNum, result;
    JTextField firstNumField, secNumField, resultField;
    JButton plus, minus, multiply, divide;

    public CalcExample() {

        //Body of calculator
        calculator = new JFrame();
        layout = new JPanel();

        layout.setLayout(null);
        calculator.add(layout);

        //Create and insert items

        //Fields
        firstNum = new JLabel("First Number");
        firstNum.setBounds(50, 25, 100, 25);

        firstNumField = new JTextField();
        firstNumField.setBounds(150, 25, 100, 25);

        secondNum = new JLabel("Second Number");
        secondNum.setBounds(50, 75, 100, 25);

        secNumField = new JTextField();
        secNumField.setBounds(150, 75, 100, 25);

        result = new JLabel("Result");
        result.setBounds(50, 200, 100, 25);

        resultField = new JTextField();
        resultField.setBounds(150, 200, 100, 25);

        //Buttons
        plus = new JButton("+");
        plus.setBounds(50, 125, 50, 50);
        plus.addActionListener(this);

        minus = new JButton("-");
        minus.setBounds(100, 125, 50, 50);
        minus.addActionListener(this);

        multiply = new JButton("*");
        multiply.setBounds(150, 125, 50, 50);
        multiply.addActionListener(this);

        divide = new JButton("/");
        divide.setBounds(200, 125, 50, 50);
        divide.addActionListener(this);



        //Insert buttons into JFrame
        layout.add(firstNum);
        layout.add(firstNumField);
        layout.add(secondNum);
        layout.add(secNumField);
        layout.add(result);
        layout.add(resultField);
        layout.add(plus);
        layout.add(minus);
        layout.add(multiply);
        layout.add(divide);

        //constraints
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setSize(300, 300);
        calculator.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //get user input as string
        String sNum1 = firstNumField.getText();
        String sNum2 = secNumField.getText();

        //convert user strings to integers
        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        int c = 0;

        if(e.getSource() == plus) {
            c = num1 + num2;
        } else if(e.getSource() == minus) {
            c = num1 - num2;
        } else if(e.getSource() == multiply) {
            c = num1 * num2;
        } else if(e.getSource() == divide) {
            c = num1 / num2;
        }

        String result = String.valueOf(c);
        resultField.setText(result);
    }
}
