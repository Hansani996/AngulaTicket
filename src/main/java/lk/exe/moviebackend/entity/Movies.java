package lk.exe.moviebackend.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movies {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int mid;
	private String mNname;
	private String releseDate;
	private String director;
	
	@OneToMany(mappedBy = "movies",targetEntity = Shows.class)
	private List<Shows>shows=new ArrayList<>();

	public Movies() {}
	
	public Movies(int mid, String mNname, String releseDate, String director, List<Shows> shows) {
		super();
		this.mid = mid;
		this.mNname = mNname;
		this.releseDate = releseDate;
		this.director = director;
		this.shows = shows;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getmNmae() {
		return mNname;
	}

	public void setmNmae(String mNname) {
		this.mNname = mNname;
	}

	public String getReleseDate() {
		return releseDate;
	}

	public void setReleseDate(String releseDate) {
		this.releseDate = releseDate;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<Shows> getShows() {
		return shows;
	}

	public void setShows(List<Shows> shows) {
		this.shows = shows;
	}

	@Override
	public String toString() {
		return "Movies [mid=" + mid + ", mNname=" + mNname + ", releseDate=" + releseDate + ", director=" + director
				+ ", shows=" + shows + "]";
	}
	
	
	
}
