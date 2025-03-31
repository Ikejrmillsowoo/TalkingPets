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
    public void setNumberOfPets(Integer num){
        this.numberOfPets = num;
    }

    public Integer getNumberOfPets(){
        return this.numberOfPets;
    }

    public void addPets(){
        for (int i = 0; i < numberOfPets; i++) {
            String typeOfPet = getUserInput("What kind of pet is it? (1)-Dog, (2)-Cat, (3)-Bird");
            String nameOfPet = getUserInput("What is the pets name?");
            this.petNames.add(typeOfPet+ " : " + nameOfPet);
        }
    }

    public void addPets(String type, String name){
            this.petNames.add(type+ " : " + name);
    }

    public ArrayList<String> getListOfPets(){
        for (String pet: petNames){
            System.out.println(pet);
        }
        return petNames;
    }


}
