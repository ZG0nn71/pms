package priv.yzwbblan.pms.module.common.model;

import com.baomidou.mybatisplus.annotations.Version;

/**
 * 带有version字段的
 * @author yzw
 *
 */
public class VersionModel extends BaseModel {

	private static final long serialVersionUID = 1L;

	//版本号
	@Version
	private Integer version;

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
}
