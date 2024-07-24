public class Main {
public static void main(String[] args) {
    Trie newTrie = new Trie(); 
    newTrie.insert("Abhishek");
   boolean bool =  newTrie.search("Abhi");
   System.out.println(bool);
}   
}