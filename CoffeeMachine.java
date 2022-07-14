package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exitCase = false;

        int water = 400;
        int milk = 540;
        int coffee = 120;
        int money = 550;
        int disCups = 9;
        String coffeeChoice;

        boolean waterCheck;
        boolean milkCheck;
        boolean coffeeCheck;
        boolean cupCheck;

        final int espressoWater = 250;
        final int espressoCoffee = 16;
        final int espressoPrice = 4;

        final int latteWater = 350;
        final int latteMilk = 75;
        final int latteCoffee = 20;
        final int lattePrice = 7;

        final int capWater = 200;
        final int capMilk = 100;
        final int capCoffee = 12;
        final int capPrice = 6;

        while(!exitCase) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:, back - to main menu:");
                    coffeeChoice = scanner.nextLine();
                    switch (coffeeChoice) {
                        case "1":
                            waterCheck = (espressoWater < water);
                            milkCheck = (true);
                            coffeeCheck = (espressoCoffee < coffee);
                            cupCheck = (disCups > 0);
                            if (waterCheck && milkCheck && coffeeCheck && cupCheck) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= espressoWater;
                                coffee -= espressoCoffee;
                                money += espressoPrice;
                                disCups--;
                            } else {
                                if (!waterCheck) {
                                    System.out.println("Sorry, not enough water!");
                                }
                                if (!coffeeCheck) {
                                    System.out.println("Sorry, not enough coffee!");
                                }
                                if (!cupCheck) {
                                    System.out.println("Sorry, not enough cups!!");
                                }
                            }
                            break;
                        case "2":
                            waterCheck = (latteWater < water);
                            milkCheck = (latteMilk < milk);
                            coffeeCheck = (latteCoffee < coffee);
                            cupCheck = (disCups > 0);

                            if (waterCheck && milkCheck && coffeeCheck && cupCheck) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= latteWater;
                                milk -= latteMilk;
                                coffee -= latteCoffee;
                                money += lattePrice;
                                disCups--;
                            } else {
                                if (!waterCheck) {
                                    System.out.println("Sorry, not enough water!");
                                }
                                if (!coffeeCheck) {
                                    System.out.println("Sorry, not enough coffee!");
                                }
                                if (!cupCheck) {
                                    System.out.println("Sorry, not enough cups!!");
                                }
                            }
                            break;
                        case "3":
                            waterCheck = (capWater < water);
                            milkCheck = (capMilk < milk);
                            coffeeCheck = (capCoffee < coffee);
                            cupCheck = (disCups > 0);

                            if (waterCheck && milkCheck && coffeeCheck && cupCheck) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= capWater;
                                milk -= capMilk;
                                coffee -= capCoffee;
                                money += capPrice;
                                disCups--;
                            } else {
                                if (!waterCheck) {
                                    System.out.println("Sorry, not enough water!");
                                }
                                if (!coffeeCheck) {
                                    System.out.println("Sorry, not enough coffee!");
                                }
                                if (!cupCheck) {
                                    System.out.println("Sorry, not enough cups!!");
                                }
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int waterFill = scanner.nextInt();
                    System.out.println("write how many ml of milk you want to add:");
                    int milkFill = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int coffeeFill = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    int cupFill = scanner.nextInt();

                    water += waterFill;
                    milk += milkFill;
                    coffee += coffeeFill;
                    disCups += cupFill;
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " ml of water");
                    System.out.println(milk + " ml of milk");
                    System.out.println(coffee + " g of coffee beans");
                    System.out.println(disCups + " disposable cups");
                    System.out.println("$" + money + " of money");
                    break;
                case "exit":
                    exitCase = true;
                    break;
            }
        }

    }
}
