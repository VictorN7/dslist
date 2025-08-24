package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {

	private Long id; 
	private String title; 
	private Integer year ; 
	private String imgurl;
	private Double score;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game identity) {
		super();
		id = identity.getId();
		title = identity.getTitle();
		year = identity.getYear();
		imgurl = identity.getImgUrl();
		score = identity.getScore();
		shortDescription = identity.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getGameYear();
		imgurl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgurl() {
		return imgurl;
	}

	public Double getScore() {
		return score;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
