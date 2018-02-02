package com.github.sergueik.swet;

// NOTE: the org.apache.log4j.Category  has been deprecated and needs to be replaced by the Logger.
// NOTE: the latter does not appear to allow different ConversionPattern for STDERR and FILE

import org.apache.log4j.Category;

import org.apache.log4j.PropertyConfigurator;

import java.util.Formatter;
import java.util.Locale;
import java.util.Properties;
import java.io.FileInputStream;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.github.sergueik.swet.Utils;

// based on: https://alvinalexander.com/blog/post/java/sample-how-format-log4j-logging-logfile-output
public class Log4JTest {
	private static StringBuilder loggingSb = new StringBuilder();
	private static Formatter formatter = new Formatter(loggingSb, Locale.US);

	@SuppressWarnings("deprecation")
	static final Category logger = Category.getInstance(Log4JTest.class);
	private static Utils utils = Utils.getInstance();

	@Test
	public void sampleLog4Jtest() {
		Sample sample = new Sample();
		logger.debug("sampleLog4Jtest (debug) done.");
		logger.info("sampleLog4Jtest (info) done.");
	}

	private static class Sample {

		private static StringBuilder loggingSb = new StringBuilder();
		private static Formatter formatter = new Formatter(loggingSb, Locale.US);

		@SuppressWarnings("deprecation")
		static final Category logger = Category.getInstance(Sample.class);
		private static Utils utils = Utils.getInstance();

		public Sample() {
			utils.initializeLogger();
			logger.info("Sample constructor (info) done.");
			logger.debug("Sample constructor  (debug) done.");
		}

	}
}
