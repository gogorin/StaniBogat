/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stanibogat1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mac
 */
public class Ranklistmethods {
    
    private FileReader fr;
    public LinkedList<Ranklistuser> getRanksfromFile() throws FileNotFoundException, IOException{
        LinkedList<Ranklistuser> list=new LinkedList<>();
            
        fr=new FileReader("Secretinfo.txt");
        BufferedReader bf=new BufferedReader(fr);
        String str; 
       
       
            while((str=bf.readLine())!=null){
                
                String arr[]=str.split("\t");
                int points =Integer.parseInt(arr[1]);
                Ranklistuser obj=new Ranklistuser(arr[0],points);
                list.add(obj);
                }
            bf.close();
            return list;
    }
    public String displayRanklist() throws IOException{
       
        LinkedList<Ranklistuser> list=getRanksfromFile();
        //quicksort.sortmethod(list,list.head,list.lastkletka);
       String answer="";
        for (int i = 0; i < list.size(); i++) {
            answer+=(i+1)+" : "+ list.get(i).getUsername()+ " - "+list.get(i).getPoints()+"\n";
            
        }
        return answer;
    }
    public int  Findyourposition(Ranklistuser obj) throws IOException{
       
        LinkedList<Ranklistuser> list=getRanksfromFile();
        //quicksort.sortmethod(list,list.head,list.lastkletka);
        int chislo=0;
        for (int i = 0; i < list.size(); i++) {
          if(list.get(i)==obj){
              chislo=i+1;
          }
            
        }
        return chislo;
    }
    
    
   public Ranklistuser findyourmatchinfile(String username) throws IOException{
       LinkedList<Ranklistuser> list=getRanksfromFile();
       Ranklistuser obj=new Ranklistuser();
       for (int i = 0; i < list.size(); i++) {
           if(list.get(i).getUsername().equals(username)){
               obj=list.get(i);
           }
           
       }
       return obj;
   }
    
    
    
}
