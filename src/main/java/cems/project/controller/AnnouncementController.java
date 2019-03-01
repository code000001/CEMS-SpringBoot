package cems.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cems.project.model.Announcement;
import cems.project.model.AnnouncementStatus;
import cems.project.model.KnowledgeRequirement;
import cems.project.model.LogKnowledge;
import cems.project.model.LogPosition;
import cems.project.model.PositionData;
import cems.project.services.AnnouncementService;

@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class AnnouncementController {

	@Autowired
	private AnnouncementService annService;
	
	@GetMapping(path="/announcement")
	public @ResponseBody Iterable<Announcement> getAllAnnouncement() {
		return annService.getAnnouncement();
	}
	
	@GetMapping(path="/announcement_status")
	public @ResponseBody Iterable<AnnouncementStatus> getAllStatusAnnouncement() {
		return annService.getAnnouncementStatus();
	}
	
	@GetMapping(path="/announcement_knowledge")
	public @ResponseBody Iterable<KnowledgeRequirement> getAllKnowledgeRequirementAnnouncement() {
		return annService.getKnowledgeRequirement();
	}
	
	@GetMapping(path="/announcement_logKnowledge")
	public @ResponseBody Iterable<LogKnowledge> getAllLogKnowledgeAnnouncement() {
		return annService.getLogKnowledge();
	}
	
	@GetMapping(path="/announcement_logPosition")
	public @ResponseBody Iterable<LogPosition> getAllLogPositionAnnouncement() {
		return annService.getLogPosition();
	}
	
	@GetMapping(path="/announcement_position_data")
	public @ResponseBody Iterable<PositionData> getAllPositionDataAnnouncement() {
		return annService.getPositionData();
	}
	
	@PostMapping(path="/announcement")
	public Announcement addAnnouncement(@RequestBody Announcement newAnnouncement) {
		return annService.addAnnouncement(newAnnouncement);
	}
	
	@PutMapping(path="/announcement/{id}")
	public Announcement updateAnnouncement(@PathVariable("id") int id,@RequestBody Announcement updateAnnouncement) {
		return annService.updateAnnouncement(id, updateAnnouncement);
	}
	
}
 