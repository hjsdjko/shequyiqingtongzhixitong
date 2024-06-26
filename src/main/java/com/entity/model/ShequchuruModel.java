package com.entity.model;

import com.entity.ShequchuruEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 社区人员出入
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShequchuruModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 住户
     */
    private Integer zhuhuId;


    /**
     * 出入类型
     */
    private Integer shequchuruTypes;


    /**
     * 体温
     */
    private Double shequchuruTiwen;


    /**
     * 从哪来
     */
    private String laiAddress;


    /**
     * 到哪去
     */
    private String quAddress;


    /**
     * 备注
     */
    private String shequchuruContent;


    /**
     * 登记时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：住户
	 */
    public Integer getZhuhuId() {
        return zhuhuId;
    }


    /**
	 * 设置：住户
	 */
    public void setZhuhuId(Integer zhuhuId) {
        this.zhuhuId = zhuhuId;
    }
    /**
	 * 获取：出入类型
	 */
    public Integer getShequchuruTypes() {
        return shequchuruTypes;
    }


    /**
	 * 设置：出入类型
	 */
    public void setShequchuruTypes(Integer shequchuruTypes) {
        this.shequchuruTypes = shequchuruTypes;
    }
    /**
	 * 获取：体温
	 */
    public Double getShequchuruTiwen() {
        return shequchuruTiwen;
    }


    /**
	 * 设置：体温
	 */
    public void setShequchuruTiwen(Double shequchuruTiwen) {
        this.shequchuruTiwen = shequchuruTiwen;
    }
    /**
	 * 获取：从哪来
	 */
    public String getLaiAddress() {
        return laiAddress;
    }


    /**
	 * 设置：从哪来
	 */
    public void setLaiAddress(String laiAddress) {
        this.laiAddress = laiAddress;
    }
    /**
	 * 获取：到哪去
	 */
    public String getQuAddress() {
        return quAddress;
    }


    /**
	 * 设置：到哪去
	 */
    public void setQuAddress(String quAddress) {
        this.quAddress = quAddress;
    }
    /**
	 * 获取：备注
	 */
    public String getShequchuruContent() {
        return shequchuruContent;
    }


    /**
	 * 设置：备注
	 */
    public void setShequchuruContent(String shequchuruContent) {
        this.shequchuruContent = shequchuruContent;
    }
    /**
	 * 获取：登记时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：登记时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
