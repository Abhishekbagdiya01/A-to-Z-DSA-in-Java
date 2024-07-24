public class Main {
    public static void main(String[] args) {
        TreeNode drink = new TreeNode("Drink");
        TreeNode cold = new TreeNode("Cold");
        TreeNode hot = new TreeNode("Hot");
        TreeNode mojito = new TreeNode("Mojito");
        TreeNode coldCoffee = new TreeNode("Cold Coffee");
        TreeNode tea = new TreeNode("tea");
        TreeNode hotCoffee = new TreeNode("Hot coffee");

        drink.addChild(cold);
        drink.addChild(hot);

        cold.addChild(mojito);
        cold.addChild(coldCoffee);

        hot.addChild(tea);
        hot.addChild(hotCoffee);

        System.out.println(drink.print(0));
    }
}
