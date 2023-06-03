/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanibogat1;

import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




/**
 *
 * @author n
 */
public class Questionsgeneratorclass implements QuestionsgeneratorInterface{

  

    @Override
    public void Joker5050(javax.swing.JLabel[] arr,int i,int counter) {
        Random gen=new Random();
        i=gen.nextInt(4);
        if(arr[i].getText().equals("")){
            Joker5050(arr, i, counter);
        }
        if(counter==2){
            return;
        }else{
           
            arr[i].setText("");
            Joker5050(arr, i, counter+1);
        }
    }

    @Override
    public void JokerPhoneAFriend(Questions obj) {
        switch(obj.getDifficulty()){
            case 1:
                JOptionPane.showMessageDialog(null, "Верният отговор е "+obj.getAnswer());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Не съм сигурен, но мисля, че верният отговор е "+obj.getAnswer());
                break;
            case 3:
                Random gen =new Random();
                int i=gen.nextInt(2);
                if(i==1){
                    JOptionPane.showMessageDialog(null, "Не съм сигурен, но мисля, че верният отговор е "+obj.getAnswer());
                }else{
                    JOptionPane.showMessageDialog(null, "Съжалявам, но не съм компетентен по тази тема");
                }
                        
                break;
                
                
        }
    }

    @Override
    public void JokerAudience(Questions obj) {
        int a=60;
        int b=20;
        int c=7;
        int d=13;
        JOptionPane.showMessageDialog(null,obj.getAnswer()+" - "+a+"\n"+obj.getWrong3()+" - "+b+"\n"+obj.getWrong2()+" - "+c+"\n"+obj.getWrong1()+" - "+d);
    }

    

   
}
