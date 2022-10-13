package pl.dungeoncrwaler.Dungeon_Crawler.HttpClients.NameModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Registered{
    @JsonProperty("date")
    public String getDate() {
		 return this.date; } 
    public void setDate(String date) {
		 this.date = date; } 
    String date;
    @JsonProperty("age") 
    public int getAge() { 
		 return this.age; } 
    public void setAge(int age) { 
		 this.age = age; } 
    int age;
}
