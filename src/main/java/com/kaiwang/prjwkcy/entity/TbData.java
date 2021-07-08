package com.kaiwang.prjwkcy.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.fun.DataProxy;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.upms.model.EruptOrg;
import xyz.erupt.upms.model.EruptUser;

import javax.persistence.*;
import java.util.Date;

@Erupt(name = "教师评价等级管理",
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
            views = @View(title = "序号",
                    sortable = true),
            edit = @Edit(title = "序号",
                    search = @Search(
                            vague = true
                    ))
    )
    private String No;
    @EruptField(
            views = @View(title = "教师评价等级名称",
                    sortable = true),
            edit = @Edit(title = "教师评价等级名称",
                    search = @Search(
                            vague = true
                    ))
    )
    private String name;
    @EruptField(
            views = @View(title = "教师评价等级说明",
                    sortable = true),
            edit = @Edit(title = "教师评价等级说明",
                    search = @Search(
                            vague = true
                    ))
    )
    private String desc;
    @EruptField(
            views = @View(title = "最低教师评价",
                    sortable = true),
            edit = @Edit(title = "最低教师评价",
                    search = @Search(
                            vague = true
                    ))
    )
    private String grade;
    @EruptField(
            views = @View(title = "建立时间",
                    sortable = true),
            edit = @Edit(title = "建立时间",
                    search = @Search)
    )
    private Date beginTime;
    @EruptField(
            views = @View(title = "建立IP",
                    sortable = true),
            edit = @Edit(title = "建立IP",
                    search = @Search)
    )
    private String ip;
}
