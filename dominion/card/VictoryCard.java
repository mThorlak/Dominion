package dominion.card;
import java.util.*;
import dominion.*;

/**
 * Les cartes Victoire
 */
public abstract class VictoryCard extends Card {

	public CardType type;
	public List<CardList> Victory_list;

	public VictoryCard(String name, int cost) {
		super(name, cost);
		this.type = CardType.Victory;

  }

  public String toString(){
      return super.toString();
  }

  public List<CardType> getTypes(){
    this.Victory_list = super.getTypes();
    liste.add(type);
    return Victory_list;
  }
}
