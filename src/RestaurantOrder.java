import java.util.List;

public class RestaurantOrder implements Order{

    private int clientLineNr;

    public int getClientLineNr() {
        return clientLineNr;
    }

    public void setClientLineNr(int clientLineNr) {
        this.clientLineNr = clientLineNr;
    }

    @Override
    public List<Food> getFoods() {
        return null;
    }
}
