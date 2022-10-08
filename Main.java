package com.company;
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import  java.lang.*;
class MyFrame extends JFrame implements ActionListener {
    Container c= this.getContentPane();
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();

    MyFrame(){
        this.setTitle("LUV");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,50,400,400);
        this.setResizable(false);
        this.setVisible(true);
        JLabel l1=new JLabel("WELCOME EVERYONE");
        l1.setBounds(145,200,150,50);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(l1);
        c.setLayout(null);
        b1.setText("LoginForm");
        b2.setText("LoveCalcy");
        b3.setText("Calcy");
        b1.setBounds(100,50,105,50);
        b1.setBackground(Color.RED);
        b1.addActionListener(this);
        b2.setBounds(206,51,100,50);
        b2.addActionListener(this);
        b2.setBackground(Color.blue);
        b3.setBounds(152,100,100,50);
        b3.setBackground(Color.yellow);
        b3.addActionListener(this);
        ImageIcon img = new ImageIcon("img.png");
        c.setBackground(Color.DARK_GRAY);
        c.add(b1);
        c.add(b2);
        c.add(b3);
    }

    @Override
    public void actionPerformed(ActionEvent v) {
        if(v.getSource()==b1){
            JFrame j1=new JFrame();
            Container p= j1.getContentPane();
            j1.setLayout(null);
            j1.setVisible(true);
            j1.setTitle("LoginForm");
            j1.setResizable(false);
            j1.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            j1.setBounds(100,300,400,450);
            JLabel l1=new JLabel("Name");
            JTextField T1=new JTextField();
            l1.setBounds(70,70,60,30);
            T1.setBounds(150,70,100,30);
            p.add(l1);
            p.add(T1);
            JLabel l2=new JLabel("Age");
            JTextField T2=new JTextField();
            l2.setBounds(70,120,60,30);
            T2.setBounds(150,120,100,30);
            p.add(l2);
            p.add(T2);
            JLabel l3=new JLabel("Number");
            JTextField T3=new JTextField();
            l3.setBounds(70,170,60,30);
            T3.setBounds(150,170,100,30);
            p.add(l3);
            p.add(T3);
            JLabel l4=new JLabel("E-Mail ");
            l4.setBounds(70,220,60,30);
            JTextField T4=new JTextField();
            T4.setBounds(150,220,100,30);
            p.add(l4);
            p.add(T4);
            JLabel l5=new JLabel("Course");
            JTextField T5=new JTextField();
            l5.setBounds(70,280,60,30);
            T5.setBounds(150,280,100,30);
            p.add(l5);
            p.add(T5);
            JLabel l6=new JLabel("Branch ");
            JTextField T6=new JTextField();
            T6.setBounds(150,335,100,30);
            l6.setBounds(70,335,60,30);
            p.add(l6);
            p.add(T6);


        }

        if(v.getSource()==b2) {

            JFrame j2 = new JFrame();
            Container m = j2.getContentPane();
            j2.setVisible(true);
            j2.setTitle("LoveCalcy");
            j2.setResizable(false);
            j2.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            j2.setBounds(600, 300, 400, 500);
            j2.setLayout(null);
            JLabel be1 = new JLabel("Your Name");
            be1.setBounds(50, 50, 80, 40);
            m.add(be1);
            JTextField TE1 = new JTextField();
            TE1.setBounds(150, 50, 100, 40);
            m.add(TE1);

            JLabel be2 = new JLabel("Bhabhi's Name");
            be2.setBounds(50, 140, 90, 40);
            m.add(be2);
            JTextField TE2 = new JTextField();
            TE2.setBounds(150, 140, 80, 40);
            m.add(TE2);
            JButton b4 = new JButton();
            b4.setText("Click Me");
            b4.setBounds(70, 250, 120, 35);
            b4.setBackground(Color.red);
            m.add(b4);
            b4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == b4) {
                        int count = 0;
                        JLabel le6 = new JLabel();
                        le6.setBounds(170, 200, 80, 40);
                        m.add(le6);

                        String a = TE2.getText();
                        String b = TE1.getText();
                        String k = "vishal";
                        if (b.equalsIgnoreCase(k) ) {
                            count = 100;
                            le6.setText("Result : " + count);
                        } else {
                            for (int i = 0; i < a.length(); i++) {
                                for (int j = 0; j < b.length(); j++) {
                                    if (a.charAt(i) == b.charAt(j)) {
                                        count = count + 10;
                                        break;
                                    }
                                }
                            }
                            if (count > 100) {
                                count = 100;
                            }
                            le6.setText("result : " + count);
                        }
                    }
                }

            });
        }
        if(v.getSource()==b3){
            JFrame j3=new JFrame();
            Container q= j3.getContentPane();
            j3.setVisible(true);
            j3.setTitle("Simple CALCULATOR");
            j3.setResizable(false);
            j3.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            j3.setBounds(600,200,300,600);
            j3.setLayout(null);
            JLabel L0=new JLabel("Number 1st ");
            L0.setBounds(50,50,80,40);
            q.add(L0);
            JLabel L1=new JLabel("Number 2nd ");
            L1.setBounds(50,120,80,40);
            q.add(L1);
            JTextField te12=new JTextField();
            te12.setBounds(150,50,80,40);
            q.add(te12);
            JTextField te13=new JTextField();
            te13.setBounds(150,120,80,40);
            q.add(te13);

            JButton b111=new JButton("ADD");
            JButton b113=new JButton("MUL");
            JButton b114=new JButton("DIV");
            JButton b112=new JButton("SUB");


            b111.setBounds(90,400,60,40);
            b112.setBounds(90,451,60,40);
            b113.setBounds(141,400,60,40);
            b114.setBounds(141,451,60,40);

            q.add(b111);
            q.add(b112);
            q.add(b113);
            q.add(b114);


            JLabel L21=new JLabel();
            L21.setBounds(50,300,70,40);
            q.add(L21);
            b111.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent aasta) {
                    if(aasta.getSource()==b111){
                        int a=Integer.parseInt(te12.getText()) ;
                        int n=Integer.parseInt(te13.getText()) ;
                        int c=a+n;



                        L21.setText("Result " +c);

                    }
                }
            });
            b112.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent aastha1) {
                    if(aastha1.getSource()==b112){
                        int a=Integer.parseInt(te12.getText()) ;
                        int n=Integer.parseInt(te13.getText()) ;
                        int c=a-n;



                        L21.setText("Result " +c);

                    }
                }
            });
            b113.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent aastha2) {
                    if(aastha2.getSource()==b113){
                        int a=Integer.parseInt(te12.getText()) ;
                        int n=Integer.parseInt(te13.getText()) ;
                        int c=a*n;



                        L21.setText("Result " +c);

                    }
                }
            });
            b114.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent aastha3) {
                    if(aastha3.getSource()==b114){
                        int a=Integer.parseInt(te12.getText()) ;
                        int n=Integer.parseInt(te13.getText()) ;
                        int c=a/n;



                        L21.setText("Result " +c);

                    }
                }
            });

        }
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        MyFrame vish= new MyFrame();
    }
}
