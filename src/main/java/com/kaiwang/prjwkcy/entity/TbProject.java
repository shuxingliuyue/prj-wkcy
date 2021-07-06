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

@Erupt(name = "教学课件",
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
            views = @View(title = "目录名称",
                    sortable = true),
            edit = @Edit(title = "目录名称",
                    search = @Search(vague = true))
    )
    private String name;
}
