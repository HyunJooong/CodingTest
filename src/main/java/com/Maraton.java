package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Maraton {

    public void main

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<Integer, String> hm = new HashMap<>();
        //hashmap에 참가자 담기
        for (int i = 0; i < participant.length; i++) {
            hm.put(i, participant[i]);
        }
        for (int k = 0; k < completion.length; k++) {
            if (hm.containsValue(completion[k])) {
                hm.remove(completion[k]);
            }
        }
        answer = hm.get(0);

        return answer;

    }
}
