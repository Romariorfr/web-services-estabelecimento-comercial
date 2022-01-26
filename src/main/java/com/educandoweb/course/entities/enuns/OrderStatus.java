package com.educandoweb.course.entities.enuns;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPED(3), DELIVERED(4), CANCELED(5);

	private int code;

	private OrderStatus(int code) {

		this.code = code;

	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueof(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}

		throw new IllegalArgumentException("Invalid Order Status code");
	}

}
