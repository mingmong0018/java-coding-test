package Sell;

public class TicketSeller {
	private TicketOffice ticketOffice;

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	// private TicketOffice getTicketOffice() {
	// 	return ticketOffice;
	// }
	public void sellTo(Audience audience) {
		ticketOffice.sellTicketTo(audience);



		// ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));




		// if (audience.getBag().hasInvitation()) {
		// 	Ticket ticket = ticketOffice.getTicket();
		// 	audience.getBag().setTicket(ticket);
		// } else {
		// 	Ticket ticket = ticketOffice.getTicket();
		// 	audience.getBag().minusAmount(ticket.getFee());
		// 	ticketOffice.plusAmount(ticket.getFee());
		// 	audience.getBag().setTicket(ticket);
		// }
	}
}
