package enumeration.test;

public enum AuthGrade {
	GUEST(1, "�մ�"),
	LOGIN(2, "�α��� ȸ��"),
	ADMIN(3, "������");
	
	private final int level;
	private final String description;
	
	AuthGrade(int level, String description) {
		this.level = level;
		this.description = description;
	}

	public int getLevel() {
		return level;
	}

	public String getDescription() {
		return description;
	}
	
	
	
	
}
