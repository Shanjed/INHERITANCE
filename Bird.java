package com.company;

public class Bird extends Animal{
    private String featherColorShanjed56275;



    public Bird(){
        super();
        featherColorShanjed56275="NN";

    }

    public Bird (String nameShanjed56275, int ageShanjed56275, int weightShanjed56275, String featherColorShanjed56275){
        super(nameShanjed56275, ageShanjed56275, weightShanjed56275);
        this.featherColorShanjed56275=featherColorShanjed56275;
    }

    public Bird(int ageShanjed56275 , String featherColorShanjed56275){
        super(ageShanjed56275);
        this.featherColorShanjed56275=featherColorShanjed56275;
    }

    public void takingFlightShanjed56275(){
        System.out.println("Flap flap");
    }

    @Override
    public void getVoiceShanjed56275() {
        System.out.println("Bird is making sounds");
    }

    @Override
    public void eatShanjed56275(String FoodName) {
        System.out.println("Bird is eating: " + FoodName);
    }

    public String getFeatherColorShanjed56275() {
        return featherColorShanjed56275;
    }

    public void setFeatherColorShanjed56275(String featherColorShanjed56275) {
        this.featherColorShanjed56275 = featherColorShanjed56275;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColorShanjed56275='" + featherColorShanjed56275 + '\'' +
                '}';
    }
}

