package dominion.card;
import java.util.*;
import dominion.*;

/**
 * Les cartes Trésor
 */
public abstract class TreasureCard extends Card {

	public CardType type;
	public List<CardList> Treasure_list;

	public TreasureCard(String cardName,int value){
		super(cardName,value);
		this.type = CardType.Treasure;

  }

  public String toString(){
      return super.toString();
  }

  public List<CardType> getTypes(){
    this.Treasure_list = super.getTypes();
    liste.add(type);
    return Treasure_list;
  }
}
