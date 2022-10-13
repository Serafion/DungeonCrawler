package pl.dungeoncrwaler.Dungeon_Crawler.HttpClients.NameModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root{
    @JsonProperty("results")
    public ArrayList<Result> getResults() {
		 return this.results; } 
    public void setResults(ArrayList<Result> results) { 
		 this.results = results; } 
    ArrayList<Result> results;
    @JsonProperty("info") 
    public Info getInfo() { 
		 return this.info; } 
    public void setInfo(Info info) { 
		 this.info = info; } 
    Info info;
}
