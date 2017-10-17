package com.vijai;

public class Ingredient {
    private final int servingSize;
    private final int amount;
    private final int sugar;
    private final int salt;

    private Ingredient(Builder builder) {
        servingSize = builder.servingSize;
        amount = builder.amount;
        sugar = builder.sugar;
        salt = builder.salt;
    }

    public static class Builder {
        private final int servingSize;
        private final int amount;
        private  int sugar =0;
        private  int salt =0;

        public Builder(int servingSize, int amount) {
            this.servingSize = servingSize;
            this.amount = amount;
        }

        public Builder sugar(int val) {
            sugar = val;
            return this;
        }
        public Builder salt(int val) {
            salt = val;
            return this;
        }

        public Ingredient build() {
            return new Ingredient(this);
        }
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "servingSize=" + servingSize +
                ", amount=" + amount +
                ", sugar=" + sugar +
                ", salt=" + salt +
                '}';
    }
}
