/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanibogat1;

import javax.swing.JLabel;




/**
 *
 * @author n
 */
public class Questionsgeneratorclass implements QuestionsgeneratorInterface{

    @Override
    public void generateQuetion(int difficulty, JLabel lblq, JLabel lblA, JLabel lblB, JLabel lblC, JLabel lblD) {
        switch(difficulty){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    @Override
    public void Joker5050() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String JokerPhoneAFriend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String JokerAudience() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
