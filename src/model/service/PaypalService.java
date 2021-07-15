package model.service;

public class PaypalService implements OnlinePaymentService {
	
	private static final double PAYMENT_FEE = 0.01;
	private static final double MONTHLY_FEE = 0.02;

	@Override
	public Double paymentFee(Double amount) {		
		return amount * PAYMENT_FEE;
	}

	@Override
	public Double interest(Double amount, Integer month) {
		
		return amount * month * MONTHLY_FEE ;
	}
	
	

}
