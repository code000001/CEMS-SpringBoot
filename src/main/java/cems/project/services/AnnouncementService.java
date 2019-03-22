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
	
	public Iterable<Announcement> getAnnouncementByannOrgId(int annOrgId) {
		return annRepository.getByannOrgId(annOrgId);
	}
	
	public Iterable<Announcement> getAnnouncementById(int id) {
		return annRepository.getById(id);
	}

	public Iterable<Announcement> getAnnouncement() {
		return annRepository.findAll();
	}
	
	public Iterable<AnnouncementStatus> getAnnouncementStatusById(int id) {
		return statusRepository.getAnnouncementStatusById(id);
	}
	
	public Iterable<AnnouncementStatus> getAnnouncementStatus() {
		return statusRepository.findAll();
	}
	
	public Optional<KnowledgeRequirement> getKnowledgeRequirementById(Integer id) {
		return knowledgeRequirRespository.findById(id);
	}
	
	public Iterable<KnowledgeRequirement> getKnowledgeRequirement() {
		return knowledgeRequirRespository.findAll();
	}
	
	public Iterable<LogKnowledge> getLogKnowledgeById(int logkAnnId) {
		return logKnowledgeRequirRepository.getLogKnowledgeBylogkAnnId(logkAnnId);
	}
	
	public Iterable<LogKnowledge> getLogKnowledge() {
		return logKnowledgeRequirRepository.findAll();
	}
	
	public Iterable<LogPosition> getLogPositionById(int logpAnnId) {
		return logPositionRepository.getLogPositionBylogpAnnId(logpAnnId);
	}

	public Iterable<LogPosition> getLogPosition() {
		return logPositionRepository.findAll();
	}
	
	public Iterable<PositionData> getPositionDataById(int Id) {
		return positionDataRepository.getPositionDataById(Id);
	}
	
	public Iterable<PositionData> getPositionData() {
		return positionDataRepository.findAll();
	}
	
	public Iterable<OrganizationData> getOrganizationDataById(int id) {
		return organizationDataRepository.getOrganizationDataById(id);
	}
	
	public Iterable<OrganizationData> getOrganization() {
		return organizationDataRepository.findAll();
	}
	
	public Iterable<OrganizationStatus> getOrganizationStatusById(int id) {
		return organizationStatusRepository.getOrganizationStatusById(id);
	}
	
	public Iterable<OrganizationStatus> getOrganizationStatus() {
		return organizationStatusRepository.findAll();
	}
	
	public Iterable<OrganizationType> getOrganizationTypeById(int id) {
		return organizationTypeRepository.getOrganizationTypeById(id);
	}
	
	public Iterable<OrganizationType> getOrganizationType() {
		return organizationTypeRepository.findAll();
	}
	
	public Announcement addAnnouncement(Announcement newAnnouncement) {
		Announcement announcement = annRepository.save(newAnnouncement);
		return annRepository.save(announcement);
	}

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
