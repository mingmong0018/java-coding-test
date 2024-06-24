package PhoneBill.RemoveDuplicatedCode_Composition;

public interface RatePolicy {
	Money calculateFee(Phone phone);
}
