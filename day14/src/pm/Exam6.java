package pm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam6 {
	/*
	 Linked List 연결 리스트
	 List<E>의 모든 공통 특징을 다 가지고 있다. 
	 (동질 자료, 동적 할당, 추가/변경/삭제/동일한 메서드 사용)
	 
	 1. LinkedList<E>는 객체를 생성할때 저장 용량을 지정할 수 없다.
	 2. 내부적으로 데이터를 저장하는 방식이 좀 다르다. 모든 데이터가 서로 연결된 형태로
	 	관리된다는 점이다.
	 */
	public static void main(String[] args) {
		List<Integer> linkedlist1 = new LinkedList<Integer>();
		
		// 1. add - 끝에 계속 추가
		linkedlist1.add(3);
		linkedlist1.add(4);
		linkedlist1.add(5);
		System.out.println(linkedlist1.toString());
		// 2. add - 위치 지정 삽입 
		linkedlist1.add(1, 6); //(index, value)
		System.out.println(linkedlist1.toString());


		// 4. set  바꾸기
		linkedlist1.set(1,5); // (index, value)
		System.out.println(linkedlist1.toString());
		// 5. remove  삭제
		linkedlist1.remove(1); // index값을 삭제
		System.out.println(linkedlist1.toString());
		// 6. remove
		linkedlist1.remove(new Integer(2)); // 처음 등장하는 값을 삭제
		System.out.println(linkedlist1.toString());
		// 7.clear()  //전체 삭제
		linkedlist1.clear();
		System.out.println(linkedlist1.toString());
		// 8.isEmpty()  // 비어 있는지 확인
		System.out.println(linkedlist1.isEmpty());
		// 9. size     // 갯수 확인
		System.out.println(linkedlist1.size());
		
		linkedlist1.add(3);
		linkedlist1.add(4);
		linkedlist1.add(5);
		//10. get      // index로 가져오기
		System.out.println(linkedlist1.get(0));
		System.out.println(linkedlist1.get(1));
		System.out.println(linkedlist1.get(2));
		for (int i = 1 ; i < linkedlist1.size()+1 ; i++) {
			System.out.println(i + "번째 : " + linkedlist1.get(i-1));
		}
	}

}

/*
 만약 7개의 데이터를 가진 ArrayList에서 2번 인덱스에 데이터를 추가하고자 한다면
 기존 2번 이후의 모든 데이터가 한칸씩 뒤로 밀려나게 된다.
 그러면 밀려나는 모든 데이터의 위치 정보가 모두 수정되어야 한다는 것을 의미한다.
 만약 데이터가 1000개이고 0번 인덱스에 데이터를 추가하면 
 1000개의 데이터 위치 정보를 모두 수정이 되어야 한다.
 그러나 Linked List는 각 원소의 앞 뒤 정보를 저장하고 있으므로 어딘가에 값이 추가되면
 값이 추가된 위치의 앞뒤 데이터 정보만 수정하면 된다. 
 따라서 중간에 데이터를 추가할 때 속도 차이가 날 것이라는 것을 예상할 수 있다.
 
 그렇다면 장점만 있을까 ?
 Linked List는 각 원소가 자신의 인덱스 정보를 갖고있지는 않다.
 특정 인덱스 위치의 값을 가져오기 위해서는 앞에서부터 차례로 번호를 세어가면서
 인덱스의 위치를 찾아야 한다.
 반면에 ArrayList는 데이터 자체에 인덱스 번호를 갖고 있으므로 특정 인덱스 위치의 데이터를
 빠르게 찾을 수 있다.
 
 데이터를 추가 또는 삭제 할때는 Linked List가 빠르고,
 데이터를 찾을때는 ArrayList가 빠르다.
 
 			ArrayList		LinkedList
 추가 삭제		느림				빠름
 검색			빠름				느림
 
 
 0 1 2 3 4 5 6		0 1 2 3 4 5 6 7
 가 나 다 라 마 바 사		가 나 아 다 라 마 바 사
 						-- 밀어서 들어간다.
 						
 						
 
 */
