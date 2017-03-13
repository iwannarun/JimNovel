package com.jim.novel.model;

import java.io.Serializable;
import java.util.Date;

public class Chapter implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.chapter_id
     *
     * @mbg.generated
     */
    private Long chapterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.article_id
     *
     * @mbg.generated
     */
    private Long articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.chapter_title
     *
     * @mbg.generated
     */
    private String chapterTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.comment_count
     *
     * @mbg.generated
     */
    private Integer commentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chapter.content
     *
     * @mbg.generated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chapter
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.chapter_id
     *
     * @return the value of chapter.chapter_id
     *
     * @mbg.generated
     */
    public Long getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.chapter_id
     *
     * @param chapterId the value for chapter.chapter_id
     *
     * @mbg.generated
     */
    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.article_id
     *
     * @return the value of chapter.article_id
     *
     * @mbg.generated
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.article_id
     *
     * @param articleId the value for chapter.article_id
     *
     * @mbg.generated
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.chapter_title
     *
     * @return the value of chapter.chapter_title
     *
     * @mbg.generated
     */
    public String getChapterTitle() {
        return chapterTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.chapter_title
     *
     * @param chapterTitle the value for chapter.chapter_title
     *
     * @mbg.generated
     */
    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.comment_count
     *
     * @return the value of chapter.comment_count
     *
     * @mbg.generated
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.comment_count
     *
     * @param commentCount the value for chapter.comment_count
     *
     * @mbg.generated
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.create_time
     *
     * @return the value of chapter.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.create_time
     *
     * @param createTime the value for chapter.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.modify_time
     *
     * @return the value of chapter.modify_time
     *
     * @mbg.generated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.modify_time
     *
     * @param modifyTime the value for chapter.modify_time
     *
     * @mbg.generated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chapter.content
     *
     * @return the value of chapter.content
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chapter.content
     *
     * @param content the value for chapter.content
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content;
    }
}