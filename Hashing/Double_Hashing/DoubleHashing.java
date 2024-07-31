import java.util.ArrayList;
public class DoubleHashing {
    String[] hashTable;
    int usedCellNumber;

    public DoubleHashing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int simpleASCIIHashFunction(String word, int hashTableSize) {
        int asciiSum = 0;
        for (int i = 0; i < word.length(); i++) {
            asciiSum += +word.charAt(i);
        }
        return asciiSum % hashTableSize;
    }

    public void reHashKeys(String word) {
        usedCellNumber = 0;
        ArrayList<String> dArrayList = new ArrayList<>();
        for (String string : hashTable) {
            if (string != null) {
                dArrayList.add(word);
            }
        }

        hashTable = new String[hashTable.length * 2];
        for (String string : dArrayList) {
            insertKeyInHashTable(string);
        }
    }

    private int addAllDigitTogther(int sum) {
        int value = 0;
        while (sum > 0) {
            value = sum % 10;
            sum /= 10;
        }
        return value;
    }

    public int secondHashFunction(String word, int hashTableSize) {
        int asciiSum = 0;
        for (int i = 0; i < word.length(); i++) {
            asciiSum += word.charAt(i);
        }
        while (asciiSum > hashTableSize) {
          asciiSum =   addAllDigitTogther(asciiSum);
        }
        return asciiSum % hashTableSize;
    }

    public double getLoadFactor() {
        return usedCellNumber * 1.0 / hashTable.length;
    }

    public void insertKeyInHashTable(String value) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
          reHashKeys(value);
        } else {
          int x = simpleASCIIHashFunction(value, hashTable.length);
          int y = secondHashFunction(value, hashTable.length);
          for (int i = 0; i<hashTable.length; i++) {
            int newIndex = (x + i*y) % hashTable.length;
            if (hashTable[newIndex] == null) {
              hashTable[newIndex] = value;
              System.out.println(value +" inserted at location:" +newIndex);
              break;
            } else {
              System.out.println(newIndex +" is occupied. Tryin next empty index..");
            }
    
          }
        }
        usedCellNumber++;
    
      }

    public void displayInHashTable() {
        System.out.println("______HASHTABLE______");
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Index : " + i + " , Key : " + hashTable[i]);
        }
    }

}
