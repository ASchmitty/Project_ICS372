import java.time.LocalDate;

public class Testmain {

	public static void main(String[] args) {
		Member member1 = new Member("Austin", "Thor", "123 Fake Address", 123456, LocalDate.now(), 10.25);
		Member member2 = new Member("alex", "shmitty", "456 new Address", 123456, LocalDate.now(), 12.45);
		Member member3 = new Member("Miguel", "unknown", "678 test Address", 123456, LocalDate.now(), 1124.25);
		Member member4 = new Member("frank", "pee", "5125 hello Address", 123456, LocalDate.now(), 12.52);

		MemberCollection newMemberList = new MemberCollection();

		newMemberList.enrollMember(member1);
		newMemberList.enrollMember(member2);
		newMemberList.enrollMember(member3);
		newMemberList.enrollMember(member4);

		newMemberList.memberInfo();

		System.out.println();

		newMemberList.removeMember(2);

		System.out.println();

		newMemberList.memberInfo();

	}

}
