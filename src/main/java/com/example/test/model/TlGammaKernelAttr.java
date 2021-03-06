package com.example.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the tl_gamma_kernel_attr database table.
 * 
 */
@Entity
@Table(name="tl_gamma_kernel_attr")
@NamedQuery(name="TlGammaKernelAttr.findAll", query="SELECT t FROM TlGammaKernelAttr t")
public class TlGammaKernelAttr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="attr_guid")
	private String attrGuid;
	
	@Column(name="attr_enum", length=128)
	private String attrEnum;

	@Column(name="attr_field", length=64)
	private String attrField;

	@Column(name="attr_name", length=256)
	private String attrName;

	@Column(name="attr_rang", length=128)
	private String attrRang;

	@Column(name="attr_sum", length=128)
	private String attrSum;

	/**
	 * STRING
	 * INTEGER
	 * NUMBER
	 * DATETIME
	 * GEOMETRY
	 */

	@Column(name="attr_type", length=64)
	private String attrType;

	@Column(name="kernel_classid", nullable=false)
	private String kernelClassid;
	
	/**
	 * 灞炴�у瓧娈典紬绛圭瓑绾�
	 * TASKGRADE 涓嶅悓浠诲姟淇濈暀澶氫唤鏁版嵁
	 * USERGRADE 涓嶅悓鐢ㄦ埛淇濈暀澶氫唤鏁版嵁
	 */
	@Column(name="attr_fgrade")
	private String attrFgrade;
	
	

	public TlGammaKernelAttr() {
	}

	public String getAttrEnum() {
		return this.attrEnum;
	}

	public void setAttrEnum(String attrEnum) {
		this.attrEnum = attrEnum;
	}

	public String getAttrField() {
		return this.attrField;
	}

	public void setAttrField(String attrField) {
		this.attrField = attrField;
	}

	public String getAttrGuid() {
		return this.attrGuid;
	}

	public void setAttrGuid(String attrGuid) {
		this.attrGuid = attrGuid;
	}

	public String getAttrName() {
		return this.attrName;
	}

	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public String getAttrRang() {
		return this.attrRang;
	}

	public void setAttrRang(String attrRang) {
		this.attrRang = attrRang;
	}

	public String getAttrSum() {
		return this.attrSum;
	}

	public void setAttrSum(String attrSum) {
		this.attrSum = attrSum;
	}

	public String getAttrType() {
		return this.attrType;
	}

	public void setAttrType(String attrType) {
		this.attrType = attrType;
	}

	public String getKernelClassid() {
		return this.kernelClassid;
	}

	public void setKernelClassid(String kernelClassid) {
		this.kernelClassid = kernelClassid;
	}

	/**
	 * @return the attrFgrade
	 */
	public String getAttrFgrade() {
		return attrFgrade;
	}

	/**
	 * @param attrFgrade the attrFgrade to set
	 */
	public void setAttrFgrade(String attrFgrade) {
		this.attrFgrade = attrFgrade;
	}
}