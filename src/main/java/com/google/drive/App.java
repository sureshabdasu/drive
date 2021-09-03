package com.google.drive;

import java.sql.Timestamp;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	final static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {

		logger.debug("DEBUG Message");
		logger.warn("WARN Message");
		logger.fatal("FATAL Message");
		logger.error("ERROR Message");
		logger.trace("TRACE Message");

		while (true) {
			try {
				Thread.sleep(5000l);
				sendNotification();
				logger.info("Running");
				System.out.println("Running at " + new Timestamp(System.currentTimeMillis()));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void sendNotification() {
		logger.info("Notification Sent");
	}
}
