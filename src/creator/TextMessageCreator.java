package com.coffeepoweredcrew.factorymethod.src.creator;

import com.coffeepoweredcrew.factorymethod.src.product.Message;
import com.coffeepoweredcrew.factorymethod.src.product.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
