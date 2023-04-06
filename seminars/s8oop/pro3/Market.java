package org.example.seminars.s8oop.pro3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{
    List<Actor> myList = new ArrayList<>(); // в маркет
    Queue<Actor> myList2 = new LinkedList<>(); // в очередь


    @Override
    public void acceptToMarket(Human human) {
        myList.add(human);

    }

    @Override
    public void releaseFromMarket(Human human) {
        myList.remove(human);
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Human human) {
        myList2.add(human);

    }

    @Override
    public void takeOrders() {
        assert myList2.peek() != null;
        myList2.peek().setMakeOrder();
    }

    @Override
    public void giveOrders() {
        assert myList2.peek() != null;
        myList2.peek().setTakeOrder();

    }

    @Override
    public void releaseFromQueue() {
        myList2.poll();

    }
}
