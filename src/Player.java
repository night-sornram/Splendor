import card.BaseCard;
import gem.*;

import java.util.ArrayList;

public class Player {
    private RedGem redGem;
    private GreenGem greenGem;
    private BlackGem blackGem;
    private BlueGem blueGem;
    private WhiteGem whiteGem;
    private int score;

    public Player() {
        redGem = new RedGem();
        greenGem = new GreenGem();
        blackGem = new BlackGem();
        blueGem = new BlueGem();
        whiteGem = new WhiteGem();
        setScore(0);
    }

    public void select(Gem gem) {
        if (gem instanceof RedGem) {
            redGem.setQuantity(redGem.getQuantity() + Math.min(2,BoardGem.redGem.getQuantity()));
            BoardGem.redGem.setQuantity(BoardGem.redGem.getQuantity() - 2);
        } else if (gem instanceof GreenGem) {
            greenGem.setQuantity(greenGem.getQuantity() + Math.min(2,BoardGem.greenGem.getQuantity()));
            BoardGem.greenGem.setQuantity(BoardGem.greenGem.getQuantity() - 2);
        } else if (gem instanceof BlueGem) {
            blueGem.setQuantity(blueGem.getQuantity() + Math.min(2,BoardGem.blueGem.getQuantity()));
            BoardGem.blueGem.setQuantity(BoardGem.blueGem.getQuantity() - 2);
        } else if (gem instanceof WhiteGem) {
            whiteGem.setQuantity(whiteGem.getQuantity() + Math.min(2,BoardGem.whiteGem.getQuantity()));
            BoardGem.whiteGem.setQuantity(BoardGem.whiteGem.getQuantity() - 2);
        } else if (gem instanceof BlackGem) {
            blackGem.setQuantity(blackGem.getQuantity() + Math.min(2,BoardGem.blackGem.getQuantity()));
            BoardGem.blackGem.setQuantity(BoardGem.blackGem.getQuantity() - 2);
        }
    }

    public void select(Gem gem1, Gem gem2, Gem gem3) {
        ArrayList<Gem> gems = new ArrayList<Gem>();
        gems.add(gem1);
        gems.add(gem2);
        gems.add(gem3);
        for (Gem gem : gems) {
            if (gem instanceof RedGem) {
                redGem.setQuantity(redGem.getQuantity() + Math.min(1,BoardGem.redGem.getQuantity()));
                BoardGem.redGem.setQuantity(BoardGem.redGem.getQuantity() - 1);
            } else if (gem instanceof GreenGem) {
                greenGem.setQuantity(greenGem.getQuantity() + Math.min(1,BoardGem.greenGem.getQuantity()));
                BoardGem.greenGem.setQuantity(BoardGem.greenGem.getQuantity() - 1);
            } else if (gem instanceof BlueGem) {
                blueGem.setQuantity(blueGem.getQuantity() + Math.min(1,BoardGem.blueGem.getQuantity()));
                BoardGem.blueGem.setQuantity(BoardGem.blueGem.getQuantity() - 1);
            } else if (gem instanceof WhiteGem) {
                whiteGem.setQuantity(whiteGem.getQuantity() + Math.min(1,BoardGem.whiteGem.getQuantity()));
                BoardGem.whiteGem.setQuantity(BoardGem.whiteGem.getQuantity() - 1);
            } else if (gem instanceof BlackGem) {
                blackGem.setQuantity(blackGem.getQuantity() + Math.min(1,BoardGem.blackGem.getQuantity()));
                BoardGem.blackGem.setQuantity(BoardGem.blackGem.getQuantity() - 1);
            }
        }
    }

    public void buyCard(BaseCard card){

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = Math.max(0, score);
    }
}
