package priv.yzwbblan.pms.app.im.model.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IEnum;

/**
 * 删除标识
 * @author yzw
 *
 */
public enum DeleteFlagEnum implements IEnum {
	DELETED(true, "已删除"), NORMAL(false, "正常");
	
	private Boolean flag;
	//备注
	private String remark;
	
	private DeleteFlagEnum(Boolean flag, String remark) {
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
