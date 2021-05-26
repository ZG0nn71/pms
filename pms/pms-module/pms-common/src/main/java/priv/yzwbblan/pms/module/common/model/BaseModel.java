package priv.yzwbblan.pms.module.common.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;

/**
 * 基础模块
 * @author yzw
 *
 */
public abstract class BaseModel extends Model<BaseModel> {

	private static final long serialVersionUID = 1L;
	//唯一标识
	protected Long id;

	@Override
	protected Serializable pkVal() {
		return null;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

}
