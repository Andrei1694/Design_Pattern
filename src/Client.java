import Observable.Observer;
import java.util.ArrayList;
import java.util.List;

//Observer
public class Client extends Observer {

    private Order order;
    private List<Food> finishedOrders;

    Client(Chef chef){
        finishedOrders = new ArrayList<>();
        this.subject = chef;
        this.subject.add(this);
    }

    //factory method
    public Order createOrder(String orderType){
        orderType = orderType.toUpperCase();
        if(orderType == "TELEPHONE"){
            return new TelephoneOrder();
        }

        if(orderType == "WEBSITE"){
            return new WebsiteOrder();
        }

        if (orderType == "EMAIL"){
            return new EmailOrder();
        }

        if(orderType == "RESTAURANT"){
            return new RestaurantOrder();
        }

        return null;
    }

    public void sendOrderToRestaurant(Chef chef){
        chef.getOrders().add(this.getOrder());
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    //TEST
    public void printFoods() {

        System.out.println("-------------TEST---------------");
        this.finishedOrders.stream().forEach(System.out::println);

    }

    @Override
    public void update() {
        System.out.println("Client has recived food");
    }

    public List<Food> getFinishedOrders() {
        return finishedOrders;
    }

    public void setFinishedOrders(List<Food> finishedOrders) {
        this.finishedOrders = finishedOrders;
    }
}
