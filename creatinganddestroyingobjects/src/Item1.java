public class Item1 {

    public static void main(String[] args) {
        Pizza pizza = Pizza.createCheesePizza("medium");
        System.out.println(pizza.getSize());
        System.out.println(pizza.hasCheese());
        System.out.println(pizza.hasPepperoni());

        Pizza pizza2 = Pizza.createPepperoniPizza("large");
        System.out.println(pizza2.getSize());
        System.out.println(pizza2.hasPepperoni());
        System.out.println(pizza2.hasCheese());
    }

    public static class Pizza {
        private String size;
        private boolean hasCheese;
        private boolean hasPepperoni;

        // Private constructor - forcing use of factory methods
        private Pizza(String size, boolean hasCheese, boolean hasPepperoni) {
            this.size = size;
            this.hasCheese = hasCheese;
            this.hasPepperoni = hasPepperoni;
        }

        // Static factory methods
        public static Pizza createCheesePizza(String size) {
            return new Pizza(size, true, false);
        }

        public static Pizza createPepperoniPizza(String size) {
            return new Pizza(size, true, true);
        }

        // Getters
        public String getSize() {
            return size;
        }

        public boolean hasCheese() {
            return hasCheese;
        }

        public boolean hasPepperoni() {
            return hasPepperoni;
        }
    }

}
