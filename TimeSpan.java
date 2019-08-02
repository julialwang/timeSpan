// Julia Wang
// APCS Period 1

// creates a calculator that wraps additions of minutes, and hours into simplified versions.

public class TimeSpan {

	int hours;
	int minutes;
	
	public TimeSpan(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;

		while (this.minutes / 60 >= 1) {
			this.minutes -= 60;
			this.hours ++;
		}
	}
	
	
	public void add(int hours, int minutes) {
		this.hours += hours;
		this.minutes += minutes;

		while (this.minutes / 60 >= 1) {
			this.minutes -= 60;
			this.hours ++;
		}
	}
	
	
	public void add(TimeSpan newTimeSpan) {
		while(this.minutes / 60 >= 1) {
			this.minutes -= 60;
			this.hours ++;
		}
		this.hours += newTimeSpan.hours;
		this.minutes += newTimeSpan.minutes;
		while(this.minutes / 60 >= 1) {
			this.minutes -= 60;
			this.hours ++;
		}
	}
	
	public double getTotalHours() {
		return this.hours + this.minutes / 60.0;
	}
	
	public String toString() {
		return hours + "h" + minutes + "m";
	}

}
