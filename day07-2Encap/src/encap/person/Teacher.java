package encap.person;

public class Teacher extends Person {

	// 1. 멤버변수
	private String subject;
	
	// 2. 생성자
	Teacher() {
		
	}
	
	Teacher(String id, String name, int age, String subject) {
		super(id, name, age);
		this.subject = subject;
	}

	/** subject 필드 접근자 */
	public String getSubject() {
		return subject;
	}

	/** subject 필드 수정자 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	// 3. 메소드
	@Override
	public String toString() {
		String tcStr = String.format(", 과목:%s", this.subject);
		return "교사 정보[" + super.toString() + tcStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== 교사 ==");
		System.out.println(this);
	}
	
	
}









