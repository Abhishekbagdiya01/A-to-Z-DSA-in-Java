import java.util.ArrayList;
public class QuadraticProbing {
   String[] hashTable;
   int usedCellNumber;

   public QuadraticProbing(int size){
    hashTable = new String[size];
    usedCellNumber = 0;
   }

   // Hash functions to be used on Keys
   public int modASCIIHashFunction(String word, int hashTableSize){
    int asciiSum = 0;
    for (int i = 0; i < word.length(); i++) {
       asciiSum =+ word.charAt(i); 
    }
    return asciiSum % hashTableSize;
   }
   
   // get load factor of hashtable
   public double getLoadFactor(){
    return usedCellNumber * 1.0 / hashTable.length;
   }

   // Rehash key
    public void rehashKeys(String newStringToBeInserted) {
		usedCellNumber = 0; 
		ArrayList<String> data = new ArrayList<String>();
		for (String s : hashTable) { 
			if (s != null)
				data.add(s);
		}
		data.add(newStringToBeInserted);
		hashTable = new String[hashTable.length * 2]; 
		for (String s : data) { 
			insertKeyInHashTable(s);
		}
	}
   //Insert value in Hashtable
   public void insertKeyInHashTable(String word) {
    double loadFactor = getLoadFactor();
    if (loadFactor >= 0.75) {
      rehashKeys(word);
    } else {
      int index = modASCIIHashFunction(word, hashTable.length);
      int counter = 0;
      for (int i = index; i< index+hashTable.length; i++) {
        int newIndex = (index + (counter*counter)) % hashTable.length;
        if (hashTable[newIndex] == null) {
          hashTable[newIndex] = word;
          System.out.println(word + " has been inserted successfully");
          break;
        } else {
          System.out.println(newIndex + " is already occupied. Trying next one...");
        }
        counter++;
      }
    }
    usedCellNumber++;
  }

   // Display hashtable
    public void displayInHashTable(){
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Index : " +i +" , Key : " + hashTable[i]);
        }
    }
}
