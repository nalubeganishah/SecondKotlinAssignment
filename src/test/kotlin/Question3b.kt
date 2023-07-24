fun main() {
    //QN: A person has four options of choosing between; Pizza, Chicken, Pancakes and Cakes. If Pizza,
    // they will go to PizzaHut, if chicken, they will go to KFC, if pancakes, they will go to foodHub,
    //if cakes, they will go to bakery. Write a program using a when statement and prints the selected restaurant
    //End of question

    println("Type in your choice......")

    val choice = readln()
    when(choice) {
        "pizza" -> print("Go to PizzaHut")
        "chicken" -> print("Go to kfc")
        "pancake" -> print("Go to foodHub")
        "cake" -> print("Go to bakery")
        else -> print("invalid choice")
    }

}
