package priv.yzwbblan.pms.rest.jwt;

import com.alibaba.fastjson.JSON;

import priv.yzwbblan.pms.base.util.MD5Util;
import priv.yzwbblan.pms.rest.auth.converter.BaseTransferEntity;
import priv.yzwbblan.pms.rest.auth.security.impl.Base64SecurityAction;
import priv.yzwbblan.pms.rest.module.model.SimpleObject;

public class DecryptTest {
    public static void main(String[] args) {

        String key = "mySecret";

        String compactJws = "eyJhbGciOiJIUzUxMiJ9.eyJyYW5kb21LZXkiOiJxczV4ZjciLCJzdWIiOiJhZG1pbiIsImV4cCI6MTUwNjM0Mzk4NywiaWF0IjoxNTA1NzM5MTg3fQ.N5_npknF-w_pq_3bi-cRp0HkjQqOVlK_dTh5QPIDYcWYCujp4uQ5-QrHDB86azHhsNKVgwpvh1_0ZkxmmEFsEQ";
        String salt = "qs5xf7";

        SimpleObject simpleObject = new SimpleObject();
        simpleObject.setUser("stylefeng");
        simpleObject.setAge(12);
        simpleObject.setName("ffff");
        simpleObject.setTips("code");

        String jsonString = JSON.toJSONString(simpleObject);
        String encode = new Base64SecurityAction().doAction(jsonString);
        String md5 = MD5Util.encrypt(encode + salt);

        BaseTransferEntity baseTransferEntity = new BaseTransferEntity();
        baseTransferEntity.setObject(encode);
        baseTransferEntity.setSign(md5);

        System.out.println(JSON.toJSONString(baseTransferEntity));

        //System.out.println("body = " + Jwts.parser().setSigningKey(key).parseClaimsJws(compactJws).getBody());
        //System.out.println("header = " + Jwts.parser().setSigningKey(key).parseClaimsJws(compactJws).getHeader());
        //System.out.println("signature = " + Jwts.parser().setSigningKey(key).parseClaimsJws(compactJws).getSignature());
    }
}
