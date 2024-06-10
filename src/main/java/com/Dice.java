package com;

public class Dice {
    public static int solution(int[] box, int n){
        int answer = 0;

        int w,l,h  = 0;
        w = box[0]/ n;
        l = box[1]/ n;
        h = box[2]/ n;

        answer = w * l * h;

        return answer;
    }
    public static void main(String[] args){

        int[] box ={10,8,6};

        System.out.println(solution(box,3));

    }
}
