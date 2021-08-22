package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int productNumber = 0;
        int productCount = 0;
        int sumProducts = 0;
        String[] products = new String[]{"Хлеб  ", "Яблоки", "Молоко"};
        int[] prices = new int[]{100, 200, 300};
        int currentPrice = 0;
        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " " + prices[i] + " руб/шт");
        }
        while (true) {
            System.out.println("Выберите товар и количество или введите 'end'");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            productNumber = Integer.parseInt(input.substring(0, 1));
            productCount = Integer.parseInt(input.substring(2, input.length()));
            currentPrice = prices[productNumber - 1] * productCount;
            sumProducts += currentPrice;
            list.add(products[productNumber - 1] + "                     " + productCount +
                    "            " + prices[productNumber - 1] + "           " + currentPrice);
        }
        System.out.println("Ваша корзина:");
        System.out.println("Наименование товара   Количество   Цена/за ед.  Общая стоимость");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("                                              Итого " + sumProducts);
    }
}
