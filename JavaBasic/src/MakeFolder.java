

import java.io.File;

public class MakeFolder {
	public static void main(String[] args) {
		
		String names = "강성일,강세미,강인욱,고인호,김덕진,김도훈,노승재,박시영,박윤솔,배하림,서동산,서지오,서현석,신연섭,안병주,양기문,이경수,이빈,이수현,이우철,이주용,장경원,장유진,정광주,조홍철,지재용,채해원,추대호,허지연,홍해인";
		
		String folder = "practice2";

		String[] n = names.split(",");
		
		int i=0;
		for(String name : n) {
			i++;
			File file = new File("D:/upload/quiz/"+folder+"/"+name);
			if( file.mkdirs() ) {
				System.out.println(name + " 성공");
			} else {
				System.out.println(name + " 실패!!!");
			}
		}
		System.out.println(i + "명 폴더 생성");

	}
}
