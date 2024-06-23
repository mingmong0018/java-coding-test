package PhoneBill.RemoveDuplicateCode_Inheritance;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NightlyDiscountPhone extends Phone {
	private static final int LATE_NIGHT_HOUR = 22;

	private Money nightlyAmount;

	public NightlyDiscountPhone(
		Money nightlyAmount, Money reqularAmount, Duration seconds, double taxRate) {
		super(reqularAmount, seconds, taxRate);
		this.nightlyAmount = nightlyAmount;
	}
	public Money getNightlyAmount() {
		return nightlyAmount;
	}
	public Money calculateFee() {
		Money result = super.calculateFee();
		Money nightlyFee = Money.ZERO;
		for (Call call:getCalls()) {
			if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
				nightlyFee = nightlyFee.plus(getAmount().minus(nightlyAmount).times(call.getDuration().getSeconds() / getSeconds().getSeconds()));
			}
		}
		return result.plus(result.times(getTaxRate()));
	}
}
