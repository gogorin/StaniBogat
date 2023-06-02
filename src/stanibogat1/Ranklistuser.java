/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanibogat1;


public class Ranklistuser {
    
    private String username;
    private int points;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    public Ranklistuser(String username,int points){
        setUsername(username);
        setPoints(points);
    }
    public Ranklistuser(){
        this("A",0);
    }
    public Ranklistuser(Ranklistuser obj){
        this(obj.getUsername(),obj.getPoints());
    }
    public String toString(){
        
        return String.format("%s - %d",getUsername(),getPoints());
    }
    
    
}
