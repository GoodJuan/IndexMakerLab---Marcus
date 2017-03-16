import java.util.*;
/**
 * Write a description of class IndexEntry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IndexEntry
{
    private String word;
    private ArrayList<Integer> numList;
    
    public IndexEntry(String input){
        word = input.toUpperCase();
        numList = new ArrayList<Integer>();
    }
    
    public void add(int num){
        boolean in = false;
        for (int x : numList){
            if (x == num){
                in = true;
                break;
            }
        }
        if (in == false){
            numList.add(num);
        }
    }
    
    public String getWord(){
        return word;
    }
    
    public String toString(){
        String numbers = "";
        for (int x : numList){
            numbers += String.valueOf(x) + ", ";
        }
        return word + " " + numbers;
    }
    
}
