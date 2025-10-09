# Diagrams Exercise

## Scenario

The provided code comes from an imaginary system to manage car rentals.
It is adapted from an example in Chapter 1 of Martin Fowler's *Refactoring*
(first edition).

The goal is for a rental agent to be able to generate a statement of the
fees owed to the rental company by a customer.  A customer is represented by
a `Customer` class that holds their name and records all of their rentals.
Each rental is represented by a `Rental` class that stores details of the
car that was rented and the time period of the rental.  Cars are represented
by a `Car` class that stores details of the model of the car and its
**price code**.  There is a standard price code and separate price codes
for new models and luxury models.  Different daily rental fees apply
to each price code.

The rental company operates a loyalty scheme in which customers can
accumulate 'frequent renter points'.  They normally get 1 frequent renter
point for each rental, but get an extra bonus point if they are renting
a new model for at least 3 days.

## Tasks

(See the module website for full details.)

1. Draw a **UML class diagram** by hand, showing the relationships between
   `Customer`, `Rental` and `Car`.

2. Draw a **UML sequence diagram** by hand, showing what happens when the
   `statement()` method is invoked on a `Customer` object.

3. Use diagrams.net to create another version of the class diagram.  Try
   saving the diagram as a `.drawio` file on your computer.  Try exporting
   the diagram as a PNG image.

4. (Optional) Use diagrams.net to create another version of the sequence
   diagram.  Once again, save it as a `.drawio` file and use the Export to
   PNG option.
