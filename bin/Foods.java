public class Foods {
    private String name;
    private int calories;

    public String getName(){
        return name;
    }
    public int getCalories(){
        return calories;
    }

    public Foods (String foodName, int calories){
        this.name = foodName;
        this.calories = calories;
    }
}
class HealthyFood extends Food
{
    private String Group;
    private String Color;

    public String getGroup(){
        return Group;
    }
    public String getColor(){
        return Color;
    }

    public HealthyFood(String foodName, int calories, String foodGroup, String foodColor){
        super(foodName, calories);
        this.Group = foodGroup;
        this.Color = foodColor;
    }
}

class Fruit extends HealthyFood
{
    private boolean isInSeason;
    private String Vitamins;

    public boolean isInSeason(){
        return isInSeason;
    }
    public String getVitamins(){
        return Vitamins;
    }
    public Fruit(String foodName, int calories, String foodGroup, String foodColor, boolean isInSeason, String majorVitamins) {
        super(foodName, calories, foodGroup, foodColor);
        this.isInSeason = isInSeason;
        this.Vitamins = majorVitamins;
    }

}
/*
 * For this exercise, you are going to create a Food superclass with a HealthyFood subclass. The HealthyFood will also have a Fruit subclass. After creating these classes, test the results in the FoodTester class.

The Food class will have two instance variables, one to store the name and one to store the calories.

Food should have two accessor (getter methods) as well:

public String getName()
public int getCalories()

The HealthyFood class will only have two instance variables, group and color, which represents the food group and the color of the food, respectively. It should have the following accessors (getter method):

public String getGroup()
public String getColor()

The Fruit class will have two instance variables, a boolean indicator if the fruit is in season and the vitamins the fruit has. The accessor methods should be:

public boolean isInSeason()
public String getVitamins()

Constructors should follow this format:

public Food (String foodName, int calories)
public HealthyFood(String foodName, int calories, String foodGroup, String foodColor)
public Fruit(String foodName, int calories, String foodColor, boolean isInSeason, String majorVitamins)

Finally, the Food class should have a toString that prints:
name has cal calories

For example:
Ice Cream has 200 calories
 */