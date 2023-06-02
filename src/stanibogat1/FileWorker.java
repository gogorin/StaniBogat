/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanibogat1;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author mac
 */
public class FileWorker {
 

    
    
    private FileWriter fw;
    private FileReader fr;
    
          
    public LinkedList<User> convertInfoFromFileToList() throws FileNotFoundException, IOException{
        fr=new FileReader("Secretinfo.txt");
        BufferedReader bf=new BufferedReader(fr);
        String str; 
       
        LinkedList<User> list=new LinkedList<>();
            while((str=bf.readLine())!=null){
                
                String arr[]=str.split("\t");
                User obj=new User(arr[0],arr[1]);
                System.out.println(arr[0]);
                System.out.println(arr[1]);
                list.add(obj);
                }
            bf.close();
            return list;
    }
    
     
    public boolean checkIfMatchRegister(User obj) throws IOException{
        
         fr=new FileReader("Secretinfo.txt");
        BufferedReader bf=new BufferedReader(fr);
        String str; 
       
            while((str=bf.readLine())!=null){
                
                String arr[]=str.split("\t");
                if(obj.getUsername().equals(arr[0])){
                    return false;
                }
               
                
                }
            bf.close();
       return true;
    }
    
     public boolean checkIfexistingLogin(User obj) throws IOException{
       LinkedList<User> list=convertInfoFromFileToList();
       return list.contains(obj);
    }
     
 
    public void setinfotoFiles(User obj,Ranklistuser obj1) throws IOException{
        try {
          
            fw = new FileWriter("Secretinfo.txt",true);
            fw.write(obj.getUsername()+"\t"+obj.getPassword() +"\n");
            fw.close();
              
            fw = new FileWriter("Points.txt", true);
            fw.write(obj1.getUsername() + "\t" +obj1.getPoints()+ '\n');
            fw.close();
            
        }
             
        catch (IOException e) {
            
        }
           
  
    }
   
}
    
    


 



