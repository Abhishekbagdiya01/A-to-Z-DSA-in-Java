public class Main {
public static void main(String[] args) {
    Trie newTrie = new Trie(); 
    newTrie.insert("Abhishek");
    newTrie.insert("Abhi");
   boolean bool =  newTrie.search("Abhi");
   System.out.println(bool);
   newTrie.delete("Abhi");
   System.out.println(newTrie.search("Abhi"));
}   
}