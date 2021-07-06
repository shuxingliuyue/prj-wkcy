package com.kaiwang.prjwkcy.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.fun.DataProxy;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.Search;

import javax.persistence.*;

@Erupt(name = "课程表",
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
            views = @View(title = "课程名称",
                    sortable = true),
            edit = @Edit(title = "课程名称",
                    search = @Search(vague = true))
    )
    private String name;
    @EruptField(
            views = @View(title = "学习进度",
                    sortable = true),
            edit = @Edit(title = "学习进度",
                    search = @Search(
                            vague = true
                    ))
    )
    private String filed1;
    @EruptField(
            views = @View(title = "学习时长",
                    sortable = true),
            edit = @Edit(title = "学习时长",
                    search = @Search(
                            vague = true
                    ))
    )
    private String filed2;
    @EruptField(
            views = @View(title = "学习次数",
                    sortable = true),
            edit = @Edit(title = "学习次数",
                    search = @Search(
                            vague = true
                    ))
    )
    private String filed3;
    @EruptField(
            views = @View(title = "考核状态",
                    sortable = true),
            edit = @Edit(title = "考核状态",
                    search = @Search(
                            vague = true
                    ))
    )
    private String filed4;
}
