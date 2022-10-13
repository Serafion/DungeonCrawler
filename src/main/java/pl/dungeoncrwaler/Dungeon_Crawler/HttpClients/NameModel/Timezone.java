package pl.dungeoncrwaler.Dungeon_Crawler.HttpClients.NameModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Timezone{
    @JsonProperty("offset")
    public String getOffset() { 
		 return this.offset; } 
    public void setOffset(String offset) { 
		 this.offset = offset; } 
    String offset;
    @JsonProperty("description") 
    public String getDescription() { 
		 return this.description; } 
    public void setDescription(String description) { 
		 this.description = description; } 
    String description;
}
