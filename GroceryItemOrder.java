// ***********************************************************************
// Assembly         :
// Author           : Signe Nørløv Eskildsen
// Created          : 06-09-2019
//
// Last Modified By : Signe Nørløv Eskildsen
// Last Modified On : 11-09-2019
// ***********************************************************************


//Klassen sørger for et standarliseret repræsentation af én vare
public class GroceryItemOrder
{
    //fields
    private String ItemName;
    private int Quantity = 1;
    private double PricePrUnit = 0;

    //Særskildt constructer til varens navn
    public GroceryItemOrder(String itemName)
    {
        ItemName = itemName;
    }

    //Constructor over varens navn, antal og pris pr. styk
    public GroceryItemOrder(String itemName, int quantity, double pricePrUnit)
    {
        ItemName = itemName;
        Quantity = quantity;
        PricePrUnit = pricePrUnit;
    }

    //getter og setter over fieldsne
    public String getItemName()
    {
        return ItemName;
    }

    public void setItemName(String itemName)
    {
        ItemName = itemName;
    }

    public int getQuantity()
    {
        return Quantity;
    }

    public double getPricePrUnit()
    {
        return PricePrUnit;
    }

    public void setQuantity(int quantity)
    {
        Quantity = quantity;
    }


    //metoden getCost() regner den samlet pris ud på en vare og antal af den vare
    // og returnere totalCost. Metoden bruges i klasserne GroceryList og GroceryList2 i metoden TotalCostList()
    public double getCost()
    {
        double totalCost = Quantity * PricePrUnit;

        return totalCost;
    }

    //Overrider den indbygget toString i Java for at returne værdierne af objectet og skrive det pænt ud i consolen
    @Override
    public String toString()
    {
        return "Item name: " + ItemName + ", " + "Quantity: " + Quantity + ", "  + "Total Price: " + getCost();
    }
}