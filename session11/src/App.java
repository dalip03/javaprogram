

//Main class
public class App {

	public static void main(String[] args) {

		Song song1 = new Song("Sach keh raha hai ", "B-praak", 3.44f);
		Song song2 = new Song("Bimaryaan ", "B-praak", 2.44f);
		Song song3 = new Song("pagal ", "akhil", 3.44f);

	//	System.out.println(song1);
		//System.out.println(song2);
		//System.out.println(song3);
		
		//Hard Code
		
		song1.nextSong = song2;
		song1.previousSongs = song3;
		
		song2.nextSong = song3;
		song2.previousSongs = song1;
		
		song3.nextSong = song1;
		song3.previousSongs = song2;
	
		Song song = song1; //reference copy operation
		
		//Forward Iteration
		System.out.println("Forward Iteration \n");
		while(true) {
			song.showSong();
			song = song.nextSong; //reference copy
			
			if(song.nextSong == song1) {
				song.showSong();
				break;
				        
			}
			
			
				}
		//Backward Iteration
		System.out.println("Backward Iteration \n");
		while(true) {
			song.showSong();
			song = song.previousSongs; //reference copy
			
			if(song.previousSongs == song3) {
			
				song.showSong();
				break;
			}
				
		}
		
		/*
		System.out.println();
		System.out.println("******************************************");
		
		song1.showSong();
		song2.showSong();
		song3.showSong();
	
	*/
	}

}
