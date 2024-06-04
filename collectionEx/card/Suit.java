package compare.card;

public enum Suit {
	
	SPADE("¢¼"),
	HEART("¢¾"),
	DIAMOND("¡ß"),
	CLUB("¢À");
	
	private String icon;

	private Suit(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return icon;
	}

	
	
}
