package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double souBrut) {
				return souBrut -(souBrut*0.32);
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double souBrut) {
				return souBrut * 0.85;
			}
		};
	}
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double souBrut) {
				return souBrut -(souBrut* 0.26);
			}
		};
	}
	public static IPaymentRate createPaymentRateSenior(){
		return new IPaymentRate() {
			@Override
			public double pay(double souBrut) {
				return souBrut -(souBrut* 0.24);
			}
		};
	}
	
	public static IPaymentRate createPaymentRateMid(){
		return new IPaymentRate() {
			@Override
			public double pay(double souBrut) {
				return souBrut -(souBrut* 0.15);
			}
		};
	}
	
	public static IPaymentRate createPaymentRateJunior(){
		return new IPaymentRate() {
			@Override
			public double pay(double souBrut) {
				return souBrut -(souBrut* 0.02);
			}
		};
	}
	public static IPaymentRate createPaymentRateVolunteer(){
		return new IPaymentRate() {
			@Override
			public double pay(double ajut) {
				return ajut;
			}
		};
	}
}
