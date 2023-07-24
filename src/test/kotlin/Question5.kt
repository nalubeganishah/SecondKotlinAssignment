fun main() {
    // a person is moving to his village with a car moving at a 20km/h, and he has many
    // alternative route. if he uses route1, he'll move a distance of 5000km,
    //f he uses route2, he'll move a distance of 25000km,
    //f he uses route3, he'll move a distance of 50000km,
    //f he uses another route, he'll move a distance of 10000km,
    //Find the time it will take him to reach the village using the separate routes
    // Using an if statement
    //End of question

    val speed = 20
    val route1 = 5000
    val route2 = 25000
    val route3 = 50000
    val another = 10000


    println("Enter the distance of the route..........")
    val distance = readln().toInt()


    if (distance == 5000) {
        val time = route1 / speed
        print("The time for route1 is $time")

    } else if (distance == 25000) {
        val time = route2 / speed
        print("The time for route2 is $time")

    } else if (distance == 50000) {
        val time = route3 / speed
        print("The time for route3 is $time")

    } else if (distance == 10000) {
        val time = another / speed
        print("The time for another is $time")
    } else {
        print("invalid distance")
    }
}