package com.kaiwang.prjwkcy.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.InputType;
import xyz.erupt.annotation.sub_field.sub_edit.ReferenceTreeType;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.upms.model.EruptMenu;

import javax.persistence.*;

@Erupt(name = "客户")
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
                    title = "客户名称",
                    sortable = true
            )},
            edit = @Edit(
                    title = "客户名称",
                    desc = "客户名称",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String name;

    @EruptField(
            views = {@View(
                    title = "客户编号",
                    sortable = true
            )},
            edit = @Edit(
                    title = "客户编号",
                    desc = "客户编号",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private Long num;
    @EruptField(
            views = {@View(
                    title = "联系人",
                    sortable = true
            )},
            edit = @Edit(
                    title = "联系人",
                    desc = "联系人",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String contact;
    @EruptField(
            views = {@View(
                    title = "手机号码"
            )},
            edit = @Edit(
                    title = "手机号码",
                    search = @Search(
                            vague = true
                    ),
                    inputType = @InputType(
                            regex = "^[1][3,4,5,6,7,8,9][0-9]{9}$"
                    )
            )
    )
    private String phone;

    @EruptField(
            views = {@View(
                    title = "邮箱"
            )},
            edit = @Edit(
                    title = "邮箱",
                    search = @Search(
                            vague = true
                    ),
                    inputType = @InputType(
                            regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$"
                    )
            )
    )
    private String email;
    @EruptField(
            views = {@View(
                    title = "HTTPS",
                    column = "https"
            )},
            edit = @Edit(
                    title = "HTTPS"
            )
    )
    private String https;
    @EruptField(
            views = {@View(
                    title = "地址"
            )},
            edit = @Edit(
                    title = "地址"
            )
    )
    private String address;
}
