public class Trie {
   private TrieNode root;

   public Trie() {
      root = new TrieNode();
      System.out.println("The Trie has been created");
   }
   // Insert string in Trie
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

   //Search string from Trie
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

   // Delete a string from Trie
   private boolean delete(TrieNode parentTrieNode,String word ,int index){
            char ch = word.charAt(index);
            TrieNode currentNode = parentTrieNode.children.get(ch);
            boolean canThisNodeBeDeleted;

            if (currentNode.children.size()>1) {
              delete(currentNode, word, index+1);
              return false; 
            }
            if (index == word.length()-1) {
              if (currentNode.children.size()>1) {
               currentNode.isEndOfString=false;
               return false;
              }else{
               parentTrieNode.children.remove(ch);
               return true;
              } 
            }
            if (currentNode.isEndOfString==true) {
               delete(currentNode, word, index+1);
            }
            canThisNodeBeDeleted = delete(currentNode, word, index+1);
            if (canThisNodeBeDeleted) {
              parentTrieNode.children.remove(ch);
              return true; 
            }else{
               return false;
            }
   }
   public void delete(String word){
      if (search(word)) {
         delete(root, word, 0);
      }
   }
}
 