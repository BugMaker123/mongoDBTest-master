package cn.com.ice.mongodbtest.result;

/**
 * @Author: Hamsun
 * @Date: 2020/8/5 11:05
 */
public enum ResultCode {
    SUCCESS(200, "操作成功"),
    FAILURE(400, "业务异常"),
    MSG_NOT_READABLE(400, "消息不能读取"),
    PARAM_MISS(400, "缺少必要的请求参数"),
    PARAM_TYPE_ERROR(400, "请求参数类型错误"),
    PARAM_BIND_ERROR(400, "请求参数绑定错误"),
    PARAM_VALID_ERROR(400, "参数校验失败"),
    UN_AUTHORIZED(401, "请求未授权"),
    CLIENT_UN_AUTHORIZED(401, "客户端请求未授权"),
    REQ_REJECT(403, "请求被拒绝"),
    NOT_FOUND(404, "404 没找到请求"),
    METHOD_NOT_SUPPORTED(405, "不支持当前请求方法"),
    MEDIA_TYPE_NOT_SUPPORTED(415, "不支持当前媒体类型"),
    INTERNAL_SERVER_ERROR(500, "服务器异常"),
    SERVER_BUSY(400, "服务器繁忙,请稍后重试"),
    TIMEOUT_ERROR(500, "请求超时,请稍后重试"),

    MUTI_IDENTIFICATION_CARDS(500, "身份证号已存在"),
    MUTI_PHONE_NOS(500,"手机号已存在"),
    PHONE_NO_NOT_EXIST(500,"手机号不存在"),
    ACCOUNT_NO_NOT_EXIST(500,"账号号不存在"),
    PHONE_NO_ERROR(400,"手机号格式不正确"),
    MUTI_COURIER_CODE(500,"业务员编码已存在"),
    HAS_OPENED_ACCOUNT(500,"该用户已开通账号"),
    RECORD_NOT_EXIST(500, "当前记录不存在"),
    RECORD_INSERT_FAIL(500,"数据插入失败"),
    RECORD_DEL_FAIL(500,"数据删除失败"),

    EMP_E1(500,"只有工作状态为试用的员工可以转正"),
    EMP_E2(500,"该工作状态为离职、锁定、无效的不支持调岗"),
    EMP_E3(500,"只有工作状态为试用或者正式的员工可以锁定"),
    EMP_E4(500,"离职失败，原因：001账号不能离职"),
    EMP_E5(500,"已离职员工不能重复离职"),
    EMP_E6(500,"只能解除离职已离职的员工"),
    EMP_E7(500,"只能解除锁定已锁定的员工"),
//    EMP_E8(500,"只能锁定或者解除锁定业务员"),
    EMP_E9(500,"该员工工作信息不存在"),
    EMP_E10(500,"该员工在该网点下已经开通SOA账号"),
    EMP_E11(500,"该员工在该网点下已经开通业务员账号"),
    EMP_E12(500,"该业务员账号已在使用中"),


    SC_YWY_E1(500,"证件类型不能为空"),
    SC_YWY_E2(500,"证件号不能为空"),
    SC_YWY_E3(500,"手机号不能为空"),
    SC_YWY_E4(500,"性别不能为空"),
    SC_YWY_E5(500,"姓名不能为空"),
    SC_YWY_E6(500,"常住省不能为空"),
    SC_YWY_E7(500,"常住市不能为空"),
    SC_YWY_E8(500,"常住区县不能为空"),
    SC_YWY_E9(500,"常住街道不能为空"),
    SC_YWY_E10(500,"未查询到该ID对应的居住地相关信息"),
    SC_YWY_E11(500,"密码长度不能超过10"),

    DEPT_E1(500,"部门名称被占用"),
    DEPT_E2(500,"新增部门不能大于10个"),
    DEPT_E3(500,"特殊部门无法进行编辑、删除、新增下级部门等操作"),
    DEPT_E4(500,"一级部门的父级部门编码必须为0"),
    DEPT_E5(500,"父级编码不存在"),
    DEPT_E6(500,"默认部门不能修改"),
    DEPT_E7(500,"不能添加自定义的默认部门"),
    DEPT_E8(500,"部门层级不能超过三级"),
    DEPT_E9(500,"部门的父级部门不能是自己"),
    DEPT_E10(500,"部门的父级部门不能是自己的子孙级部门"),
    DEPT_E11(500,"该部门不存在"),
    DEPT_E12(500,"删除部门失败，请先解绑部门中的人员"),
    DEPT_E13(500,"删除部门失败请先删除子部门"),
    DEPT_E14(500,"不允许修改当前部门的层级与父级部门"),
    DEPT_E15(500,"默认部门不能删除"),
    DEPT_E16(500,"请先删除部门下的岗位"),
    DEPT_E17(500,"非一级部门的父级部门编码不能为0"),

    STANDARD_POSITON_E1(500,"标准岗位编码重复"),
    STANDARD_POSITON_E2(500,"标准岗位名称重复"),

    JOB_E1(500,"岗位名称校验失败，含有特殊字符"),

    JOB_E3(500,"预设岗位不能删除"),
    JOB_E4(500,"岗位下有未解绑人员,删除岗位失败"),
    JOB_E5(500,"岗位名称长度超过10"),
    JOB_E6(500,"同一网点下的岗位名字不能重复"),
    JOB_E7(500,"岗位编码不能为空"),
    JOB_E8(500,"请先解绑该岗位下的人员"),
    JOB_E9(500,"不存在该岗位"),
    JOB_E10(500,"不允许修改预设岗位"),
    JOB_E11(500,"不允许新增预设岗位"),

    EC_USER_INFO_E1(400,"该手机号已注册"),
    EC_USER_INFO_E2(400,"不能批量更新手机号");

    final Integer code;
    final String message;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
