package PhoneBill.RemoveDuplicatedCode_Composition;

import java.time.Duration;

public class NightlyDiscountPolicy extends BasicRatePolicy {
	private static final int LATE_NIGHT_HOUR = 22;

	private Money nightlyAmount;
	private Money reqularAmount;
	private Duration seconds;

	public NightlyDiscountPolicy(
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
