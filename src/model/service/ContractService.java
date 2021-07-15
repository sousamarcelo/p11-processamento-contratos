package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer month) {
		Double basicQuota = contract.getTotalValue() / month;
		
		for (int i = 1; i <= month; i++) {
			Double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			Double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			
			Date dueDate = addMonth(contract.getDate(), i);
			
			contract.addInstallment(new Installment(dueDate, fullQuota));
		}
		
	}
	
	public Date addMonth(Date date, int N) {
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(date);
		 cal.add(Calendar.MONTH, N);		
		return cal.getTime();
	}
}
