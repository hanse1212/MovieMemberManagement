package hanseAR;

public class MovieMember {
	String name, gender, id, vip, recMovie;
	
	public MovieMember() {}
	public MovieMember(String name, String gender, String id, String vip, String recMovie) {
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.vip = vip;
		this.recMovie = recMovie;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", gender=" + gender + ", id=" + id + ", vip=" + vip + ", recMovie="
				+ recMovie + "]";
	}
	
	public void set(int c, String s) {
				
		switch (c) {
			case 1: {
				System.out.println("(기존값 : " + name + ") ->  " + s);
				setName(s);
				break;
			}
			case 2: {
				System.out.println("(기존값 : " + gender + ") -> " + s);
				setGender(s);
				break;
			}
			case 3: {
				System.out.println("(기존값 : " + id + ") -> " + s);
				setId(s);
				break;
			}
			case 4: {
				System.out.println("(기존값 : " + vip + ") -> " + s);
				setVip(s);
				break;
			}
			case 5: {
				System.out.println("(기존값 : " + recMovie + ") -> " + s);
				setRecMovie(s);
				break;
			}
			default:
				System.out.println("유효한 번호가 아닙니다.");
			}
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVip() {
		return vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}
	public String getRecMovie() {
		return recMovie;
	}
	public void setRecMovie(String recMovie) {
		this.recMovie = recMovie;
	}
	
}
