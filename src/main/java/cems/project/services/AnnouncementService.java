package cems.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.Announcement;
import cems.project.model.AnnouncementStatus;
import cems.project.model.KnowledgeRequirement;
import cems.project.model.LogKnowledge;
import cems.project.model.LogPosition;
import cems.project.model.OrganizationData;
import cems.project.model.OrganizationStatus;
import cems.project.model.OrganizationType;
import cems.project.model.PositionData;
import cems.project.respository.AnnouncementRepository;
import cems.project.respository.AnnouncementStatusRepository;
import cems.project.respository.KnowledgeRequirementRepository;
import cems.project.respository.LogKnowledgeRepository;
import cems.project.respository.LogPositionRepository;
import cems.project.respository.OrganizationDataRepository;
import cems.project.respository.OrganizationStatusRepository;
import cems.project.respository.OrganizationTypeRepository;
import cems.project.respository.PositionDataRepository;

@Service
@Configuration
public class AnnouncementService {

	@Autowired
	private AnnouncementRepository annRepository;
	
	@Autowired
	private AnnouncementStatusRepository statusRepository;
	
	@Autowired
	private KnowledgeRequirementRepository knowledgeRequirRespository;
	
	@Autowired
	private LogKnowledgeRepository logKnowledgeRequirRepository;
	
	@Autowired
	private LogPositionRepository logPositionRepository;
	
	@Autowired
	private PositionDataRepository positionDataRepository;
	
	@Autowired
	private OrganizationDataRepository organizationDataRepository;
	
	@Autowired
	private OrganizationStatusRepository organizationStatusRepository;
	
	@Autowired
	private OrganizationTypeRepository organizationTypeRepository;
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get announcement data
	 * Function input	: as parameter	=> organization id (annOrgId) : int
	 * Function output	: all announcement data with the organization id
	 * Purpose			: response of announcement data with the organization id in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<Announcement> getAnnouncementByannOrgId(int annOrgId) {
		return annRepository.getByannOrgId(annOrgId);
	}
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get announcement data
	 * Function input	: as parameter	=> announcement id (id) : int
	 * Function output	: all announcement data with the id
	 * Purpose			: response of announcement data with the id in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<Announcement> getAnnouncementById(int id) {
		return annRepository.getById(id);
	}

	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get announcement data all
	 * Function input	: as parameter	=> -
	 * Function output	: all announcement data
	 * Purpose			: response of announcement data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<Announcement> getAnnouncement() {
		return annRepository.findAll();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get announcement status data
	 * Function input	: as parameter	=> organization id (id) : int
	 * Function output	: all announcement status with the announcement id
	 * Purpose			: response of announcement status with the announcement id in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<AnnouncementStatus> getAnnouncementStatusById(int id) {
		return statusRepository.getAnnouncementStatusById(id);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get announcement status data all
	 * Function input	: as parameter	=> -
	 * Function output	: all announcement status data
	 * Purpose			: response of announcement status data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<AnnouncementStatus> getAnnouncementStatus() {
		return statusRepository.findAll();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get knowledge requirement data
	 * Function input	: as parameter	=> knowledge requirement id (id) : int
	 * Function output	: all announcement data with the organization id
	 * Purpose			: response of knowledge requirement data with the id in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Optional<KnowledgeRequirement> getKnowledgeRequirementById(Integer id) {
		return knowledgeRequirRespository.findById(id);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get knowledge requirement data all
	 * Function input	: as parameter	=> -
	 * Function output	: all knowledge requirement data
	 * Purpose			: response of knowledge requirement data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<KnowledgeRequirement> getKnowledgeRequirement() {
		return knowledgeRequirRespository.findAll();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get log knowledge requirement data
	 * Function input	: as parameter	=> announcement knowledge requirement id (logkAnnId) : int
	 * Function output	: all log knowledge requirement data with the announcement logkAnnId
	 * Purpose			: response of log knowledge requirement data with the id in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<LogKnowledge> getLogKnowledgeById(int logkAnnId) {
		return logKnowledgeRequirRepository.getLogKnowledgeBylogkAnnId(logkAnnId);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get log knowledge requirement data all
	 * Function input	: as parameter	=> -
	 * Function output	: all log knowledge requirement data
	 * Purpose			: response of log knowledge requirement data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<LogKnowledge> getLogKnowledge() {
		return logKnowledgeRequirRepository.findAll();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get log position data
	 * Function input	: as parameter	=> announcement position id (logkAnnId) : int
	 * Function output	: all log position data with the announcement logpAnnId
	 * Purpose			: response of log position data with the id in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<LogPosition> getLogPositionById(int logpAnnId) {
		return logPositionRepository.getLogPositionBylogpAnnId(logpAnnId);
	}

	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get log position data all
	 * Function input	: as parameter	=> -
	 * Function output	: all position data
	 * Purpose			: response of log position data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<LogPosition> getLogPosition() {
		return logPositionRepository.findAll();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get position data
	 * Function input	: as parameter	=> position id (id) : int
	 * Function output	: all position data with the position id
	 * Purpose			: response of position data with the id in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Optional<PositionData> getPositionDataById(int id) {
		return positionDataRepository.getById(id);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get position data all
	 * Function input	: as parameter	=> -
	 * Function output	: all position data
	 * Purpose			: response of position data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<PositionData> getPositionData() {
		return positionDataRepository.findAll();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get organization data
	 * Function input	: as parameter	=> organization id (id) : int
	 * Function output	: all organization data with the position id
	 * Purpose			: response of organization data with the id in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<OrganizationData> getOrganizationDataById(int id) {
		return organizationDataRepository.getOrganizationDataById(id);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get organization data all
	 * Function input	: as parameter	=> -
	 * Function output	: all organization data
	 * Purpose			: response of organization data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<OrganizationData> getOrganization() {
		return organizationDataRepository.findAll();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get organization status data
	 * Function input	: as parameter	=> organization status id (id) : int
	 * Function output	: all organization status data with the position id
	 * Purpose			: response of organization status data with the id in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<OrganizationStatus> getOrganizationStatusById(int id) {
		return organizationStatusRepository.getOrganizationStatusById(id);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get organization status data all
	 * Function input	: as parameter	=> -
	 * Function output	: all organization data
	 * Purpose			: response of organization status data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<OrganizationStatus> getOrganizationStatus() {
		return organizationStatusRepository.findAll();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get organization type data
	 * Function input	: as parameter	=> organization type id (id) : int
	 * Function output	: all organization type data with the position id
	 * Purpose			: response of organization type data with the id in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<OrganizationType> getOrganizationTypeById(int id) {
		return organizationTypeRepository.getOrganizationTypeById(id);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: get organization type data all
	 * Function input	: as parameter	=> -
	 * Function output	: all organization data
	 * Purpose			: response of organization type data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Iterable<OrganizationType> getOrganizationType() {
		return organizationTypeRepository.findAll();
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: post announcement data
	 * Function input	: as parameter	=> announcement model
	 * Function output	: -
	 * Purpose			: response of announcement data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Announcement addAnnouncement(Announcement newAnnouncement) {
		Announcement announcement = annRepository.save(newAnnouncement);
		return annRepository.save(announcement);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: post log position data
	 * Function input	: as parameter	=> log position model
	 * Function output	: -
	 * Purpose			: response of log position data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public LogPosition addLogPosition(LogPosition newLogPosition) {
		LogPosition logposition = logPositionRepository.save(newLogPosition);
		return logPositionRepository.save(logposition);
	}
	
	
	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: post log knowledge data
	 * Function input	: as parameter	=> log knowledge model
	 * Function output	: -
	 * Purpose			: response of log knowledge data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public LogKnowledge addLogKnowledge(LogKnowledge newLogKnowledge) {
		LogKnowledge logposition = logKnowledgeRequirRepository.save(newLogKnowledge);
		return logKnowledgeRequirRepository.save(logposition);
	}

	/* Author			: Ruksina Prommee
	 * Author ID		: 58160247
	 * Function			: put announcement data
	 * Function input	: as parameter	=> announcement model
	 * Function output	: -
	 * Purpose			: response of announcement data in announcement module on Cooperative Education Management System
	 * Last edited		: 01/05/2019
	 */
	public Announcement updateAnnouncement(int id, Announcement newAnnouncement) {
		Announcement currentAnnouncement = annRepository.findById(id);
		if (newAnnouncement.getAnnAccId().equals(null)) {
			throw new ArithmeticException("Has not this id");
		}
			currentAnnouncement.setAnnAccId(newAnnouncement.getAnnAccId());
			currentAnnouncement.setAnnOrgId(newAnnouncement.getAnnOrgId());
			currentAnnouncement.setAnnStatusId(newAnnouncement.getAnnStatusId());
			currentAnnouncement.setAnnStartDate(newAnnouncement.getAnnStartDate());
			currentAnnouncement.setAnnEndDate(newAnnouncement.getAnnEndDate());
			currentAnnouncement.setAnnStdAmount(newAnnouncement.getAnnStdAmount());
			currentAnnouncement.setAnnReward(newAnnouncement.getAnnReward());
			currentAnnouncement.setAnnWorkshift(newAnnouncement.getAnnWorkshift());
			currentAnnouncement.setAnnItemReq(newAnnouncement.getAnnItemReq());
			return annRepository.save(currentAnnouncement);

	}

}
