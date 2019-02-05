package lk.exe.moviebackend.dto;

import java.io.Serializable;

public class MoviesDto implements Serializable{
	private int mid;
	private String mNname;
	private String releseDate;
	private String director;
	
	public MoviesDto() {}
	
	public MoviesDto(int mid, String mNname, String releseDate, String director) {
		super();
		this.mid = mid;
		this.mNname = mNname;
		this.releseDate = releseDate;
		this.director = director;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getmNname() {
		return mNname;
	}

	public void setmNname(String mNname) {
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
	
	
}
