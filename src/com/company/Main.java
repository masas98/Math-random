package com.company;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static <Exeption extends Throwable> void main(String[] args) {

//        String tekstas="kazkoks tekstas";
//        tekstas = "kitkoks tekstas";
//        tekstas+= " prailgintas";
//        tekstas = "labas" + "rytas";
//        System.out.println(tekstas);
//
//        int sk=7;
//        double skDouble= 7.2;
//        float skFloat=7.2f;
//        skFloat+= 12f;
//        skFloat= skFloat/5;
//        System.out.println(skFloat);
//        char raide= 'k';
//        boolean truFlase= true;
//        byte hm = 7;
//
//        System.out.println("tekstas");
//        String zodis ="zodis";
//        System.out.println(4 + zodis);
//        System.out.println(zodis +4);
//        System.out.println(zodis +4+4);
//        System.out.println(4+ 4+ zodis);


//        for (int i =0; 10==10; i++){
//            System.out.println(i);
//        }
//
//        if ("siandien lyja"){
//            System.out.println("pasiimsiu sketi")
//        }
//        else if ("siandien salta"){
//            System.out.println("siltai apsirengsiu");
//        }
//
//        if ("siandien lyja"){
//            System.out.println("pasiimsiu sketi")
//        }
//        else (){
//            System.out.println("skecio neimsiu");
//        }

        System.out.println("\"");
        System.out.println(Math.random());

        String vardas = "Vaidotas";
        String pavarde = "Masas";
        int years= 1998;
        int today = 2021;
        System.out.println(("Aš esu ")+(vardas+(" ")+pavarde+(" "))+(".")+(" Man yra ")+(today-years)+(" metai."));

        Math.random(); // 0 < x < 1 0.00000000001, 0,99999999999999999999


        double rnd = Math.random() * 5;
        int rndInt = (int) rnd; //3
        //System.out.println(Math.random() *4); //0.0000000000000004, 0.39999999999999999995
        System.out.println(rndInt);
        int random = (int)(Math.random()*6+2); // sugeneruos skaiciu nuo 2 iki 7 sveiki skaiciai


        /*Įvedami skaičiai -a, b, c –kraštinių ilgiai, trys kintamieji (naudokite
        ​Math.random()​ funkcija nuo 1 iki 10).
        Parašykite Java programą, kuri nustatytų, ar galima sudaryti trikampį ir atsakymą atspausdintų.
         */
        int a = (int)(Math.random()*10+1);
        int b = (int)(Math.random()*10+1);
        int c = (int)(Math.random()*10+1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        if (a+b<=c || b+c<=a || a+c<=b){
            System.out.println("Galima sudaryti trikampi");
        }
        else{
            System.out.println("trikampio sudaryti negalima");
        }
        /* Padarykite skaitmeninį laikrodį, rodantį valandas, minutes ir sekundes. Valandom, minutėm ir sekundėm sugeneruoti panaudokite funkciją Math.random().
        Sugeneruokite skaičių nuo 0 iki 300. Tai papildomos sekundės.
        Skaičių pridėkite prie jau sugeneruoto laiko. Atspausdinkite laikrodį prieš ir po sekundžių pridėjimo ir pridedamų sekundžių skaičių.
         */


        int hours = (int)((Math.random()*24));
        int minutes = (int)((Math.random()*60));
        int seconds = (int)((Math.random()*60));

        System.out.println((hours)+":"+(minutes)+":"+(seconds));

        int rand = (int)((Math.random()*300+1));
        System.out.println("random skaicius "+(rand));

        int secondsAdded=(seconds)+(rand);

        if (secondsAdded>0 && secondsAdded<60){
            seconds=secondsAdded;
            System.out.println((hours)+":"+(minutes)+":"+(seconds));
        }
        else if (secondsAdded>60 && secondsAdded<120){
            minutes=minutes+1;
            seconds=120-secondsAdded;
            System.out.println((hours)+":"+(minutes)+":"+(seconds));
        }
        else if (secondsAdded>120 && secondsAdded<180){
            minutes=minutes+2;
            seconds=180-secondsAdded;
            System.out.println((hours)+":"+(minutes)+":"+(seconds));
        }
        else if (secondsAdded>180 && secondsAdded<240){
            minutes=minutes+3;
            seconds=240-secondsAdded;
            System.out.println((hours)+":"+(minutes)+":"+(seconds));
        }
        else if (secondsAdded>240 && secondsAdded<300) {
            minutes = minutes + 4;
            seconds = 300 - secondsAdded;
            System.out.println((hours) + ":" + (minutes) + ":" + (seconds));
        }
        else {
            minutes=minutes+5;
            System.out.println((hours) + ":" + (minutes) + ":" + (seconds));
        }

        int h=12;
        int m=24;
        int s=50;
        int xTime=259;
        System.out.println((h)+":"+(m)+":"+(s));

        String str="labas as krabas";
        System.out.println(str.length());


        //Capitalize letters
        String name= "viktoras byrbyne";
        String nameUp=name.toUpperCase();
        System.out.println(nameUp);

        //pakeisti raides tekste
        String title="An American in Paris";
        String newTitle= title.replace("A" ,"*");
        String newerTitle=newTitle.replace("a","*");
        System.out.println(newerTitle);

        //ištrini balses
        String pav="An American in Paris";
        String newa=pav.replaceAll("[AEIOUaeiou]", "");

        System.out.println("Sakinys be balsių: "+newa);
//            012345
        // random vardas
        String vard="bobas";
        String pavard="bobelis";
        String kit=(vard.substring(vard.length()-3))+(pavard.substring(pavard.length()-3));
        System.out.println("Vardas is random: "+kit);
//7 užd
        String episode=("Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope");
        System.out.println(episode);
        System.out.println(episode.substring(episode.length()-14,episode.length()-13));

        for(char ch: episode.toCharArray()){
            if(Character.isDigit(ch)){
                System.out.println("Serijos numeris yra: "+ch);
            }
        }
 //8užd
//        String tekstas= "Don't Be a Menace to South Central While Drinking Your Juice in the Hood";
//        String[] words=tekstas.split(" ",20);
//        for (String z:words)
//            System.out.println(z);

       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Jūsų vardas?");
        String k=scanner.nextLine();
        System.out.println("Jūsų Pavardė?");
        String l=scanner.nextLine();
        System.out.println("Programuoju?(True/false)");
        boolean q=scanner.nextBoolean();
        System.out.println("Jūsų Amžius");
        int p=scanner.nextInt(); */


//        System.out.println(k+" "+l+" "+q+" "+p);

        long currentTime = new java.sql.Timestamp(System.currentTimeMillis()).getTime();
        System.out.println(currentTime);

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date= new Date();
        System.out.println(formatter.format(date));




















    }
}
