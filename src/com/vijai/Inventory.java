package com.vijai;

public class Inventory {
    private   int armour;
    private   int swords;
    private   int shield;
    private   int amulets;

    private Inventory(InventoryBuilder inventoryBuilder) {
        armour = inventoryBuilder.armour;
        swords = inventoryBuilder.swords;
        shield = inventoryBuilder.shield;
        amulets = inventoryBuilder.amulets;
    }

    public static final class InventoryBuilder {
        private static int armour;
        private static int swords;
        private static int shield;
        private static int amulets;

        public InventoryBuilder() {
        }

        public static InventoryBuilder anInventory() {
            return new InventoryBuilder();
        }

        public InventoryBuilder withArmour(int val) {
            armour = val;
            return this;
        }

        public InventoryBuilder withSwords(int val) {
            swords = val;
            return this;
        }

        public InventoryBuilder withShield(int val) {
            shield = val;
            return this;
        }

        public InventoryBuilder withAmulets(int val) {
            amulets = val;
            return this;
        }

        public Inventory build() {
            Inventory inventory = new Inventory(this);
            inventory.shield = this.shield;
            inventory.swords = this.swords;
            inventory.amulets = this.amulets;
            inventory.armour = this.armour;
            return inventory;
        }
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "armour=" + armour +
                ", swords=" + swords +
                ", shield=" + shield +
                ", amulets=" + amulets +
                '}';
    }
}
