package com.in28minutes.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minutes.springboot.service.SurveyService;
import com.in28minutes.springboot.model.Question;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
public class SurveyController {
	
	@Autowired
	private SurveyService surveyService;
	
	@GetMapping("/surveys/{surveyId}/questions")
	public List<Question> retrieveQuestionsForSurvey(@PathVariable String surveyId){
		return surveyService.retrieveQuestions(surveyId);
		
	}
	
	@GetMapping("/surveys/{surveyId}/questions/{questionId}")
	public Question retrieveDetailsForQuestions(@PathVariable String surveyId, @PathVariable String questionId){
		return surveyService.retrieveQuestion(surveyId, questionId);
		
	}
	
	//@PostMapping(value="/surveys/{surveyId}/questions/")
	@PostMapping("/surveys/{surveyId}/questions")
	public ResponseEntity<Void> addQuestionToSurvey(@PathVariable String surveyId, @RequestBody Question newQuestion){
	
	//@RequestBody maps request to the Question object	
	Question question = surveyService.addQuestion(surveyId, newQuestion);
	
	if(question==null)
		return ResponseEntity.noContent().build(); //If question not created, returns noContentcreated
	
	//Success - URI of the new resource in Response Header
	//Status - created
	//URI - /surveys/{surveyId}/questions/{questionId} question.getQuestionId()
	 URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
			 .buildAndExpand(question.getId()).toUri();
	 
	 //Status
	 return ResponseEntity.created(location).build();
		
	}
	
	

}

/* 
 URL = /surveys/Survey1/questions/
 SurveyService - Autowire
 PathVariable  -  surveyId
 Path variable is used when we get variable as input
 
 */


