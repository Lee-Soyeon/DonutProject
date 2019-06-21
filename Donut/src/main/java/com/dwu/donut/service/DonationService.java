package com.dwu.donut.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwu.donut.dao.DonationDao;
import com.dwu.donut.domain.Donation;

@Service
public class DonationService {

	@Autowired
	DonationDao donationDao;
	
	// 1. '기증해요' 게시판 View
	public List<Donation> getDonationList() {
		return donationDao.getDonationList();
	}
	
	// 2. '기증해요' 게시물 View
	public Donation getDonationItem(int donationId) {
		return donationDao.getDonationItem(donationId);
	}

	// 3. '기증해요' 게시물 작성하기
	public void insertDonation(Donation donation) {
		
		donation.setDonationDate(new Date());
		donation.setDonationMatchingState('F');
		
		donationDao.insertDonation(donation);
	}
	
	// 4. '기증해요' 게시물 수정하기
	public void updateDonation(Donation donation) {
		donation.setDonationDate(new Date());
		
		donationDao.updateDonation(donation);
	}
	
	// 5. '기증해요' 게시물 삭제하기
	public void deleteDonation(int donationId) {
		donationDao.deleteDonation(donationDao.getDonationItem(donationId));
	}
	
}