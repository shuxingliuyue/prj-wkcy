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

@Erupt(name = "学生学籍管理")
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
                    title = "学号",
                    sortable = true
            )},
            edit = @Edit(
                    title = "学号",
                    desc = "学号",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String No;
    @EruptField(
            views = {@View(
                    title = "班级",
                    sortable = true
            )},
            edit = @Edit(
                    title = "班级",
                    desc = "班级",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String classRome;
    @EruptField(
            views = {@View(
                    title = "姓名",
                    sortable = true
            )},
            edit = @Edit(
                    title = "姓名",
                    desc = "姓名",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String name;

    @EruptField(
            views = {@View(
                    title = "年纪",
                    sortable = true
            )},
            edit = @Edit(
                    title = "年纪",
                    desc = "年纪",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private Long num;
    @EruptField(
            views = {@View(
                    title = "民族"
            )},
            edit = @Edit(
                    title = "民族",
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String filed1;
    @EruptField(
            views = {@View(
                    title = "性别"
            )},
            edit = @Edit(title = "性别", type = EditType.CHOICE,
                    choiceType = @ChoiceType(
                            vl = {
                                    @VL(label = "男", value = "男"),
                                    @VL(label = "女", value = "女")
                            }
                    ))
    )
    private String sex;
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
                    title = "出生日期"
            )},
            edit = @Edit(
                    title = "出生日期"
            )
    )
    private Date birthday;
    @EruptField(
            views = {@View(
                    title = "分类"
            )},
            edit = @Edit(
                    title = "分类"
            )
    )
    private String type;
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
    private String filed4;
}
