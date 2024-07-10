package com.admin.out.api.newadminoutapi.config;


import com.admin.out.api.newadminoutapi.vo.CodeInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/**
 * @author: David
 * @date: 03/03/2020
 * @description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends RuntimeException {

    protected final Integer code;
    protected final String message;
    protected final CodeInfo codeInfo;

    public BusinessException(@NotNull CodeInfo codeInfo) {
        this.code = codeInfo.getCode();
        this.message = codeInfo.getMsg();
        this.codeInfo = codeInfo;
    }

    public BusinessException(String msg) {
        this.code = CodeInfo.STATUS_CODE_ERROR.getCode();
        this.message = msg;
        this.codeInfo = CodeInfo.STATUS_CODE_ERROR;
    }
    @NotNull
    @Contract("_, _ -> new")
    public static BusinessException buildException(@NotNull CodeInfo info, @NotNull String  message) {
        return new BusinessException(CodeInfo.setMsg(info.getCode(), message));
    }

}
