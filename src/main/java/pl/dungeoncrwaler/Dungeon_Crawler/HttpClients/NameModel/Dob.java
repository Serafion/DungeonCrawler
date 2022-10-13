package pl.dungeoncrwaler.Dungeon_Crawler.HttpClients.NameModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Dob{
    @JsonProperty("date")
    public Date getDate() {
		 return this.date; } 
    public void setDate(Date date) { 
		 this.date = date; } 
    Date date;
    @JsonProperty("age") 
    public int getAge() { 
		 return this.age; } 
    public void setAge(int age) { 
		 this.age = age; } 
    int age;
}
