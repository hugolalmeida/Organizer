fun main() {
    println("Welcome to the Recipe Organizer!\n")

    print("Enter the recipe name: ")
    val recipeName = readln()
    val recipe = Recipe(recipeName)

    // Ingredient input loop
    while (true) {
        print("Add an ingredient? (yes/no): ")
        val answer = readln().lowercase()
        if (answer == "no") break
        if (answer == "yes") {
            print("Ingredient name: ")
            val name = readln()
            print("Quantity: ")
            val quantity = readln()
            recipe.addIngredient(Ingredient(name, quantity))
        } else{
            println("Please enter yes or no!")
        }

    }

    // Step input loop
    println("\nNow enter the preparation steps.")
    while (true) {
        print("Add a step? (yes/no): ")
        val answer = readln().lowercase()
        if (answer == "no") break
        if (answer == "yes"){
            print("Describe the step: ")
            val stepText = readln()
            recipe.addStep(Step(stepText))
        } else {
            println("Please enter yes or no!")
        }

    }

    recipe.isCompleted = true
    println("\nRecipe saved successfully!")

    // Show the recipe
    recipe.display()
    // Save recipe
    RecipeStorage.save(recipe)
    println("Recipe saved to file!")
}
