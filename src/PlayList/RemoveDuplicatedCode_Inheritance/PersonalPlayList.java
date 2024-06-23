package PlayList.RemoveDuplicatedCode_Inheritance;

public class PersonalPlayList extends PlayList{
	public void remove(Song song) {
		getTracks().remove(song);
		getSingers().remove(song.getSinger());
	}
}
