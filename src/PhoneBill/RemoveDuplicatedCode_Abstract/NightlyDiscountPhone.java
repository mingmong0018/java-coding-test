package PhoneBill.RemoveDuplicatedCode_Abstract;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NightlyDiscountPhone extends AbstractPhone{
	private static final int LATE_NIGHT_HOUR = 22;

	private Money nightlyAmount;
	private Money reqularAmount;
	private Duration seconds;

	public NightlyDiscountPhone(
		Money nightlyAmount, Money reqularAmount, Duration seconds) {
		this.nightlyAmount = nightlyAmount;
		this.reqularAmount = reqularAmount;
		this.seconds = seconds;
	}

	@Override
	protected Money calculateCallFee(Call call) {
		if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
			return nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
		} else {
			return reqularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
		}
	}
}
