package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MainController {
    String look = "";
    String input;
    int first_num;
    int second_num;
    int fin_num;

    HashSet<String> numbers = new HashSet<>(
            Arrays.asList("1","2","3","4","5","6","7","8","9","0")
    );

    HashSet<String> symbols = new HashSet<>(
            Arrays.asList("+","-","*","/","=")
    );

    public void check(String data){
        int count = 0;
        int index_last = 0;
        int index_first = 0;
        if(numbers.contains(data)){
            look = look + data;

            // Dogshit code below
            /*
            if(String.valueOf(look.charAt(look.length()-1)).equals("=")){
                for (int i = 0; i < look.length(); i++) {
                    if(String.valueOf(look.charAt(i)).equals("+")){
                        System.out.print("Second num is: " + look.substring(look.indexOf("+")+1, look.indexOf("=")));
                        second_num = Integer.parseInt(look.substring(look.indexOf("+")+1, look.indexOf("=")));
                        fin_num = first_num + second_num;
                        System.out.print("\nSum is " + fin_num);
                    }else if(String.valueOf(look.charAt(i)).equals("-")){
                        System.out.print("Second num is: " + look.substring(look.indexOf("-")+1, look.indexOf("=")));
                        second_num = Integer.parseInt(look.substring(look.indexOf("-")+1, look.indexOf("=")));
                        fin_num = first_num - second_num;
                        System.out.print("\nDifference is " + fin_num);
                    }else if(String.valueOf(look.charAt(i)).equals("*")){
                        System.out.print("Second num is: " + look.substring(look.indexOf("*")+1, look.indexOf("=")));
                        second_num = Integer.parseInt(look.substring(look.indexOf("*")+1, look.indexOf("=")));
                        fin_num = first_num * second_num;
                        System.out.print("\nProduct is " + fin_num);
                    }else if(String.valueOf(look.charAt(i)).equals("/")) {
                        System.out.print("Second num is: " + look.substring(look.indexOf("/") + 1, look.indexOf("=")));
                        second_num = Integer.parseInt(look.substring(look.indexOf("/") + 1, look.indexOf("=")));
                        fin_num = first_num / second_num;
                        System.out.print("\nQuotient is " + fin_num);
                    }
                }
            }

             */

        }

        if(symbols.contains(data)){
            look = look + data;
            for (int i = 0; i < look.length(); i++) {
               if(symbols.contains(String.valueOf(look.charAt(i)))){
                   count++;
               }
            }

            if(count == 2){
                display.clear();
                // index of last entered symbol
                index_last = look.lastIndexOf(data);
                // index of first symbol
                for (int i = 0; i < look.length(); i++) {
                    if(symbols.contains(String.valueOf(look.charAt(i)))){
                        index_first = i;
                        break;
                    }
                }

                first_num = Integer.parseInt(look.substring(0,index_first));
                second_num = Integer.parseInt(look.substring(index_first+1,index_last));

                if(String.valueOf(look.charAt(index_first)).equals("+")){
                    fin_num = first_num + second_num;
                }else if(String.valueOf(look.charAt(index_first)).equals("-")){
                    // having issue where numbers are still being added
                    fin_num = first_num - second_num;
                }else if(String.valueOf(look.charAt(index_first)).equals("*")){
                    fin_num = first_num * second_num;
                }else if(String.valueOf(look.charAt(index_first)).equals("/")){
                    fin_num = first_num / second_num;
                }
            }
        }

        if(String.valueOf(look.charAt(look.length()-1)).equals("=")){
            look = String.valueOf(fin_num);
            display.setText(look);
        }else if(count == 2){
            look = String.valueOf(fin_num) + look.charAt(index_last);
            display.setText(look);
        }else{
            display.setText(look);
        }
    }

    @FXML
    void clear(ActionEvent event) {
        look = " ";
        display.clear();
        first_num = 0;
        second_num = 0;
    }


    @FXML
    void addition(ActionEvent event) {
        input = "+";
        check(input);
    }
    @FXML
    void subtraction(ActionEvent event) {
        input = "-";
        check(input);
    }

    @FXML
    void multiplication(ActionEvent event) {
        input = "*";
        check(input);
    }

    @FXML
    void division(ActionEvent event) {
        input = "/";
        check(input);
    }


    @FXML
    void equals(ActionEvent event) {
        input = "=";
        check(input);
    }

    @FXML
    private TextField display;

    @FXML
    void num_0(ActionEvent event) {
        input = "0";
        check(input);
    }

    @FXML
    void num_1(ActionEvent event) {
        input = "1";
        check(input);
    }

    @FXML
    void num_2(ActionEvent event) {
        input = "2";
        check(input);
    }

    @FXML
    void num_3(ActionEvent event) {
        input = "3";
        check(input);
    }

    @FXML
    void num_4(ActionEvent event) {
        input = "4";
        check(input);
    }

    @FXML
    void num_5(ActionEvent event) {
        input = "5";
        check(input);
    }

    @FXML
    void num_6(ActionEvent event) {
        input = "6";
        check(input);
    }

    @FXML
    void num_7(ActionEvent event) {
        input = "7";
        check(input);
    }

    @FXML
    void num_8(ActionEvent event) {
        input = "8";
        check(input);
    }

    @FXML
    void num_9(ActionEvent event) {
        input = "9";
        check(input);
    }
}