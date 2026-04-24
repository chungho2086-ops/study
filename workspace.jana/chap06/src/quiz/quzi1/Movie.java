package quiz.quzi1;

public class Movie {

	String title;
	int year;
	
	void setMovie(String title, int year) {
		this.title = title;
		this.year = year;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	String getTitle() {
		return title;
	}
	
	int getYear() {
		return year;
	}
	
	void printInfo() {
		System.out.println("영화 제목 : " + title);
	}

}
