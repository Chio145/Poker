package RocioAguirre;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Deck {
    public ArrayList<Card> poker = new ArrayList<>();
    private HashMap<String,String> palos = new HashMap<>();

    public void Random_head (){
        Collections.shuffle(poker);
    }
    public void shuffle(){

        Collections.shuffle(poker);
        System.out.println("Se mezcló el Deck");
    }
    public void pok(){
        palos.put("TREBOL","NEGRO");
        palos.put("PICA","NEGRO");
        palos.put("DIAMANTE","ROJO");
        palos.put("CORAZON","ROJO");

        for (Map.Entry<String,String> palo:palos.entrySet()){
            int contador=1;
            Card carta;
            while (contador <=13){
                carta = new Card(palo.getKey(), palo.getValue());
                carta.ValorCartas(contador);
                poker.add(carta);
                contador ++;
            }
        }
    }

    public void head(){
        int quitar=1;
        var card = poker.get(poker.size()-quitar);
        poker.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format("Quedan %s",poker.size()));
    }

    public void pick(){ var carta_azar = Card_Random();
        poker.remove(carta_azar);
        System.out.println(carta_azar.toString());
        System.out.println(String.format("Quedan %s",poker.size()));
    }

    public void Deck_Cartas(ArrayList<Card> cards){
        for (var card: cards) System.out.println(card.toString());
    }

    private Card Card_Random(){
        var card_random = (int)Math.floor(Math.random()*(1-poker.size()+1)+poker.size());
        return poker.get(card_random);
    }
    public void hand(){
        if(poker.size() <= 5){  for (var card:poker){
                Deck_Cartas(poker);
            }
        }else { var cards = new ArrayList<Card>();
            Card card;
            int con=1;
            while (con<=5){ card = Card_Random();
                poker.remove(card);
                cards.add(card);
                con++;
            }
            Deck_Cartas(cards);
            System.out.println(String.format("Quedan %s",poker.size()));
        }
    }

}
