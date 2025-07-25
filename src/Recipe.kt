class Recipe(val name: String) {
    val ingredients = mutableListOf<Ingredient>()
    val steps = mutableListOf<Step>()
    var isCompleted: Boolean = false

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }

    fun addStep(step: Step) {
        steps.add(step)
    }

    fun display() {
        println("\n--- Recipe: $name ---")

        println("\nIngredients:")
        ingredients.forEach {
            println("- ${it.name}: ${it.quantity}")
        }

        println("\nSteps:")
        steps.forEachIndexed { index, step ->
            println("${index + 1}. ${step.description}")
        }
    }
}
