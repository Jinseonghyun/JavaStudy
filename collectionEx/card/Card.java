package compare.card;

public class Card implements Comparable<Card>{
	private final int rank; // ī���� ����
	private final Suit suit; // ī���� ��ũ
	
	public Card(int rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	
	@Override
	public int compareTo(Card anotherCard) {
		// ���ڸ� ���� ���ϰ�, ���ڰ� ������ ��ũ�� ��
		if (this.rank != anotherCard.rank) {
			return Integer.compare(this.rank, anotherCard.rank);
		} else {
			return this.suit.compareTo(anotherCard.suit);
		}
	}

	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}
	
	
}
