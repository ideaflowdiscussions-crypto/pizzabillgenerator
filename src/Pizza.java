public class Pizza {
    private double price;
    private boolean vegitable;
    private final int topping = 100;
    private int cheese = 150;
    private int bag = 20;
    private double basePrice;
    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isTakeAway = false;


    public Pizza(boolean vegitable) {
        this.vegitable = vegitable;
        if(vegitable){
            this.price = 300;
        }
        else {
            this.price = 400;
        }

        basePrice = this.price;


    }

    void addToppings(){
        // ....
        System.out.println("TOPPING IS ADDED!");
        basePrice+=topping;
    }

    void addExtraCheese(){
        System.out.println("EXTRA CHEESE IS ADDED!");
        basePrice = cheese;
    }

    void takeAway(){
        System.out.println("TAKE AWAY!");
        basePrice += bag;
        // takeaway
    }

    void bill(){
        System.out.println("BILL: "+basePrice);
        if(isCheeseAdded){
            System.out.println("EXTRA CHEESE: "+cheese);
        }
        if(isToppingsAdded){
            System.out.println("EXTRA TOPPINGS: "+isToppingsAdded);
        }
        if(isTakeAway){
            System.out.println("BAG: "+bag);
        }
    }

    void banner(){
        System.out.println("-".repeat(50));
        System.out.println("WELCOME TO THE BILL GENERATOR!");
        System.out.println("-".repeat(50));
    }




//
//    public void setPrice() {
//        System.out.println("Bill: "+price);
//    }
}
