package dominion.card.base;
import java.util.*;
import dominion.*;
import dominion.card.*;

/**
 * Carte Marché (Market)
 *
 * +1 Carte.
 * +1 Action.
 * +1 Achat.
 * +1 Pièce.
 */
public class Market extends ActionCard {
  @Override
  public void play(Player p) {
		p.drawCard();
		p.incrementActions(1);
		p.incrementBuys(1);
		p.incrementMoney(1);
}

}
