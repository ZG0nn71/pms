package priv.yzwbblan.pms.rest.module.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import priv.yzwbblan.pms.base.exception.PmsException;
import priv.yzwbblan.pms.rest.common.exception.BizExceptionEnum;
import priv.yzwbblan.pms.rest.module.controller.dto.AuthRequest;
import priv.yzwbblan.pms.rest.module.controller.dto.AuthResponse;
import priv.yzwbblan.pms.rest.util.JwtTokenUtil;
import priv.yzwbblan.pms.rest.validator.IReqValidator;

/**
 * 请求验证的
 *
 * @author fengshuonan
 * @Date 2017/8/24 14:22
 */
@RestController
public class AuthController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Resource(name = "simpleValidator")
    private IReqValidator reqValidator;

    @RequestMapping(value = "${jwt.auth-path}")
    public ResponseEntity<?> createAuthenticationToken(AuthRequest authRequest) {

        boolean validate = reqValidator.validate(authRequest);

        if (validate) {
            final String randomKey = jwtTokenUtil.getRandomKey();
            final String token = jwtTokenUtil.generateToken(authRequest.getUserName(), randomKey);
            return ResponseEntity.ok(new AuthResponse(token, randomKey));
        } else {
            throw new PmsException(BizExceptionEnum.AUTH_REQUEST_ERROR);
        }
    }
}
