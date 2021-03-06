# hw3


## Goals in Code:
<ul>
  <li>Use at least three distinct OO patterns that we have discussed in your design. Typical uses might include factory (for instantiating rolls or customers), decorator (for adding extras), observer (for capturing events that will go to output). You may see other opportunities for other OO pattern use. Document and comment clearly where any patterns are applied.</li>
  <li>include at least 10 JUnit test methods (methods with the @Test decorator) in a single test class called MyUnitTest. These unit tests should be applied appropriately to classes and methods in your simulation code to ensure their proper behavior. You should be able to instantiate a MyUnitTest object before your simulation run and then execute each of the ten test methods at some point before, during, or after the simulation, with output from each test indicating the identification of the test and success or failure of each test method. A single test method may contain single or multiple assert statements as you feel are needed or are appropriate. Clear output from the test run must be included in your program results.</li>
</ul>
  




## Simulation Rules:

Store starts with 30 types of each roll

### Roll types:
<ul>
  <li><strike>Spring Rolls</strike></li>
  <li><strike>Egg Rolls</strike></li>
  <li><strike>Pastry Rolls</strike></li>
  <li><strike>Sausage Rolls</strike></li>
  <li><strike>Jelly Rolls</strike></li>
</ul>
<strike>Each roll must be given a unique cost/price.</strike>

### Addons to rolls:
<ul>
  <li>Extra sauce</li>
  <li>Extra filling</li>
  <li>Extra topping</li>
</ul>
Each addon has a different cost for each roll type.
The store has an unlimited supply of these addons.

### Customer types:
<ul>
  <li><strike>Casual</strike></li>
  <ul>
    <li><strike>Count of 1-12 each day.</strike></li>
    <li><strike>Buys 1-3 random rolls</strike></li>
    <li>If selected rolls are out of stock:</li>
      <ul>
        <li><strike>Will select any available roll.</strike></li>
        <li><strike>Will accept less than their ideal total (will take 2 if 3 aren't available).</strike></li>
      </ul>
  </ul>
  <li><strike>Business</strike></li>
  <ul>
    <li><strike>Count of 1-3 each dya.</strike></li>
    <li><strike>Buys 10 rolls; two of each type</strike></li>
    <li>If selected rolls are out of stock:</li>
      <ul>
        <li><strike>Will NOT buy order; only takes their exact original order.</strike></li>
      </ul>
  </ul>
      <li><strike>Catering</strike></li>
  <ul>
    <li><strike>Count of 1-3 each day.</strike></li>
    <li><strike>Buys 15 rolls; 5 rolls of 3 random types</strike></li>
    <li>If selected rolls are out of stock:</li>
      <ul>
        <li><strike>Will select any available roll.</strike></li>
        <li><strike>Will accept less than their ideal total (will take 10 if 15 aren't available).</strike></li>
      </ul>
  </ul>
</ul>

## Rules
<ul>
  <li><strike>When a certain roll sells out, no more may be sold that day.</strike></li>
  <ul>
    <li>Notice must be given (message).</li>
    <li><strike>30 more rolls will be made the next day.</li>
    <li>Customer type must be recorded; a total of this count must be kept for each customer for the dialy report).</strike></li>
  </ul>
    <li><strike>Store closes and notice is given when everything sells out.</strike></li>
  <ul>
    <li><strike>Customers will not visit this store at this point</strike></li>
  </ul>
  <li><strike>If roll still has inventory, use the same inventory for the next day; only reset inventory if we have none.</strike></li>
    <li><strike>Customers arrive randomly every day in random order.</strike></li>
  <li>Every individual roll will have (all costs are added to roll order cost):</li>
    <ul>
      <li>0-3 extra sauces</li>
      <li>0-1 extra fillings</li>
      <li>0-2 extra toppings</li>
    </ul>
</ul>
  
## Required Outputs
For each day the simulation runs, the program should print the following information in a concise format:
<ul>
  <li><strike>Day number</strike></li>
  <li><strike>Rolls in inventory at start & end of day; by type</strike></li>
  <li>Roll sales – individual customer orders: including customer type, number of rolls by type, any added extras per roll, and the total cost of the order</li>
  <li>Total payment for orders for the day by customer type, and overall</li>
  <li><strike>Count of orders impacted by a roll outage, by customer type (do not count customers that did not go to the store after it closed)</strike></li>
  <li><strike>Count inventory orders by roll type</strike></li>
    <li><strike>Indicate if the store closed for no inventory that day</strike></li>
</ul>

At the end of the 30 days, print (concisely):
<ul>
  <li>Total number of rolls sold, by type and overall</li>
  <liTotal money in sales</li>
  <li><strike>Total number of roll outage impacts</strike></li>
</ul>

Re-run the program two more times increasing the inventory level at the start and at replacement from 30 rolls to 45 and then from 45 to 60.

# UNFINISHED WORK
<ul>
  <li>Create decorator method for roll toppings</li>
  <li>Generate report for daily and total (after simulation ends) sales and a way to track this info</li>
  <ul>
    <li>NOTE: The buy() function in the Customer class would be the easiest way to do this. However, each customer has their order attatched it its object as a list of rolls, there should be plently of flexibility to accomplish this</li>
  </ul>
  <li>UML diagram needs to be generated based on code design</li>
  <li>10 test cases need to be ran and recorded</li>
</ul>
  
