package musicPlayer;

public class MusicPlayer {
	int volume = 0;
	boolean isOn = false;
	
	void on() {
		isOn = true;
		System.out.println("���� �÷��̾� �����մϴ�.");
	}
	
	void off() {
		isOn = false;
		System.out.println("���� �÷��̾ �����մϴ�.");
	}
	
	void volumUp() {
		volume++;
		System.out.println("���� �÷��̾� ����:" + volume);
	}
	
	void volumeDown() {
		volume--;
		System.out.println("���� �÷��̾� ����:" + volume);
	}
	
	void showStatus() {
		if (isOn) {
			System.out.println("���� �÷��̾� ON, ����: " + volume);
		} else {
			System.out.println("���� �÷��̾� OFF");
		}
	}
}
