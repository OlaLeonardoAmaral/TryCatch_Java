package model.entities;

import model.exceptions.MyException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) {
		// se caso der excecao no validateWithdraw o sistema vai parar
		// e nao vai executar o this.balance -= amount; 
		validateWithdraw(amount);
		this.balance -= amount;
	}

	private void validateWithdraw(double amount) {
		if (amount > getBalance()) {
			throw new MyException("Not enough balance");
		}
		if (amount > getWithDrawLimit()) {
			throw new MyException("The amount exceeds withdraw limit");
		}
	}
}
