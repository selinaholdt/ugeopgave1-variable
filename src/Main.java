public class Main {
    void main(){
        //Opgave 1: Shopping cart
        double item1 = 25.50;
        double item2 = 15.00;
        double item3 = 30.00;
        double itemsSum = item1 + item2 + item3;
        double salesTax = 25.0;
        double totalSum = itemsSum + (itemsSum * salesTax / 100);
        System.out.println(itemsSum);
        System.out.println(totalSum);

        //Opgave 2: Split restaurant bill
        double food = 450.0;
        double drinks = 120.0;
        double tips = 50.0;
        int persons = 4;
        double totalBill = food + drinks + tips;
        double billPerPerson = totalBill / persons;
        System.out.println(billPerPerson);

        //Opgave 3: Discount calculation
        double originalPrice = 300.0;
        double discount = 20.0;
        double discountPrice = originalPrice - (originalPrice * discount / 100);
        double salesTaxes = 25.0;
        double finalPrice = discountPrice + (discountPrice * salesTaxes / 100);
        System.out.println(originalPrice);
        System.out.println(discountPrice);
        System.out.println(finalPrice);

        //Opgave 4: Party planning
        int guests = 15;
        int cupCakes= 40;
        int cupCakesPerPerson = cupCakes / guests;
        int leftovers = cupCakes % guests;
        System.out.println("Each guest gets " + cupCakesPerPerson + " cupcakes");
        System.out.println(leftovers + " cupcakes left");

        //Opgave 5: Build greeting message
        String name = "Anna";
        int age = 25;
        StringBuilder message = new StringBuilder();
        message.append("Hello, ");
        message.append(name);
        message.append("! ");
        message.append("You are ");
        message.append(age);
        message.append(" years old.");
        System.out.println(message);

        //Opgave 6: Using +=
        int score = 100;
        System.out.println(score);
        score += 50;
        System.out.println(score);
        score += 25;
        System.out.println(score);

        //Opgave 7: Using -=
        int health = 100;
        health -= 15;
        System.out.println(health);
        health -= 20;
        System.out.println(health);

        //Opgave 8: Using *=
        double price = 50.0;
        System.out.println(price);
        price *= 2;
        System.out.println(price);

        //Opgave 9: Increment og decrement med 1
        int counter = 10;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);

        //Opgave 10: All compound operators
        int number = 10;
        number += 5;
        System.out.println(number);
        number -= 3;
        System.out.println(number);
        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        //Opgave 11: E-commerce product
        /* 1. Sting productName =
           2. double productPrice =
           3. boolean isInStock =
           4. int stockQuantity =
           5. double discount =
           String category =
         */

        //Opgave 12: Karaktersystem
        /* 1. String studentName =
           2. int testPoints =
           3. int assignmentPoints =
           4. double finalGrade =
           5. boolean isCoursePassed =
         */

        //Opgave 13: Bookingsystem
        /* 1. String guestName =
           2. int roomNumber =
           3. int numberOfNights =
           4. double pricePerNight =
           5. boolean hasBreakfast =
           6. double totalCost =
         */

        //Opgave 14: Fitness-tracker
        /* 1. int stepsToday =
           2. int aimedSteps =
           3. double stepsInKm =
           4. int caloriesBurned =
           5. boolean hasReachedGoal =
         */

        //Opgave 15: Bibliotekssystem
        /* 1. Sting bookTitel =
           2. String author =
           3. int isbn =
           4. int bookPages =
           5. boolean iaAvailable =
           6. String currentHolder =
           7. String returnDate =
           8. double overdueFee =
           9. boolean isBestseller =
           10. double rating =
         */


    }
}
