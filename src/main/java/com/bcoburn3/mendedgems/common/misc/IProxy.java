package com.bcoburn3.mendedgems.common.misc;

public interface IProxy {
	
    public String localize(String text);
	
    public String format(String text, Object... args);
}
