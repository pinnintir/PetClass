package com.company;

public class Pet
{

    Pet input = new Pet();

    public Pet() {
        input.name();
    }

    private void name() {
    }



        private String name = "Angel";
        private String animal = "gecko";
        private String type = "spotted";
        private String location = "Malvern";
        private int age = 100;
        //only the pet class can access this

    public Pet(String initialName, String initialAnimal, String initialType, int initialAge)
    {
    }

    public void setvariable(int a){
        age = a;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setType(String newType){

        type = newType;
    }
    public void setAnimal(String newAnimal){

        animal = newAnimal;

    }
    public int getvariable(){
            return age;
    }

    public String getName() {
        return name;
    }
    public String getAnimal(){
        return animal;
    }
    public String getType() {
    return type;
    }
    public void printvariable() {
        System.out.printf("You are ");
    }


}




