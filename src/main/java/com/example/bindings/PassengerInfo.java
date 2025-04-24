package com.example.bindings;

import lombok.Data;

@Data

public class PassengerInfo {
	
	
	private String name;
	
	private Long phno;
	
	private String jdate;
	
	private String from;
	
	private String to;
	
	private Integer trainNum;
	
	 
	  public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter and Setter for phno
	    public Long getPhno() {
	        return phno;
	    }

	    public void setPhno(Long phno) {
	        this.phno = phno;
	    }

	    // Getter and Setter for jdate
	    public String getJdate() {
	        return jdate;
	    }

	    public void setJdate(String jdate) {
	        this.jdate = jdate;
	    }

	    // Getter and Setter for from
	    public String getFrom() {
	        return from;
	    }

	    public void setFrom(String from) {
	        this.from = from;
	    }

	    // Getter and Setter for to
	    public String getTo() {
	        return to;
	    }

	    public void setTo(String to) {
	        this.to = to;
	    }

	    // Getter and Setter for trainNum
	    public Integer getTrainNum() {
	        return trainNum;
	    }

	    public void setTrainNum(Integer trainNum) {
	        this.trainNum = trainNum;
	

}
}




