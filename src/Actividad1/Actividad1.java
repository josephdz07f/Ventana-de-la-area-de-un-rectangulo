package actividad1;

import javax.swing.*;

public class Actividad1 {
    public static void main(String[] args) {
        JFrame ventana= new JFrame("Mi ventana");
        ventana.setSize(400, 400);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(2);
        ventana.setLocationRelativeTo(null);
       
        JLabel lb_base=new JLabel("Base");
        lb_base.setBounds(50, 40, 100, 25);
       
        JTextField text_base = new JTextField();
        text_base.setBounds(100,40,100,25);
       
        JLabel lb_balt =new JLabel("Altura");
        lb_balt.setBounds(50, 90, 100, 25);
       
        JTextField text_alt = new JTextField();
        text_alt.setBounds(100,90,100,25);
       
        JLabel lbres = new JLabel();
        lbres.setBounds(50,250,100,25);
       
        JButton bt = new JButton("Calcular");
        bt.setBounds(140, 170, 160, 30);
       
        bt.addActionListener(e->{
            double base = Double.parseDouble(text_base.getText());
            double altura = Double.parseDouble(text_alt.getText());
            double area = base * altura;
           
            lbres.setText(""+area);

        });
               
        ventana.add(lb_base);
        ventana.add(text_base);
        ventana.add(lb_balt);
        ventana.add(text_alt);
        ventana.add(lbres);
        ventana.add(bt);

        ventana.setVisible(true);
    }
   
    }
