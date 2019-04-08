package id.sch.smktelkom.www.actors_nabil;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ActorsService {

    @GET("/JSONParsingTutorial/jsonActors")
    Call<ActorsService> getActors();
}