import Observable.Subject;

import java.util.ArrayList;
import java.util.List;

//Singleton
//Subject
public class Chef extends Subject {

    private List<Order> orders;
    private static Chef ourInstance = new Chef();

    public static Chef getInstance() {
        return ourInstance;
    }

    private Chef() {
        orders = new ArrayList<>();

        TelephoneOrder telephoneOrder1 = new TelephoneOrder();
        TelephoneOrder telephoneOrder2 = new TelephoneOrder();
        TelephoneOrder telephoneOrder3 = new TelephoneOrder();
        TelephoneOrder telephoneOrder4 = new TelephoneOrder();

        telephoneOrder1.setCleintTelephoneNr("0732 539 017");
        telephoneOrder1.addFoodToOrder(new Pizza.PizzaBuilder().withDough("S").withSauce("HOT").withTopping(Topping.SALAMI).build());
        telephoneOrder2.setCleintTelephoneNr("0731 314 444");
        telephoneOrder2.addFoodToOrder(new Pizza.PizzaBuilder().withDough("A").withSauce("HOT").withTopping(Topping.SALAMI).build());
        telephoneOrder3.setCleintTelephoneNr("0730 010 476");
        telephoneOrder3.addFoodToOrder(new Pizza.PizzaBuilder().withDough("B").withSauce("HOT").withTopping(Topping.SALAMI).build());
        telephoneOrder3.addFoodToOrder(new Pizza.PizzaBuilder().withDough("BBBB").withSauce("HOT").withTopping(Topping.SALAMI).build());
        telephoneOrder4.setCleintTelephoneNr("0742 190 332");
        telephoneOrder4.addFoodToOrder(new Pizza.PizzaBuilder().withDough("VV").withSauce("HOT").withTopping(Topping.SALAMI).build());

        orders.add(telephoneOrder1);
        orders.add(telephoneOrder2);
        orders.add(telephoneOrder3);
        orders.add(telephoneOrder4);
    }

    public void bake(Client client) {
        List<Food> food = this.orders.stream().findFirst().get().getFoods();
        for (Food f : food) {
            client.getFinishedOrders().add(f);
        }
        this.orders.stream().findFirst().ifPresent(order -> orders.remove(order));
        this.setState(2);

    }


    //TEST
    public void printOrders() {
        this.orders.stream().forEach(System.out::println);
        System.out.println("-------------------------------------");
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public static Chef getOurInstance() {
        return ourInstance;
    }

    public static void setOurInstance(Chef ourInstance) {
        Chef.ourInstance = ourInstance;
    }
}
