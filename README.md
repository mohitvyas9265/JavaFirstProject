# Readme.md week 1

**CheckEven.java**
contains boolean method check(int x) to check whether the number is even or not.

**AppTest.java**
contains the test methods to test the main class functions.

# Readme.md week 2

**1.ClassDiagram.drawio**
The diagram shows relatioship between objects of the class namely-Customer,Order,SpecialOrder & NormalOrder.
SpecialOrder & NormalOrder are derived from Order.Multiple instances of Order can be created for a single customer.

**2.UseCaseDiagram.drawio**
The diagram shows the high level functionality.
There is only one actor-Customer.A customer can order and the type of order will decide is it Normal order or special order.

**3.AcitivityDiagram.drwaio**
The diagra shows the flow of actions.process is started when the customer sends an order request and then upon confirmation by the system,checks if it is normal order.if it is,then confirms the order else checks if it is special order.If it is special order,then confirms it else  terminates.Upon confimration of order,the order is dispatched and the process is terminated.

