
import static dating.DateActivity.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dating.Date;
import dating.Date.DatePlan;
import dating.DateActivity;
import people.People;
import people.Person;

public class Main {

	public static void main(String[] args) {
		System.out.println("Name of the person I found just now:");
		
		People kenneth = People.KENNETH;
		String message = kenneth.getName();
		System.out.println(kenneth);

		System.out.println("Things enjoyed by the person I met just now:");
		Set <DateActivity> activities = kenneth.favoriteActivities();
		for (DateActivity activity : activities) {
			System.out.println(activity.name());
		}
		
		System.out.println();
		System.out.println();
		
		Person carolyn = new Carolyn();
		System.out.println("I'm asking him out on a date!");
		List<DateActivity> itinerary = new ArrayList<>();
		itinerary.add(DANCING);
		itinerary.add(DINNER);
		DatePlan plan = new DatePlan(itinerary);
		Date lastFirstDate = kenneth.askOut(carolyn, plan) ;
		
		System.out.println("He gave me a date! Let's go on it...");
		System.out.println();
		System.out.println();
		
		lastFirstDate.goOut();
	}
	
	static class Carolyn implements Person {

		@Override
		public Set<DateActivity> favoriteActivities() {
			Set<DateActivity> cbakeActivities = new HashSet<>();
			cbakeActivities.add(STAR_GAZING);
			cbakeActivities.add(CONVERSATION);
			cbakeActivities.add(CONCERT);
			cbakeActivities.add(PLAYING_SPORTS);
			cbakeActivities.add(MOVIE);
			cbakeActivities.add(LUNCH);
			cbakeActivities.add(COFFEE);
			cbakeActivities.add(ICE_CREAM);
			return cbakeActivities;
		}

		@Override
		public String getName() {
			return "cbake";
		}
		
//		@Override
//		public String toString() {
//			return getName();
//		}
		
	}
		
}

