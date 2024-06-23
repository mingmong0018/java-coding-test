package PhoneBill.DuplicatedCode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NightlyDiscountPhone {
	private static final int LATE_NIGHT_HOUR = 22;

	private PhoneBill.DuplicatedCode.Money nightlyAmount;
	private PhoneBill.DuplicatedCode.Money reqularAmount;
	private Duration seconds;
	private List<PhoneBill.DuplicatedCode.Call> calls = new ArrayList<>();
	private double taxRate;

	public NightlyDiscountPhone(
		PhoneBill.DuplicatedCode.Money nightlyAmount, PhoneBill.DuplicatedCode.Money reqularAmount, Duration seconds, double taxRate) {
		this.nightlyAmount = nightlyAmount;
		this.reqularAmount = reqularAmount;
		this.seconds = seconds;
		this.taxRate = taxRate;
	}

	public void call(PhoneBill.DuplicatedCode.Call call) {
		calls.add(call);
	}
	public List<PhoneBill.DuplicatedCode.Call> getCalls() {
		return calls;
	}
	public PhoneBill.DuplicatedCode.Money getNightlyAmount() {
		return nightlyAmount;
	}

	public PhoneBill.DuplicatedCode.Money getReqularAmount() {
		return reqularAmount;
	}
	public Duration getSeconds() {
		return seconds;
	}
	public PhoneBill.DuplicatedCode.Money calculateFee() {
		PhoneBill.DuplicatedCode.Money result = PhoneBill.DuplicatedCode.Money.ZERO;
		for (PhoneBill.DuplicatedCode.Call call:calls) {
			if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
				result = result.plus(nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
			} else {
				result = result.plus(reqularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
			}
		}
		return result.plus(result.times(taxRate));
	}
}
