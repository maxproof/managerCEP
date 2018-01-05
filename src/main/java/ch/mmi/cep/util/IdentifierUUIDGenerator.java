package ch.mmi.cep.util;

import java.util.UUID;

public class IdentifierUUIDGenerator {

	public String identifierUUIDGenerator() {
		// generate random UUID
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		return id;
	}
}
