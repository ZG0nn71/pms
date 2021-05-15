package priv.yzwbblan.pms.app.im.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;

/**
 * 信息
 * @author yzw
 *
 */
public class Info extends Model<Info>  {

	private static final long serialVersionUID = 1L;
	
	//唯一标识
	private Long id;
	//版本号
	private Integer version;
	//标题
	private String title;
	//备注
	private String remark;
	//来源
	private Long orgin;
	//类型
	private Long type;
	//详情
	private Long detail;
	//创建时间
	private Date createTime;
	//修改时间
	private Date modifyTime;
	//启用标识
	private Boolean enableFlag;
	//删除标识
	private Boolean deleteFlag;
	
	@Override
	protected Serializable pkVal() {
		return id;
	}
	
}
