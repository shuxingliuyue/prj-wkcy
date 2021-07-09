package com.kaiwang.prjwkcy.entity;

import lombok.Data;
import org.springframework.stereotype.Component;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.fun.DataProxy;
import xyz.erupt.annotation.sub_erupt.LinkTree;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.ChoiceType;
import xyz.erupt.annotation.sub_field.sub_edit.InputType;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.annotation.sub_field.sub_edit.VL;
import xyz.erupt.upms.model.EruptUser;
import xyz.erupt.upms.model.base.HyperModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbuser")
@Erupt(
        name = "客户管理",
        desc = "客户管理",
        dataProxy = {TbUser.class}
)
@Component
@Data
public class TbUser extends HyperModel implements DataProxy<EruptUser> {
    private static final String EMAIL_REGEX = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    private static final String PHONE_REGEX = "^[1][3,4,5,6,7,8,9][0-9]{9}$";
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
                    title = "客户类别",
                    sortable = true
            )},
            edit = @Edit(
                    title = "客户类别",
                    desc = "客户类别",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String type;

    @EruptField(
            views = {@View(
                    title = "客户状态",
                    sortable = true
            )},
            edit = @Edit(
                    title = "客户状态",
                    notNull = true,
                    search = @Search
            )
    )
    private String status;
    @EruptField(
            views = {@View(
                    title = "主联系人",
                    sortable = true
            )},
            edit = @Edit(
                    title = "主联系人",
                    notNull = true,
                    search = @Search
            )
    )
    private String contact;

    @EruptField(
            views = {@View(
                    title = "职位",
                    sortable = true
            )},
            edit = @Edit(
                    title = "职位",
                    notNull = true,
                    search = @Search
            )
    )
    private String position;
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
                    title = "联系手机"
            )},
            edit = @Edit(
                    title = "联系手机"
            )
    )
    private String phone;
    @EruptField(
            views = {@View(
                    title = "联系邮箱"
            )},
            edit = @Edit(
                    title = "联系邮箱",
                    search = @Search(
                            vague = true
                    ),
                    inputType = @InputType(
                            regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$"
                    )
            )
    )
    private String email;
    public TbUser() {
    }

    public TbUser(Long id) {
        this.setId(id);
    }

}
