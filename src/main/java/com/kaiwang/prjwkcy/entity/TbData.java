package com.kaiwang.prjwkcy.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.fun.DataProxy;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.ChoiceType;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.annotation.sub_field.sub_edit.VL;
import xyz.erupt.upms.model.EruptOrg;
import xyz.erupt.upms.model.EruptUser;

import javax.persistence.*;
import java.util.Date;

@Erupt(name = "咨询工单编号",
        dataProxy = {TbData.class})
@Table(name = "data")
@Entity
@Component
public class TbData implements DataProxy<TbData> {
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
                    title = "咨询工单编号",
                    sortable = true
            )},
            edit = @Edit(
                    title = "咨询工单编号",
                    desc = "咨询工单编号",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String name;

    @EruptField(
            views = @View(title = "咨询日期",
                    sortable = true),
            edit = @Edit(title = "咨询日期",
                    search = @Search)
    )
    private Date orderTime;

    @EruptField(
            views = {@View(
                    title = "客服人员"
            )},
            edit = @Edit(
                    title = "客服人员"
            )
    )
    private String service;

    @EruptField(
            views = {@View(
                    title = "咨询客户"
            )},
            edit = @Edit(
                    title = "咨询客户"
            )
    )
    private String custom;
    @EruptField(
            views = {@View(
                    title = "联系电话"
            )},
            edit = @Edit(
                    title = "联系电话"
            )
    )
    private String phone;
    @EruptField(
            views = {@View(
                    title = "资讯结果"
            )},
            edit = @Edit(title = "资讯结果", type = EditType.CHOICE,
                    choiceType = @ChoiceType(
                            vl = {
                                    @VL(label = "未解决", value = "未解决"),
                                    @VL(label = "已解决", value = "已解决")
                            }
                    ))
    )
    private String result;

}
