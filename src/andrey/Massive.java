package andrey;

import java.util.Arrays;

public class Massive {
    Massive(){
        massivMetod();
    }

    public void massivMetod(){
        int[] mass1 = {1, 2, 3, 4};
        int[] mass3;
        int[] mass4;
        int[] mass5 = new int[4];
        mass5[0] = 5;
        mass5[1] = 6;
        mass3 = mass1;
        mass3[0] = 5;
        int[] mass2 = {5, 6, 7, 8};
        mass1 = mass2;
        mass4 = Arrays.copyOf(mass3, mass3.length);
        System.out.println(mass1);
        System.out.println(mass2);
        System.out.println(mass3);
        System.out.println(mass4);
        System.out.println(mass5);

        for (int i = 0; i < 4; i++){
            mass1[i] = mass1[i];
            System.out.println(mass1[i]);
        }


    }
}
