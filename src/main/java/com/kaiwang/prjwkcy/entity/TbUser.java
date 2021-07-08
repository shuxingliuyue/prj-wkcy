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
import xyz.erupt.annotation.sub_field.sub_edit.InputType;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.upms.model.EruptUser;
import xyz.erupt.upms.model.base.HyperModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbuser")
@Erupt(
        name = "用户",
        desc = "用户配置",
        dataProxy = {TbUser.class}
)
@Component
@Data
public class TbUser extends HyperModel implements DataProxy<EruptUser> {
    private static final String EMAIL_REGEX = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    private static final String PHONE_REGEX = "^[1][3,4,5,6,7,8,9][0-9]{9}$";
    @EruptField(
            views = {@View(
                    title = "名/姓/名的拼音/姓的拼音/中间名字/别名",
                    sortable = true
            )},
            edit = @Edit(
                    title = "名/姓/名的拼音/姓的拼音/中间名字/别名",
                    desc = "名/姓/名的拼音/姓的拼音/中间名字/别名",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String name;
    @EruptField(
            views = {@View(
                    title = "Email地址"
            )},
            edit = @Edit(
                    title = "Email地址",
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
            views = @View(title = "市/县"),
            edit = @Edit(
                    title = "市/县",
                    type = EditType.TEXTAREA
            )
    )
    private String city;
    @EruptField(
            views = @View(title = "国家和地区"),
            edit = @Edit(
                    title = "国家和地区",
                    type = EditType.TEXTAREA
            )
    )
    private String country;
    @Column(
            length = 2000
    )
    @EruptField(
            views = @View(title = "上次访问"),
            edit = @Edit(
                    title = "上次访问",
                    type = EditType.TEXTAREA
            )
    )
    private String lastView;
    @Column(
            length = 2000
    )
    @EruptField(
            edit = @Edit(
                    title = "备注",
                    type = EditType.TEXTAREA
            )
    )
    private String remark;

    public TbUser() {
    }

    public TbUser(Long id) {
        this.setId(id);
    }

}
