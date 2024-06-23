package PhoneBill.DuplicatedCode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Phone {
	private PhoneBill.DuplicatedCode.Money amount;
	private Duration seconds;
	private List<PhoneBill.DuplicatedCode.Call> calls = new ArrayList<>();
	private double taxRate;

	public Phone(PhoneBill.DuplicatedCode.Money amount, Duration seconds, double taxRate) {
		this.amount = amount;
		this.seconds = seconds;
		this.taxRate = taxRate;
	}
	public void call(PhoneBill.DuplicatedCode.Call call) {
		calls.add(call);
	}
	public List<PhoneBill.DuplicatedCode.Call> getCalls() {
		return calls;
	}

	public PhoneBill.DuplicatedCode.Money getAmount() {
		return amount;
	}

	public Duration getSeconds() {
		return seconds;
	}
	public PhoneBill.DuplicatedCode.Money calculateFee() {
		PhoneBill.DuplicatedCode.Money result = PhoneBill.DuplicatedCode.Money.ZERO;
		for (PhoneBill.DuplicatedCode.Call call:calls) {
			result = result.plus(amount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
		}
		return result.plus(result.times(taxRate));
	}
}
