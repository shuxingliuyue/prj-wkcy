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

@Erupt(name = "待审核资源",
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
            views = @View(title = "标题",
                    sortable = true),
            edit = @Edit(title = "标题",
                    search = @Search())
    )
    private String name;
    @EruptField(
            views = @View(title = "专题库",
                    sortable = true),
            edit = @Edit(title = "专题库",
                    search = @Search(
                            vague = true
                    ))
    )
    private String topic;
    @EruptField(
            views = {
                    @View(title = "专题分类", column = "type"
                    )
            },
            edit = @Edit(title = "专题分类", type = EditType.CHOICE,
                    choiceType = @ChoiceType(
                            vl = {
                                    @VL(label = "广告学", value = "广告学"),
                                    @VL(label = "语法阅读", value = "语法阅读")
                            }
                    ),
                    search = @Search)
    )
    private String type;
    @EruptField(
            views = {
                    @View(title = "媒体类型", column = "type2"
                    )
            },
            edit = @Edit(title = "媒体类型", type = EditType.CHOICE,
                    choiceType = @ChoiceType(
                            vl = {
                                    @VL(label = "文本", value = "文本")
                            }
                    ),
                    search = @Search)
    )
    private String type2;
    @EruptField(
            views = @View(title = "上传日期",
                    sortable = true),
            edit = @Edit(title = "上传日期",
                    search = @Search)
    )
    private Date orderTime;

}
