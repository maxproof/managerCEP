package ch.mmi.cep.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TimeManager {

	public Timestamp timestampManager() {

		LocalDateTime localDateTime = LocalDateTime.now();
		Timestamp timeStamp = Timestamp.valueOf(localDateTime);
		//LocalDateTime localDateTimestamp = timeStamp.toLocalDateTime();
		return timeStamp;
	}

}
