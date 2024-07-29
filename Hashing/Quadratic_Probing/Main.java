class Main{
    public static void main(String[] args) {
        QuadraticProbing qp = new QuadraticProbing(15);
        qp.insertKeyInHashTable("Hello world");
        qp.insertKeyInHashTable("Hello world");
        qp.insertKeyInHashTable("Hello there");
        qp.insertKeyInHashTable("LFG");
        qp.insertKeyInHashTable("Hello there");
        qp.insertKeyInHashTable("LFG");
        qp.displayInHashTable();
    }
}