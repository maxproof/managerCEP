package ch.mmi.cep.model;

public enum UserProfileType {
	USER("USER"), DBA("DBA"), ADMIN("ADMIN"), MODERATOR("MODERATOR");

	String userProfileType;

	private UserProfileType(String userProfileType) {
		this.userProfileType = userProfileType;
	}

	public String getUserProfileType() {
		return userProfileType;
	}

}
