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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 *
 * @author mac
 */
public class ReadandWrite {
 

    
    
    private FileWriter fw;
    private FileReader fr;
    private static int points;
    private  static HashMap<String,Integer> ranker=new HashMap<>();
    ArrayList<String> merger=new ArrayList<>();
    private static int position;
    private static String finalranking;
    
    
    
    public void setPoints(int points){
        this.points=points;
    }
    public static int getPoints(){
        return points;
    }
    
    
    public void setPos(int pos){
        this.position=pos;
    }
    public static int getPos(){
        return position;
    }
    
    public void setStandings(String table){
        this.finalranking=table;
    }
       
    public static String getStandings(){
        return finalranking;
    }
           
     
    public boolean checkIfMatchRegister() throws IOException{
        boolean check=true;
        try {
            fr=new FileReader("Secretinfo.txt");
            BufferedReader bf=new BufferedReader(fr);
            String str; 
            
            String username=User.getUsername();
            
            while((str=bf.readLine())!=null){
                ArrayList<Character>merger=new ArrayList<>();
                for (int i = 0; i < str.length(); i++) {
                   if(str.charAt(i)=='\t'){
                       //System.out.println(str.charAt(i));
                       break;
                       
                   }
                   else if(str.charAt(i)!='\t'){
                       merger.add(str.charAt(i));
                       //System.out.println(str.charAt(i));
                   }
                    
                }
               String finalusername ="";
                for (int i = 0; i <merger.size(); i++) {
                  finalusername+=merger.get(i);
                    
                }
                //System.out.println(finalusername);
                if(username.equals(finalusername))
                {
                    check=false;
                  
                }
                
            }
        } 
        catch (FileNotFoundException e) {
            
        }
        
        return check;
    }
    
     public boolean checkIfexistingLogin(User obj){
        boolean check=true;
        try {
            fr=new FileReader("Secretinfo.txt");
            BufferedReader bf=new BufferedReader(fr);
            String str;   
            while((str=bf.readLine())!=null){
                if(str.equals(User.getUsername()+"\t"+User.getPassword()))
                {
                    check=false;
                  
                }
                
            }
        } 
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return check;
    }
     
 
    public void setinfotoFiles(User obj) throws IOException{
        try {
          
            fw = new FileWriter("Secretinfo.txt",true);
            fw.write(User.getUsername()+"\t"+User.getPassword() + "\n");
            fw.close();
              
            fw = new FileWriter("Points.txt", true);
            fw.write(User.getUsername() + "\t" + "0"+ '\n');
            fw.close();
            
        }
             
        catch (IOException e) {
            
        }
         
         
  
    }
    public void convertALtoHM(int points,String username) throws FileNotFoundException, IOException{
        fr=new FileReader("Points.txt");
       BufferedReader bf=new BufferedReader(fr);
       String str;
       
      while((str=bf.readLine())!=null){
          String currentusername ="";
          String reversedpoints="";
          String finalpoint="";
          for (int i = 0; i < str.length(); i++) {
              if(str.charAt(i)!='\t'){
                  currentusername+=str.charAt(i);
              }
              else{
                  break;
              } 
          }
          
          
              for (int i = str.length()-1; i >=0 ; --i) {
                  if(str.charAt(i)!='\t'){
                       reversedpoints+=str.charAt(i);
                  }
                  else{
                      break;
                  }
                  
              }
              
              for (int i = reversedpoints.length()-1; i>=0; i--) {
              finalpoint+=reversedpoints.charAt(i);
              
          }
            int convert=Integer.parseInt(finalpoint);
                 ranker.put(currentusername, convert);
             
      }
       bf.close();
       
        for (String i:ranker.keySet()) {
           if(i.equals(User.getUsername()))
           {
               setPoints(ranker.get(i)+points);
               ranker.replace(i,ranker.get(i)+points);
           }
        }
        fw=new FileWriter("Points.txt");
       for (String i:ranker.keySet()) {
           fw.write(i+"\t"+ranker.get(i)+"\n");
       }
       fw.close();
       ranks(username);
   
    }
    
    public void ranks(String username){
    
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : ranker.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list); 
        for (int num : list) {
            for (Map.Entry<String, Integer> entry : ranker.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        //System.out.println(sortedMap);
        ArrayList<String> table=new ArrayList<>();
        int counter=sortedMap.size();           
        for(String i :sortedMap.keySet()){
            table.add(String.format("%d:%s -- %d\n",counter,i,sortedMap.get(i)));
            if(i.equals(username)){
                setPos(counter);
            }
            counter--; 
        
        }
        String finaltable="";
        for (int i =table.size()-1; i>=0; i--) {
           
            finaltable+=table.get(i);
            
        }
        setStandings(finaltable);
    }
}
    
    


 



