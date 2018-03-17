package com.vic.dao;

import com.vic.pojo.EbookEntry;

import java.io.Serializable;
import java.util.List;

public interface EbookEntryMapper {
    /**
     * 查询所有图书条目
     * @return
     */
    List<EbookEntry> selectAllEntry();

    /**
     * 根据分类查询图书条目
     */
    List<EbookEntry> selectEntryByCategoryId(Serializable categoryId);

    /**
     * 根据id查询某个条目
     */
    EbookEntry selectOneById(Serializable id);
    /**
     * 增加电子图书条目
     */
    int addEntry(EbookEntry ebookEntry);

    /**
     * 删除电子图书条目
     */
    int delEntry(Serializable entryId);

    /**
     * 修改电子图书条目
     */
    int updateEntry(EbookEntry ebookEntry);
}
