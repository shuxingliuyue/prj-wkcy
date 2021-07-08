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

@Erupt(name = "成果列表",
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
            views = @View(title = "成果编号",
                    sortable = true),
            edit = @Edit(title = "成果编号",
                    search = @Search(
                            vague = true
                    ))
    )
    private String No;
    @EruptField(
            views = @View(title = "成果名称",
                    sortable = true),
            edit = @Edit(title = "成果名称",
                    search = @Search(vague = true))
    )
    private String name;
    @EruptField(
            views = @View(title = "所属类别",
                    sortable = true),
            edit = @Edit(title = "所属类别",
                    search = @Search(vague = true))
    )
    private String type;
    @EruptField(
            views = @View(title = "作者",
                    sortable = true),
            edit = @Edit(title = "作者",
                    search = @Search(
                            vague = true
                    ))
    )
    private String author;
    @EruptField(
            views = @View(title = "申报日期",
                    sortable = true),
            edit = @Edit(title = "申报日期",
                    search = @Search)
    )
    private Date orderTime;
    @EruptField(
            views = {
                    @View(title = "指派专家", column = "status"
                    )
            },
            edit = @Edit(title = "指派专家")
    )
    private String professor;
    @EruptField(
            views = {
                    @View(title = "状态", column = "status"
                    )
            },
            edit = @Edit(title = "状态", type = EditType.CHOICE,
                    choiceType = @ChoiceType(
                            vl = {
                                    @VL(label = "未受理", value = "未受理"),
                                    @VL(label = "已受理", value = "已受理")
                            }
                    ))
    )
    private String status;


}
