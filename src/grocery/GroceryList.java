package grocery;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class GroceryList {
    public static void main(String[] args) {
        Input input= new Input();

        HashMap<String,ArrayList<GroceryItem>> categories = new HashMap<>();
        categories.put("Dairy",new ArrayList<>());
        categories.put("Meat",new ArrayList<>());
        categories.put("Produce",new ArrayList<>());
        categories.put("Snacks",new ArrayList<>());
        categories.put("Breakfast",new ArrayList<>());
        categories.put("Cans",new ArrayList<>());
        categories.put("Frozen",new ArrayList<>());
        categories.put("Drinks",new ArrayList<>());
        categories.put("Household Items",new ArrayList<>());


        categories.get("Dairy").add(new GroceryItem("Goats Milk", 666));
        categories.get("Dairy").add(new GroceryItem("Cheese", 420));
        categories.get("Dairy").add(new GroceryItem("Yogurt", 999));

        categories.get("Breakfast").add(new GroceryItem("Cap'n Crunch", 20));
        categories.get("Breakfast").add(new GroceryItem("Tacos", 20));

        categories.get("Snacks").add(new GroceryItem("Goldfish", 5000));

        categories.get("Drinks").add(new GroceryItem("Cider", 99));

        categories.get("Frozen").add(new GroceryItem("Pizza", 99));


        List<String> categoriesList = new ArrayList<String>(categories.keySet());

        System.out.println("Would you like to create a grocery list?");

        if (!input.yesNo()){
            System.out.println("(-(-_(-_-)_-)-)");
            return;
        }
        boolean cont=true;
        do {
            System.out.println("Would you like to enter new item?");
            if (input.yesNo()) {
                String itemCategory;
                do {
                    System.out.println("Please choose a category:");
                    System.out.println("～♡～ " + String.join(" ～♡～ ", categoriesList) + " ～♡～");
                    itemCategory = input.getString();
                    if (!categories.containsKey(itemCategory)) {
                        System.err.println("That's not a category!");
                    }
                } while (!categories.containsKey(itemCategory));
                System.out.println("What is the item's name?");
                String itemName = input.getString();
                System.out.println("How many?");
                int itemCount = input.getInt();
                System.out.println("Added (" + itemCategory + ") " + itemName + " - " + itemCount + "!");

                categories.get(itemCategory).add(new GroceryItem(itemName, itemCount));
            }else{
                cont=false;
            }
        }while(cont);
        for(String category : categoriesList){
            if(categories.get(category).size()>0) {
                System.out.println(("♡"+category+"♡"));
                Collections.sort(categories.get(category),(GroceryItem o1, GroceryItem o2) ->o1.name.compareTo(o2.name));
                for(GroceryItem item : categories.get(category)){
                    System.out.println("♥ " + item.name + " ♥ "+ item.count);
                }
                System.out.println("\n～*～♡～*～♥～*～♡～*～♥～*～♡～*～♥～*～♡～*～\n");
            }
        }


    }


}