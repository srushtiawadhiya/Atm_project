package src;

import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, m1, m2, m3;
    JButton next;
    JTextField textName, textFname,  textMname,textEmail, textAdd, textCity, textPin, textState, textGender, textMarital;
    JComboBox<String> dayCombo, monthCombo, yearCombo;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        // Load Image
        String imagePath = "src/icon/bank.png";
        ImageIcon i1 = new ImageIcon(imagePath);
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        // Application Form Title
        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 30));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 110, 600, 30);
        add(label3);

        // Name Label & Text Field
        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        // Father's Name Label & Text Field
        JLabel labelFname = new JLabel("Father's Name:");
        labelFname.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFname.setBounds(100, 240, 200, 30);
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);

        // Mother's Name Label & Text Field
        JLabel labelMname = new JLabel("Mother's Name:");
        labelMname.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMname.setBounds(100, 290, 200, 30);
        add(labelMname);

        textMname = new JTextField();
        textMname.setFont(new Font("Raleway", Font.BOLD, 14));
        textMname.setBounds(300, 290, 400, 30);
        add(textMname);



                // Gender
                JLabel genderLabel = new JLabel("Gender:");
                genderLabel.setFont(new Font("Raleway", Font.BOLD, 20));
                genderLabel.setBounds(100, 390, 200, 30);
                add(genderLabel);
        
                r1 = new JRadioButton("Male");
                r2 = new JRadioButton("Female");
                r3 = new JRadioButton("Other");
        
                ButtonGroup genderGroup = new ButtonGroup();
                genderGroup.add(r1);
                genderGroup.add(r2);
                genderGroup.add(r3);
        
                r1.setBounds(300, 390, 80, 30);
                r2.setBounds(400, 390, 80, 30);
                r3.setBounds(500, 390, 80, 30);
        
                add(r1);
                add(r2);
                add(r3);
        

        // Email Label & Text Field
        JLabel labelEmail = new JLabel("Email:");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 340, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 340, 400, 30);
        add(textEmail);

        // Address Label & Text Field
        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 440, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 440, 400, 30);
        add(textAdd);

        // City Label & Text Field
        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 490, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 490, 400, 30);
        add(textCity);

        // Pin Code Label & Text Field
        JLabel labelPin = new JLabel("Pin Code:");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 540, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 540, 400, 30);
        add(textPin);

        // State Label & Text Field
        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100, 590, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 590, 400, 30);
        add(textState);

        // Marital Status Label
        JLabel labelMarital = new JLabel("Marital Status:");
        labelMarital.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMarital.setBounds(100, 640, 200, 30);
        add(labelMarital);

        // Radio Buttons for Marital Status
            m1 = new JRadioButton("Married");
            m1.setFont(new Font("Raleway", Font.BOLD, 14));
            m1.setBackground(new Color(222, 255, 228));
            m1.setBounds(300, 640, 100, 30);
            add(m1);

            m2 = new JRadioButton("Unmarried");
            m2.setFont(new Font("Raleway", Font.BOLD, 14));
            m2.setBackground(new Color(222, 255, 228));
            m2.setBounds(400, 640, 120, 30);
            add(m2);

            JRadioButton m3 = new JRadioButton("Other");
            m3.setFont(new Font("Raleway", Font.BOLD, 14));
            m3.setBackground(new Color(222, 255, 228));
            m3.setBounds(520, 640, 100, 30);
            add(m3);

        // Group the radio buttons
            ButtonGroup maritalGroup = new ButtonGroup();
            maritalGroup.add(m1);
            maritalGroup.add(m2);
            maritalGroup.add(m3);


             // Date of Birth Label & ComboBoxes
        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 690, 200, 30);
        add(DOB);

            // Day ComboBox (1-31)
        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }
        dayCombo = new JComboBox<>(days);
        dayCombo.setBounds(300, 690, 60, 30);
        add(dayCombo);

        // Month ComboBox
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthCombo = new JComboBox<>(months);
        monthCombo.setBounds(370, 690, 80, 30);
        add(monthCombo);

        // Year ComboBox (1940-2024)
        String[] years = new String[85];
        for (int i = 0; i < 85; i++) {
            years[i] = String.valueOf(1940 + i);
        }
        yearCombo = new JComboBox<>(years);
        yearCombo.setBounds(460, 690, 100, 30);
        add(yearCombo);


        // Next Button
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 740, 80, 30);
        add(next);

        // Register ActionListener for the button
        next.addActionListener(this);

        // Background and Frame Settings
        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(800, 1000);
        setLocation(360, 15);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;

        String name = textName.getText();

        String fName = textFname.getText();

        String Mname = textMname.getText();


        String gender = "";
        if (r1.isSelected()) gender = "Male";
        else if (r2.isSelected()) gender = "Female";
        else if (r3.isSelected()) gender = "Other";

        String email = textEmail.getText();

        String marital = "";
        if (m1.isSelected()) marital = "Married";
        else if (m2.isSelected()) marital = "Unmarried";
        else if (m3.isSelected()) marital = "Other";

        String address = textAdd.getText();

        String city = textCity.getText();

        String pinCode = textPin.getText();

        String state = textState.getText();

        String dob = dayCombo.getSelectedItem() + "-" + monthCombo.getSelectedItem() + "-" + yearCombo.getSelectedItem();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"please fill the fields" );
            }else {
                sql sql1 = new sql();
                String q = "insert into signup values('"+formNo+"','"+name+"','"+fName+"','"+Mname+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pinCode+"','"+state+"','"+dob+"')";
                sql1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
            
        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}
