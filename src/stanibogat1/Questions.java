/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanibogat1;

/**
 *
 * @author georgisa
 */
public class Questions {
   
    private String question;
    private String answer;
    private String wrong1;
    private String wrong2;
    private String wrong3;

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setWrong1(String wrong1) {
        this.wrong1 = wrong1;
    }

    public void setWrong2(String wrong2) {
        this.wrong2 = wrong2;
    }

    public void setWrong3(String wrong3) {
        this.wrong3 = wrong3;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getWrong1() {
        return wrong1;
    }

    public String getWrong2() {
        return wrong2;
    }

    public String getWrong3() {
        return wrong3;
    }

    public Questions(String question, String answer, String wrong1, String wrong2, String wrong3) {
        this.question = question;
        this.answer = answer;
        this.wrong1 = wrong1;
        this.wrong2 = wrong2;
        this.wrong3 = wrong3;
    }
    
    
    
}
