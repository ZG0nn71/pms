package priv.yzwbblan.pms.app.im.model;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;

/**
 * 信息详情
 * @author yzw
 *
 */
public class InfoDetails extends Model<InfoDetails> {
	
	private static final long serialVersionUID = 524066266556002822L;

	private Long id;
	
	private Boolean deleteFlag;
	
	private Boolean enableFlag;
	
	private Long storageType;
	
	private Date createTime;
	
	private Date modifyTime;
	
	private String URI;
	
	private String attachText;
	
	private Object attachObject;
	
	public void setFile() {
		
	}
	
	public File getFile() {
		return null;
	}

	@Override
	protected Serializable pkVal() {
		return id;
	}
}
