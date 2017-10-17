package com.vijai;

public class Main {

    public static void main(String[] args) {
	Proto proto = new Proto();
        System.out.println(proto.go().go2());

        Ingredient ingr =  new Ingredient.Builder(100, 1).sugar(40).salt(20).build();
        System.out.println(ingr.toString());

        Inventory inv = new Inventory.InventoryBuilder().withArmour(1).withAmulets(3).build();
        System.out.println(inv);

    }



}
