package cems.project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

/* Author			: Ruksina Prommee
 * Author ID		: 58160247
 * Class			: AnnouncementController
 * Module			: announcement controller
 * Last edited		: 01/05/2019
 */
@CrossOrigin
@RestController
@RequestMapping(path="/cems")
public class AnnouncementController {

	@Autowired
	private AnnouncementService annService;
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET Announcement
	 * Function input	: -
	 * Function output	: all announcement data
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement")
	public Iterable<Announcement> getAllAnnouncement() {
		return annService.getAnnouncement();
	}
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET Announcement
	 * Function input	: id
	 * Function output	: all announcement data by annOrgId
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_org/{id}")
	public @ResponseBody Iterable<Announcement> getByannAccIdAnnouncement(@PathVariable("id") int annOrgId) {	
		return annService.getAnnouncementByannOrgId(annOrgId);
	}
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET Announcement
	 * Function input	: id
	 * Function output	: announcement data by id
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement/{id}")
	public @ResponseBody Iterable<Announcement> getByIdAnnouncement(@PathVariable("id") int id) {	
		return annService.getAnnouncementById(id);
	}
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET AnnouncementStatus
	 * Function input	: -
	 * Function output	: all announcement status
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_status")
	public @ResponseBody Iterable<AnnouncementStatus> getAllStatusAnnouncement() {
		return annService.getAnnouncementStatus();
	}
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET AnnouncementStatus
	 * Function input	: id
	 * Function output	: announcement status by id
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_status/{id}")
	public @ResponseBody Iterable<AnnouncementStatus> getByIdAnnouncementStatus(@PathVariable("id") int id) {	
		return annService.getAnnouncementStatusById(id);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET KnowledgeRequirement
	 * Function input	: -
	 * Function output	: Knowledge Requirement
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_knowledge")
	public @ResponseBody Iterable<KnowledgeRequirement> getAllKnowledgeRequirementAnnouncement() {
		return annService.getKnowledgeRequirement();
	}
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET KnowledgeRequirement
	 * Function input	: id
	 * Function output	: Knowledge Requirement by id
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_knowledge/{id}")
	public @ResponseBody Optional<KnowledgeRequirement> getByIdKnowledgeRequirement(@PathVariable("id") Integer id) {	
		return annService.getKnowledgeRequirementById(id);
	}
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET LogKnowledge
	 * Function input	: -
	 * Function output	: LogKnowledge
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_logKnowledge")
	public @ResponseBody Iterable<LogKnowledge> getAllLogKnowledgeAnnouncement() {
		return annService.getLogKnowledge();
	}
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET LogKnowledge
	 * Function input	: id
	 * Function output	: LogKnowledge by id
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_logKnowledge/{id}")
	public @ResponseBody Iterable<LogKnowledge> getByIdLogKnowledge(@PathVariable("id") int logkAnnId) {	
		return annService.getLogKnowledgeById(logkAnnId);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET LogPosition
	 * Function input	: -
	 * Function output	: LogPosition
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_logPosition")
	public @ResponseBody Iterable<LogPosition> getAllLogPositionAnnouncement() {
		return annService.getLogPosition();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET LogPosition
	 * Function input	: id
	 * Function output	: LogPosition by id
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_logPosition/{id}")
	public @ResponseBody Iterable<LogPosition> getByIdLogPosition(@PathVariable("id") int logpAnnId) {	
		return annService.getLogPositionById(logpAnnId);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET PositionData
	 * Function input	: -
	 * Function output	: all PositionData
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_position_data")
	public @ResponseBody Iterable<PositionData> getAllPositionDataAnnouncement() {
		return annService.getPositionData();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET PositionData
	 * Function input	: id
	 * Function output	: PositionData by id
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_position_data/{id}")
	public @ResponseBody Optional<PositionData> getByIdPositionData(@PathVariable("id") int id) {	
		return annService.getPositionDataById(id);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET OrganizationData
	 * Function input	: id
	 * Function output	: OrganizationData by id
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_organization_data/{id}")
	public @ResponseBody Iterable<OrganizationData> getByIdOrganizationData(@PathVariable("id") int id) {	
		return annService.getOrganizationDataById(id);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET OrganizationData
	 * Function input	: -
	 * Function output	: all OrganizationData
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_organization_data")
	public @ResponseBody Iterable<OrganizationData> getAllOrganizationDataAnnouncement() {
		return annService.getOrganization();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET OrganizationStatus
	 * Function input	: id
	 * Function output	: OrganizationStatus by id
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_organization_status/{id}")
	public @ResponseBody Iterable<OrganizationStatus> getByIdOrganizationStatus(@PathVariable("id") int id) {	
		return annService.getOrganizationStatusById(id);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET OrganizationStatus
	 * Function input	: -
	 * Function output	: all OrganizationStatus
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_organization_status")
	public @ResponseBody Iterable<OrganizationStatus> getAllOrganizationStatusAnnouncement() {
		return annService.getOrganizationStatus();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET OrganizationType
	 * Function input	: id
	 * Function output	: OrganizationType by id
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_organization_type/{id}")
	public @ResponseBody Iterable<OrganizationType> getByIdOrganizationType(@PathVariable("id") int id) {	
		return (Iterable<OrganizationType>) annService.getOrganizationTypeById(id);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: GET OrganizationType
	 * Function input	: -
	 * Function output	: all OrganizationType
	 * Purpose			: GET api
	 * Last edited		: 01/05/2019
	 */
	@GetMapping(path="/announcement_organization_type")
	public @ResponseBody Iterable<OrganizationType> getAllOrganizationTypeAnnouncement() {
		return annService.getOrganizationType();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: POST Announcement
	 * Function input	: -
	 * Function output	: insert Announcement
	 * Purpose			: POST api
	 * Last edited		: 01/05/2019
	 */
	@PostMapping(path="/announcement")
	public ResponseEntity<String> insertAnnouncement(@RequestBody Announcement newAnnouncement) {
		HttpHeaders responseHeaders = new HttpHeaders();
		newAnnouncement.setAnnStatusId(1);
		if((newAnnouncement.getAnnEndDate()).equals(null)||(newAnnouncement.getAnnStartDate()).equals(null)
				||(newAnnouncement.getAnnOrgId()).equals(null)||(newAnnouncement.getAnnItemReq()).equals(null)
				||(newAnnouncement.getAnnAccId()).equals(null)||(newAnnouncement.getAnnStdAmount()).equals(null)
				||(newAnnouncement.getAnnWorkshift()).equals(null)||(newAnnouncement.getAnnReward()).equals(null)) {
			responseHeaders.set("ResponeAddAnnouncement", "Fail");
			return new ResponseEntity<String>("Fail", responseHeaders, HttpStatus.BAD_REQUEST);
				
			}
		else {
		annService.addAnnouncement(newAnnouncement);	
		responseHeaders.set("ResponeAddAnnouncement", "Success");
		return new ResponseEntity<String>("Success", responseHeaders, HttpStatus.OK);
		}
	}
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: POST LogKnowledge
	 * Function input	: -
	 * Function output	: insert LogKnowledge
	 * Purpose			: POST api
	 * Last edited		: 01/05/2019
	 */
	@PostMapping(path="/announcement_logKnowledge")
	public LogKnowledge addLogKnowledge(@RequestBody LogKnowledge newLogKnowledge) {
		return annService.addLogKnowledge(newLogKnowledge);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: POST LogPosition
	 * Function input	: -
	 * Function output	: insert LogPosition
	 * Purpose			: POST api
	 * Last edited		: 01/05/2019
	 */
	@PostMapping(path="/announcement_logPosition")
	public LogPosition addLogPosition(@RequestBody LogPosition newLogPosition) {
		return annService.addLogPosition(newLogPosition);
	}
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: PUT Announcement
	 * Function input	: id
	 * Function output	: update Announcement by id
	 * Purpose			: PUT api
	 * Last edited		: 01/05/2019
	 */
	@PutMapping(path="/announcement/{id}")
	public Announcement updateAnnouncement(@PathVariable("id") int id,@RequestBody Announcement updateAnnouncement) {
		return annService.updateAnnouncement(id, updateAnnouncement);
	}
	
}
 