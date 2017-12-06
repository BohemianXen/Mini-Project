/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blaze
 */
import java.util.LinkedHashMap;

public class App {
    String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", 
                       "G#", "A", "A#", "B"};
    String[] solfegeNames = {"Do", "Re", "Mi", "Fa", "So", "La", "Ti"};
    int[] solfegeNumbers = {0, 2, 4, 5, 7, 9, 11}; 
    LinkedHashMap <String, Integer> solfege = new LinkedHashMap<>();
    
    public void start(){
        for (int i = 0; i < (solfegeNames).length; i++){
            solfege.put(solfegeNames[i], solfegeNumbers[i]);
        }
    
        String[] scaleIn = getScale("D");
        for (String note: scaleIn){
            System.out.print(note + " ");
        }     
    }
    
    private String[] getScale(String noteScale){
        String[] scale = new String[solfegeNames.length];
        int startIndex = 0;
        for (String note: notes){
            if (note.equals(noteScale)){ break;}
            startIndex++;
        }
        
       // if (startIndex > notes.length + 1) TODO: Add error check
       int index, counter = 0;

       for (int jump : solfegeNumbers){
           //remainder = startIndex % notes.length;
           index = startIndex + jump;
           if (index >= notes.length){
               index = notes.length - jump;
            }
           scale[counter] = notes[index];
           counter++;
           // if (counter > scale.length){break;} TODO: Handle error  
       }
        
        return scale;
    }  
}
