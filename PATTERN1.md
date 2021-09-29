ID: 45911355  Name: Thien Tran
## Pattern chosen: Strategy pattern

For the landscapes, each landscape is given an elevation with a random number between -500 and 6000. Although this is effective of giving a random elevation in the range, however the client or the developer may require the landscapes to be more realistic and have elevations that make sense to their type or add boundaries to the cell's elevation. For example, the water cell could have an elevation of 2000 (sea level) or lower logically since water may be only present in these elevations only. Hence, the Strategy pattern is suitable for this purpose because it allows the developer to turn behaviours into objects and separate them from a main class (the Grid component since this is where the cells are used). This allows the developer to implement many behaviours for different instances of Cell without the need to instantiate behaviours manually inside the types of Cells. 

This is achieved through an interface called Elevation, which either picks the LowElevation class to generate an elevation between -500 and sea level (0) or a high elevation between 0 and 6000 in HighElevation. Hence, this allows the developer to attach the particular behaviour to a particular cell. Also, more different kind of behaviours can be added easily with the interfaces, making the code structure layed out nicely and understandable. E.g. If the cells are required to return the values of that particular cell when mouse pressed, an interface called PrintValues which will have sub classes that will return a particular value such as colour or name.

 The structure that the Strategy Pattern provides is more easier to implement than the other patterns. The decorator pattern would also be valid alongside the Strategy pattern by introducing a superclass by using Cell.java and the subclasses that inherit it as the types of Cells. The main issue is that not all cells contain the same kind of fields or behaviours as this would require a large interface consistong of methods of what can be decorated to the cell, whereas the Strategy pattern allows us to make interfaces of those behaviours and apply them to particular cells of our choice more effeciently and separately. The composite pattern can also be used, however the need to traverse the whole tree to extract a particular object can cause ineffeciency during runtime or execution. Therefore, the strategy pattern enables a better structure in the code in terms of separating behaviours so that super classes do not have to worry about about the implementations of these behaviours, and using these behaviours can be called easily, and can be customised or implemented without impacting the rest of the program.


## Additions: 
HighElevation.java
LowElevation.java

In RandomCell.java:
Lines 18-19: Declared the elevation classes

