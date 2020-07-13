package com.zzy.myenum;

public enum ResponseEnum {
    /**
     * 1. &#x679a;&#x4e3e;&#x9879;&#x662f;&#x672c;&#x7c7b;&#x5b9e;&#x4f8b;&#xff0c;
     *    1. SUCCESS_STATUS &#x5bf9;&#x8c61;&#x5728;&#x5b9e;&#x4f8b;&#x5316;&#x4f7f;&#x7528;&#x65e0;&#x53c2;&#x6784;&#x9020;&#x5668;
     *    2. SUCCESS_STATUS("200","&#x6210;&#x529f;") &#x4f7f;&#x7528;&#x6709;&#x53c2;&#x6784;&#x9020;&#x5668;
     *    3. &#x6784;&#x9020;&#x5668;&#x9ed8;&#x8ba4;&#x7684;&#x6743;&#x9650;&#x4fee;&#x9970;&#x7b26; private
     *
     * 2.
     */
    //查询用户成功返回码
    SUCCESS_STATUS("200","成功"),
    //查询用户失败返回码
    ERROR_STATUS("100","失败"),
    //权限验证未通过
    ERROR_AUTHORITY("300","用户没有权限");

    //返回码
    private String code;
    //解释信息
    private String msg;

    //构造函数
    ResponseEnum(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    //根据code值获取枚举对象
    public ResponseEnum getEnumByCode(String code){
        ResponseEnum[] enums = ResponseEnum.values();
        for (ResponseEnum responseEnum : enums){
            if (code != null && code.equals(responseEnum.getCode())) return responseEnum;
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
