package com.in28minutes.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.service.SurveyService;
import com.in28minutes.springboot.model.Question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
	
	

}

/* 
 URL = /surveys/Survey1/questions/
 SurveyService - Autowire
 PathVariable  -  surveyId
 Path variable is used when we get variable as input
 
 */


