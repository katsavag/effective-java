public class Item2 {


    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Intel i9", "32GB")
                .graphicsCard("NVIDIA RTX 4090")
                .storage("256GB")
                .withWiFi()
                .withBluetooth()
                .operatingSystem("Linux")
                .build();

        System.out.println(computer);
    }



    public static class Computer {
        // Required parameters
        private final String processor;
        private final String ram;

        // Optional parameters
        private final String graphicsCard;
        private final String storage;
        private final boolean hasWiFi;
        private final boolean hasBluetooth;
        private final String operatingSystem;
        private final Integer warrantyYears;

        private Computer(Builder builder) {
            this.processor = builder.processor;
            this.ram = builder.ram;
            this.graphicsCard = builder.graphicsCard;
            this.storage = builder.storage;
            this.hasWiFi = builder.hasWiFi;
            this.hasBluetooth = builder.hasBluetooth;
            this.operatingSystem = builder.operatingSystem;
            this.warrantyYears = builder.warrantyYears;
        }

        @Override
        public String toString() {
            return "Computer{" +
                    "processor='" + processor + '\'' +
                    ", ram='" + ram + '\'' +
                    ", graphicsCard='" + graphicsCard + '\'' +
                    ", storage='" + storage + '\'' +
                    ", hasWiFi=" + hasWiFi +
                    ", hasBluetooth=" + hasBluetooth +
                    ", operatingSystem='" + operatingSystem + '\'' +
                    ", warrantyYears=" + warrantyYears +
                    '}';
        }

        public static class Builder {
            // Required parameters
            private final String processor;
            private final String ram;

            // Optional parameters - initialized to default values
            private String graphicsCard = "Integrated Graphics";
            private String storage = "256GB SSD";
            private boolean hasWiFi = false;
            private boolean hasBluetooth = false;
            private String operatingSystem = "Linux";
            private Integer warrantyYears = 1;

            public Builder(String processor, String ram) {
                this.processor = processor;
                this.ram = ram;
            }

            public Builder graphicsCard(String graphicsCard) {
                this.graphicsCard = graphicsCard;
                return this;
            }

            public Builder storage(String storage) {
                this.storage = storage;
                return this;
            }

            public Builder withWiFi() {
                this.hasWiFi = true;
                return this;
            }

            public Builder withBluetooth() {
                this.hasBluetooth = true;
                return this;
            }

            public Builder operatingSystem(String operatingSystem) {
                this.operatingSystem = operatingSystem;
                return this;
            }

            public Builder warrantyYears(Integer warrantyYears) {
                this.warrantyYears = warrantyYears;
                return this;
            }

            public Computer build() {
                return new Computer(this);
            }
        }
    }
}
