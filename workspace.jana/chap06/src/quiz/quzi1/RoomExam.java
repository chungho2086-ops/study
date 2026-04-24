package quiz.quzi1;

public class RoomExam {

	public static void main(String[] args) {
		 
		// 방 생성자
		 Room room = new Room(4, true, true);
		 
		 room.reserve(6); // 하루 예약
		 room.reserve(3, 2); // 기간 에약
		 room.reserve(8, 9); // 에약이 겹쳤다
		 room.reserve(0); // 잘못된 날짜

	}

}
