package lk.exe.moviebackend.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="shows")
public class Shows {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="SHOW_ID",nullable=false,length=10)
	private int showId;
	
	@Column(name="SHOW_TIME",nullable=false,length=10)
	private String showTime;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="MOVIE_ID")
	private Movies movies;
	
	public Shows() {}
	
	public Shows(int showId, String showTime, Movies movies) {
		super();
		this.showId = showId;
		this.showTime = showTime;
		this.movies = movies;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public Movies getMovies() {
		return movies;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Shows [showId=" + showId + ", showTime=" + showTime + ", movies=" + movies + "]";
	}
	
	
	
}
