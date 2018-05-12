package dominion.card;
import java.util.*;
import dominion.*;

/**
 * Les cartes Malédiction
 */
public abstract class CurseCard extends Card {


  public CardType type;
  public List<CardList> malediction_list;


  public CurseCard (String name, String cost){
    super(name, cost);
    this.type = CardType.Malediction;

  }

  public String toString(){
      return super.toString();
  }

  public List<CardType> getTypes(){
    this.malediction_list = super.getTypes();
    liste.add(type);
    return malediction_list;
  }
}
