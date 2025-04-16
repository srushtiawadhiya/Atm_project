package src;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.ResultSet;



public class Login extends JFrame implements ActionListener{
    JLabel label1 ,label2,label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;

    Login(){ //construtor
        super("Bank System");//headline

        String imagePath = "C:/Users/srush/c language/PROJECTS/java/project1-atm/src/icon/backbg.png";
        ImageIcon i1 = new ImageIcon(imagePath);
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        String iimagePath = "C:/Users/srush/c language/PROJECTS/java/project1-atm/src/icon/card.png";
        ImageIcon ii1 = new ImageIcon(iimagePath);
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        label1 = new JLabel("WELCOME TO ATM ");// jlabel ka kaam hota ha kisi text ko frame ami show kar va na 
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.BLACK);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2 = new JTextField (15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("Pin No:");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.BLACK);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);
        
        button1 = new JButton("SIGN IN");
        button1.setBounds(300,300,100,30);
        button1.setBackground(Color.BLACK);
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.addActionListener(this);
        add(button3);


        String iiimagePath = "C:/Users/srush/c language/PROJECTS/java/project1-atm/src/icon/backbg.png";
        ImageIcon iii1 = new ImageIcon(iiimagePath);
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);


        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e){
     try {
            if (e.getSource() == button1) {
                sql s = new sql();
                String cardno = textField2.getText();
                String pin = new String(passwordField3.getPassword());

                String q = "SELECT * FROM login WHERE Card_Number = '" + cardno + "' AND Pin = '" + pin + "'";
                ResultSet resultSet = s.statement.executeQuery(q);

                if (resultSet.next()) {
                    setVisible(false);
                    new MainClass(pin);  // Make sure MainClass sets visibility
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Card Number or PIN");
                }

            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField3.setText("");

            } else if (e.getSource() == button3) {
                // SIGN UP logic placeholder
                JOptionPane.showMessageDialog(null, "Sign Up clicked!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Login();//object
    }
}