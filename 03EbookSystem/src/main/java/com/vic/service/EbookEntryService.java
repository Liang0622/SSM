package com.vic.service;

import com.vic.pojo.EbookEntry;

import java.io.Serializable;
import java.util.List;

public interface EbookEntryService {
    List<EbookEntry> selectAllEntry();
    List<EbookEntry> selectEntryByCategoryId(Serializable categoryId);
    EbookEntry selectOneById(Serializable id);
    boolean addEntry(EbookEntry ebookEntry);
    boolean updateEntry(EbookEntry ebookEntry);
    boolean delEntry(Serializable entryId);
}
