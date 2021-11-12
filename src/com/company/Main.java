package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.add(1);
        numArray.add(2);
        numArray.add(3);
        numArray.add(8);
        numArray.add(9);
        numArray.add(3);
        numArray.add(2);
        numArray.add(1);

        System.out.println(maxMirror(numArray));

    }

    public static int maxMirror(ArrayList<Integer> arrayNums) {
        ArrayList<Integer> mirrorList = new ArrayList<>();
        int maxMirror = 0;

        for (int i = 0; i < (arrayNums.size()/2)+1; i++) {
            mirrorList.add(arrayNums.get(i));
            Collections.reverse(mirrorList);
            System.out.println(mirrorList);
            if(!(arrayNums.containsAll(mirrorList))){
                mirrorList.clear();
            }
            else{
                Collections.reverse(mirrorList);
                maxMirror+=1;
            }



        }
        return maxMirror;

    }


}




