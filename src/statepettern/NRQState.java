/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepettern;

/**
 *
 * @author im
 */
public class NRQState implements State {//���� ��û�� ���� ��Ȳ
    SP sP;
    
    public NRQState(SP sP){
    this.sP = sP;
    }
    
    public String reQ(){
    String a = "���� ��û\n";
    sP.setState(sP.getHRQState());
    return a;
    }
    public String reJ(){
      String b = "���� ��û �ź�\n";
      return b;
    }
    public String id(){
      String c = "â�� Ȯ��\n";
      return c;
    }
    public String ds(){
      String d = "���� ����\n";
      return d;
    }
    @Override
    public String toString(){
    return "���� ��û�� ��ٷ���.\n";
    }
}