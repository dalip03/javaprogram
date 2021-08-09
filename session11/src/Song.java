
public class Song {
	String track;
	String artists;
	float duration;
	 //Reference Variables
	
	Song nextSong;
	Song previousSongs;
	
	Song() {
	
	}


	Song(String track, String artists, float duration) {
		super();
		this.track = track;
		this.artists = artists;
		this.duration = duration;
	}


void showSong() {
	System.out.println("");
	System.out.println(track+"|" +artists+"|" +duration);
	System.out.println("");
	System.out.println("");
}
	@Override
	public String toString() {
		return "Song [name=" + track + ", artists=" + artists + ", duration=" + duration + "]";
	}
	
	
	

}
