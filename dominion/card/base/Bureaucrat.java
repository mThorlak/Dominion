package dominion.card.base;
import java.util.*;

import dominion.*;
import dominion.card.*;

/**
 * Carte Bureaucrate (Bureaucrat)
 * 
 * Recevez une carte Argent; placez-la sur votre deck.
 * Tous vos adversaires dévoilent une carte Victoire et la placent sur leur deck (sinon ils dévoilent leur main afin que vous puissiez voir qu'ils n'ont pas de cartes Victoire).
 */
public class Bureaucrat extends AttackCard {

	@Override
	public void play(Player p) {
		Card c=p.getGame().getFromSupply("Silver");
		if(c!=null){
			p.getDraw().add(0, c);
		}
		List<Player> op;
		op=p.getGame().otherPlayers(p);
		for (Player loop_p : op){
			loop_p.
		}
		
	}
}