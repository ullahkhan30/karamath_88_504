import java.util.Date;

public class Student implements Comparable {

	private int id;
	private String fullName;
	private Date birthDate;
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
           this.id = id;
		   this.fullName = fullName;
		   this.birthDate = birthDate;
		   this.avgMark = avgMark;
	}

	public int getId() {
           return this.id;
	}

	public void setId(int id) {
         this.id = id;
	}

	public String getFullName() {
          return fullName;
	}

	public void setFullName(String fullName) {
           this.fullName = fullName;
	}

	public Date getBirthDate() {
        return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
          this.birthDate = birthDate;
	}

	public double getAvgMark() {
          return avgMark;
	}

	public void setAvgMark(double avgMark) {
         this.avgMark = avgMark;
	}

	@Override
	public boolean equals(Object o) {
         if (!(o instanceof Student)) {
            return false;
        }
		Student s = (Student)o;
		return this.getId() == s.getId() && this.getFullName() == s.getFullName() && this.getAvgMark() == s.getAvgMark() && 
			   this.getBirthDate().compareTo(s.getBirthDate()) == 0;
	}

	@Override
	public int hashCode() {
          return this.getId();
	}

	@Override
	public int compareTo(Object o) {
         if (!(o instanceof Student)) {
            return -1;
        }
		Student s = (Student)o;
          if(this.getId() < s.getId()) return -1;
		  else if(this.getId() > s.getId()) return 1;
		  else return 0;
	}
}
