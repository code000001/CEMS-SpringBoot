package cems.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import cems.project.model.Announcement;
import cems.project.model.AnnouncementStatus;
import cems.project.model.KnowledgeRequirement;
import cems.project.model.LogKnowledge;
import cems.project.model.LogPosition;
import cems.project.model.PositionData;
import cems.project.respository.AnnouncementRepository;
import cems.project.respository.AnnouncementStatusRepository;
import cems.project.respository.KnowledgeRequirementRepository;
import cems.project.respository.LogKnowledgeRepository;
import cems.project.respository.LogPositionRepository;
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
	
	
	public Announcement getAnnouncementById(int id) {
		return annRepository.findById(id);
	}

	public List<Announcement> getAnnouncement() {
		return (List<Announcement>) annRepository.findAll();
	}
	
	public List<AnnouncementStatus> getAnnouncementStatus() {
		return (List<AnnouncementStatus>) statusRepository.findAll();
	}
	
	public List<KnowledgeRequirement> getKnowledgeRequirement() {
		return (List<KnowledgeRequirement>) knowledgeRequirRespository.findAll();
	}
	
	public List<LogKnowledge> getLogKnowledge() {
		return (List<LogKnowledge>) logKnowledgeRequirRepository.findAll();
	}

	public List<LogPosition> getLogPosition() {
		return (List<LogPosition>) logPositionRepository.findAll();
	}
	
	public List<PositionData> getPositionData() {
		return (List<PositionData>) positionDataRepository.findAll();
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
