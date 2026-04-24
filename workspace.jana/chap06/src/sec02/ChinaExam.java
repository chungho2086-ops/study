package sec02;

public class ChinaExam {

	public static void main(String[] args) {
		
		China i1 = new China();
		i1.name = "가게이름 = 양자강";
		i1.address = "주소 = 임피면사무소옆";
		i1.menus = new String[] { "깐쇼새우","양장피", "탕수육" };		
		
		System.out.println(i1.name);
		System.out.println(i1.address);
		System.out.println(i1.menus[0]);
		System.out.println(i1.menus[1]);
		System.out.println(i1.menus[2]);
			
		System.out.println("=============");
		
		China i2 = new China();
		i2.name = "가게이름 = 태평반점";
		i2.address = "주소 = 임피우체국옆";
		i2.menus = new String[] { " 깐쇼새우", "짬뽕"  };
			
		System.out.println(i1.name);
		System.out.println(i1.address);
		System.out.println(i1.menus[0]);
		System.out.println(i1.menus[1]);
		
		System.out.println("=============");
		
		i1.name =  "군산교동짬뽕";
		i1.address =  "비응로";
		
		System.out.println(i1.name);
		System.out.println(i1.address);
	}

}
