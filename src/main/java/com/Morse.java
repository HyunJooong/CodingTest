package com;

class Morse {
    public String solution(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."};

        StringBuilder answer = new StringBuilder();
        String[] morseSplit = letter.split(" ");

        for (String hello3 : morseSplit) {
            for (int i = 0; i < morse.length; i++) {
                if (hello3.equals(morse[i])) {
                    answer.append(Character.toString(i + 'a'));
                }
            }

        }
        return answer.toString();
    }
}
