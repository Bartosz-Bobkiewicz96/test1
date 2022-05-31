import java.util.HashMap;
import java.util.Map;


    public class Main {

        public static void main(String[] args) {
            Map<String, String> nameToMeal = new HashMap<>();
            nameToMeal.put("Mariusz", "Pizza");
            nameToMeal.put("Dominik", "Burger");
            nameToMeal.put("Paweł", "Salad");

            System.out.println(nameToMeal.get("Paweł"));
        }
    }

