package com.accenture.lkm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accenture.lkm.business.bean.MaterialTypeBean;

public interface MaterialTypeService {
	List<MaterialTypeBean> getMaterialTypes(String categoryId);
}
