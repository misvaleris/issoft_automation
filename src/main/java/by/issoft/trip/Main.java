package by.issoft.trip;

import by.issoft.trip.bank.ExchangeRate;
import by.issoft.trip.bank.NationalBankAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Entertainments> entertainments = new ArrayList<>();

        Entertainments disco = new Entertainments(5, 10);
        entertainments.add(disco);

        Entertainments spa = new Entertainments(10, 15);
        entertainments.add(spa);

        Entertainments shopping = new Entertainments(50, 5);
        entertainments.add(shopping);

        Hotel hotel = new Hotel(50, 30);
        Food food = new Food(10, 90);
        Transport transport = new Transport(150, 2);

        List<Expenses> expenses = new ArrayList<>();
        expenses.addAll(entertainments);
        expenses.add(hotel);
        expenses.add(food);
        expenses.add(transport);


        Trip trip = new Trip("June 2021", expenses);
        TripCalculator tripCalculator = new TripCalculator();
        int tripBudget = tripCalculator.getTripBudget(trip);
        System.out.println("Trip budget is " + tripBudget);

        NationalBankAPI api = new NationalBankAPI();
        ExchangeRate[] currenciesExchangeRate = api.getCurrenciesExchangeRate();

        for(ExchangeRate exchangeRate : currenciesExchangeRate){
            double inCurrency = tripBudget / exchangeRate.getCurrencyRate();
            String currencyName = exchangeRate.getCurrencyName();
            String result = String.format("In %s trip budget is %.2f", currencyName, inCurrency);
            System.out.println(result);
        }

    }

}
