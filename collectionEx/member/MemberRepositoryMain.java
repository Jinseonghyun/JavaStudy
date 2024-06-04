package collectionEx.member;

public class MemberRepositoryMain {

	public static void main(String[] args) {
		Member member1 = new Member("id1", "ȸ��1");
		Member member2 = new Member("id2", "ȸ��2");
		Member member3 = new Member("id3", "ȸ��3");
		
		//ȸ�� ����
		MemberRepository repository = new MemberRepository();
		repository.save(member1);
		repository.save(member2);
		repository.save(member3);
		
		//ȸ�� ��ȸ
		Member findMember1 = repository.findById("id1");
		System.out.println("findMember1 = " + findMember1);
		
		Member findMember3 = repository.findByName("ȸ��3");
		System.out.println("findMember3 = " + findMember3);
		
		//ȸ�� ����
		repository.remove("id1");
		Member removedMember1 = repository.findById("id1");
		System.out.println("removedMember1 = " + removedMember1);
	}

}
