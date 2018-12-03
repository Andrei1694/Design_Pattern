import java.util.ArrayList;

//Builder Pattern
class Pizza implements Food{

    private String dough = "";
    private String sauce = "";
    private ArrayList<Topping> topping;

    @Override
    public String getFoodType() {
        return "Pizza";
    }


    public static class PizzaBuilder{
        //builder code
        private String dough = "";
        private String sauce = "";
        private ArrayList<Topping> topping;


        public PizzaBuilder(){
            topping = new ArrayList<>();
        }

        public PizzaBuilder withDough(String dough){
            this.dough = dough;
            return this;
        }

        public PizzaBuilder withSauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder withTopping(Topping topping){
            if(this.topping.size() < 3){
                this.topping.add(topping);
            }else{
                System.out.println("Maximum number of extras reached !");

            }

            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }


    }
    private Pizza(PizzaBuilder pizzaBuilder){
        this.dough = pizzaBuilder.dough;
        this.sauce = pizzaBuilder.sauce;
        this.topping = pizzaBuilder.topping;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping=" + topping +
                '}';
    }
}