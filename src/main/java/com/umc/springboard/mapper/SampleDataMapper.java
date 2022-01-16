package com.umc.springboard.mapper;

import com.umc.springboard.model.SampleData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleDataMapper {

	public List<SampleData> getSampleData();

}
