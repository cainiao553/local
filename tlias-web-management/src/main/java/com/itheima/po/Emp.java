package com.itheima.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 员工表
 * </p>
 *
 * @author zly
 * @since 2024-06-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("emp")
@ApiModel(value="Emp对象", description="员工表")
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "性别, 说明: 1 男, 2 女")
    private Integer gender;

    @ApiModelProperty(value = "图像")
    private String image;

    @ApiModelProperty(value = "职位, 说明: 1 班主任,2 讲师, 3 学工主管, 4 教研主管, 5 咨询师")
    private Integer job;

    @ApiModelProperty(value = "入职时间")
    private LocalDate entrydate;

    @ApiModelProperty(value = "部门ID")
    private Integer deptId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;


}
