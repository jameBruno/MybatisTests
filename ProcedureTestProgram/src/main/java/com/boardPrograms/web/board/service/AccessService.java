package com.boardPrograms.web.board.service;

import com.boardPrograms.web.board.model.Params;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.boardPrograms.web.board.model.AccessVO;
import org.springframework.stereotype.Service;

@Service
public interface AccessService {
	
	//List<AccessVO> getAccessList(final Params params);
	
	public Map<String, Object> getAccessList(Map<String, Object> param);
	
	//List<AccessVO> getAccessList(final Params params);
	
	//List<AccessVO> listAccessList();
}

