ID: 45911355  Name: Thien Tran


## Pattern 2: Factory method


When creating a random type of cell in this program, the grid constructor uses a nested loop to randomly allocate a type of cell to a 2D array which will be used to be painted. Hence, the factory method makes sense of accomplishing this same task since the factory's interface can define a class that can return a 2D array of randomised cells for the developer rather than implement it in the grid's constructor. Not only does this make the grid class a better code structure but also thanks to the factory method, the developer can also implement many different factories of how and what cells should be stored and then returned in the 2D array. 

For example, currently the interface CellFactory has a class of RandomCell which returns a 2D array of Cells with the same implementation as before. If the developer decides to randomise the cells  or return a set of cells differently, the developer can make a class that implements the CellFactory interface without the need to replace the previous code in Grid and implement it. E.g. The developer can create a factory subclass called CreateWater.java which may return a 2D array of water cells only, and rather than changing the previous implementation in Grid, the current value of 'cellArray' can easily switch to the CreateWater.java . 

This saves time, provides a better code layout and flexibility among objects, and provides a structure for the developer to add more varieties of factory classes. The abstract factory method is not necessary since it will require more additional classes to accompany the different cell types whereas the Factory Method required only one, and the Singleton pattern can only be intantiated once, meaning it can only return one cell, hence cannot form a grid of cells. Therefore, the Factory method is effective of separating the implementation of choosing a random cell from the grid class allowing flexibility, provide a better structure and allows the opportunity of being able to create different types of factories to return the product in some type of way.

## Additions:

CellFactory.java
RandomCell.java


## Changes:
In Grid.java:

Line 19
In constructor, replaced all implementations of creating a 2D array of cells to the field cellArray which consists of the implementation in a class RandomCell.java.
