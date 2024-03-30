public class FoodItem
{
    private static final double CALORIES_PER_GRAM_FAT = 9.0;
    private static final double CALORIES_PER_GRAM_CARBS = 4.0;
    private static final double CALORIES_PER_GRAM_PROTEIN = 4.0;

    private String name;
    private double calories;
    private double fat;
    private double carbs;
    private double protein;

    public FoodItem(String name, double fat, double carbs,double protein)
    {
        this.name = name;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
        this.calories = this.fat * CALORIES_PER_GRAM_FAT + this.carbs * CALORIES_PER_GRAM_CARBS + this.protein * CALORIES_PER_GRAM_PROTEIN;
    }

    public double getCalories()
    {
        return this.calories;
    }

    public void printInfo()
    {
        System.out.printf("Nutritional information per serving of %s:\n", this.name);
        System.out.printf("   Fat: %.2f\n", this.fat);
        System.out.printf("   Carbohydrates: %.2f\n", this.carbs);
        System.out.printf("   Protein: %.2f\n", this.protein);

    }
    // is this the if else loop to get the information on wether the dominant nutrient is a fat or carb or protein
    public String getDominantMacronutrient()
    {
        if (this.fat > this.carbs && this.fat > this.protein)
        {
            return "Fat";
        }
        else if (this.carbs > this.fat && this.carbs > this.protein)
        {
            return "Carbohydrates";
        }
        else
        {
            return "Protein";
        }
    }

}
