package com.creational.singleton;

import java.io.Serializable;

public class SerializationSigleton implements Serializable {
	private static final long serialVersionUID = 1L;

	private SerializationSigleton() {
		// private constructor
	}

	private static class SerializationSigletonHolder {
		public static final SerializationSigleton INSTANCE = new SerializationSigleton();
	}

	public static SerializationSigleton getInstance() {
		return SerializationSigletonHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
	
    private int i = 10;
    
    public int getI() {
        return i;
    }
 
    public void setI(int i) {
        this.i = i;
    }
}