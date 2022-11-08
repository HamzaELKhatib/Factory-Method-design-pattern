package com.coffeepoweredcrew.factorymethod.src.creator;

import com.coffeepoweredcrew.factorymethod.src.product.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage() {
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		
		return msg;
	}
	//Todo: Implement this method in sub-classes
	//Factory method
	protected abstract Message createMessage();
}
