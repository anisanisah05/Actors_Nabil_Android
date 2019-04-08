package id.sch.smktelkom.www.actors_nabil;

import com.google.gson.annotations.SerializedName;

import java.util.List;
public class ActorsResponse{

	@SerializedName("actors")
	private List<ActorsItem> actors;

	public void setActors(List<ActorsItem> actors){
		this.actors = actors;
	} public List<ActorsItem> getActors(){
		return actors;
	}
}