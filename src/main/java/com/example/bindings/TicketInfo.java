package com.example.bindings;
import lombok.Data;

@Data
public class TicketInfo {
	

	private Integer TicketId;
	
	
	private String pnr;
	
	
	private String ticketstatus;
	
	 public Integer getTicketId() { return TicketId; }
	    public void setTicketId(Integer ticketId) { this.TicketId = ticketId; }

	    public String getPnr() { return pnr; }
	    public void setPnr(String pnr) { this.pnr = pnr; }

	    public String getticketstatuss() { return ticketstatus; }
	    public void setTicketStatus(String TicketStatus) { this.ticketstatus = TicketStatus; }
	}
	


