package model.service;

public interface OnlinePaymentService {
	
	Double interest(Double amount, Integer month);
		
	Double paymentFee(Double amount);
}
