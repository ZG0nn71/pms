package priv.yzwbblan.pms.base.exception;

/**
 * 封装pms的异常
 *
 * @author fengshuonan
 * @Date 2017/12/28 下午10:32
 */
public class PmsException extends RuntimeException {

	private static final long serialVersionUID = -4733544222311248486L;

	private Integer code;

    private String message;

    public PmsException(ServiceExceptionEnum serviceExceptionEnum) {
        this.code = serviceExceptionEnum.getCode();
        this.message = serviceExceptionEnum.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
