package com.jim.novel.dao;

import com.jim.novel.model.Chapter;

public interface ChapterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer chapterId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated
     */
    int insert(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated
     */
    int insertSelective(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated
     */
    Chapter selectByPrimaryKey(Integer chapterId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Chapter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Chapter record);
}