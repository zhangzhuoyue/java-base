package com.zzy.myenum;

public enum ResponseEnum {
    /**
     * 1. 枚举项是本类实例，
     * 1. SUCCESS_STATUS 对象在实例化使用无参构造器
     * 2. SUCCESS_STATUS("200","成功") 使用有参构造器
     * 3. 构造器默认的权限修饰符 private
     */
    //查询用户成功返回码
    SUCCESS_STATUS("200", "成功"),
    //查询用户失败返回码
    ERROR_STATUS("100", "失败"),
    //权限验证未通过
    ERROR_AUTHORITY("300", "用户没有权限");

    //返回码
    private String code;
    //解释信息
    private String msg;

    //构造函数
    ResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //根据code值获取枚举对象
    public ResponseEnum getEnumByCode(String code) {
        ResponseEnum[] enums = ResponseEnum.values();
        for (ResponseEnum responseEnum : enums) {
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
