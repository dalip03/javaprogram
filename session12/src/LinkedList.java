
public class LinkedList {

	Song head;
	Song tail;
	int length;
	
	/*LinkedList(){
		head = null;
		tail = null;
	}
*/
	
	boolean isEmpty() {
		return head == null;
	}
	
	 int length() {
		 return length;
	 }
	
	void add(Song song) {
		
		length ++;
		
		if(head == null) {
			head = song;
			tail = song;
			System.out.println("SONG ADDED AS HEAD AND TAIL");
			
		}else {
			tail.nextSong = song;
			//Current song's previous song updated
			song.previousSong = tail;
			
			head.previousSong = song;
			tail = song; 
			tail.nextSong = head;
			System.out.println("SONG ADDED AS TAIL");

		}
	
	}
	/*void iterate() {
		Song temporarySong.showSong();
		temporarySong = temporarySong.nextSong;
		
		if(temporary)
		*/
	
	}
	
	
	
	

