public class Main {

    //todo [X] Observer, Strategy, [X]Builder, [X] Factory, [X] Singleton

    public static void main(String[] args) {

        Chef chef = Chef.getInstance();
        Client client1 = new Client(chef);

        Order o = client1.createOrder("TELEPHONE");
        client1.setOrder(o);
        TelephoneOrder telephoneOrder = (TelephoneOrder) client1.getOrder();
        telephoneOrder.addFoodToOrder(new Pizza.PizzaBuilder()
                .withDough("Cdsada")
                .withSauce("HOT")
                .withTopping(Topping.SALAMI)
                .build());
        telephoneOrder.setCleintTelephoneNr("0732 544 444");
        client1.sendOrderToRestaurant(chef);


        System.out.println();
        chef.printOrders();
        chef.bake(client1);
        chef.printOrders();
        client1.printFoods();


    }
}
