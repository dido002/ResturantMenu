package restaurant;

import java.util.ArrayList;
import java.util.Date;


public class Menu {
    private ArrayList<MenuItem> listOfDishes;
    private Date lastUpdated;

    public Menu(){
        this.listOfDishes = new ArrayList<>();
        this.lastUpdated = new Date();
    }

    public void setListOfDishes(ArrayList<MenuItem> listOfDishes) {
        this.listOfDishes = listOfDishes;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

