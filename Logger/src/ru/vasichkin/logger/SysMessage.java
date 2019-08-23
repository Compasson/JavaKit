package ru.vasichkin.logger;

public enum SysMessage {
	
	INFO, WARNING, ERROR;
	
	public final static SysMessage DEFAULT_MESSAGE = SysMessage.INFO;
}
