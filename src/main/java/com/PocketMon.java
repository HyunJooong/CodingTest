package com;

import java.util.HashSet;

public class PocketMon {

    public int solution(int[] nums) {

        int answer = 0;

        //가질 수 있는 포켓몬 수
        int pocketBall = nums.length/2;
        // 중복 제거 hashset
        HashSet<Integer> pocketMon = new HashSet<>();
        //반복문을 통해 중복 제거 후 set에 포켓몬 담기
        for(int i = 0; i < nums.length; i++){
            pocketMon.add(nums[i]);
        }

        if(pocketMon.size() > pocketBall) {
            answer = pocketBall;
        }else answer = pocketMon.size();



        return answer;
    }


}
