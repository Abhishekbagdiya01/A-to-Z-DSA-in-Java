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

}
 