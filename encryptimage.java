package com.test;
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class image {
        public static void encrypt(int x)
        {
             JFileChooser fileChooser=new JFileChooser();
             fileChooser.showOpenDialog(null);
             File file=fileChooser.getSelectedFile();
             try
            {
             FileInputStream fis=new FileInputStream(file);
             byte []data=new byte[fis.available()];
             fis.read(data);
             int i=0;
             for(byte b:data)
             {
            System.out.println(b);
            data[i]=(byte)(b^x);
            i++;
         }


             FileOutputStream fos=new FileOutputStream(file);
             fos.write(data);
             fos.close();
             fis.close();
             JOptionPane.showMessageDialog(null, "Done");
            }
            catch(Exception e)
             {
            e.printStackTrace();
            }
        }

    public static void main(String[] args) {

       JFrame x=new JFrame();
   //    x.setVisible(true);
       x.setSize(500,500);
       Font font=new Font("Roboto",Font.BOLD,25);
       x.setTitle("Teja image encyrption");
       x.setLocationRelativeTo(null);
       x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JTextField textField=new JTextField(20);
       textField.setFont(font);
       JButton button=new JButton();
       button.setText("click here");
       button.setFont(font);
       button.addActionListener(e->{
       System.out.println("button is pressed");
       String s=textField.getText();
       int temp=Integer.parseInt(s);
       System.out.println(temp);
        if(temp==100)
           encrypt(temp);
       });
       x.setLayout(new FlowLayout());
       x.add(button);
       x.add(textField);
       x.setVisible(true);


    }
}