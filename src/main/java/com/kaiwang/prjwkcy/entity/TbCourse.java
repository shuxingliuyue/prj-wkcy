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
import java.security.PrivateKey;
import java.util.Date;

@Erupt(name = "资源上传",
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
            views = @View(title = "标题",
                    sortable = true),
            edit = @Edit(title = "标题",
                    search = @Search(vague = true))
    )
    private String topic;
    @EruptField(
            views = @View(title = "上传时间",
                    sortable = true),
            edit = @Edit(title = "上传时间",
                    search = @Search)
    )
    private Date beginTime;
    @EruptField(
            views = @View(title = "资源类型",
                    sortable = true),
            edit = @Edit(title = "资源类型",
                    search = @Search)
    )
    private String type;
    @EruptField(
            views = @View(title = "资源大小",
                    sortable = true),
            edit = @Edit(title = "资源大小",
                    search = @Search)
    )
    private Integer resourceSize;
    @EruptField(
            views = @View(title = "编目",
                    sortable = true),
            edit = @Edit(title = "编目",
                    search = @Search)
    )
    private String joinExplore;
}
