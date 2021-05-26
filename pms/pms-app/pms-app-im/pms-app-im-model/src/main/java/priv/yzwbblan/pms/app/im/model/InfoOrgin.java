package priv.yzwbblan.pms.app.im.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;

/**
 * 信息来源
 * @author yzw
 *
 */
public class InfoOrgin extends Model<InfoOrgin> {
	
	private static final long serialVersionUID = -4461838719942519744L;

	private Long id;
	
	private String name;
	
	private String code;
	
	private String remark;
	
	@Override
	protected Serializable pkVal() {
		return id;
	}
	  
}
