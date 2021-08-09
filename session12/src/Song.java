
public class Song {
	String track;
	String artists;
	float duration;
	
	Song nextSong;
	Song previousSong;
	
	Song() {
		
	}



	Song(String track, String artists, float duration) {
		super();
		this.track = track;
		this.artists = artists;
		this.duration = duration;
	}

	


	@Override
	public String toString() {
		return "Song [track=" + track + ", artists=" + artists + ", duration=" + duration + "]";
	}
	

void showSong() {
	System.out.println("");
	System.out.println(track+"|" +artists+"|" +duration);
	System.out.println("");
}

}
