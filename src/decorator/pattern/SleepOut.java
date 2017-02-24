package decorator.pattern;
/**
 *추가로 받는 포상(외박) 구현
 * @author 지동
 */
public class SleepOut extends Condimentdecorator {

                Award award;    //추가로 받는 포상을 저장할 인스턴스 변수
	public SleepOut(Award award) {  //인스턴스 변수를 감싸고자 하는 객체로 설정하기 위한 생성자
		this.award = award;
	}

	public String getDescription() {
		return award.getDescription();
	}

	public String getAward() {  //추가로 받는 포상 부분
                                String gunshot_excellent_award = "--추가 포상--\n외박\n";
		return award.getAward() + gunshot_excellent_award;
	}
}