import java.util.ArrayList;

public class MemberCollection {
	ArrayList<Member> memberList = new ArrayList<>();

//	public void getMember() {
//		memberList.get();
//	}

	public void enrollMember(Member member) {
		memberList.add(member);
	}

	public void removeMember(int id) {

		for (Member members : memberList) {
			if (id == members.getId()) {
				memberList.remove(members);
			}
		}
	}

	public void memberInfo() {
		for (Member members : memberList) {
			System.out.println(members.toString());
		}
	}
}
