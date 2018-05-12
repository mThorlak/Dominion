package dominion.card;
import java.util.*;
import dominion.*;

/**
 * Les cartes Attaque
 * Rmq: les cartes Attaque sont toutes des cartes Action
 */
 public CardType type;

public abstract class AttackCard extends ActionCard {

  public AttackCard(String name, Int cost)
    super(name, cost);
    this.type = CardType.Attack;

  }

  public toString(){
    return super.toString();
  }
  public List<CardType> getTypes(){
    action_attack_list = super.getTypes();
    liste.add(type);
    return action_attack_list;
  }
}
