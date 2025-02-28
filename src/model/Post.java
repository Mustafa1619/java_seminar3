package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
	
	private String msg;
	private LocalDateTime dateTime;
	private int countOfLikes = 0;
		
	
	public String getMsg() {
		return msg;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public int getCountOfLikes() {
		return countOfLikes;
	}

	
	public void setMsg(String msg) {
		if(msg!= null && msg.matches("[A-Za-z0-9 .,:;\"^'?(){}><_!@#$%^&*+-]{1,100}")) {
			this.msg = msg;	
		}else {
			this.msg = "No Message here";
		}
		
	}

	public void setDateTime() {
		dateTime = LocalDateTime.now();
	}

	public void increaseLikes() {
		countOfLikes++;
	}
	
	public Post() {
		setMsg("Text");
		setDateTime();
		
	}
	
	public Post(String msg) {
		setMsg(msg);
		setDateTime();
	}
		
	public String toString() {
		return msg + " (" + 
				dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " + 
							dateTime.getHour() + ":" + dateTime.getMinute() + ":" + dateTime.getSecond() + ") "
							+ countOfLikes;
	}
	
}










