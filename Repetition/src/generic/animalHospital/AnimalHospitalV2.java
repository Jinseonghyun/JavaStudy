package generic.animalHospital;

public class AnimalHospitalV2<T> {

	private T animal;

	public void set(T animal) {
		this.animal = animal;
	}
	
	public void checkup() {
		//T�� Ÿ���� �޼��带 �����ϴ� �������� �� �� ����. Object�� ��ɸ� ��� ����
		animal.toString();
		animal.equals(null);
		
		//������ ����
		//System.out.println("���� �̸�: " + animal.getName());
		//animal.sound();
	}
	
	public T getBigger(T target) {
		//������ ����
		//return animal.getSize() > target.getSize() ? animal : target;
		return null;
	}
	
}
