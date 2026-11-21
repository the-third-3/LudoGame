package dicegame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class LudoGame {
public static void main(String[] args) {
  JFrame dice=new JFrame("DICE GAME");

  dice.setSize(280,200);

  dice.setVisible(true);

  dice.getContentPane().setBackground(Color.blue);

  dice.setLayout(null);

  JLabel Number = new JLabel("NUMBER ROLLED");

  Number.setBounds(70,15,200,50);

final JTextField num= new JTextField();

   num.setBounds(104,55,27,40);

   num.setFont(new Font("Arial",Font.BOLD,35));

   num.setForeground(Color.cyan);

   dice.add(num);

   dice.add(Number);

   JButton roll=new JButton("ROLL");

  dice.add(roll);

  roll.setBounds(80,110,90,40);

  roll.setBackground(Color.red);

  roll.addActionListener(new ActionListener(){

          public void actionPerformed(ActionEvent e){

          Random rand= new Random();

              int number=rand.nextInt(5);

              num.setText(String.valueOf(number));

              }} );

  

}
}

