import java.util.*;
/**
 * Write a description of class DocumentIndex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DocumentIndex extends ArrayList<IndexEntry>
{
    
    public DocumentIndex(){
        super();
    }
    public DocumentIndex(int lim){
        super(lim);
    }
    
    public void addWord(String word, int num){
        IndexEntry entry = new IndexEntry(word);
        entry.add(num);
    }
    
    public void addAllWords(String str, int num){
        String[] list = str.split(" ");
        for (String s : list){
            if (s.equals(" ")){
                continue;
            }
            addWord(s, num);
        }
        
    }
    
    private int foundOrInserted(String word){
        int size = this.size();
   
        for (int i = 0; i < size; i++){
            IndexEntry entry = this.get(i);
            String arrWord = entry.getWord();
            int compare = arrWord.compareToIgnoreCase(word);
            if (compare > 0){
                IndexEntry newEntry = new IndexEntry(arrWord);
                this.add(i, newEntry);
                return i;
            }
            
            
        }
        return 0;
    }
    
}
