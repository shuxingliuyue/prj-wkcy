package com.kaiwang.prjwkcy.entity;

import org.springframework.stereotype.Component;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.fun.DataProxy;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.jpa.model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Erupt(name = "教室管理",
        dataProxy = {TbClassRome.class})
@Table(name = "classrome")
@Entity
@Component
public class TbClassRome extends BaseModel implements DataProxy<TbClassRome> {
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
            views = @View(title = "隶属校区",
                    sortable = true),
            edit = @Edit(title = "隶属校区",
                    search = @Search(
                            vague = true
                    ))
    )
    private String Num;
    @EruptField(
            views = @View(title = "教室名称",
                    sortable = true),
            edit = @Edit(title = "教室名称",
                    search = @Search(
                            vague = true
                    ))
    )
    private String name;
    @EruptField(
            views = @View(title = "教室容量",
                    sortable = true),
            edit = @Edit(title = "教室容量",
                    search = @Search(
                            vague = true
                    ))
    )
    private Integer capacity;
    @EruptField(
            views = @View(title = "教室类型",
                    sortable = true),
            edit = @Edit(title = "教室类型",
                    search = @Search(
                            vague = true
                    ))
    )
    private String type;
    @EruptField(
            views = @View(title = "显示顺序",
                    sortable = true),
            edit = @Edit(title = "显示顺序",
                    search = @Search(
                            vague = true
                    ))
    )
    private String grade;
    @EruptField(
            views = @View(title = "操作时间",
                    sortable = true),
            edit = @Edit(title = "操作时间",
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
