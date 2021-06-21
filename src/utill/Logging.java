package utill;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Logging {
	public Logging() {
		logTest();
	}

	private void logTest() {
		writeLog("I","情報レベル");
		writeLog("W","警告レベル");
		writeLog("S","重大レベル");

	}

	public void writeLog(String level,String message) {
		Logger logger = Logger.getLogger(Util.getClassMehtodName());
		try {
			LogManager manager = LogManager.getLogManager();
			manager.readConfiguration(new FileInputStream("src/properties/logging.properties"));
			switch (level) {
			case "I":
				logger.info(message);
				break;
			case "W":
				logger.warning(message);
				break;
			case "S":
				logger.severe(message);
				break;
			default:
				break;
			}

//			logger.finest("FINEST");
//			logger.finer("FINER");
//			logger.fine("FINE");
//			logger.config("CONFIG");
//			logger.info("INFO");
//			logger.warning("WARNING");
//			logger.severe("SEVERE");
//			logger.info("AAA");

		} catch (SecurityException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
