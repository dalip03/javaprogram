

//Main Class
public class App {

	
	//Main Method
	public static void main(String[] args) {

    LinkedList playList = new LinkedList();		
		

	Song song1 = new Song("Sach keh raha hai ", "B-praak", 3.44f);
	Song song2 = new Song("Bimaryaan ", "B-praak", 4.44f);
	Song song3 = new Song("pagal ", "akhil", 3544f);
	Song song4 = new Song("Bachhapan Ka Pyar  ", "anonymous", 2.44f);
	Song song5 = new Song("Barish  ", "Nutaila", 36.44f);
	
	System.out.println();
	System.out.println("1INITIALLY PLAY LIST DETAILS");
	System.out.println();
	System.out.println("Is PlayList Is Empty: " +playList.isEmpty());
	System.out.println("Length Of Play List Is " +playList.length());

	playList.add(song1);
	
	System.out.println("**************************************");
	System.out.println();
	System.out.println("Is PlayList Is Empty: " +playList.isEmpty());
	System.out.println("Length Of Play List Is: " +playList.length());
	playList.add(song2);

	
	System.out.println("**************************************");
	System.out.println();
	System.out.println("Is PlayList Is Empty: " +playList.isEmpty());
	System.out.println("Length Of Play List Is: " +playList.length());
	
	System.out.println("**************************************");
	System.out.println();
	playList.add(song3);
	System.out.println("Is PlayList Is Empty: " +playList.isEmpty());
	System.out.println("Length Of Play List Is: " +playList.length());
	
	
	System.out.println("**************************************");
	System.out.println();
	playList.add(song4);
	System.out.println("Is PlayList Is Empty: " +playList.isEmpty());
	System.out.println("Length Of Play List Is: " +playList.length());
	
	
System.out.println("**************************************");
	System.out.println();
	playList.add(song5);
	System.out.println("Is PlayList Is Empty: " +playList.isEmpty());
	System.out.println("Length Of Play List Is: " +playList.length());
	System.out.println("**************************************");
	
	
	//playList.iterate(true);
	System.out.println();
	//playList.iterate(false);
	
	}

}
