package lk.exe.moviebackend.dto;

import java.io.Serializable;

public class ShowsDto {
	private int showId;
	private String showTime;
	
	public ShowsDto() {}

	public ShowsDto(int showId, String showTime) {
		super();
		this.showId = showId;
		this.showTime = showTime;
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
	
	
}
