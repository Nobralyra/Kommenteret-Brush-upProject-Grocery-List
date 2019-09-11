// ***********************************************************************
// Assembly         :
// Author           : Signe Nørløv Eskildsen
// Created          : 06-09-2019
//
// Last Modified By : Signe Nørløv Eskildsen
// Last Modified On : 11-09-2019
// ***********************************************************************

//Klassens ansvar er at arbejde med array

public class GroceryList
{
    //array der har 10 pladser
    private GroceryItemOrder[] _arrayGrocery = new GroceryItemOrder[10];

    //fields
    private int _current = -1; //array starter på 0, så for at få _current til at følge
    //det index starter den på -1

    //metode som tilføjer en vare til arrayet
    public void addItem(GroceryItemOrder groceryitemorder)
    {
        _current++; //lægger 1 til _current

        if (_current >= 10) //tjekker om _current er 10 eller mere, hvis _current er 10 eller over, smider den fejlbeskeden højere op i hirakiet, hvor den i klassen TestClass rammer en try/catch som handler den.
            {
                throw new ArrayIndexOutOfBoundsException("Can not store more Items!");
            }

      _arrayGrocery[_current] = groceryitemorder;//tilføjer varen i arrayet
    }

    //metoden TotalCostList() udregner hvad den totale pris er for hver vare * antal på hele listen udnytter metoden getCost() fra klassen GroceryItemOrder
    public double TotalCostList()
    {
        double totalCost = 0;
        int length = _current >= 10?9:_current; //Ternary Operator som tjekker om _current er større eller ligmed 10, hvis den er, skal den retunere 9 (som er max den må være) og ellers returnere _current værdi

        for (int i = 0; i <= length; i++)
            {
                totalCost += _arrayGrocery[i].getCost();
            }

        return totalCost;
    }

    //Overrider den indbygget toString i Java for at returne værdierne af objectet og skrive det pænt ud i consolen
    @Override
    public String toString()
    {
        int length = _current >= 10?9:_current;
        for (int i = 0; i <= length; i++)
            {
                System.out.println(_arrayGrocery[i].toString());//henter den toString der er blevet overridet i klassen GroceryItemOrder
            }

        System.out.println("Total price: " + TotalCostList());
        return "";
    }
}