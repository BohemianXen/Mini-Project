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
import java.util.Arrays;

public class App {
    private String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G",
                       "G#", "A", "A#", "B"};
    private String[] solfegeNames = {"Do", "Re", "Mi", "Fa", "So", "La", "Ti"};
    private int[] solfegeNumbers = {0, 2, 4, 5, 7, 9, 11};
    private LinkedHashMap <String, Integer> solfege = new LinkedHashMap<>();
    
    public void start(){
        for (int i = 0; i < (solfegeNames).length; i++){
            solfege.put(solfegeNames[i], solfegeNumbers[i]);
        }
        System.out.println(getNote("C", "Do"));
        System.out.println(getNote("C", "Re"));
        System.out.println(getNote("C", "Mi"));
        System.out.println(getNote("D", "Mi"));
        System.out.println(getNote("A#", "Fa"));
    }
    
    private String getNote(String noteScale, String solfegeIn){
        if (Arrays.asList(notes).contains(noteScale) && solfege.containsKey(solfegeIn)) {
            int startIndex = 0;
            for (String note: notes){
                if (note.equals(noteScale)){ break;}
                startIndex++;
            }

            int jump = solfege.get(solfegeIn);
            int index = startIndex + jump;

            if (index >= notes.length){
                index -= notes.length;
            }

            String note = notes[index];
            return note;
        }
        else {
            return "Failed";
        }

    }  
}
