package dominion.card.base;
import java.util.*;
import dominion.*;
import dominion.card.*;

/**
 * Carte Cave (Cellar)
 *
 * +1 Action.
 * Défaussez autant de cartes que vous voulez.
 * +1 Carte par carte défaussée.
 */
public class Cellar extends ActionCard {

  @Override
  public void play(Player p) {
    p.incrementActions(1);
    boolean stop = false;

    while(stop == false && !p.hand.isEmpty()){

    }
  }
}
