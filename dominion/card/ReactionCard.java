package dominion.card;
import java.util.*;
import dominion.*;

/**
 * Les cartes Réaction
 * Rmq: les cartes Réaction sont toutes des cartes Action
 */
 public CardType type;

public abstract class ReactionCard extends ActionCard {

  public AttackCard(String name, Int cost)
    super(name, cost);
    this.type = CardType.Reaction;

  }

  public toString(){
    return super.toString();
  }
  public List<CardType> getTypes(){
    action_reaction_list = super.getTypes();
    liste.add(type);
    return action_reaction_list;
  }
}
