package dominion.card.base;
import java.util.*;
import dominion.*;
import dominion.card.*;

/**
 * Carte Laboratoire (Laboratory)
 *
 * +2 Cartes.
 * +1 Action.
 */
public class Laboratory extends ActionCard {
  @Override
  public void play(Player p) {
    for (int i=0;i<2 ;i++ ) {
      p.drawCard();
    }
    p.incrementActions(1);
  }
}
