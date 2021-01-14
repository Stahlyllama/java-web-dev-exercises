package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    }
    //class variables
    private ArrayList<M  enuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    //constructors
    public Menu() {
        this.lastUpdated = new Date();
            }
    //methods
    //getters and setters
    public ArrayList<MenuItem> getMenuItems() { return this.menuItems; }
    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }

    public Date getLastUpdated() { return this.lastUpdated; }
    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }
    }

