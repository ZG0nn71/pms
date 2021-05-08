package priv.yzwbblan.pms.rest.fastjosn;

import com.alibaba.fastjson.JSON;

import priv.yzwbblan.pms.base.util.MD5Util;
import priv.yzwbblan.pms.rest.auth.converter.BaseTransferEntity;
import priv.yzwbblan.pms.rest.module.model.SimpleObject;

public class JsonTest {

    public static void main(String[] args) {
        String randomKey = "1xm7hw";

        BaseTransferEntity baseTransferEntity = new BaseTransferEntity();
        SimpleObject simpleObject = new SimpleObject();
        simpleObject.setUser("fsn");
        baseTransferEntity.setObject("123123");

        String json = JSON.toJSONString(simpleObject);

        //md5签名
        String encrypt = MD5Util.encrypt(json + randomKey);
        baseTransferEntity.setSign(encrypt);

        System.out.println(JSON.toJSONString(baseTransferEntity));
    }
}
