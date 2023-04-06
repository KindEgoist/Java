package org.example.seminars.s8oop.pro3;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Market market = new Market();
        market.acceptToMarket(human);

        market.takeInQueue(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
    }
}
