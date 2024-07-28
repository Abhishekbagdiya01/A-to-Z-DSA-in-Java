import java.util.LinkedList;
public class DirectChaining {
    LinkedList<String>[] hashTable;

    @SuppressWarnings("unchecked")
    DirectChaining(int size){
        hashTable = new LinkedList[size];
    }
    
    public int modASCIIHashFuntion(String word,int m){
        char[] ch = word.toCharArray();
        int total=0;
        for (int i = 0; i < ch.length; i++) {
            total += ch[i];
        }
        return total % m;
    }

    public void insertInHashTable(String word){
        int index = modASCIIHashFuntion(word,hashTable.length);
        if (hashTable[index]== null) {
           hashTable[index] = new LinkedList<String>();
           hashTable[index].add(word);
        }else{
            hashTable[index].add(word);
        }
    }
    public void traverseInHashTable(){
        if (hashTable == null) {
            System.out.println("Hashtable doesn't exist");
        }
        else{
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index "+ i+ ", Key :" +hashTable[i]);
            }
        }
    }
    public boolean search(String word){
        int index = modASCIIHashFuntion(word, hashTable.length);
        if (hashTable[index] != null && hashTable[index].contains(word)) {
            System.out.println("\""+ word + "\"" + " founded in Hashtable at index :" + index);
            return true;
        }else{

            System.out.println("\""+ word + "\"" + " does not found in Hashtable ");
            return false;
        }
    }
    public void deleteKeyHashTable(String word){
        int index = modASCIIHashFuntion(word, hashTable.length);
        boolean result = search(word);
        if (result == true) {
            hashTable[index].remove(word);
            System.out.println("\"" + word + "\"" + " deleted successfully");
        }else{
            System.out.println("\""+ word + "\"" + " does not exist in Hashtable ");
        }
    }
}