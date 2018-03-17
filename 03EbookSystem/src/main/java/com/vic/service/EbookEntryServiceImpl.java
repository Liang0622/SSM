package com.vic.service;

import com.vic.dao.EbookEntryMapper;
import com.vic.pojo.EbookEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class EbookEntryServiceImpl implements EbookEntryService {

    @Autowired
    private EbookEntryMapper mapper;

    public List<EbookEntry> selectAllEntry(){
        List<EbookEntry> entries= mapper.selectAllEntry();
        return entries;
    }

    public List<EbookEntry> selectEntryByCategoryId(Serializable categoryId) {
        System.out.println("进入了sevice的selectEntryByCategoryId方法");
        return mapper.selectEntryByCategoryId(categoryId);
    }

    public EbookEntry selectOneById(Serializable id){
        System.out.println("进入了service的selectOneById方法");
        System.out.println("id="+id);
        return mapper.selectOneById(id);
    }

    public boolean addEntry(EbookEntry ebookEntry) {
        if(mapper.addEntry(ebookEntry)>0){
            return true;
        }
        return false;
    }

    public boolean updateEntry(EbookEntry ebookEntry) {
        if(mapper.updateEntry(ebookEntry)>0){
            return true;
        }
        return false;
    }

    public boolean delEntry(Serializable entryId) {
        if(mapper.delEntry(entryId)>0){
            return true;
        }
        return false;
    }
}
