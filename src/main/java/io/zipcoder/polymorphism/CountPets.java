package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;


public class CountPets {

    private Integer numberOfPets;
    private ArrayList<String> petNames = new ArrayList<>();

    Scanner sc = new Scanner(System.in);


    public String getUserInput(String string){
        System.out.println(string);
        String userInput = sc.nextLine();
        return userInput;
    }

    public void setNumberOfPets(){
        this.numberOfPets = Integer.parseInt(getUserInput("How many pets do you have?"));
    }

    public void addPets(){

        for (int i = 0; i < numberOfPets; i++) {
            String typeOfPet = getUserInput("What kind of pet is it?");
            String nameOfPet = getUserInput("What is the pets name?");
            this.petNames.add(typeOfPet+ " : " + nameOfPet);
        }

    }

    public void getListOfPets(){
        for (String pet: petNames){
            System.out.println(pet);
        }
    }


}
