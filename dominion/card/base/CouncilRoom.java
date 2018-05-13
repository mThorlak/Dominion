package dominion.card.base;
import java.util.*;
import dominion.*;
import dominion.card.*;

/**
 * Carte Chambre du conseil (Council Room)
 *
 * +4 Cartes.
 * +1 Achat.
 * Tous vos adversaires piochent 1 carte.
 */
public class CouncilRoom extends ActionCard {
  @Override
  public void play(Player p) {
    for (int i=0;i<4 ;i++ ) {
      p.drawCard();
    }
    p.incrementBuys(1);

    List<Player> op;
		op=p.getGame().otherPlayers(p);
		for (Player loop_p : op){
      loop_p.drawCard();
    }
  }
}
