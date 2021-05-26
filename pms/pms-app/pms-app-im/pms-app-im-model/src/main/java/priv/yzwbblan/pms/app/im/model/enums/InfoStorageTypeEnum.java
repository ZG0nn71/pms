package priv.yzwbblan.pms.app.im.model.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IEnum;

/**
 * 信息存储类型
 * @author yzw
 *
 */
public enum InfoStorageTypeEnum implements IEnum {
	DATABASE(0, "数据库"), FILE(1, "文件");
	
	private Integer type;
	//备注
	private String remark;
	
	private InfoStorageTypeEnum(Integer type, String remark) {
		this.setType(type);
		this.setRemark(remark);
	}
	
	@Override
	public Serializable getValue() {
		return this.getType();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
