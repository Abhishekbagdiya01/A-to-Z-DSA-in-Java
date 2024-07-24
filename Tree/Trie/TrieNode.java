import java.util.HashMap;
import java.util.Map;
public class TrieNode {
   Map<Character,TrieNode> children;
   boolean isEndOfString;
    public TrieNode(){
        children = new HashMap<>();
        isEndOfString = false;
    }
}
