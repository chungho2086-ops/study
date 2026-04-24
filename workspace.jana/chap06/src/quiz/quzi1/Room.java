package quiz.quzi1;

public class Room {


    int maxPeople;          
    boolean pet;            
    boolean bbq;
    
    boolean[] reserved = new boolean[11]; 
    
    Room(int maxPeople, boolean pet, boolean bbq) {
        this.maxPeople = maxPeople;
        this.pet = pet;
        this.bbq = bbq;
    }
    
    boolean reserve(int day) {

        if (day < 1 || day > 10) {
            System.out.println(" 이 날짜에 에약 불가능합니다");
            return false;
        }

        if (reserved[day]) {
            System.out.println( day + "일은 이미 에약 되어있습니다");
            return false;
        }

        reserved[day] = true;
        System.out.println( day + "일 예약이 완료 되었습니다");
        return true;
    }
    
    boolean reserve(int start, int end) {

        if (start < 1 || end > 10 || start > end) {
            System.out.println("잘못된 날짜입니다");
            return false;
        }

        
        for (int i = start; i <= end; i++) {
            if (reserved[i]) {
                System.out.println("❌ " + i + "일에 이미 예약이 되어있습니다");
                return false;
            }
        }

        for (int i = start; i <= end; i++) {
            reserved[i] = true;
        }

        System.out.println( start + "일 ~ " + end + "일 예약이 완료 되어있습니다");
        return true;
    }

}
