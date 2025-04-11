package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Signup2 extends JFrame implements ActionListener{
    String formNo;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    
    // set size of the frame 
    Signup2(String first){
        super("APPLICATION FORM");

         // Load Image
        String imagePath = "src/icon/bank.png";
        ImageIcon i1 = new ImageIcon(imagePath);
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5, 100, 100);
        add(image);


        this.formNo = first;

        //labels and textfields
        JLabel l1 = new JLabel("Page no. 2 :- ");
        l1.setFont(new Font("Raleway",Font.BOLD,24));
        l1.setBounds(350,50,600,40);
        add(l1);
    
        JLabel l2 = new JLabel("Additonal Details : ");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(350,80,600,30);
        add(l2);
        
        
        JLabel label3 = new JLabel("State : ");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(150, 180, 600, 30);
        add(label3);

        String states[] = { 
            "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", 
            "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", 
            "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", 
            "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", 
            "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"
        };
        comboBox = new JComboBox(states);
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setBounds(350,180,320,30);
        add(comboBox);

        JLabel label4 = new JLabel("Category : ");
        label4.setFont(new Font("Raleway", Font.BOLD, 22));
        label4.setBounds(150, 230, 600, 30);
        add(label4);

        String category[] = { "Gen","OBC","SC","ST","other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setBounds(350,230,320,30);
        add(comboBox2);

        JLabel label5 = new JLabel("Income : ");
        label5.setFont(new Font("Raleway", Font.BOLD, 22));
        label5.setBounds(150, 280, 600, 30);
        add(label5);

        String Income[] = { "null","<10,000,00","<20,000,00","<50,000,00","above 50,000,00"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setBounds(350,280,320,30);
        add(comboBox3);

        JLabel label6 = new JLabel("Education : ");
        label6.setFont(new Font("Raleway", Font.BOLD, 22));
        label6.setBounds(150, 330, 600, 30);
        add(label6);

        String Education[] = { "non-Graduate","Graduate","Post-Graduate","Under-Graduate","other"};
        comboBox4 = new JComboBox(Education);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setBounds(350,330,320,30);
        add(comboBox4);

        JLabel label7 = new JLabel("Occupation : ");
        label7.setFont(new Font("Raleway", Font.BOLD, 22));
        label7.setBounds(150, 380, 600, 30);
        add(label7);

        String Occupation[] = { "Self-employed","employed","Bussiness","Student","other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5 .setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5 .setBackground(new Color(252,208,76));
        comboBox5 .setBounds(350,380,320,30);
        add(comboBox5);

        JLabel label8 = new JLabel("Pan-Number : ");
        label8.setFont(new Font("Raleway", Font.BOLD, 22));
        label8.setBounds(150, 430, 600, 30);
        add(label8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,20));
        textPan.setBounds(350,430,320,30);
        add(textPan);

        JLabel label9 = new JLabel("Aadhar-Number : ");
        label9.setFont(new Font("Raleway", Font.BOLD, 22));
        label9.setBounds(150, 480, 600, 30);
        add(label9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,20));
        textAadhar.setBounds(350,480,320,30);
        add( textAadhar);

        JLabel label10 = new JLabel("Senior Citizen : ");
        label10.setFont(new Font("Raleway", Font.BOLD, 22));
        label10.setBounds(150, 530, 600, 30);
        add(label10);

        r1 = new JRadioButton("Yes");
        r2 = new JRadioButton("No");
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(r1);
        seniorGroup.add(r2);

        r1.setBounds(350, 530, 100, 30);
        r2.setBounds(460, 530, 100, 30);
        add(r1);
        add(r2);

        JLabel label11 = new JLabel("Existing Account : ");
        label11.setFont(new Font("Raleway", Font.BOLD, 22));
        label11.setBounds(150, 580, 600, 30);
        add(label11);

        e1 = new JRadioButton("Yes");
        e2 = new JRadioButton("No");
        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(e1);
        existingGroup.add(e2);

        e1.setBounds(350, 580, 100, 30);
        e2.setBounds(460, 580, 100, 30);
        add(e1);
        add(e2);
        
        JLabel label12 = new JLabel("Form No : ");
        label12.setFont(new Font("Raleway", Font.BOLD, 22));
        label12.setBounds(600, 30, 150, 30);
        add(label12);

        JLabel label13 = new JLabel(formNo);
        label13.setFont(new Font("Raleway", Font.BOLD, 22));
        label13.setBounds(660, 30, 60, 30);
        add(label13);

        next = new JButton("NEXT");
        next.setBounds(700, 650, 100, 30); 
        next.setBackground(Color.WHITE);
        next.addActionListener(this);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        add(next);

        



            setSize(900,900);
            setLocation(450,80);
            getContentPane().setBackground( new Color (252,208,76));
            setLayout(null); // Necessary for absolute positioning
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        String States = (String) comboBox.getSelectedItem();
        
        String Category = (String) comboBox2.getSelectedItem();

        String Income = (String) comboBox3.getSelectedItem();

        String education = (String) comboBox4.getSelectedItem();

        String occupation = (String) comboBox5.getSelectedItem();

        String pan_card = textPan.getText();
         String Aadhar = textAadhar.getText();

        String  senior_citizen = "";
        if (r1.isSelected()) senior_citizen = "yes";
        else if (r2.isSelected())  senior_citizen = "no";
        

         String  existing_ac = "";
         if (e1.isSelected()) existing_ac = "yes";
         else if (e2.isSelected())  existing_ac = "no";


         try{
            if (textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"please fill the fields" );
            }else {
                sql sql1 = new sql();
                String q = "insert into signup2 values('"+formNo+"','"+States+"','"+Category+"','"+Income+"','"+education+"','"+occupation +"','"+pan_card+"','"+Aadhar+"','"+senior_citizen+"','"+existing_ac+"')";
                sql1.statement.executeUpdate(q);
                new Signup3(formNo);
                setVisible(false);
            }
            
        }catch(Exception E){
            E.printStackTrace();
        }



          }
        

    public static void main (String[] args){
        new Signup2("");
    }
    
}
