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

@Erupt(name = "在线测试",
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
            views = @View(title = "测试标题",
                    sortable = true),
            edit = @Edit(title = "测试标题",
                    search = @Search(
                            vague = true
                    ))
    )
    private String name;
    @EruptField(
            views = @View(title = "截止时间",
                    sortable = true),
            edit = @Edit(title = "截止时间",
                    search = @Search)
    )
    private Date beginTime;
    @EruptField(
            views = @View(title = "公开状态"),
            edit = @Edit(title = "公开状态", type = EditType.CHOICE,
                    choiceType = @ChoiceType(
                            vl = {
                                    @VL(label = "公开", value = "公开"),
                                    @VL(label = "不公开", value = "不公开")

                            }
                    ),
                    search = @Search)
    )
    private String state;

}
