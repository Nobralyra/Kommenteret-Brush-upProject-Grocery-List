// ***********************************************************************
// Assembly         :
// Author           : Signe Nørløv Eskildsen
// Created          : 06-09-2019
//
// Last Modified By : Signe Nørløv Eskildsen
// Last Modified On : 11-09-2019
// ***********************************************************************

//package org.kodejava.example.google.gson;
//import com.google.gson.Gson;

import java.util.*;
public class TestClass
{
    public static void main(String[] args)
    {
        //Lokale variabler
        int option = 0;

        boolean run = true;

        // Create a new instance of Gson
        //Gson gson = new Gson();
        Scanner input = new Scanner(System.in);

        //************************************
        //Man kan skifte mellem array og arraylist
        //GroceryList groceryList = new GroceryList();
        GroceryList2 groceryList = new GroceryList2();
        //************************************

        //String daysJson = gson.toJson(groceryList);

        //While bliver ved med at køre indtil run = false. Den indeholder en switch case
        while (run)
        {
            //Lokale variabler
            option = input.nextInt();//Tager inputtet over i den lokale variable, som bestemmer hvilken case man kommer ind i
            switch (option)
            {
                case 0: //Kan tilføje vare til arrayet eller arraylisten alt efter hvad der er valgt

                    System.out.println("Input a new item name: ");
                    input = new Scanner(System.in);//nødt til at være der for at undgå at programmet springer en linje over
                    String newItemName = input.nextLine();

                    System.out.println("Input a new item quantity: ");
                    int newItemQuantity = input.nextInt();

                    System.out.println("Input a new item pricePrUnit: ");
                    double newItemPricePrUnit = input.nextDouble();

                    GroceryItemOrder groceryItemOrder = new GroceryItemOrder(newItemName, newItemQuantity, newItemPricePrUnit);

                    //Try/catch som handler hvis der er tilføjet for mange vare til arrayet.
                    try
                    {
                        groceryList.addItem(groceryItemOrder);
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.getMessage());//Får fejlbeskeden fra GroceryList klassen
                    }
                        break;

                case 1: //Udskriver alle vare
                    groceryList.toString();
                    break;

                case 2: //Får programmet til at stoppe

                    run = false;

                    break;
            }
        }
    }
}