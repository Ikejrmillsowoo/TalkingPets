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
            if (typeOfPet.equals("1")){
                Dog dog = new Dog();
                String nameOfPet = setPetsName();
                this.petNames.add("Dog"+ " : " + nameOfPet + " can "  +dog.speak());
            } else if (typeOfPet.equals("2")){
                Dog cat = new Dog();
                String nameOfPet = setPetsName();
                this.petNames.add("Cat"+ " : " + nameOfPet + " can "  + cat.speak());
            } else {
                Dog bird = new Dog();
                String nameOfPet = setPetsName();
                this.petNames.add("Bird"+ " : " + nameOfPet + " can "  + bird.speak());
            }
        }
    }

    public String setPetsName() {
        return getUserInput("What is the pets name?");
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
