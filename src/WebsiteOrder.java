import java.util.List;

public class WebsiteOrder implements Order {

    private String clientHomeAdress;

    public String getClientHomeAdress() {
        return clientHomeAdress;
    }

    public void setClientHomeAdress(String clientHomeAdress) {
        this.clientHomeAdress = clientHomeAdress;
    }

    @Override
    public List<Food> getFoods() {
        return null;
    }
}
