package priv.yzwbblan.pms.app.im.model.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IEnum;

/**
 * 启用标识
 * @author yzw
 *
 */
public enum EnableFlagEnum implements IEnum {
	ENABLED(true, "启用"), DISABLED(false, "禁用");

	private Boolean flag;
	//备注
	private String remark;
	
	private EnableFlagEnum(Boolean flag, String remark) {
		this.setFlag(flag);
		this.setRemark(remark);
	}
	
	@Override
	public Serializable getValue() {
		return this.getFlag();
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
}
