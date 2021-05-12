package comp1721.cwk2;

public class BaccaratHand extends CardCollection {
    BaccaratHand() {
        super();
    }

    public boolean isNatural() {
        if (this.value() == 8 | this.value() == 9) {
            return true;
        } else {
            return false;
        }
    }

    public int value() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.value();
        }
        while (sum >= 10) {
            sum = sum - 10;
        }
        return sum;
    }

    public String toString() {
        String tempString = "";
        for (Card card : this.cards) {
            tempString += card.toString();
            tempString += " ";
        }
        tempString = tempString.substring(0, tempString.length() - 1);
        return tempString;
    }


}
// Implement the BaccaratHand class here
