package test;

import org.puremvc.java.patterns.mediator.Mediator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;

public class Json {
	
	private String code;
	private String data;
	private String name;
	private String currency;
	private String fullName;
	private int precision;
	private int confirms;
	private String contractAddress;
	private String withdrawalMinSize;
	private String withdrawalMinFee;
	private boolean isWithdrawEnabled;
	private boolean isDebitEnabled;
	private boolean isDepositEnabled;
	private boolean isMarginEnabled;
	
	
	
	public Json(String element) {
		
	}
	
	
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public int getPrecision() {
		return precision;
	}


	public void setPrecision(int precision) {
		this.precision = precision;
	}


	public int getConfirms() {
		return confirms;
	}


	public void setConfirms(int confirms) {
		this.confirms = confirms;
	}


	public String getContractAddress() {
		return contractAddress;
	}


	public void setContractAddress(String contractAddress) {
		this.contractAddress = contractAddress;
	}


	public String getWithdrawalMinSize() {
		return withdrawalMinSize;
	}


	public void setWithdrawalMinSize(String withdrawalMinSize) {
		this.withdrawalMinSize = withdrawalMinSize;
	}


	public String getWithdrawalMinFee() {
		return withdrawalMinFee;
	}


	public void setWithdrawalMinFee(String withdrawalMinFee) {
		this.withdrawalMinFee = withdrawalMinFee;
	}


	public boolean isWithdrawEnabled() {
		return isWithdrawEnabled;
	}


	public void setWithdrawEnabled(boolean isWithdrawEnabled) {
		this.isWithdrawEnabled = isWithdrawEnabled;
	}


	public boolean isDebitEnabled() {
		return isDebitEnabled;
	}


	public void setDebitEnabled(boolean isDebitEnabled) {
		this.isDebitEnabled = isDebitEnabled;
	}


	public boolean isDepositEnabled() {
		return isDepositEnabled;
	}


	public void setDepositEnabled(boolean isDepositEnabled) {
		this.isDepositEnabled = isDepositEnabled;
	}


	public boolean isMarginEnabled() {
		return isMarginEnabled;
	}


	public void setMarginEnabled(boolean isMarginEnabled) {
		this.isMarginEnabled = isMarginEnabled;
	}


	
	
	
}
