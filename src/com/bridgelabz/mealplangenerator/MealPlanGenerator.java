package com.bridgelabz.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        System.out.println("Validating meal plan: " + mealPlan.getDescription());
        if (mealPlan instanceof VegetarianMeal) {
            String vegetarianDescription = mealPlan.getDescription().toLowerCase(); // Case-insensitive check.
            if (vegetarianDescription.contains("chicken") || vegetarianDescription.contains("fish")) {
                System.out.println("Validation failed: Vegetarian meal contains potentially non-vegetarian ingredients.");
                return null;
            }
        }
        return new Meal<>(mealPlan);
    }

    public static void main(String[] args) {
        List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();

        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        Meal<VegetarianMeal> vegetarianMealMeal = generateMealPlan(vegetarianMeal);
        if (vegetarianMealMeal != null) {
            mealPlans.add(vegetarianMealMeal);
        }
        mealPlans.add(generateMealPlan(veganMeal));
        mealPlans.add(generateMealPlan(ketoMeal));
        mealPlans.add(generateMealPlan(highProteinMeal));

        System.out.println("\nGenerated Meal Plans:");
        for (Meal<? extends MealPlan> meal : mealPlans) {
            System.out.println(meal);
        }
    }
}