package construct;

public class ConstructMain2 {

	public static void main(String[] args) {
		MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
		MemberConstruct member2 = new MemberConstruct("user2", 16);
		
		MemberConstruct[] mebers = {member1, member2};
		
		for (MemberConstruct s : mebers) {
			System.out.println("이름: " + s.name + "나이: " + s.age + " 성적:" + s.grade);
		}

	}
	

}
