package dominion.card.base;
import java.util.*;
import dominion.*;
import dominion.card.*;

/**
 * Carte Sorcière (Witch)
 *
 * +2 Cartes.
 * Tous vos adversaires recoivent une carte Curse.
 */
public class Witch extends AttackCard {
  @Override
  public void play(Player p) {
    for (int i=0;i<2 ;i++ ) {
      p.drawCard();
    }
    List<Player> op;
    op=p.getGame().otherPlayers(p);
    for (Player loop_p : op){
      loop_p.hand.getFromSupply(Curse);
    }
  }
}
