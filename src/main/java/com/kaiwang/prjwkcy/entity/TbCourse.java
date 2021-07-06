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
import java.util.Date;

@Erupt(name = "课程评价表",
        dataProxy = TbCourse.class)
@Table(name = "course")
@Entity
@Component
public class TbCourse implements DataProxy<TbCourse> {
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "native")
    @Column(name = "id")
    @EruptField
    private Long id;
    @EruptField(
            views = @View(title = "主题",
                    sortable = true),
            edit = @Edit(title = "主题",
                    search = @Search(vague = true))
    )
    private String topic;
    @EruptField(
            views = @View(title = "开始时间",
                    sortable = true),
            edit = @Edit(title = "开始时间",
                    search = @Search)
    )
    private Date beginTime;
    @EruptField(
            views = @View(title = "结束时间",
                    sortable = true),
            edit = @Edit(title = "结束时间",
                    search = @Search)
    )
    private Date endTime;
    @EruptField(
            views = @View(title = "参与调查",
                    sortable = true),
            edit = @Edit(title = "参与调查",
                    search = @Search)
    )
    private String joinExplore;
}
