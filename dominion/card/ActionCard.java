package dominion.card;
import java.util.*;
import dominion.*;

/**
 * Les cartes Action
 */
public abstract class ActionCard extends Card {

    public CardType type;
    public List<CardList> action_list;

  public ActionCard(String name, Int cost){
    super(name,cost);
    this.type = CardType.Action; 

  }

  public String toString(){
      return super.toString();
  }

  public List<CardType> getTypes(){
    this.action_list = super.getTypes();
    liste.add(type);
    return action_list;
  }
}
