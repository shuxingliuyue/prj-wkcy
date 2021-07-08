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

@Erupt(name = "重大事件处理",
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
            views = {@View(
                    title = "类型"
            )},
            edit = @Edit(
                    title = "类型"
            )
    )
    private String type;
    @EruptField(
            views = {@View(
                    title = "班级",
                    sortable = true
            )},
            edit = @Edit(
                    title = "班级",
                    desc = "班级",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String classRome;
    @EruptField(
            views = {@View(
                    title = "学号",
                    sortable = true
            )},
            edit = @Edit(
                    title = "学号",
                    desc = "学号",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String No;
    @EruptField(
            views = {@View(
                    title = "姓名",
                    sortable = true
            )},
            edit = @Edit(
                    title = "姓名",
                    desc = "姓名",
                    notNull = true,
                    search = @Search(
                            vague = true
                    )
            )
    )
    private String name;

    @EruptField(
            views = @View(title = "时间",
                    sortable = true),
            edit = @Edit(title = "时间",
                    search = @Search)
    )
    private Date orderTime;
    @EruptField(
            views = {@View(
                    title = "性质"
            )},
            edit = @Edit(
                    title = "性质"
            )
    )
    private String filed1;
    @EruptField(
            views = {@View(
                    title = "详情"
            )},
            edit = @Edit(
                    title = "详情"
            )
    )
    private String detail;
}
