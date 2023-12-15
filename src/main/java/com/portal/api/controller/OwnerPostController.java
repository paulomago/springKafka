package com.portal.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.api.dto.OwnerPostDTO;
import com.portal.api.service.OwnerPostsService;

@RestController
@RequestMapping("/api/owner")
public class OwnerPostController {

	@Autowired
	private OwnerPostsService ownerPostStoreService;
	
	@PostMapping
	public ResponseEntity createOwnerCar(@RequestBody OwnerPostDTO ownerPostDTO) {
		ownerPostStoreService.createOwner(ownerPostDTO);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
