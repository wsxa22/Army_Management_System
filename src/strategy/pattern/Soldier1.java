/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.pattern;

/**
 * 병사 휴가 클래스
 * HolidayBehavior(휴가) 인터페이스를 받아 Soldier1(병사) 클래스 생성
 *  * @author 동영
 */
public class Soldier1 implements HolidayBehavior {
        public String holiday(){
        String holiday = "-----------병사 휴가-----------\n군생활 중 21일[637일 중]";
        return holiday;
    }
}

