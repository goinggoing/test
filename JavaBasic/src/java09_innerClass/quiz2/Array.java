package java09_innerClass.quiz2;


public class Array implements ArrayAction {
	String[] arr = new String[10];

	@Override
	public void add(String element) {
		int idx; //삽입 위치 인덱스
		
		//삽입 위치 찾기
		for(idx=0; idx<arr.length; idx++) { //배열의 길이만큼
			if( arr[idx] == null ) { //비어있는 공간의 idx찾기
				break;
			}
		}
		
		// 배열의 크기보다 많은 데이터를 입력하는 상황 - 예외 처리
		if( idx >= arr.length ) {
			return;
		}
		
		arr[idx] = element; //삽입
	}
	
	@Override
	public void print() {
		int idx;
		
		//배열의 모든 요소 출력
		for(idx=0; idx<arr.length; idx++) {
			if( arr[idx] != null ) { //null이 아니면 출력
				System.out.println( arr[idx] );
				
			} else { //null을 만나면 중단
				break;
				
			}
		}
	}

	@Override
	public void remove(String element) {
		int idx = find(element);
		
		// 지우려는 요소로부터 다음에 있는 요소들은
		//모두 한칸씩 당겨서 저장한다
		for(; idx<arr.length-1; idx++) {
			arr[idx] = arr[idx+1];
		}
		
		// 배열이 가득 차 있던 상황에서는 마지막 요소에 null을 저장
		arr[idx] = null;
	}

	@Override
	public String get(int idx) {
		return arr[idx];
	}

	@Override
	public int find(String element) {
		int idx; //삽입 위치 인덱스
		
		//삽입 위치 찾기
		for(idx=0; idx<arr.length; idx++) { //배열의 길이만큼
			if( arr[idx].equals(element) ) { //비어있는 공간의 idx찾기
				break;
			}
		}
		
		if(idx==arr.length) {
			return -1;
		} else {
			return idx;
		}
	}
}






