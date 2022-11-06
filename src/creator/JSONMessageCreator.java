package com.coffeepoweredcrew.factorymethod.src.creator;

import com.coffeepoweredcrew.factorymethod.src.product.JSONMessage;
import com.coffeepoweredcrew.factorymethod.src.product.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
