package cn.com.ice.mongodbtest.result;

/**
 * @Author: Hamsun
 * @Date: 2020/8/5 11:05
 */
public enum InsertResultCode {
    SUCCESS(200, "操作成功"),

    CHERK_JOBNAME(500,"岗位名称不能为空"),
    CHERK_JOBTYPE(500,"岗位类型不能为空"),
    CHERK_DPMENTCODE(500,"所属部门编码不能为空"),
    CHERK_CPCODE(500,"网点编码不能为空"),
    CHERK_JOBLEVEL(500,"岗位级别不能为空"),
    CHERK_CREATETIME(500,"创建时间不能为空"),
    CHERK_CREATEUSERCODE(500,"创建人工号不能为空"),
    CHERK_CREATEUSERNAME(500,"创建人姓名不能为空"),
    CHERK_JOBSOURCE(500,"岗位来源不能为空"),

    CHERK_DPMENTNAME(500,"部门名称不能为空"),
    CHERK_PARENTDPMENTNAME(500,"父级部门编码不能为空"),
    CHERK_BUSINESSMODEL(500,"经营模式不能为空"),
    CHERK_DPMENTLEVEL(500,"部门层级不能为空"),
    CHERK_DPMENTHEAD(500,"部门负责人不能为空");

    final Integer code;
    final String message;

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    InsertResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
