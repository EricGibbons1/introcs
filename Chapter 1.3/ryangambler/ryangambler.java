public class ryangambler {
    
    int money;
    int goal;
    String name;

    public ryangambler (int startingMoney, int goal, String name) {
        money = startingMoney;
        this.goal = goal;
        this.name = name;
    }
    
    void throwDice() {
        if (Math.random() < 0.5) money++;
        else money--;
    }
    
    void printHoldings() {
        System.out.println(money);
    }

    boolean hasMoneyLeft() {
        return money > 0;
    }
    
    boolean hasReachedGoal() {
        return money >= goal;
    }
    
    void taunt(ryangambler gambler) {
        if (money > gambler.money) {
            System.out.println("Suck it, " + gambler.name);
        }
    }
    
    public static void main(String[] args) {
        ryangambler tim = new ryangambler(4, 9, "Tim");
        ryangambler brilong = new ryangambler(5, 10, "Brian");
        while(brilong.hasMoneyLeft() && !brilong.hasReachedGoal()) {
            brilong.taunt(tim);
            brilong.printHoldings();
            brilong.throwDice();
            tim.taunt(brilong);
        }
        brilong.printHoldings();
        
    }
}
