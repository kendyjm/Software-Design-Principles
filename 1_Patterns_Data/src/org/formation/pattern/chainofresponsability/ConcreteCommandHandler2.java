package org.formation.pattern.chainofresponsability;

public class ConcreteCommandHandler2 extends CommandHandler {


	protected boolean handleCommand(String commande) {
		System.out.println("Second handler handles " + commande + " I will return true");
		return true;
	}

}
