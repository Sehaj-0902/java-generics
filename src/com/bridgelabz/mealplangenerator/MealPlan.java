package com.bridgelabz.mealplangenerator;

interface MealPlan {
    String getDescription();
}

class VegetarianMeal implements MealPlan {
    @Override
    public String getDescription() {
        return "Vegetarian Meal: Vegetable Salad";
    }
}

class VeganMeal implements MealPlan {
    @Override
    public String getDescription() {
        return "Vegan Meal: Lentil Soup";
    }
}

class KetoMeal implements MealPlan {
    @Override
    public String getDescription() {
        return "Keto Meal: Chicken Salad";
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public String getDescription() {
        return "High-Protein Meal: Grilled Fish";
    }
}