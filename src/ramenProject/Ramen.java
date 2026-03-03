package ramenProject;

public class Ramen {

    private Human human = new Human();


    public void menuPick() {

        human.menuSelection();
    }

    public void orderRamen() {

        human.orderRamens();
    }

    public void ramenHot() {

        human.ramenHots();
    }

    public void ramenEven() {

        human.ramenEvens();
    }

    public void eatRamen() {
        human.eatRamen();
    }
}
