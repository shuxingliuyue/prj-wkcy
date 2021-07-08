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
import xyz.erupt.jpa.model.BaseModel;

import javax.persistence.*;
import java.util.Date;

@Erupt(name = "资源信息管理",
        dataProxy = {TbProject.class})
@Table(name = "project")
@Entity
@Component
public class TbProject extends BaseModel implements DataProxy<TbProject> {

    @EruptField(
            views = @View(title = "资源标题",
                    sortable = true),
            edit = @Edit(title = "资源标题",
                    search = @Search)
    )
    private String name;
    @EruptField(
            views = @View(title = "资源类型",
                    sortable = true),
            edit = @Edit(title = "资源类型", type = EditType.CHOICE,
                    choiceType = @ChoiceType(
                            vl = {
                                    @VL(label = "教案", value = "教案")
                            }
                    ),
                    search = @Search)
    )
    private String filed1;
    @EruptField(
            views = @View(title = "供应商名称",
                    sortable = true),
            edit = @Edit(title = "供应商名称",
                    search = @Search)
    )
    private String filed2;

    @EruptField(
            views = @View(title = "创建人",
                    sortable = true),
            edit = @Edit(title = "创建人",
                    search = @Search)
    )
    private String filed3;

    @EruptField(
            views = @View(title = "创建日期",
                    sortable = true),
            edit = @Edit(title = "创建日期",
                    search = @Search)
    )
    private Date filed4;

    @EruptField(
            views = @View(title = "大小(M)",
                    sortable = true),
            edit = @Edit(title = "大小(M)",
                    search = @Search)
    )
    private Double filed5;
}
