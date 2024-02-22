package card;

import gem.*;

import java.util.Random;

public class BaseCard {
    private RedGem redGem;
    private WhiteGem whiteGem;
    private BlueGem blueGem;
    private GreenGem greenGem;
    private BlackGem blackGem;
    private int cardScore;

    public BaseCard() {
        redGem = new RedGem();
        greenGem = new GreenGem();
        blackGem = new BlackGem();
        blueGem = new BlueGem();
        whiteGem = new WhiteGem();
        Random random = new Random();
        int randomTotalGem = random.nextInt(3) + (this instanceof HighCard ? 8 :(this instanceof MidCard ? 6 : (this instanceof LowCard ? 4 : 0)));

        //TODO edit number of card score
        setCardScore(this instanceof HighCard ? random.nextInt(3) + 3 :(this instanceof MidCard ? random.nextInt(3) + 3 : (this instanceof LowCard ? random.nextInt(3) + 3 : 0)));
        //END

        int randomGemColor;
        int randomGemQ;
        int numDe = 0;
        while (numDe != randomTotalGem) {
            randomGemColor = random.nextInt(5);
            randomGemQ = random.nextInt(randomTotalGem - numDe) + 1;
            if (randomGemColor == 0) {
                redGem.setQuantity(redGem.getQuantity() + randomGemQ);
                numDe += randomGemQ;
            } else if (randomGemColor == 1) {
                greenGem.setQuantity(greenGem.getQuantity() + randomGemQ);
                numDe += randomGemQ;
            } else if (randomGemColor == 2) {
                blackGem.setQuantity(blackGem.getQuantity() + randomGemQ);
                numDe += randomGemQ;
            } else if (randomGemColor == 3) {
                whiteGem.setQuantity(whiteGem.getQuantity() + randomGemQ);
                numDe += randomGemQ;
            } else if (randomGemColor == 4) {
                blueGem.setQuantity(blueGem.getQuantity() + randomGemQ);
                numDe += randomGemQ;
            }
        }
    }

    public int getCardScore() {
        return cardScore;
    }

    public void setCardScore(int cardScore) {
        this.cardScore = Math.max(cardScore,0);
    }


}
