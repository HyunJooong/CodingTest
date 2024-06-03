package com;

public class Babbling {
    public static void main(String[] args) {
        String[] baby = {"aya", "ye", "woo", "ma"};
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int answer = 0;

        for(int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < baby.length; j++) {
                babbling[i] = babbling[i].replace(baby[j], " ");
            }
            if(babbling[i].trim().length() == 0) answer++;
        }


    }
}
