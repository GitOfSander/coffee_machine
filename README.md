# Coffee machine
Created this easy coffee machine program with Kotlin while following the Jetbrains academy.

# Overview
The program exists of the following commands:

1. buy - show the coffee options you can buy: 1 - espresso,  2 - latte,  3 - cappuccino, back - to main menu.
2. fill - will ask you the amount of water, milk, coffee beans and disposable cups you want to fill.
3. take - take all the money out of the machine.
4. remaining - show the remaining content of the coffee machine.
5. exit - exit the program.

After the application finished the commands, it will go back to start until you enter exit.

<pre>
Write action (buy, fill, take, remaining, exit):
buy


What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
1

I have enough resources, making you a coffee!


Write action (buy, fill, take, remaining, exit):
buy


What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
2

Sorry, not enough water!


Write action (buy, fill, take, remaining, exit):
fill

Write how many ml of water you want to add:
1000

Write how many ml of milk you want to add:
500

Write how many grams of coffee beans you want to add:
20

Write how many disposable cups you want to add:
9


Write action (buy, fill, take, remaining, exit):
remaining

The coffee machine has:
1150 ml of water
1040 ml of milk
124 g of coffee beans
17 disposable cups
$554 of money


Write action (buy, fill, take, remaining, exit):
take

I gave you $554


Write action (buy, fill, take, remaining, exit):
exit
</pre>

# Usage
Download the release and go in your terminal where you placed coffee_machine.jar and run:

<pre>java -jar coffee_machine.jar</pre>
