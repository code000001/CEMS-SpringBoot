package cems.project.controller;

import java.util.Optional;

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
import cems.project.model.OrganizationData;
import cems.project.model.OrganizationStatus;
import cems.project.model.OrganizationType;
import cems.project.model.PositionData;
import cems.project.services.AnnouncementService;

@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class AnnouncementController {

	@Autowired
	private AnnouncementService annService;
	
	@GetMapping(path="/announcement")
	public Iterable<Announcement> getAllAnnouncement() {
		return annService.getAnnouncement();
	}
	
	@GetMapping(path="/announcement_org/{id}")
	public @ResponseBody Iterable<Announcement> getByannAccIdAnnouncement(@PathVariable("id") int annOrgId) {	
		return annService.getAnnouncementByannOrgId(annOrgId);
	}
	
	@GetMapping(path="/announcement/{id}")
	public @ResponseBody Iterable<Announcement> getByIdAnnouncement(@PathVariable("id") int id) {	
		return annService.getAnnouncementById(id);
	}
	
	@GetMapping(path="/announcement_status")
	public @ResponseBody Iterable<AnnouncementStatus> getAllStatusAnnouncement() {
		return annService.getAnnouncementStatus();
	}
	
	@GetMapping(path="/announcement_status/{id}")
	public @ResponseBody Iterable<AnnouncementStatus> getByIdAnnouncementStatus(@PathVariable("id") int id) {	
		return annService.getAnnouncementStatusById(id);
	}
	
	@GetMapping(path="/announcement_knowledge")
	public @ResponseBody Iterable<KnowledgeRequirement> getAllKnowledgeRequirementAnnouncement() {
		return annService.getKnowledgeRequirement();
	}
	
	@GetMapping(path="/announcement_knowledge/{id}")
	public @ResponseBody Optional<KnowledgeRequirement> getByIdKnowledgeRequirement(@PathVariable("id") Integer id) {	
		return annService.getKnowledgeRequirementById(id);
	}
	
	@GetMapping(path="/announcement_logKnowledge")
	public @ResponseBody Iterable<LogKnowledge> getAllLogKnowledgeAnnouncement() {
		return annService.getLogKnowledge();
	}
	
	@GetMapping(path="/announcement_logKnowledge/{id}")
	public @ResponseBody Iterable<LogKnowledge> getByIdLogKnowledge(@PathVariable("id") int logkAnnId) {	
		return annService.getLogKnowledgeById(logkAnnId);
	}
	
	@GetMapping(path="/announcement_logPosition")
	public @ResponseBody Iterable<LogPosition> getAllLogPositionAnnouncement() {
		return annService.getLogPosition();
	}
	
	@GetMapping(path="/announcement_logPosition/{id}")
	public @ResponseBody Iterable<LogPosition> getByIdLogPosition(@PathVariable("id") int logpAnnId) {	
		return annService.getLogPositionById(logpAnnId);
	}
	
	@GetMapping(path="/announcement_position_data")
	public @ResponseBody Iterable<PositionData> getAllPositionDataAnnouncement() {
		return annService.getPositionData();
	}
	
	@GetMapping(path="/announcement_position_data/{id}")
	public @ResponseBody Optional<PositionData> getByIdPositionData(@PathVariable("id") int id) {	
		return annService.getPositionDataById(id);
	}
	
	@GetMapping(path="/announcement_organization_data/{id}")
	public @ResponseBody Iterable<OrganizationData> getByIdOrganizationData(@PathVariable("id") int id) {	
		return annService.getOrganizationDataById(id);
	}
	
	@GetMapping(path="/announcement_organization_data")
	public @ResponseBody Iterable<OrganizationData> getAllOrganizationDataAnnouncement() {
		return annService.getOrganization();
	}
	
	@GetMapping(path="/announcement_organization_status/{id}")
	public @ResponseBody Iterable<OrganizationStatus> getByIdOrganizationStatus(@PathVariable("id") int id) {	
		return annService.getOrganizationStatusById(id);
	}
	
	@GetMapping(path="/announcement_organization_status")
	public @ResponseBody Iterable<OrganizationStatus> getAllOrganizationStatusAnnouncement() {
		return annService.getOrganizationStatus();
	}
	
	@GetMapping(path="/announcement_organization_type/{id}")
	public @ResponseBody Iterable<OrganizationType> getByIdOrganizationType(@PathVariable("id") int id) {	
		return (Iterable<OrganizationType>) annService.getOrganizationTypeById(id);
	}
	
	@GetMapping(path="/announcement_organization_type")
	public @ResponseBody Iterable<OrganizationType> getAllOrganizationTypeAnnouncement() {
		return annService.getOrganizationType();
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
 