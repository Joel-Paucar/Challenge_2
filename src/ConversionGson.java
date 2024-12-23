import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversionGson {
    private Gson gson;

    public ConversionGson(){
        gson = new GsonBuilder().setPrettyPrinting().create();
    }
    public MonedaExchange LlamarGson (String json){
        return gson.fromJson(json, MonedaExchange.class);
    }

    public Gson getGson() {
        return gson;
    }
}
