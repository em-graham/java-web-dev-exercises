package org.launchcode.java.studios.restaurant;

public class Menu {
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private Boolean newOrNot;

    public Menu(MenuItem item1, MenuItem item2, MenuItem item3, Boolean newOrNot) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.newOrNot = newOrNot;
    }

    public MenuItem getItem1() {
        return item1;
    }
    public void setItem1(MenuItem anItem1) {
        item1 = anItem1;
    }

    public MenuItem getItem2() {
        return item2;
    }
    public void setItem2(MenuItem anItem2) {
        item2 = anItem2;
    }

    public MenuItem getItem3() {
        return item3;
    }
    public void setItem3(MenuItem anItem3) {
        item3 = anItem3;
    }

    public Boolean getNewOrNot() {
        return newOrNot;
    }
    public void setNewOrNot(Boolean aNewOrNot) {
        newOrNot = aNewOrNot;
    }

    public static void main(String[] args) {
        MenuItem spaghetti = new MenuItem(16.00, "Penne pasta with marinara", "main course");
        MenuItem toastedRavioli = new MenuItem(8.00, "An STL classic", "appetizer");
        MenuItem tiramisu = new MenuItem(10.00, "Lady fingers soaked in rum and topped with cream and chocolate", "dessert");

        Menu italianMenu = new Menu(spaghetti, toastedRavioli, tiramisu, true);
        System.out.println(italianMenu);
    }
}
