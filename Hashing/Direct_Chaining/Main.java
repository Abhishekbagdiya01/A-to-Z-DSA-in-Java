public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(25);
        directChaining.insertInHashTable("Hii");
        directChaining.insertInHashTable("How are you");
        directChaining.insertInHashTable("ohh i see");
        directChaining.insertInHashTable("SPD Emergrncy");
        directChaining.insertInHashTable("I chose you pikachu");
        directChaining.insertInHashTable("I am Batman");
        directChaining.insertInHashTable("Wubba lubba dub dub");
        directChaining.insertInHashTable("Bonk");
        directChaining.insertInHashTable("That's make some sense");
        directChaining.insertInHashTable("i am out of my convo skill");
        directChaining.insertInHashTable("No Cap");
        directChaining.traverseInHashTable();
        // System.out.println(directChaining.search("Hii"));
        // System.out.println(directChaining.search("Thor"));
        directChaining.deleteKeyHashTable("Hii");
        directChaining.deleteKeyHashTable("Hii");
        directChaining.search("Hii");
        directChaining.traverseInHashTable();
    }
}
