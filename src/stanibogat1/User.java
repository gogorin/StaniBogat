/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanibogat1;



import java.util.regex.*;


public class User extends Register {
    
    private  String username;
    private  String password;
    
  
  
    
    public boolean username_checker(String s)
    {
        Pattern p = Pattern.compile("^[a-zA-Z][\\w]{0,9}");
        return p.matcher(s).matches();
    }
    
    public boolean password_checker(String s)
    {
        Pattern p = Pattern.compile("^[a-zA-Z0-9][\\w@#$!]{0,9}");
        return p.matcher(s).matches();
    }
    
    public  void setUsername(String username){
        if(username_checker(username)){
            this.username=username;
        }
        else
        {
            throw new RuntimeException("Empty");
        }
    }
    
    public  String getUsername(){
        return username;
    }
    public void setPassword(String password){
        if(password_checker(password)){
            this.password=password;
        }
        else
        {
            throw new RuntimeException("Empty");
        }
    }
    public  String getPassword(){
        return password;
    }
    
    
    public User(String username, String password)
    {
        setUsername(username);
        setPassword(password);
        
    }
    
    public User()
    {
        this("a", "a");
    }
    
    public User(User obj){
        this(obj.getUsername(),obj.getPassword());
    }
    @Override
    public String toString()
    {
           return String.format("%s \n %s",getUsername(),getPassword()) ;
    }
}

