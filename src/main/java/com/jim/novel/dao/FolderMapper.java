package com.jim.novel.dao;

import com.jim.novel.constant.FolderConstant;
import com.jim.novel.entity.FolderVo;
import com.jim.novel.model.Folder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FolderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table folder
     *
     * @mbg.generated
     */
    boolean deleteByPrimaryKey(Integer folderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table folder
     *
     * @mbg.generated
     */
    int insert(Folder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table folder
     *
     * @mbg.generated
     */
    int insertSelective(Folder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table folder
     *
     * @mbg.generated
     */
    FolderVo selectByPrimaryKey(Integer folderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table folder
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Folder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table folder
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Folder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table folder
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Folder record);

    /**
     * @param folderId
     * @param name
     * @param ename
     * @param content
     * @param status
     */
    public void updateFolderById(@Param("folderId") long folderId,
                                 @Param("name") String name, @Param("ename") String ename,
                                 @Param("status") FolderConstant.status status,
                                 @Param("content") String content, @Param("height") int height,
                                 @Param("width") int width);

    public int updateSort(@Param("folderId") long folderId,
                          @Param("sort") int sort);

    public int updateCount(@Param("folderId") long folderId,
                           @Param("count") int count);


    /**
     * 得到所有子目录
     *
     * @param fatherId
     * @return List<FolderVo>
     */
    public List<FolderVo> getFolderListByFatherId(
            @Param("fatherId") long fatherId,
            @Param("status") FolderConstant.status status);


}