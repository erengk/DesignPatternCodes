package org.example.compositePattern;

public class CafeMenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);

        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59));

        dinerMenu.add(new MenuItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}

