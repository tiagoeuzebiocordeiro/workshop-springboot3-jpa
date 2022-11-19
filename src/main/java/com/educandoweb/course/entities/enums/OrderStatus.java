package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),									/*Precisamos enumerar os códigos para evitar possíveis problemas futuros na manutenção*/
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;							// Construtor de orderStatus são privados
	}
	
	public int getCode() {
		return code;						// Método para pegar o código do status
	}
	
	public static OrderStatus valueOf(int code) { // Estático por que vai funcionar sem precisar instanciar
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}
