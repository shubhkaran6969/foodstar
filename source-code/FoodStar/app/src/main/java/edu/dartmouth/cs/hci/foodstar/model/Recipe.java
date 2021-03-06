package edu.dartmouth.cs.hci.foodstar.model;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import edu.dartmouth.cs.hci.foodstar.R;

/**
 * Created by Vishal Gaurav
 */
public class Recipe implements Serializable {
    private long id;
    private String recipeName;
    private int duration;
    private int uriThumb;
    private int uriLarge;
    private int stars;
    public int fat = 0;
    public int protein = 0;
    public int carbs = 0;
    public int calories = 20;

    public ArrayList<RecipeStep> recipeSteps;


    public Recipe(long id, String recipeName, int duration) {
        this.id = id;
        this.recipeName = recipeName;
        this.duration = duration;
    }

    public Recipe(long id, String recipeName, int duration, int drawable, int stars) {
        this.id = id;
        this.recipeName = recipeName;
        this.duration = duration;
        this.uriThumb = drawable;
        this.uriLarge = drawable;
        this.stars = stars;
        this.recipeSteps = new ArrayList<RecipeStep>();
    }

    public void addRecipeStep(RecipeStep step) {
        this.recipeSteps.add(step);
    }

    public void setRecipeSteps(ArrayList<RecipeStep> recipeSteps) {
        this.recipeSteps = recipeSteps;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getUriThumb() {
        return uriThumb;
    }
    public int getStars() {
        return this.stars;
    }

//    public void setUriThumb(Uri uriThumb) {
//        this.uriThumb = uriThumb;
//    }

//    public Uri getUriLarge() {
//        return uriLarge;
//    }

//    public void setUriLarge(Uri uriLarge) {
//        this.uriLarge = uriLarge;
//    }

    public static List<Recipe> getHardCodedRecipes(Context context) {
        List<Recipe> result = new ArrayList<>();
        String[] array = context.getResources().getStringArray(R.array.recipes);

        ArrayList<RecipeStep> recipeSteps = new ArrayList<RecipeStep>();
        recipeSteps.add(new RecipeStep("Stir together the chipotle chile powder, garlic powder, salt, and cracked black pepper in a shallow bowl." , "" , 0 , false , 0 , "5 mins"));
        recipeSteps.add(new RecipeStep("Brush the tilapia fillets with the canola oil, and press into the spice mixture to coat, and set aside." , "" , 0 , false , 0 , "15 mins"));
        recipeSteps.add(new RecipeStep("Make the salsa." , "Make salsa by stirring together the mango, jalapeno, red onion, 1 clove garlic, cilantro, and lime juice in a separate bowl, and set aside." , R.drawable.rdetail1 , false , 0 ,"1 min"));
        recipeSteps.add(new RecipeStep("Bring the black beans and 2 cloves of garlic to a simmer in a saucepan with a pinch of salt." , "" , 0 , false , 0 , "15 mins"));
        recipeSteps.add(new RecipeStep("Cover, and cook over low heat for 20 minutes." , "" , 0 , true , 20 , "20 mins"));
        recipeSteps.add(new RecipeStep("Cook the tilapia." , "Meanwhile, heat a large skillet over medium-high heat, and cook the tilapia until opaque in the center, and crispy on both sides, about 7 minutes." , R.drawable.rdetail2 , false , 0 , "15 mins"));
        recipeSteps.add(new RecipeStep("Heat the tortillas in a skillet over medium heat, and keep warm." , "" , 0 , false , 0 , "2 mins"));
        recipeSteps.add(new RecipeStep("To serve, place the tortillas on a plate, spoon on some Spanish rice and black beans." , "To serve, place the tortillas on a plate, spoon on some Spanish rice and black beans." , R.drawable.rdetail3, false , 0 , "7 mins"));
        recipeSteps.add(new RecipeStep("Top with some of the coleslaw mix, hot tilapia, and a spoonful of the mango-cilantro salsa." , "" , 0 , false , 0 , "10 mins"));
        recipeSteps.add(new RecipeStep("Serve hot topped with fresh cilantro." , "" , 0 , false , 0 , "13 mins"));


        Recipe recipe = new Recipe(0, array[0], 15, R.drawable.recipe1, 1);
        recipe.setCarbs(10);
        recipe.setFat(5);
        recipe.setProtein(12);
        recipe.setRecipeSteps(recipeSteps);
        result.add(recipe);

        Recipe recipe2 =new Recipe(1, array[1], 45, R.drawable.recipe2, 2);
        recipe2.setProtein(10);
        recipe2.setFat(4);
        recipe2.setCarbs(6);
        recipe2.setRecipeSteps(recipeSteps);
        result.add(recipe2);

        Recipe recipe3 =new Recipe(2, array[2], 32, R.drawable.recipe3, 3);
        recipe3.setProtein(6);
        recipe3.setFat(2);
        recipe3.setCarbs(16);
        recipe3.setRecipeSteps(recipeSteps);
        result.add(recipe3);

        Recipe recipe4 = new Recipe(3, array[3], 21, R.drawable.recipe4, 2);
        recipe4.setProtein(61);
        recipe4.setFat(20);
        recipe4.setCarbs(26);
        recipe4.setRecipeSteps(recipeSteps);
        result.add(recipe4);

        Recipe recipe5 =new Recipe(4, array[4], 50, R.drawable.recipe5, 4);
        recipe5.setProtein(4);
        recipe5.setFat(20);
        recipe5.setCarbs(17);
        recipe5.setRecipeSteps(recipeSteps);
        result.add(recipe5);

        Recipe recipe6 = new Recipe(5, array[5], 45, R.drawable.recipe6, 5);
        recipe6.setProtein(16);
        recipe6.setFat(46);
        recipe6.setCarbs(7);
        recipe6.setRecipeSteps(recipeSteps);
        result.add(recipe6);

        Recipe recipe7 =new Recipe(6, array[6], 33, R.drawable.recipe7, 5);
        recipe7.setProtein(12);
        recipe7.setFat(12);
        recipe7.setCarbs(26);
        recipe7.setRecipeSteps(recipeSteps);
        result.add(recipe7);

        Recipe recipe8 = new Recipe(7, array[7], 21, R.drawable.recipe8, 3);
        recipe8.setProtein(16);
        recipe8.setFat(31);
        recipe8.setCarbs(84);
        recipe8.setRecipeSteps(recipeSteps);
        result.add(recipe8);

        Recipe recipe9 = new Recipe(8, array[8], 13, R.drawable.recipe9, 2);
        recipe9.setProtein(11);
        recipe9.setFat(10);
        recipe9.setCarbs(46);
        recipe9.setRecipeSteps(recipeSteps);
        result.add(recipe9);

        Recipe recipe10 = new Recipe(9, array[9], 10, R.drawable.recipe10, 1);
        recipe10.setProtein(20);
        recipe10.setFat(11);
        recipe10.setCarbs(16);
        recipe10.setRecipeSteps(recipeSteps);
        result.add(recipe10);
        return result;
    }

    public static List<Recipe> getFilteredRecipes(Context context, Filter filter) {
        List<Recipe> resultAll = getHardCodedRecipes(context);
        List<Recipe> result = new ArrayList<>();
        for (Recipe recipe : resultAll) {
            if (Filter.isFilterPassed(recipe, filter)) {
                result.add(recipe);
            }
        }
        return result;
    }
}
