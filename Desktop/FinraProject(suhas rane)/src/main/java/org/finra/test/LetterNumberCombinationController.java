package org.finra.test;

import org.finra.test.service.LetterNumberCombinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LetterNumberCombinationController {

	@Autowired
	LetterNumberCombinationService letterNumberCombinationService;
	@CrossOrigin
	@GetMapping(value="/phonepad/{number}",produces="application/json")
	public List<String> getLetterNumberCombination(@PathVariable String number, @RequestParam("page") int page, @RequestParam("size") int size) {

		
		List<String> result = letterNumberCombinationService.getCombinations(number);
		List<String> output = new ArrayList<>();
		for(int i = (page - 1) * size; i < (page * size); i++ ){
			output.add(result.get(i));
		}      
		//model.addAttribute("list", result);
		return output;

	}

}