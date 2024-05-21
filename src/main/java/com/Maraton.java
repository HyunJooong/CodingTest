package com;

import java.util.HashMap;

public class Maraton {

    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String answer = "";

        HashMap<String, Integer> hm = new HashMap<>();

        for(int i = 0; i < participant.length; i++) {
            hm.put(participant[i], hm.getOrDefault(participant[i], 0) + 1);
        }
//        System.out.println(hm);
        for(int j = 0; j < completion.length; j++) {
            hm.put(completion[j], hm.get(completion[j]) - 1);
        }

        for(String answer2 : hm.keySet()) {
            if (hm.get(answer2) != 0) {
                answer = answer2;
                break;
            }
        }

        System.out.println(answer);


    }
}




