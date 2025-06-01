public class Item3Enum {

    public enum SingletonEnum {
        INSTANCE;

        private final String data;

        SingletonEnum() {
            data = "Singleton data";
        }

        public String getData() {
            return data;
        }

        public void doSomething() {
            System.out.println("Singleton is doing something");
        }
    }

}
