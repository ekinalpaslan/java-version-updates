public enum Currency {

    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    //Penny is an object on currency class


    private int value;
    Currency(int value) {
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
