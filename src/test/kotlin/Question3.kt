fun main() {
    //QN: A person has four options of choosing between; Pizza, Chicken, Pancakes and Cakes. If Pizza,
    // they will go to PizzaHut, if chicken, they will go to KFC, if pancakes, they will go to foodHub,
    //if cakes, they will go to bakery. Write a program using an if statement
    // that captures the person's choice and prints the selected restaurant.
    //End of question

    println("Type in your choice")
    val choice = readln()

    if (choice== "pizza") {
        print("go to pizza hut")

    } else if (choice == "chicken") {
        print("go to kfc")

    } else if (choice == "pancake") {
        print("go to foodHub")

    } else if (choice == "cake") {
        print("go to bakery")

    } else {
        print("invalid name")
    }
}