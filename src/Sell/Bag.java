package Sell;

public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;
	public Bag(Long amount) {
		this(null, amount);
	}
	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}
	private boolean hasInvitation() {
		return invitation != null;
	}
	private boolean hasTicket() {
		return ticket != null;
	}
	private void minusAmount(Long amount) {
		this.amount -= amount;
	}
	private void plusAmount(Long amount) {
		this.amount += amount;
	}
	private void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Long hold(Ticket ticket) {
		if (hasInvitation()) {
			setTicket(ticket);
			return 0L;
		} else {
			minusAmount(ticket.getFee());
			setTicket(ticket);
			return ticket.getFee();
		}
	}
}
