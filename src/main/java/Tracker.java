import java.util.Scanner;
public class Tracker
{

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How many food items would you like to input?");
    int numItems = input.nextInt();
    //FoodItem[] is where we are storing all the information of the number of foods that we will be storing
    FoodItem[] items = new FoodItem[numItems];
    double totalCalories = 0;
    for (int i = 0; i < numItems; i++)
    {
      System.out.println("Enter the name of the food item: ");
      String name = input.next();
      double fat = getInputValue("Enter the amount of fat in " + name + " (grams): ");
      double carbs = getInputValue("Enter the amount of carbs in "+ name +" (grams): ");
      double protein = getInputValue("Enter the amount of protein in "+ name +" (grams): ");
      System.out.println("Enter the number of servings: ");
      int servings = input.nextInt();
      //item[] is where we are storing all the information about the foods that we will be storing such as the fats, carbs and proteins
      items[i] = new FoodItem(name,fat, carbs,protein);
      items[i].printInfo();
      //this is the calculations for the calories of the certain foods
      totalCalories += items[i].getCalories() * servings;
      System.out.printf("   Total Calories for %d servings of %s: %.2f\n", servings, name, items[i].getCalories() * servings);
      System.out.printf("   Dominant Macronutrient: %s\n", items[i].getDominantMacronutrient());
    }
    System.out.printf("Total calories consumed: %.2f\n", totalCalories);
    System.out.println("Thank you for using the Nutrition Information System!");

  }
  private static double getInputValue(String prompt)
  {
    Scanner input = new Scanner(System.in);
    System.out.println(prompt);
    return input.nextDouble();
  } 
}
