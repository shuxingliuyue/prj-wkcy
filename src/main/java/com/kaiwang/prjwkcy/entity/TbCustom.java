package com.kaiwang.prjwkcy.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.ChoiceType;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.annotation.sub_field.sub_edit.VL;

import javax.persistence.*;
import java.util.Date;

@Erupt(name = "进度查询")
@Table(name = "custom")
@Entity
@Component
public class TbCustom {
    private static final String EMAIL_REGEX = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    private static final String PHONE_REGEX = "^[1][3,4,5,6,7,8,9][0-9]{9}$";
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "native")
    @Column(name = "id")
    @EruptField
    private Long id;

    @EruptField(
            views = {@View(
                    title = "序号",
                    sortable = true
            )},
            edit = @Edit(
                    title = "序号",
                    desc = "序号",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String No;
    @EruptField(
            views = {@View(
                    title = "申请企业名称",
                    sortable = true
            )},
            edit = @Edit(
                    title = "申请企业名称",
                    desc = "申请企业名称",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String name;

    @EruptField(
            views = {@View(
                    title = "登记日期"
            )},
            edit = @Edit(
                    title = "登记日期"
            )
    )
    private Date day;

    @EruptField(
            views = {@View(
                    title = "进度",
                    sortable = true
            )},
            edit = @Edit(
                    title = "进度",
                    desc = "进度",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String progress;
    @EruptField(
            views = {@View(
                    title = "负责员工"
            )},
            edit = @Edit(
                    title = "负责员工",
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String filed1;

    @EruptField(
            views = {@View(
                    title = "注册企业类型"
            )},
            edit = @Edit(
                    title = "注册企业类型"
            )
    )
    private String type;

/*
    @EruptField(
            views = {@View(
                    title = "政治面貌",
                    column = "field2"
            )},
            edit = @Edit(
                    title = "政治面貌"
            )
    )
    private String field2;
   @EruptField(
            views = {@View(
                    title = "是否住校"
            )},
            edit = @Edit(title = "是否住校", type = EditType.CHOICE,
                    choiceType = @ChoiceType(
                            vl = {
                                    @VL(label = "是", value = "是"),
                                    @VL(label = "否", value = "否")
                            }
                    ))
    )
    private String field3;
    @EruptField(
            views = {@View(
                    title = "职务"
            )},
            edit = @Edit(
                    title = "职务"
            )
    )
    private String filed4;*/
}
