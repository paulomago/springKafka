package com.portal.api.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude
public class OwnerPostDTO {

	private String model;
	
	private String brand;
	
	private String price;
	
	private String description;
	
	private String engineVersion;
	
	private String city;
	
	private String createdDate;
	
	private Long ownerId;
	
	private String ownerName;
	
	private String ownerType;
	
	private String contact;
	
}
