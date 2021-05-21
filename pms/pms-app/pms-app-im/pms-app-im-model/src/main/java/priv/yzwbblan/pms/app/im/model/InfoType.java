package priv.yzwbblan.pms.app.im.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;

/**
 * 信息类型
 * @author yzw
 *
 */
public class InfoType extends Model<InfoType> {

	private Long id;
	
	private String name;
	
	private String code;
	
	private String namePath;
	private String codePath;
	private String idPath;
	
	private Long parent;
	
	private String remark;
	

	@Override
	protected Serializable pkVal() {
		return null;
	}
}
