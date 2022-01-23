# SDE-Opdracht
Team members:
Luc van Westen
Vincent Hollestelle

We hebben besloten om een soort van cinema programma te maken en daarin 4 design patterns te maken. 
We hadden beiden onze taken en als we vast liepen/vragen hadden contacteerden we elkaar via 
discord of gingen we in een call om te pair programmen.
De verdeling is als volgt:
Vincent: Factory + Facade
Luc: State + Strategy

Factory pattern(Creational Pattern):
The factory pattern is used to create/select the movies. It is used in the SelectMovieState.java
From the SelectMovieState the MovieFactory is called and in the Factory the right movie is returned.
You can see all the movies in the Movies folder.

Facade pattern(Structural Pattern):
You can find the Facade in the CinemaFacade.java. In this facade there is a method that opens the cinema.
It calls methods from Cinema.java and Ticketmachine.java.

State pattern(Behavioral Pattern):
The state pattern is used to control the states of the TicketMachineUI.java. You can find all the different states 
in the State folder. Once the if-statement in each state is passed, the state changes to the next state.

Strategy pattern(Behavioral Pattern):
The Strategy pattern is used for the different forms of payment(cash and credit card). You can find the Strategy pattern being used in the SelectPaymentState.java.
The Strategy selected is executed via the PaymentContext.java. 

To test the program go to TicketMachineTest.java and run the test.