class Main {
    public static void main(String[] args) {

        LinearProbing linearProbing = new LinearProbing(5);
        linearProbing.insertInHashTable("Hello world");
        linearProbing.insertInHashTable("Helloiiii world");
        linearProbing.search("Hello world");
        linearProbing.delete("Hello world");
        linearProbing.displayInHashTable();
    }
}