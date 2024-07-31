import java.util.ArrayList;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    LinearProbing(int size) {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int modASCIIHashFunction(String word, int hashTableSize) {
        int asciiSum = 0;
        for (int i = 0; i < word.length(); i++) {
            asciiSum += +word.charAt(i);
        }
        return asciiSum % hashTableSize;
    }

    public double getLoadFactor() {
        return usedCellNumber * 1.0 / hashTable.length;
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
            insertInHashTable(string);
        }
    }

    public void insertInHashTable(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            reHashKeys(word);
        } else {
            for (int i = index; i < index + hashTable.length; i++) {
                int newIndex = i % hashTable.length;
                if (hashTable[newIndex] == null) {
                    hashTable[newIndex] = word;
                    System.out.println(word + " inserted successfully at location : " + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " is already occupied. Trying on next cell");
                }
            }
        }
        usedCellNumber++;
    }

    public void displayInHashTable(){
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Index : " +i +" , Key : " + hashTable[i]);
        }
    }

    public boolean search(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);
        for (int i = 0; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                System.out.println(word + " found at location : " + newIndex);
                return true;
            }
        }
        System.out.println(word + " doesn't found in Hashtable");
        return false;
    }

    public void delete(String word) {
        int index = modASCIIHashFunction(word, hashTable.length);
        for (int i = 0; i < index + hashTable.length; i++) {
            int newIndex = i % hashTable.length;
            if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                hashTable[newIndex] = null;
                usedCellNumber--;
                System.out.println(word + " has been deleted successfully");
                return;
            }
        }

        System.out.println(word + " doesn't exist in Hashtable");

    }

}