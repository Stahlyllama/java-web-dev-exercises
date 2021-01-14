package org.launchcode.java.studios.restaurantmenu;

public class MenuItem {
    // class variables
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    //constructors  initialize these variables - help build; which ones need to be set to something to be useful?
    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "not Categorized";
        this.isNew = false;
    }

    public MenuItem(String name, String description, Double price, String category, Boolean isNew){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    //methods
    //getters and setters
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public Double getPrice() { return this.price ; }
    public void setPrice(Double price) { this.price = price; }

    public String getCategory() { return this.category; }
    public void setCategory(String category) { this.category = category; }

    public Boolean getIsNew() { return this.isNew; }
    public void setIsNew(Boolean isNew) { this.isNew = isNew; }

}

