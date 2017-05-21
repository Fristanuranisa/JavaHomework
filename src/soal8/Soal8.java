package soal8;

import java.util.ArrayList;

/**
 * Created by fristanuranisa on 5/21/17.
 */
public class Soal8 {
    public static void main(String[] args) {
        ArrayList<Integer> monthlyHeight = new
                ArrayList<Integer>();

        monthlyHeight.add(130);
        monthlyHeight.add(135);
        monthlyHeight.add(145);
        monthlyHeight.add(150);
        monthlyHeight.add(160);
        monthlyHeight.add(163);
        monthlyHeight.add(170);
        monthlyHeight.add(175);
        monthlyHeight.add(180);
        monthlyHeight.add(190);

        for (Integer high : monthlyHeight){

            System.out.println("Monthly height of banana tree" + ": " + high + "cm");
        }


    }
}
