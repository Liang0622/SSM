package com.vic.service;

import com.vic.dao.EbookCategoryMapper;
import com.vic.pojo.EbookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookCategorySerivceImpl implements EbookCategoryService{

    @Autowired
    private EbookCategoryMapper mapper;

    public List<EbookCategory> getAllCategory() {
        return mapper.selectAllCategory();
    }
}
