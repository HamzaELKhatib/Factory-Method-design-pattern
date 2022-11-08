package com.coffeepoweredcrew.factorymethod.src;

import com.coffeepoweredcrew.factorymethod.src.product.Message;
import com.coffeepoweredcrew.factorymethod.src.creator.JSONMessageCreator;
import com.coffeepoweredcrew.factorymethod.src.creator.MessageCreator;
import com.coffeepoweredcrew.factorymethod.src.creator.TextMessageCreator;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}
}
