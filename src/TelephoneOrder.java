import java.util.ArrayList;
import java.util.List;

public class TelephoneOrder implements Order{

    private String cleintTelephoneNr;
    private List<Food> foods;

    TelephoneOrder(){
        foods = new ArrayList<>();
    }

    public Food addFoodToOrder(Food food){
        this.foods.add(food);
        return food;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public String getCleintTelephoneNr() {
        return cleintTelephoneNr;
    }

    public void setCleintTelephoneNr(String cleintTelephoneNr) {
        this.cleintTelephoneNr = cleintTelephoneNr;
    }

    @Override
    public String toString() {
        return "TelephoneOrder{" +
                "cleintTelephoneNr='" + cleintTelephoneNr + '\'' +
                ", foods=" + foods +
                '}';
    }
}
