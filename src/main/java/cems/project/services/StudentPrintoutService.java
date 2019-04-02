package cems.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.StudentPrintout;
import cems.project.respository.StudentPrintoutRepository;

@Service
@Configuration
public class StudentPrintoutService {

	@Autowired
	private StudentPrintoutRepository stdPrintout;
	
	public Iterable<StudentPrintout> getstudentdata(int stdId){
		return stdPrintout.getBystdId(stdId);
	}
}
