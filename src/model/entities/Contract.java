package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.service.ContractService;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double totalValue;
	
	ContractService contractService;
	
	List<Installment> installments = new ArrayList<Installment>();
	
	public Contract() {
		
	}
	
	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Double getTotalValue() {
		return totalValue;
	}
	
	public List<Installment> getInstallment() {
		return installments;
	}
	
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public void addInstallment(Installment installment) {
		installments.add(installment);
	}
	
	public void removeInstallment(Installment installment) {
		installments.remove(installment);
	}

	
		
	

}
