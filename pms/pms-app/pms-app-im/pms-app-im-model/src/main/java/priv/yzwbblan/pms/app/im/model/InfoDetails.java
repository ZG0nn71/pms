package priv.yzwbblan.pms.app.im.model;

import java.io.File;
import java.util.Date;

/**
 * 信息详情
 * @author yzw
 *
 */
public class InfoDetails {

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
}
