public class Trie {
   private TrieNode root;

   public Trie() {
      root = new TrieNode();
      System.out.println("The Trie has been created");
   }

   public void insert(String word) {
      TrieNode currentNode = root;
      for (int i = 0; i < word.length(); i++) {
         char ch = word.charAt(i);
         TrieNode node = currentNode.children.get(ch);
         if (node == null) {
            node = new TrieNode();
            currentNode.children.put(ch, node);
         }
         currentNode = node;
      }
      currentNode.isEndOfString = true;
      System.out.println("Successfully inserted " + word + " in Trie.");
   }
   public boolean search(String word){
      TrieNode currentNode = root;
      for (int i = 0; i < word.length(); i++) {
         char ch = word.charAt(i);
         TrieNode node = currentNode.children.get(ch);
         if (node == null) {
            System.out.println(word + " doesn't exist in Trie");
            return false;
         }
         currentNode = node;
      }
      if(currentNode.isEndOfString==true){
         System.out.println(word + " exists in Trie");
      }else{
         System.out.println("Word : "+ word + " doesn't exist in Trie. but it is a prefix of another string");
      }
      return currentNode.isEndOfString;
   }   
}
 