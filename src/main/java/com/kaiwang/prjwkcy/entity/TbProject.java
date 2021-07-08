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

import javax.persistence.*;

@Erupt(name = "课程评价",
        dataProxy = {TbProject.class})
@Table(name = "project")
@Entity
@Component
public class TbProject implements DataProxy<TbProject> {
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "native")
    @Column(name = "id")
    @EruptField
    private Long id;
    @EruptField(
            views = @View(title = "序号",
                    sortable = true),
            edit = @Edit(title = "序号",
                    search = @Search(vague = true))
    )
    private Integer num;
    @EruptField(
            views = @View(title = "指标小类",
                    sortable = true),
            edit = @Edit(title = "指标小类",
                    search = @Search(vague = true))
    )
    private String littleType;
    @EruptField(
            views = @View(title = "指标名称",
                    sortable = true),
            edit = @Edit(title = "指标名称",
                    search = @Search(vague = true))
    )
    private String name;
    @EruptField(
            views = @View(title = "考评细则",
                    sortable = true),
            edit = @Edit(title = "考评细则",
                    search = @Search(
                            vague = true
                    ))
    )
    private String filed1;
    @EruptField(
            views = @View(title = "评价数据"),
            edit = @Edit(title = "评价数据", type = EditType.CHOICE,
                    choiceType = @ChoiceType(
                            vl = {
                                    @VL(label = "10", value = "10"),
                                    @VL(label = "8", value = "8"),
                                    @VL(label = "6", value = "6"),
                                    @VL(label = "4", value = "4"),
                                    @VL(label = "2", value = "2")
                            }
                    ), search = @Search)
    )
    private String filed2;
    @EruptField(
            views = @View(title = "最大分数"
            )

    )
    private Integer filed3 = 10;
    @EruptField(
            views = @View(title = "最小分数"
            )

    )
    private Integer filed4 = 2;

    @EruptField(
            views = @View(title = "单条说明"
            ),
            edit = @Edit(title = "单条说明")

    )
    private String filed5;
}
