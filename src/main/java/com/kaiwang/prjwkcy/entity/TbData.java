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

@Erupt(name = "项目表",
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
            views = @View(title = "项目编号",
                    sortable = true),
            edit = @Edit(title = "项目编号",
                    search = @Search(
                            vague = true
                    ))
    )
    private String No;
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
            views = @View(title = "项目名称",
                    sortable = true),
            edit = @Edit(title = "项目名称",
                    search = @Search(
                            vague = true
                    ))
    )
    private String name;
    @ManyToOne
    @EruptField(
            views = {
                    @View(title = "配置部门", column = "name"
                    )
            },
            edit = @Edit(title = "配置本门", type = EditType.REFERENCE_TREE)
    )
    private EruptOrg org;
    @ManyToOne
    @EruptField(
            views = {
                    @View(title = "配置人员", column = "name"
                    )
            },
            edit = @Edit(title = "配置人员", type = EditType.REFERENCE_TREE)
    )
    private EruptUser user;
    @ManyToOne
    @EruptField(
            views = {
                    @View(title = "配置PRP阶段", column = "name"
                    )
            },
            edit = @Edit(title = "配置PRP阶段", type = EditType.REFERENCE_TREE)
    )
    private TbProject project;


}
