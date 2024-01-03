package api.utill.collection4;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test01Queue {

	public static void main(String[] args) {
		//Queue(큐)
		// - 사용법이 정해져 있는 특수 저장소
		// - FIFO(First - in - First - out) 구조 선입선출
		// - 입출력 시스템의 기본 구성 원리
		// - ex ) 키보드와 마우스 클릭 같은것
		// - 데이터 1개 추가 / 데이터 1개 제거 / 데이터 확인
		
		Queue<String> queue = new LinkedBlockingQueue<>();
		
		//데이터 추가 - add
		queue.add("뽀로로");
		queue.add("크롱");
		queue.add("루피");
		queue.add("패티");
		
		//현재 차례 확인 - peek()
		System.out.println("현재 차례 = " + queue.peek());
		
		//데이터 제거 - poll()
		queue.poll(); //out
		queue.poll(); //out
		
		System.out.println("현재 차례 = " + queue.peek());
		
		//우선순위 큐
	}
}
