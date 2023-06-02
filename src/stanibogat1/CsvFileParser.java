package stanibogat1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvFileParser 
{
    LinkedList<Questions> returnQuestions(String pathFile) 
        {
            LinkedList<Questions> questions = new LinkedList<>();

            try 
            {
                List<String> linesList = Files.readAllLines(Paths.get(pathFile), StandardCharsets.UTF_8);
                linesList.remove(0); //премахва първият ред
                for (String tempRow : linesList) //for-each, в който променливата tempRow приема стойността на всеки ред
                {
                    String[] tempArrString = tempRow.split(","); //масив, в който се разделя реда всеки път, когато се срещне запетая
                    String question = tempArrString[0];
                    String answer = tempArrString[1];
                    String wrong1 = tempArrString[2];
                    String wrong2 = tempArrString[3];
                    String wrong3 = tempArrString[4];
                    int difficulty = Integer.parseInt(tempArrString[5]);
                    Questions list = new Questions(question, answer, wrong1, wrong2, wrong3, difficulty); // въвежда характеристиките в нов обект въпрос
                    questions.add(list);

                }

            } catch (IOException e) {

                e.printStackTrace();
            }

            return questions;
        }
    
}
