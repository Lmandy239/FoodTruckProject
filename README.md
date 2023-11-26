# FoodTruckProject
Hey welcome to the food truck storing device! 

#Description
This app helps users input the name, food type and rating of their preferred food trucks. Then it will store the information and display at users discretion. You may also choose to display the average ratings, or the highest-rated truck.

Instructions:
BEFORE YOU START: some invalid answers will cause the program to terminate.

1- Start the program.
2- Follow the initial prompt
3- Type in the name, food type and rating of a food truck
4- YOu may choose to leave during the name input prompt by simply typing "Quit"
5- App will run the list program until you choose to not add more trucks or finish listing all

Notes: 
-Food type refers to a type of food, not a specific dish (for example: mexican, italian, cuban etc). Rating average will calculate higher than 5, but then the standard will be up to the user. 

-Another bug is the names not being able to type with spaces for example:
CubanTruck will print out but Cuban Truck will print as Cuban. This is most likely an issue within my toString method in the other file. 

-Could have built multple toStrings to have different outputs depending on the situation. For simplicity I chose to stick with the same output for all scenarios.


#Tech Used
All of this was written in java, most of the work was done using separate classes and methods. There is usage of a few for loops and a switch statement for the main menu. 

#Lessons Learned
I learned a lot about methods and passing down fields, I had a bit of trouble with the logic, but mostly due to my own confusion. Moreover, I kept adding a lot to the program without testing little by little, before I knew it I had a mess of stuff that can cause some bugs or things to not work according to the plan.  I think next time I will keep the code dry and try to only make things work little by little.