// ***********************************************************************
// Assembly         :
// Author           : Signe Nørløv Eskildsen
// Created          : 06-09-2019
//
// Last Modified By : Signe Nørløv Eskildsen
// Last Modified On : 11-09-2019
// ***********************************************************************


import java.util.ArrayList;
public class GroceryList2
{
    //arraylist som indeholder de vare som GroceryItemOrder repræsentere
    private ArrayList<GroceryItemOrder> _arrayGrocery2 = new ArrayList<GroceryItemOrder>();

    //metode som tilføjer en vare til arraylisten
    public void addItem(GroceryItemOrder groceryitemorder)
    {
        _arrayGrocery2.add(groceryitemorder);
    }

    //metoden TotalCostList() udregner hvad den totale pris er for hver vare * antal på hele listen udnytter metoden getCost() fra klassen GroceryItemOrder
    public double TotalCostList()
    {
        double totalCost = 0;
        for (int i = 0; i < _arrayGrocery2.size(); i++)
            {
                totalCost += _arrayGrocery2.get(i).getCost();
            }

        return totalCost;
    }

    //Overrider den indbygget toString i Java for at returne værdierne af objectet og skrive det pænt ud i consolen
    @Override
    public String toString()
    {
        for (int i = 0; i < _arrayGrocery2.size(); i++)
            {
                System.out.println(_arrayGrocery2.get(i).toString());
            }

        System.out.println("Total price: " + TotalCostList());

        return "";
    }
}