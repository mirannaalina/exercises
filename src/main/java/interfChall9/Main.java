package interfChall9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Player tim = new Player("Tim",10,15);
        System.out.println(tim.toString());

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbrigner");
        saveObject(tim);
        System.out.println(tim);
    }

    public static  ArrayList<String> readValues(){
        //bla bla
        return null;
    }


    public static void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size();i++){
            System.out.println("Saving "+ objectToSave.write().get(i)+ " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
    }


}
