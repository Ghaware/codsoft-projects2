import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class student {
    private JTextField txtStname;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAverage;
    private JTextField txtGrade;
    private JButton calButton;
    private JPanel main;
    private JTextField txtMarks1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("student");
        frame.setContentPane(new student().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public student() {
    calButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            int m1,m2,m3,tot;
            double average;

            m1=Integer.parseInt(txtMarks1.getText());
            m2=Integer.parseInt(txtMarks2.getText());
            m3=Integer.parseInt(txtMarks3.getText());
            tot= m1+ m2 + m3;
            txtTotal.setText(String.valueOf(tot));

            average=tot/3;
            txtAverage.setText(String.valueOf(average));

            if(average>50)
            {
                txtGrade.setText("pass");
            }
            else
            {
                txtGrade.setText("fail");
            }



        }
    });
}
}
