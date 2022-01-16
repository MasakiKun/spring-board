package com.umc.springboard.service;

import com.umc.springboard.mapper.SampleDataMapper;
import com.umc.springboard.model.SampleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

	@Autowired
	private SampleDataMapper sampleDataMapper;

	public String getGreetMessage() {
		return getSampleData().getGreetMessage();
	}

	public SampleData getSampleData() {
		List<SampleData> sampleDatas = sampleDataMapper.getSampleData();
		if(sampleDatas == null || sampleDatas.size() < 1) {
			throw new RuntimeException("Sample Data is not stored");
		}

		return sampleDatas.get(0);
	}

}
