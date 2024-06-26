package io.github.toquery.example.java.jdk14;

/**
 *
 */
public class AppJdk14Test {

    public void instanceofType(){

        Object type = new Object();

        if (type instanceof String str){
            String s = (String)type;
            //
        }else if (type instanceof Integer i){

        }
    }

    public void record(){
        AppRecord appRecord = new AppRecord("", "", 1);
    }

    public void switchEnhance(){

    }


}
