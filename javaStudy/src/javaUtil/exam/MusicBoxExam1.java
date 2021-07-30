package javaUtil.exam;

public class MusicBoxExam1 {

	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		
		MusicPlayer kim = new MusicPlayer(1, box);
		MusicPlayer bae = new MusicPlayer(2, box);
		MusicPlayer park = new MusicPlayer(3, box);
		
		kim.start();
		bae.start();
		park.start();
		
	}

}
