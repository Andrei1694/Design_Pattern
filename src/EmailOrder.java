import java.util.List;

public class EmailOrder implements Order {

    private String clientEmailAdress;

    public String getClientEmailAdress() {
        return clientEmailAdress;
    }

    public void setClientEmailAdress(String clientEmailAdress) {
        this.clientEmailAdress = clientEmailAdress;
    }

    @Override
    public List<Food> getFoods() {
        return null;
    }
}
