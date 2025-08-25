import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class task2 extends JFrame implements ActionListener{
    JLabel title;    
    JLabel userInput;
    JTextField userChoice;
    JButton submit;
    JLabel note;
    JLabel result;
    JLabel background;
    int attempt = 0, secretNumber;

    public task2(){
              
        this.setLayout(null);;
        this.setSize(700,400);
        this.setTitle("Task2");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        


        // Container c = this.getContentPane();
        ImageIcon image = new ImageIcon("back1.jpg");
        title = new JLabel("Number Guessing Game");        
        userInput = new JLabel("Enter your guess: ");  
        userChoice = new JTextField();   
        submit = new JButton("Submit"); 
        note = new JLabel("(Note: Enter a number from 1 to 10 only.)");
        result = new JLabel();      
        background = new JLabel(image); 

        title.setBounds(200,40,500,50);                    
        userInput.setBounds(220,120,200,30);
        userChoice.setBounds(390,120,100,30);
        submit.setBounds(300,160,80,30);
        note.setBounds(230,190,300,30);
        result.setBounds(310,230,300,30);
        background.setBounds(0, 0, 700, 400);

        title.setForeground(Color.yellow);   
        userInput.setForeground(Color.white);
        note.setForeground(Color.orange); 
        result.setForeground(Color.white);      

        title.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
        userInput.setFont(new Font("Verdana", Font.BOLD, 16));
        note.setFont(new Font("Segoe UI", Font.BOLD, 12));
        result.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        
        this.add(background);
        background.add(title);
        background.add(userInput);
        background.add(userChoice);
        background.add(submit);
        background.add(note);
        background.add(result);
                

        this.setVisible(true);

        Random rand = new Random();
        secretNumber = rand.nextInt(10)+1;

        submit.addActionListener(this);
    }
    
    public static void main(String[] args) {
        task2 obj = new task2();        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = userChoice.getText();
        int guess = Integer.parseInt(input);
        attempt++;

        if(guess == secretNumber){ 
             
            result.setText(" Congrats, You guessed it right in " + attempt + " tries!, Winner");
            result.setBounds(140,230,500,30);
            attempt = 0; 
            

        }else if(guess > secretNumber){
            result.setText("Too High!");

        }else{
            result.setText("Too Low!");
        }       

    }
}
