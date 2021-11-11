package jpa_assgn2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorId;
	private String firstName;
	private String LastName;
	
	
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Author(int authorId, String firstName, String lastName) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		LastName = lastName;
	}


	public int getAuthorId() {
		return authorId;
	}
	public void setauthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
    public String getLastName() {
	  return LastName;
    }
    public void setLastName(String LastName) {
    	this.LastName=LastName;
    }


	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName + ", LastName=" + LastName + "]";
	}
    
    
}
