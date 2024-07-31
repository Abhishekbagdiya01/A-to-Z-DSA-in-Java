public class Main {
   public static void main(String[] args) {
      DoubleHashing dh = new DoubleHashing(15);
    dh.insertKeyInHashTable("Hello world");
    dh.insertKeyInHashTable("Hello There");
    dh.insertKeyInHashTable("Pikachu");
    dh.insertKeyInHashTable("Jojo");
    dh.insertKeyInHashTable("El Psy Kongroo");
    dh.displayInHashTable();
   } 
}
