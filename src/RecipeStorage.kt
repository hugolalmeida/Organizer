import java.io.File

object RecipeStorage {
    private val file = File("recipes.txt")

    fun save(recipe: Recipe) {
        val content = buildString {
            appendLine("Recipe: ${recipe.name}")
            appendLine("Ingredients:")
            recipe.ingredients.forEach {
                appendLine("- ${it.name}: ${it.quantity}")
            }
            appendLine("Steps:")
            recipe.steps.forEachIndexed { index, step ->
                appendLine("${index + 1}. ${step.description}")
            }
            appendLine("Status: ${if (recipe.isCompleted) "Completed" else "Incomplete"}")
            appendLine("=".repeat(40)) // separador
        }

        file.appendText(content + "\n")
    }
}
